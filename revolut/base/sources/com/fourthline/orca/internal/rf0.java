package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.df0;
import com.fourthline.orca.internal.ff0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rf0 implements lf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf0 f32717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p70 f32718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye0 f32719c;
    private final v10 d;
    private final ff0 e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p70 f32720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f32721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Pair f32722c;
        private final Pair d;

        public a(p70 lottieSource, Pair initialAnimationRange, Pair scanningAnimationRange, Pair successAnimationRange) {
            Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
            Intrinsics.checkNotNullParameter(initialAnimationRange, "initialAnimationRange");
            Intrinsics.checkNotNullParameter(scanningAnimationRange, "scanningAnimationRange");
            Intrinsics.checkNotNullParameter(successAnimationRange, "successAnimationRange");
            this.f32720a = lottieSource;
            this.f32721b = initialAnimationRange;
            this.f32722c = scanningAnimationRange;
            this.d = successAnimationRange;
        }

        public final Pair a() {
            return this.f32721b;
        }

        public final p70 b() {
            return this.f32720a;
        }

        public final Pair c() {
            return this.f32722c;
        }

        public final Pair d() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f32720a, aVar.f32720a) && Intrinsics.f(this.f32721b, aVar.f32721b) && Intrinsics.f(this.f32722c, aVar.f32722c) && Intrinsics.f(this.d, aVar.d);
        }

        public int hashCode() {
            return (((((this.f32720a.hashCode() * 31) + this.f32721b.hashCode()) * 31) + this.f32722c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "LottieAnimationModel(lottieSource=" + this.f32720a + ", initialAnimationRange=" + this.f32721b + ", scanningAnimationRange=" + this.f32722c + ", successAnimationRange=" + this.d + ")";
        }
    }

    public rf0(hf0 repository, p70 loadingSpinnerLottieSource, ye0 lottieProvider, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
        Intrinsics.checkNotNullParameter(lottieProvider, "lottieProvider");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32717a = repository;
        this.f32718b = loadingSpinnerLottieSource;
        this.f32719c = lottieProvider;
        this.d = imageServiceLocator;
        this.e = new ff0.b(c81.a.a(c81.f27404a, R.string.step_qes_loading_header, 0, 2, null), loadingSpinnerLottieSource);
    }

    private final a s() {
        p70 p70VarA = this.f32719c.a(this.f32717a.a(), this.f32717a.b(), this.f32717a.d());
        Pair pair = new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f));
        Float fValueOf = Float.valueOf(0.5f);
        Float fValueOf2 = Float.valueOf(0.83f);
        return new a(p70VarA, pair, new Pair(fValueOf, fValueOf2), new Pair(fValueOf2, Float.valueOf(0.85f)));
    }

    @Override // com.fourthline.orca.internal.lf0
    public /* bridge */ Function1 b(int i) {
        return super.b(i);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ff0 getInitialState() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.lf0
    public ff0 m() {
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.step_document_nfc_scan_hint_android_success_title, 0, 2, null);
        c81.b bVar = c81.b.f27406b;
        a aVarS = s();
        return new ff0.e(new ff0.a(g81.a(aVarS.b(), aVarS.d()), new Pair(0, 0), false, 4, null), dVarA, bVar, this.d.a(r10.L0), this.d.a(r10.J0));
    }

    @Override // com.fourthline.orca.internal.lf0
    public ff0.c q() {
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detecting_title, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detecting_message_center, 0, 2, null);
        a aVarS = s();
        return new ff0.c(new ff0.a(g81.a(aVarS.b(), aVarS.a()), new Pair(0, 0), true), dVarA, dVarA2, this.d.a(r10.L0), new df0.b(this.f32718b));
    }

    @Override // com.fourthline.orca.internal.lf0
    public ff0.d b() {
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detected_title, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_selfie_capture_message_device_not_steady, 0, 2, null);
        a aVarS = s();
        return new ff0.d(new ff0.a(g81.a(aVarS.b(), aVarS.c()), new Pair(0, 0), true), dVarA, dVarA2, this.d.a(r10.L0), new df0.a(0, kotlin.ranges.f.g(0, 0, 10), 1, null));
    }
}
