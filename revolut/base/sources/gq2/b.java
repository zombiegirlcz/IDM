package gq2;

import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TermsAndConditionsScreen f145520b;

    public /* synthetic */ b(TermsAndConditionsScreen termsAndConditionsScreen, int i) {
        this.f145519a = i;
        this.f145520b = termsAndConditionsScreen;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f145519a;
        TermsAndConditionsScreen termsAndConditionsScreen = this.f145520b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = TermsAndConditionsScreen.P;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.d = new b(termsAndConditionsScreen, 1);
                break;
            default:
                Exception exception = (Exception) obj2;
                KProperty[] kPropertyArr2 = TermsAndConditionsScreen.P;
                Intrinsics.checkNotNullParameter(exception, "error");
                n nVar = (n) ((j) termsAndConditionsScreen.N.getValue());
                nVar.getClass();
                Intrinsics.checkNotNullParameter(exception, "exception");
                nVar.H2(nVar.f145540q, new d22.f(4, exception));
                break;
        }
        return Unit.f186387a;
    }
}
