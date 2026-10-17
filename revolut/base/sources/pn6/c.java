package pn6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.accounts_to_link.AccountsToLinkScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pij.d1;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountsToLinkScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountsToLinkScreen accountsToLinkScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountsToLinkScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountsToLinkScreen accountsToLinkScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                accountsToLinkScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((h) accountsToLinkScreen.N.getValue());
                String str = ((f) ((j2) lVar.f237677s.f22677a).getValue()).f237669b;
                Continuation continuation = null;
                if (str == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("accountId cannot be null");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    lVar.n2(new pdi.j(lVar, str, continuation, 27), new d1(lVar, 20));
                }
                break;
        }
        return Unit.f186387a;
    }
}
