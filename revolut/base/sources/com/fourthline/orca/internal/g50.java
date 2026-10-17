package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.le1;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g50 implements l21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p70 f28754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final le1 f28756c;
    private final le1.a.C0242a d;
    private final c21.b.d e;
    private final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f28757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f28758h;
    private final e21 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c21 f28759j;
    private final c21.b.d k;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieScannerWarning.values().length];
            try {
                iArr[SelfieScannerWarning.FACE_NOT_IN_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_NOT_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_TOO_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_TOO_FAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerWarning.FACE_YAW_TOO_BIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieScannerWarning.DEVICE_NOT_STEADY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g50(p70 loadingSpinnerLottieSource, final p70 livenessLeftLottieSource, final p70 livenessRightLottieSource, p70 livenessLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
        Intrinsics.checkNotNullParameter(livenessLeftLottieSource, "livenessLeftLottieSource");
        Intrinsics.checkNotNullParameter(livenessRightLottieSource, "livenessRightLottieSource");
        Intrinsics.checkNotNullParameter(livenessLottieSource, "livenessLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28754a = livenessLottieSource;
        this.f28755b = imageServiceLocator;
        le1 le1Var = new le1(imageServiceLocator.a(r10.f32587o0), t70.f33239a, null);
        this.f28756c = le1Var;
        le1.a.C0242a c0242a = new le1.a.C0242a(imageServiceLocator.a(r10.p0), false, false, 2, null);
        this.d = c0242a;
        c81.d dVarA = c81.f27404a.a(R.string.step_selfie_capture_message_selfie, R.string.shared_selfie_instruction_automatic_accessibility);
        r10 r10Var = r10.L0;
        this.e = new c21.b.d(dVarA, le1Var, imageServiceLocator.a(r10Var), loadingSpinnerLottieSource);
        final int i = 0;
        this.f = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.hm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g50 f29338b;

            {
                this.f29338b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return g50.a(this.f29338b, livenessLeftLottieSource);
                    default:
                        return g50.b(this.f29338b, livenessLeftLottieSource);
                }
            }
        });
        final int i2 = 1;
        this.f28757g = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.hm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g50 f29338b;

            {
                this.f29338b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return g50.a(this.f29338b, livenessRightLottieSource);
                    default:
                        return g50.b(this.f29338b, livenessRightLottieSource);
                }
            }
        });
        this.f28758h = yhm.j.b(new ul1(this, 9));
        c81.b bVar = c81.b.f27406b;
        this.i = new e21(bVar, le1.a(le1Var, null, null, new le1.a.c(c0242a.a()), 3, null), imageServiceLocator.a(r10Var));
        this.f28759j = new d21(bVar, imageServiceLocator.a(r10Var), null, imageServiceLocator.a(r10.J0), 4, null);
        this.k = b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 c(c21 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof c21.b.c.a)) {
            return state;
        }
        c21.b.c.a aVar = (c21.b.c.a) state;
        return aVar.a((12287 & 1) != 0 ? aVar.f27326a : null, (12287 & 2) != 0 ? aVar.f27327b : null, (12287 & 4) != 0 ? aVar.f27328c : null, (12287 & 8) != 0 ? aVar.d : null, (12287 & 16) != 0 ? aVar.e : null, (12287 & 32) != 0 ? aVar.f : null, (12287 & 64) != 0 ? aVar.f27329g : null, (12287 & 128) != 0 ? aVar.f27330h : null, (12287 & 256) != 0 ? aVar.i : null, (12287 & 512) != 0 ? aVar.f27331j : null, (12287 & 1024) != 0 ? aVar.k : null, (12287 & 2048) != 0 ? aVar.f27332l : null, (12287 & 4096) != 0 ? aVar.f27333m : null, (12287 & 8192) != 0 ? aVar.f27334n : null);
    }

    @Override // com.fourthline.orca.internal.l21
    public /* bridge */ Function1 a(Bitmap bitmap) {
        return super.a(bitmap);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 d() {
        return this.f28759j;
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.C0176b f() {
        return (c21.b.C0176b) this.f28757g.getValue();
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 o() {
        return new bi1(27);
    }

    @Override // com.fourthline.orca.internal.l21
    public /* bridge */ Function1 p() {
        return super.p();
    }

    @Override // com.fourthline.orca.internal.l21
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public c21.b.d b() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.a u() {
        return (c21.b.a) this.f28758h.getValue();
    }

    @Override // com.fourthline.orca.internal.l21
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public e21 j() {
        return this.i;
    }

    @Override // com.fourthline.orca.internal.l21
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public c21.b.e r() {
        return new c21.b.e(null, null, this.f28755b.a(r10.L0), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21.b.C0176b b(g50 g50Var, p70 p70Var) {
        return new c21.b.C0176b(c81.f27404a.a(R.string.step_selfie_capture_message_liveness_right, R.string.shared_liveness_instruction_right_accessibility), p70Var, null, g50Var.f28755b.a(r10.L0));
    }

    private final Pair d(int i) {
        int i2 = ((i % 360) / 45) * 100;
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i2 + 75));
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.C0176b h() {
        return (c21.b.C0176b) this.f.getValue();
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c21.b.d getInitialState() {
        return this.k;
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.c.C0177b c(int i) {
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_liveness_successful, 0, 2, null);
        z10 z10VarA = this.f28755b.a(r10.f32595t0);
        z10 z10VarA2 = this.f28755b.a(r10.u0);
        z10 z10VarA3 = this.f28755b.a(r10.f32596v0);
        return new c21.b.c.C0177b(dVarA, new le1(this.f28755b.a(r10.f32593s0), t70.f33239a, null), this.f28755b.a(r10.f32591r0), z10VarA, z10VarA2, z10VarA3, null, this.f28755b.a(r10.J0), i, this.f28755b.a(r10.L0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21.b.C0176b a(g50 g50Var, p70 p70Var) {
        return new c21.b.C0176b(c81.f27404a.a(R.string.step_selfie_capture_message_liveness_left, R.string.shared_liveness_instruction_left_accessibility), p70Var, null, g50Var.f28755b.a(r10.L0));
    }

    @Override // com.fourthline.orca.internal.l21
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c21.b.d a(SelfieScannerWarning warning) {
        Intrinsics.checkNotNullParameter(warning, "warning");
        return c21.b.d.a(b(), c(warning), le1.a(this.f28756c, null, null, new le1.a.C0242a(this.d.a(), true, false), 3, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21.b.a a(g50 g50Var) {
        return new c21.b.a(c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_dynamic, 0, 2, null), g50Var.f28755b.a(r10.q0), null, g50Var.f28755b.a(r10.L0));
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 b(c21 c21Var) {
        Intrinsics.checkNotNullParameter(c21Var, "<this>");
        if (!(c21Var instanceof c21.b.d)) {
            return c21Var;
        }
        c21.b.d dVar = (c21.b.d) c21Var;
        return c21.b.d.a(dVar, c81.b.f27406b, le1.a(dVar.getMask(), null, null, null, 3, null), null, null, 12, null);
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 a(final int i) {
        return new Function1() { // from class: com.fourthline.orca.internal.gm1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return g50.a(this.f28936a, i, (c21) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 a(g50 g50Var, int i, c21 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof c21.b.c.a)) {
            return state;
        }
        c21.b.c.a aVar = (c21.b.c.a) state;
        return aVar.a((12287 & 1) != 0 ? aVar.f27326a : null, (12287 & 2) != 0 ? aVar.f27327b : null, (12287 & 4) != 0 ? aVar.f27328c : null, (12287 & 8) != 0 ? aVar.d : null, (12287 & 16) != 0 ? aVar.e : null, (12287 & 32) != 0 ? aVar.f : null, (12287 & 64) != 0 ? aVar.f27329g : null, (12287 & 128) != 0 ? aVar.f27330h : null, (12287 & 256) != 0 ? aVar.i : null, (12287 & 512) != 0 ? aVar.f27331j : null, (12287 & 1024) != 0 ? aVar.k : null, (12287 & 2048) != 0 ? aVar.f27332l : null, (12287 & 4096) != 0 ? aVar.f27333m : g50Var.d(i), (12287 & 8192) != 0 ? aVar.f27334n : null);
    }

    private final c81 c(SelfieScannerWarning selfieScannerWarning) {
        switch (a.$EnumSwitchMapping$0[selfieScannerWarning.ordinal()]) {
            case 1:
                return c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_face_not_in_frame, 0, 2, null);
            case 2:
                return c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_face_not_detected, 0, 2, null);
            case 3:
                return c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_face_too_close, 0, 2, null);
            case 4:
                return c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_face_too_far, 0, 2, null);
            case 5:
                return c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_face_not_straight, 0, 2, null);
            case 6:
                return c81.b.f27406b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.orca.internal.l21
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c21.a.C0175a a(ScannerImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        c81.a aVar = c81.f27404a;
        return new c21.a.C0175a(c81.a.a(aVar, R.string.step_selfie_capture_header_confirm, 0, 2, null), c81.a.a(aVar, R.string.step_selfie_capture_message_confirm, 0, 2, null), image.getCropped(), c81.a.a(aVar, R.string.shared_button_retake, 0, 2, null), c81.a.a(aVar, R.string.step_selfie_capture_message_confirm_first_mobile, 0, 2, null), c81.a.a(aVar, R.string.step_selfie_capture_message_confirm_second_mobile, 0, 2, null), c81.a.a(aVar, R.string.step_selfie_capture_message_confirm_third_mobile, 0, 2, null), c81.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), null, this.f28755b.a(r10.P0), 256, null);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.c.a a(Pair stepsProgress, int i) {
        Intrinsics.checkNotNullParameter(stepsProgress, "stepsProgress");
        return new c21.b.c.a(c81.f27404a.a(R.string.step_selfie_capture_message_liveness, i != 0 ? i != 45 ? i != 90 ? i != 135 ? i != 180 ? i != 225 ? i != 270 ? i != 315 ? -2113338353 : R.string.shared_liveness_instruction_upward_left_accessibility : R.string.shared_liveness_instruction_left_accessibility : R.string.shared_liveness_instruction_downward_left_accessibility : R.string.shared_liveness_instruction_bottom_accessibility : R.string.shared_liveness_instruction_downward_right_accessibility : R.string.shared_liveness_instruction_right_accessibility : R.string.shared_liveness_instruction_upward_right_accessibility : R.string.shared_liveness_instruction_top_accessibility), new le1(this.f28755b.a(r10.f32593s0), t70.f33239a, null), this.f28755b.a(r10.f32591r0), this.f28755b.a(r10.f32595t0), this.f28755b.a(r10.u0), this.f28755b.a(r10.f32596v0), Integer.valueOf(i), null, null, null, stepsProgress, this.f28754a, d(i), this.f28755b.a(r10.L0), 896, null);
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 a(Integer num, Float f, Float f4) {
        return new com.fourthline.core.location.internal.b(num, 2, f, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 a(Integer num, Float f, Float f4, c21 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof c21.b.c.a)) {
            return state;
        }
        c21.b.c.a aVar = (c21.b.c.a) state;
        return aVar.a((12287 & 1) != 0 ? aVar.f27326a : null, (12287 & 2) != 0 ? aVar.f27327b : null, (12287 & 4) != 0 ? aVar.f27328c : null, (12287 & 8) != 0 ? aVar.d : null, (12287 & 16) != 0 ? aVar.e : null, (12287 & 32) != 0 ? aVar.f : null, (12287 & 64) != 0 ? aVar.f27329g : null, (12287 & 128) != 0 ? aVar.f27330h : num, (12287 & 256) != 0 ? aVar.i : f, (12287 & 512) != 0 ? aVar.f27331j : f4, (12287 & 1024) != 0 ? aVar.k : null, (12287 & 2048) != 0 ? aVar.f27332l : null, (12287 & 4096) != 0 ? aVar.f27333m : null, (12287 & 8192) != 0 ? aVar.f27334n : null);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.c.C0177b a(int i, Pair stepsProgress) {
        Intrinsics.checkNotNullParameter(stepsProgress, "stepsProgress");
        return new c21.b.c.C0177b(c81.a.a(c81.f27404a, R.string.step_selfie_capture_message_liveness, 0, 2, null), new le1(this.f28755b.a(r10.f32593s0), t70.f33239a, null), this.f28755b.a(r10.f32591r0), this.f28755b.a(r10.f32595t0), this.f28755b.a(r10.u0), this.f28755b.a(r10.f32596v0), stepsProgress, null, i, this.f28755b.a(r10.L0));
    }
}
