package ax9;

import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10897a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileScannerScreen f10898b;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f10897a;
        ProfileScannerScreen profileScannerScreen = this.f10898b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = ProfileScannerScreen.T;
                qji.b bVarQ2 = profileScannerScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.payments.profile.impl.ui_kompot.scanner.di.ProfileScannerScreenComponentInjector");
                ow9.f fVar = (ow9.f) bVarQ2;
                return new ow9.j(fVar.f230359b, fVar.f230360c, profileScannerScreen);
            default:
                KProperty[] kPropertyArr2 = ProfileScannerScreen.T;
                return (f) ((ow9.j) profileScannerScreen.Q.getValue()).f230398m.get();
        }
    }
}
