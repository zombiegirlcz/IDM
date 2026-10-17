package w16;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.defi.accounts.impl.R$string;
import do3.q;
import elm.f;
import gim.i;
import knd.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import l16.e;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.accounts.impl.ui.creation.flow.a f293800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.defi.accounts.impl.ui.creation.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f293800w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f293800w, continuation, 0);
            default:
                return new d(this.f293800w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.defi.accounts.impl.ui.creation.flow.a aVar = this.f293800w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f16.b bVar = aVar.o;
                String string = aVar.f71648p.b(new TextLocalisedClause(R$string.defi_accounts_creation_default_name, null, null, 14)).toString();
                String str = aVar.f71649q;
                this.v = 1;
                e eVar = (e) bVar;
                eVar.getClass();
                h0 h0Var = new h0(eVar, string, str, null, 17);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, h0Var, this);
                return objJ == aVar2 ? aVar2 : objJ;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d dVar = new d(aVar, null, 0);
                this.v = 1;
                Object objT = q.t(aVar, dVar, this);
                return objT == aVar3 ? aVar3 : objT;
        }
    }
}
