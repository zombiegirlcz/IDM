package ax9;

import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$ProcessingState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aii.m f10906b;

    public /* synthetic */ j(aii.m mVar, int i) {
        this.f10905a = i;
        this.f10906b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f10905a) {
            case 0:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                ProfileScannerScreenContract$ProcessingState profileScannerScreenContract$ProcessingState = (ProfileScannerScreenContract$ProcessingState) this.f10906b;
                updateState.getClass();
                return e.a(profileScannerScreenContract$ProcessingState);
            case 1:
                by6.g update = (by6.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return by6.g.a(update, ((dy6.d) this.f10906b).f121065b, null, 2);
            case 2:
                hea.o update2 = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return hea.o.a(update2, null, false, null, null, null, null, null, null, false, null, null, false, null, ((kea.a) this.f10906b).f183059b, false, 24575);
            case 3:
                jy6.h update3 = (jy6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                ly6.e eVar = (ly6.e) this.f10906b;
                return jy6.h.a(update3, eVar.f200710c, false, eVar.f200709b, null, 10);
            default:
                wx6.h update4 = (wx6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return wx6.h.a(update4, null, false, ((yx6.d) this.f10906b).f317577b, 3);
        }
    }
}
