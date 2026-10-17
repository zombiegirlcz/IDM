package owf;

import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransportTermsScreen f230440b;

    public /* synthetic */ b(TransportTermsScreen transportTermsScreen, int i) {
        this.f230439a = i;
        this.f230440b = transportTermsScreen;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f230439a;
        TransportTermsScreen transportTermsScreen = this.f230440b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = TransportTermsScreen.U;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.d = new b(transportTermsScreen, 1);
                break;
            default:
                Exception t2 = (Exception) obj2;
                KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                Intrinsics.checkNotNullParameter(t2, "error");
                m mVar = (m) transportTermsScreen.T.getValue();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(t2, "t");
                mVar.H2(mVar.f230450r, new nd8.l(t2, 4));
                break;
        }
        return Unit.f186387a;
    }
}
