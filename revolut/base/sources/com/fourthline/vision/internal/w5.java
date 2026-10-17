package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class w5 implements Function1 {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f37043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oa f37044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f37045c;

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
            int[] iArr = new int[x5.values().length];
            try {
                iArr[x5.f37091a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x5.f37092b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x5.f37093c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w5(@NotNull TimestampProvider timestampProvider, @NotNull oa detectionAreaProvider, @NotNull Function0<Long> autoDetectStepDurationFactory) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(autoDetectStepDurationFactory, "autoDetectStepDurationFactory");
        this.f37043a = timestampProvider;
        this.f37044b = detectionAreaProvider;
        this.f37045c = autoDetectStepDurationFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public m invoke(@NotNull x5 documentTimeoutType) {
        Intrinsics.checkNotNullParameter(documentTimeoutType, "documentTimeoutType");
        int i = b.$EnumSwitchMapping$0[documentTimeoutType.ordinal()];
        if (i == 1) {
            return new zd(this.f37043a, 40L, TimeUnit.SECONDS);
        }
        if (i == 2) {
            return new s7(this.f37044b, this.f37043a, 250L, TimeUnit.MILLISECONDS);
        }
        if (i == 3) {
            return new ea(this.f37043a, ((Number) this.f37045c.invoke()).longValue(), TimeUnit.SECONDS);
        }
        throw new NoWhenBranchMatchedException();
    }
}
