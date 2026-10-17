package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerConfig f35959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f35960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hf f35961c;
    private boolean d;
    private List e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35962a = new a("TOP", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f35963b = new a("TOP_RIGHT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f35964c = new a("RIGHT", 2);
        public static final a d = new a("BOTTOM_RIGHT", 3);
        public static final a e = new a("BOTTOM", 4);
        public static final a f = new a("BOTTOM_LEFT", 5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f35965g = new a("LEFT", 6);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f35966h = new a("TOP_LEFT", 7);
        public static final a i = new a("OTHER", 8);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f35967j;
        private static final /* synthetic */ EnumEntries k;

        private static final /* synthetic */ a[] $values() {
            return new a[]{f35962a, f35963b, f35964c, d, e, f, f35965g, f35966h, i};
        }

        static {
            a[] aVarArr$values = $values();
            f35967j = aVarArr$values;
            k = vc.s.n(aVarArr$values);
        }

        private a(String str, int i2) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return k;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35967j.clone();
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.ORCHESTRATED_LIVENESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ff.values().length];
            try {
                iArr2[ff.f36208a.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ff.f36209b.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ad(@NotNull SelfieScannerConfig config, @NotNull Function0<? extends List<Integer>> randomnessLivenessStepsProvider, @NotNull hf scannerContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(randomnessLivenessStepsProvider, "randomnessLivenessStepsProvider");
        Intrinsics.checkNotNullParameter(scannerContext, "scannerContext");
        this.f35959a = config;
        this.f35960b = randomnessLivenessStepsProvider;
        this.f35961c = scannerContext;
        prepareRandomnessLivenessConfig();
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.c(scannerContext);
        }
        u9.f36980a.flushToScannerIfPresent();
    }

    private final void clearScannerContext() {
        u9.f36980a.clear();
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.a(ib.b.Scanner);
        }
    }

    private final String getNameLowerCased(Enum<?> r3) {
        String strName = r3.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onStepCompleted$default(ad adVar, SelfieScannerStep selfieScannerStep, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            map = null;
        }
        adVar.onStepCompleted(selfieScannerStep, map);
    }

    private final void prepareRandomnessLivenessConfig() {
        List list = (List) this.f35960b.invoke();
        if (list != null) {
            this.d = true;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                int iIntValue = ((Number) it8.next()).intValue();
                arrayList.add(iIntValue != 0 ? iIntValue != 45 ? iIntValue != 90 ? iIntValue != 135 ? iIntValue != 180 ? iIntValue != 225 ? iIntValue != 270 ? iIntValue != 315 ? a.i : a.f35966h : a.f35965g : a.f : a.e : a.d : a.f35964c : a.f35963b : a.f35962a);
            }
            this.e = zhm.d0.f1(arrayList);
        }
    }

    private static final Unit prepareRandomnessLivenessConfig$lambda$1(ad adVar) {
        adVar.d = false;
        adVar.e = null;
        return Unit.f186387a;
    }

    public final void onFail(@NotNull SelfieScannerStep scannerStep, @NotNull SelfieScannerError scannerError, Throwable th10) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(scannerError, "scannerError");
        lf lfVar = new lf(scannerError, th10, bd.getStepType(scannerStep));
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(lfVar);
        }
        clearScannerContext();
    }

    public final void onMoveToNextStep() {
    }

    public final void onPermissionNotGranted(@NotNull ff permission) {
        SelfieScannerError selfieScannerError;
        Intrinsics.checkNotNullParameter(permission, "permission");
        int i = b.$EnumSwitchMapping$1[permission.ordinal()];
        if (i == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        jf jfVar = new jf(selfieScannerError);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(jfVar);
        }
        clearScannerContext();
    }

    public final void onReset() {
        mf mfVar = mf.f36581a;
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(mfVar);
        }
    }

    public final void onResetCurrentStep(@NotNull SelfieScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
    }

    public final void onStart() {
        nf nfVar = nf.f36604a;
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(nfVar);
        }
    }

    public final void onStepCompleted(@NotNull SelfieScannerStep scannerStep, Map<String, ? extends Object> map) {
        String nameLowerCased;
        a aVar;
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        String stepType = bd.getStepType(scannerStep);
        if (b.$EnumSwitchMapping$0[scannerStep.ordinal()] == 1) {
            List list = this.e;
            if (list == null || (aVar = (a) zhm.a0.G(list)) == null) {
                aVar = a.i;
            }
            nameLowerCased = getNameLowerCased(aVar);
        } else {
            nameLowerCased = null;
        }
        of ofVar = new of(stepType, nameLowerCased, map);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(ofVar);
        }
    }

    public final void onStepSuccess(@NotNull SelfieScannerStep scannerStep, @NotNull ud stepResult) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
    }

    public final void onStepUpdate(@NotNull SelfieScannerStep scannerStep) {
        String nameLowerCased;
        a aVar;
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        String stepType = bd.getStepType(scannerStep);
        if (b.$EnumSwitchMapping$0[scannerStep.ordinal()] == 1) {
            List list = this.e;
            if (list == null || (aVar = (a) zhm.a0.G(list)) == null) {
                aVar = a.i;
            }
            nameLowerCased = getNameLowerCased(aVar);
        } else {
            nameLowerCased = null;
        }
        qf qfVar = new qf(stepType, nameLowerCased);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(qfVar);
        }
    }

    public final void onSuccess(@NotNull SelfieScannerResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        kf kfVar = new kf(result.getMetadata().getMotionData());
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(kfVar);
        }
        clearScannerContext();
    }

    public final void onTakeSnapshot(@NotNull SelfieScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
    }

    public final void onVideoTypeMismatch(@NotNull me expected, @NotNull me result) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(result, "result");
        ib.d dVar = new ib.d(4, "selfie_scan_video_type_mismatched", null, zhm.r0.k(new Pair("expected", expected), new Pair("result", result)));
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(dVar);
        }
    }
}
