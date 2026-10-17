package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.df0;
import com.fourthline.orca.internal.ff0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sf0 implements lf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f32995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p70 f32996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f32997c;
    private final ff0 d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ff0.a.InterfaceC0196a f32998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f32999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Pair f33000c;
        private final Pair d;

        public a(ff0.a.InterfaceC0196a videoSource, Pair initialFrameRange, Pair scanningFrameRange, Pair successFrameRange) {
            Intrinsics.checkNotNullParameter(videoSource, "videoSource");
            Intrinsics.checkNotNullParameter(initialFrameRange, "initialFrameRange");
            Intrinsics.checkNotNullParameter(scanningFrameRange, "scanningFrameRange");
            Intrinsics.checkNotNullParameter(successFrameRange, "successFrameRange");
            this.f32998a = videoSource;
            this.f32999b = initialFrameRange;
            this.f33000c = scanningFrameRange;
            this.d = successFrameRange;
        }

        public final Pair a() {
            return this.f32999b;
        }

        public final Pair b() {
            return this.f33000c;
        }

        public final Pair c() {
            return this.d;
        }

        public final ff0.a.InterfaceC0196a d() {
            return this.f32998a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f32998a, aVar.f32998a) && Intrinsics.f(this.f32999b, aVar.f32999b) && Intrinsics.f(this.f33000c, aVar.f33000c) && Intrinsics.f(this.d, aVar.d);
        }

        public int hashCode() {
            return (((((this.f32998a.hashCode() * 31) + this.f32999b.hashCode()) * 31) + this.f33000c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "VideoModel(videoSource=" + this.f32998a + ", initialFrameRange=" + this.f32999b + ", scanningFrameRange=" + this.f33000c + ", successFrameRange=" + this.d + ")";
        }
    }

    public sf0(Function0 videoSource, p70 loadingSpinnerLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        Intrinsics.checkNotNullParameter(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32995a = videoSource;
        this.f32996b = loadingSpinnerLottieSource;
        this.f32997c = imageServiceLocator;
        this.d = new ff0.b(c81.a.a(c81.f27404a, R.string.step_qes_loading_header, 0, 2, null), loadingSpinnerLottieSource);
    }

    private final a s() {
        return new a((ff0.a.InterfaceC0196a) this.f32995a.invoke(), new Pair(0, 6700), new Pair(6700, 8200), new Pair(8200, 10000));
    }

    @Override // com.fourthline.orca.internal.lf0
    public /* bridge */ Function1 b(int i) {
        return super.b(i);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ff0 getInitialState() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.lf0
    public ff0 m() {
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.step_document_nfc_scan_hint_android_success_title, 0, 2, null);
        c81.b bVar = c81.b.f27406b;
        a aVarS = s();
        return new ff0.e(new ff0.a(aVarS.d(), new Pair(aVarS.c().f186385a, aVarS.c().f186386b), false, 4, null), dVarA, bVar, this.f32997c.a(r10.L0), this.f32997c.a(r10.J0));
    }

    @Override // com.fourthline.orca.internal.lf0
    public ff0.c q() {
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detecting_title, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detecting_message_center, 0, 2, null);
        a aVarS = s();
        return new ff0.c(new ff0.a(aVarS.d(), new Pair(aVarS.a().f186385a, aVarS.a().f186386b), true), dVarA, dVarA2, this.f32997c.a(r10.L0), new df0.b(this.f32996b));
    }

    @Override // com.fourthline.orca.internal.lf0
    public ff0.d b() {
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detected_title, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_selfie_capture_message_device_not_steady, 0, 2, null);
        a aVarS = s();
        return new ff0.d(new ff0.a(aVarS.d(), new Pair(aVarS.b().f186385a, aVarS.b().f186386b), true), dVarA, dVarA2, this.f32997c.a(r10.L0), new df0.a(0, kotlin.ranges.f.g(0, 0, 10), 1, null));
    }
}
