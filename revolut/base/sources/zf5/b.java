package zf5;

import androidx.recyclerview.widget.RecyclerView;
import bjl.u;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesController;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlowContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f321862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f321863c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, int i, Object obj3, Object obj4) {
        this.f321861a = i;
        this.f321862b = obj2;
        this.f321863c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f321861a;
        Object obj2 = this.d;
        Object obj3 = this.f321863c;
        Object obj4 = this.f321862b;
        switch (i) {
            case 0:
                lf5.b bVar = (lf5.b) obj3;
                CryptoExchangeFeesMode cryptoExchangeFeesMode = (CryptoExchangeFeesMode) obj2;
                KProperty[] kPropertyArr = CryptoExchangeFeesController.P;
                phm.a aVar = (phm.a) ue0.e.j(((CryptoExchangeFeesController) obj4).m2()).a().get(tf5.e.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", tf5.e.class, " is not found"));
                }
                tf5.e eVar = ((tf5.e) aVar2.b()).o;
                bVar.getClass();
                cryptoExchangeFeesMode.getClass();
                return new tf5.f(eVar, bVar, cryptoExchangeFeesMode);
            case 1:
                zl7.d dVar = (zl7.d) obj3;
                ((NavBarWithToolbar) obj4).removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) dVar);
                ((RecyclerView) obj2).removeOnScrollListener(dVar);
                return Unit.f186387a;
            default:
                com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a aVar3 = (com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a) obj3;
                AuthenticationFlow authenticationFlow = (AuthenticationFlow) obj2;
                if (!((Ref$BooleanRef) obj4).f186407a) {
                    rql.a aVar4 = aVar3.f106693p;
                    ReauthenticationWrapperFlowContract$InputData reauthenticationWrapperFlowContract$InputData = aVar3.o;
                    aVar4.a(reauthenticationWrapperFlowContract$InputData.f106688a, pql.e.f238815a);
                    int i2 = zol.c.f324083a[reauthenticationWrapperFlowContract$InputData.d.ordinal()];
                    if (i2 == 1) {
                        oki.h.D2(aVar3.u);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        authenticationFlow.c3(u.f16189a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
