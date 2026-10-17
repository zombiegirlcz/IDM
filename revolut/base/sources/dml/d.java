package dml;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreen;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$DomainState;
import dmj.e0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectIdentityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectIdentityScreen selectIdentityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectIdentityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object notSelected;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.sso.impl.ui.consent.common.select_identity.a aVar2 = (com.revolut.sso.impl.ui.consent.common.select_identity.a) iVarE3;
        y yVar = aVar2.f106462p;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        ConsentChallenge.Qr.Delegated.Selection.Identity identity = obj3 instanceof ConsentChallenge.Qr.Delegated.Selection.Identity ? (ConsentChallenge.Qr.Delegated.Selection.Identity) obj3 : null;
        if (identity == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Identity parcel is not of type ConsentChallenge.Selection.Identity");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ConsentScreenModel", null, illegalStateException, h0Var);
        } else {
            List f106460b = ((SelectIdentityScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f106456b.getF106460b();
            int i = k.f116199a[model.f53306c.ordinal()];
            if (i == 1) {
                notSelected = new SelectIdentityScreenContract$DomainState.SelectionState.NotSelected(f106460b);
            } else if (i == 2) {
                notSelected = new SelectIdentityScreenContract$DomainState.SelectionState.Selected(identity, f106460b);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Selected state is indeterminate");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "ConsentScreenModel", null, illegalStateException2, h0Var2);
            }
            aVar2.H2(yVar, new e0(notSelected, 1));
        }
        return Unit.f186387a;
    }
}
