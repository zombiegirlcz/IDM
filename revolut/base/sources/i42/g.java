package i42;

import ab4.q;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.uri.ApmRegistrationTermsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApmRegistrationTermsScreen f158276b;

    public /* synthetic */ g(ApmRegistrationTermsScreen apmRegistrationTermsScreen, int i) {
        this.f158275a = i;
        this.f158276b = apmRegistrationTermsScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f158275a;
        ApmRegistrationTermsScreen apmRegistrationTermsScreen = this.f158276b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = ApmRegistrationTermsScreen.T;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.d = new g(apmRegistrationTermsScreen, 1);
                break;
            default:
                Exception t2 = (Exception) obj2;
                KProperty[] kPropertyArr2 = ApmRegistrationTermsScreen.T;
                Intrinsics.checkNotNullParameter(t2, "error");
                l lVarE3 = apmRegistrationTermsScreen.e3();
                lVarE3.getClass();
                Intrinsics.checkNotNullParameter(t2, "t");
                lVarE3.H2(lVarE3.f158278q, new q(t2, 17));
                break;
        }
        return Unit.f186387a;
    }
}
