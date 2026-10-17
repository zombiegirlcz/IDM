package anl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.ui.external_entry.external_entry.choose_account.ChooseAccountScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooseAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChooseAccountScreen chooseAccountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooseAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Z.getValue();
        Object obj3 = model.u;
        i iVar = (i) fVar;
        iVar.getClass();
        RevolutAccountSession revolutAccountSession = obj3 instanceof RevolutAccountSession ? (RevolutAccountSession) obj3 : null;
        if (revolutAccountSession == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", p.a.p("Illegal state: Parcel type is not supported: ", obj3 != null ? o0.f186429a.b(obj3.getClass()).m() : null, ".\nParcel must be supported"), null, h0Var);
        } else {
            iVar.v2(new d(revolutAccountSession));
        }
        return Unit.f186387a;
    }
}
