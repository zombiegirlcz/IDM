package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.MrzValidationPolicy;
import com.fourthline.vision.internal.e3;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class i9 implements Function1 {
    private static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimestampProvider f36368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f36369c;
    private e3.b d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MrzValidationPolicy.values().length];
            try {
                iArr[MrzValidationPolicy.STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MrzValidationPolicy.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MrzValidationPolicy.WEAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i9(@NotNull Function0<? extends MrzValidationPolicy> mrzValidationPolicyFactory, @NotNull TimestampProvider timestampProvider) {
        Intrinsics.checkNotNullParameter(mrzValidationPolicyFactory, "mrzValidationPolicyFactory");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        this.f36367a = mrzValidationPolicyFactory;
        this.f36368b = timestampProvider;
    }

    private final List<e3.b> candidateMrzDetectionOrEmpty() {
        e3.b bVar = this.d;
        if (bVar != null) {
            cleanUpCandidate();
            List<e3.b> listC = zhm.u.c(bVar);
            if (listC != null) {
                return listC;
            }
        }
        return zhm.f0.f322471a;
    }

    private final void cleanUpCandidate() {
        this.f36369c = null;
        this.d = null;
    }

    private final boolean doesPassPolicy(MrzInfo mrzInfo) {
        int i = b.$EnumSwitchMapping$0[getMrzValidationPolicy().ordinal()];
        if (i == 1) {
            return errorsCount(mrzInfo) == 0;
        }
        if (i == 2) {
            return errorsCount(mrzInfo) < 2;
        }
        if (i == 3) {
            return errorsCount(mrzInfo) < 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int errorsCount(MrzInfo mrzInfo) {
        List<ValidationError> validationErrors = mrzInfo.getValidationErrors();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : validationErrors) {
            ValidationError validationError = (ValidationError) obj2;
            int i = b.$EnumSwitchMapping$0[getMrzValidationPolicy().ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (validationError != MrtdMrzInfoValidationError.TRUNCATED_NAMES && validationError != MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM && validationError != IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM) {
                    arrayList.add(obj2);
                }
            } else if (validationError != MrtdMrzInfoValidationError.TRUNCATED_NAMES) {
                arrayList.add(obj2);
            }
        }
        return arrayList.size();
    }

    private final MrzValidationPolicy getMrzValidationPolicy() {
        return (MrzValidationPolicy) this.f36367a.invoke();
    }

    private final long getTimeoutThreshold() {
        Long l2 = this.f36369c;
        if (l2 != null) {
            return l2.longValue() + ((long) 500);
        }
        return Long.MAX_VALUE;
    }

    private final boolean isPerfect(MrzInfo mrzInfo) {
        return errorsCount(mrzInfo) == 0;
    }

    private final boolean isTimeout() {
        return this.f36368b.getCurrentTimestamp() >= getTimeoutThreshold();
    }

    private final List<e3> processAsFirstCandidate(e3.b bVar) {
        if (!isPerfect(bVar.getMrz())) {
            return doesPassPolicy(bVar.getMrz()) ? saveCandidate(Long.valueOf(this.f36368b.getCurrentTimestamp()), bVar) : zhm.f0.f322471a;
        }
        List<e3> listC = zhm.u.c(bVar);
        cleanUpCandidate();
        return listC;
    }

    private final List<e3> processNewCandidate(e3.b bVar, e3.b bVar2) {
        List<e3.b> listCandidateMrzDetectionOrEmpty;
        if (bVar2 != null) {
            if (isPerfect(bVar2.getMrz())) {
                listCandidateMrzDetectionOrEmpty = zhm.u.c(bVar2);
                cleanUpCandidate();
            } else {
                if (errorsCount(bVar2.getMrz()) < errorsCount(bVar.getMrz())) {
                    saveCandidate(this.f36369c, bVar2);
                }
                listCandidateMrzDetectionOrEmpty = isTimeout() ? candidateMrzDetectionOrEmpty() : zhm.f0.f322471a;
            }
            if (listCandidateMrzDetectionOrEmpty != null) {
                return listCandidateMrzDetectionOrEmpty;
            }
        }
        return isTimeout() ? candidateMrzDetectionOrEmpty() : zhm.f0.f322471a;
    }

    private final List<e3> saveCandidate(Long l2, e3.b bVar) {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f36369c = l2;
        this.d = bVar;
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public List<e3> invoke(@NotNull List<? extends e3> input) {
        List<e3> listProcessNewCandidate;
        Intrinsics.checkNotNullParameter(input, "input");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : input) {
            if (obj2 instanceof e3.b) {
                arrayList.add(obj2);
            }
        }
        e3.b bVar = (e3.b) zhm.d0.d0(arrayList);
        e3.b bVar2 = this.d;
        return (bVar2 == null || (listProcessNewCandidate = processNewCandidate(bVar2, bVar)) == null) ? bVar != null ? processAsFirstCandidate(bVar) : input : listProcessNewCandidate;
    }
}
