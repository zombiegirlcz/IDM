package k25;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f180338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ft3.g f180339x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, ProductAccountId productAccountId, ft3.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f180338w = productAccountId;
        this.f180339x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, this.f180338w, this.f180339x, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((al4.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        u uVar = this.v;
        o25.i iVar = uVar.k;
        al4.i iVar2 = (al4.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = iVar2 instanceof al4.f;
        ProductAccountId productAccountId = this.f180338w;
        od0.i iVar3 = od0.i.f224256b;
        ft3.g gVar = this.f180339x;
        if (!z) {
            if (iVar2 instanceof al4.g) {
                return nim.a.v(iVar.o(productAccountId), new j2c.o(uVar, 22, gVar, iVar2));
            }
            if (!(iVar2 instanceof al4.h)) {
                throw new NoWhenBranchMatchedException();
            }
            od0.i.Companion.getClass();
            return new go.g(new Data(iVar3, null, false, 6, null), 2);
        }
        Iterator it8 = ((al4.f) iVar2).f6141a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            wp3.e eVar = (wp3.e) next;
            if (eVar.f299021c == gVar.f137828c && eVar.e == gVar.f137827b) {
                break;
            }
        }
        wp3.e eVar2 = (wp3.e) next;
        if (eVar2 != null) {
            return nim.a.v(iVar.o(productAccountId), new j2c.o(uVar, 21, gVar, eVar2));
        }
        od0.i.Companion.getClass();
        return zi0.c.i(iVar3);
    }
}
