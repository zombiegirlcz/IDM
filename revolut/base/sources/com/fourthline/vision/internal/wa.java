package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class wa implements ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerConfig f37056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa f37057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f37058c;
    private final hf d;
    private boolean e;
    private List f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37059a = new a("TOP", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f37060b = new a("TOP_RIGHT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f37061c = new a("RIGHT", 2);
        public static final a d = new a("BOTTOM_RIGHT", 3);
        public static final a e = new a("BOTTOM", 4);
        public static final a f = new a("BOTTOM_LEFT", 5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f37062g = new a("LEFT", 6);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f37063h = new a("TOP_LEFT", 7);
        public static final a i = new a("OTHER", 8);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f37064j;
        private static final /* synthetic */ EnumEntries k;

        private static final /* synthetic */ a[] $values() {
            return new a[]{f37059a, f37060b, f37061c, d, e, f, f37062g, f37063h, i};
        }

        static {
            a[] aVarArr$values = $values();
            f37064j = aVarArr$values;
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
            return (a[]) f37064j.clone();
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
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerStep.HAND_MOVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ff.values().length];
            try {
                iArr2[ff.f36208a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ff.f36209b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public wa(@NotNull SelfieScannerConfig config, @NotNull qa errorMapper, @NotNull Function0<? extends List<Integer>> randomnessLivenessStepsProvider, @NotNull hf scannerContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(randomnessLivenessStepsProvider, "randomnessLivenessStepsProvider");
        Intrinsics.checkNotNullParameter(scannerContext, "scannerContext");
        this.f37056a = config;
        this.f37057b = errorMapper;
        this.f37058c = randomnessLivenessStepsProvider;
        this.d = scannerContext;
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

    private final String getStepType(SelfieScannerStep selfieScannerStep) {
        return b.$EnumSwitchMapping$0[selfieScannerStep.ordinal()] == 2 ? "automatic_capture" : "liveness";
    }

    private final void prepareRandomnessLivenessConfig() {
        List list = (List) this.f37058c.invoke();
        if (list != null) {
            this.e = true;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                int iIntValue = ((Number) it8.next()).intValue();
                arrayList.add(iIntValue != 0 ? iIntValue != 45 ? iIntValue != 90 ? iIntValue != 135 ? iIntValue != 180 ? iIntValue != 225 ? iIntValue != 270 ? iIntValue != 315 ? a.i : a.f37063h : a.f37062g : a.f : a.e : a.d : a.f37061c : a.f37060b : a.f37059a);
            }
            this.f = zhm.d0.f1(arrayList);
        }
    }

    private static final Unit prepareRandomnessLivenessConfig$lambda$1(wa waVar) {
        waVar.e = false;
        waVar.f = null;
        return Unit.f186387a;
    }

    private final Pair<String, String> toFatalErrorAttr(SelfieScannerError selfieScannerError) {
        return new Pair<>("fatal_error", getNameLowerCased(selfieScannerError));
    }

    private final Pair<String, Boolean> toIsVideoAvailableAttr(ua uaVar) {
        return new Pair<>("is_video_url_available", Boolean.valueOf(uaVar.getVideoUrl() != null));
    }

    private final Pair<String, String> toLivenessCheckTypeAttr(SelfieScannerConfig selfieScannerConfig) {
        return new Pair<>("liveness_check_type", getNameLowerCased(selfieScannerConfig.getLivenessCheckType()));
    }

    private final Pair<String, String> toRecordVideoAttr(SelfieScannerConfig selfieScannerConfig) {
        return new Pair<>("record_video", getNameLowerCased(selfieScannerConfig.getRecordingType()));
    }

    private final Pair<String, String> toSelfieFlowAttr(String str) {
        return new Pair<>("selfie_flow", str);
    }

    private final Pair<String, String> toStepAttr(SelfieScannerStep selfieScannerStep) {
        String str;
        int i = b.$EnumSwitchMapping$0[selfieScannerStep.ordinal()];
        if (i == 1) {
            str = "orchestrated_liveness";
        } else if (i == 2) {
            str = "automatic_selfie";
        } else if (i == 3) {
            str = "turn_head_left";
        } else if (i == 4) {
            str = "turn_head_right";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "hand_movement";
        }
        return new Pair<>("step", str);
    }

    private final Pair<String, String> videoGravity(SelfieScannerConfig selfieScannerConfig) {
        return new Pair<>("preview_gravity", "resize_aspect_fill");
    }

    @Override // com.fourthline.vision.internal.ne
    public void onMoveToNextStep() {
    }

    @Override // com.fourthline.vision.internal.ne
    public void onPermissionNotGranted(@NotNull ff permission) {
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
        ib.h hVar = hb.a.f150532a;
        hb.a.b(2, "selfie_fail", null, zhm.r0.k(toFatalErrorAttr(selfieScannerError), toSelfieFlowAttr("selfie_fail")));
        jf jfVar = new jf(selfieScannerError);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(jfVar);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.ne
    public void onReset() {
        hb.a.c(null, "selfie_reset", 6);
        mf mfVar = mf.f36581a;
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(mfVar);
        }
    }

    @Override // com.fourthline.vision.internal.ne
    public void onResetCurrentStep(@NotNull SelfieScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
    }

    @Override // com.fourthline.vision.internal.ne
    public void onStart() {
        prepareRandomnessLivenessConfig();
        ib.h hVar = hb.a.f150532a;
        SelfieScannerConfig selfieScannerConfig = this.f37056a;
        hb.a.c(zhm.r0.k(toLivenessCheckTypeAttr(selfieScannerConfig), videoGravity(selfieScannerConfig), toRecordVideoAttr(selfieScannerConfig), toSelfieFlowAttr("selfie_start")), "selfie_start", 2);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.c(this.d);
        }
        u9.f36980a.flushToScannerIfPresent();
        nf nfVar = nf.f36604a;
        ib.h hVar3 = hb.a.f150532a;
        if (hVar3 != null) {
            hVar3.f(nfVar);
        }
    }

    @Override // com.fourthline.vision.internal.ne
    public void onStepSuccess(@NotNull SelfieScannerStep scannerStep, @NotNull ud stepResult) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
    }

    @Override // com.fourthline.vision.internal.ne
    public void onSuccess(@NotNull ua result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.k(toIsVideoAvailableAttr(result), toSelfieFlowAttr("selfie_success")), "selfie_success", 2);
        kf kfVar = new kf(result.getMetadata().getMotionData());
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(kfVar);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.ne
    public void onTakeSnapshot(@NotNull SelfieScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
    }

    @Override // com.fourthline.vision.internal.ne
    public void onFail(@NotNull SelfieScannerStep scannerStep, @NotNull pa scannerError, Throwable th10) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(scannerError, "scannerError");
        SelfieScannerError selfieScannerError = (SelfieScannerError) this.f37057b.convertError(scannerError);
        ib.h hVar = hb.a.f150532a;
        hb.a.a("selfie_fail", th10, zhm.r0.k(toFatalErrorAttr(selfieScannerError), toStepAttr(scannerStep), toSelfieFlowAttr("selfie_fail")));
        lf lfVar = new lf(selfieScannerError, th10, getStepType(scannerStep));
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(lfVar);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.ne
    public void onStepUpdate(@NotNull SelfieScannerStep scannerStep) {
        String nameLowerCased;
        a aVar;
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.k(toStepAttr(scannerStep), toSelfieFlowAttr("selfie_step_update")), "selfie_step_update", 2);
        String stepType = getStepType(scannerStep);
        if (b.$EnumSwitchMapping$0[scannerStep.ordinal()] == 1) {
            List list = this.f;
            if (list == null || (aVar = (a) zhm.a0.G(list)) == null) {
                aVar = a.i;
            }
            nameLowerCased = getNameLowerCased(aVar);
        } else {
            nameLowerCased = null;
        }
        qf qfVar = new qf(stepType, nameLowerCased);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(qfVar);
        }
    }
}
