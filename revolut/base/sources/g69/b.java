package g69;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.PocketSource;
import gim.i;
import io3.k;
import io3.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f140887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f140888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f140889y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, xi0.b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f140887w = dVar;
        this.f140888x = bVar;
        this.f140889y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f140887w, this.f140888x, this.f140889y, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Iterator it8 = ((List) pair.f186386b).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                io3.d dVar = (io3.d) next;
                if (dVar.e == l.CURRENT && dVar.f == k.ACTIVE && Intrinsics.f(dVar.f163145a, this.f140889y)) {
                    break;
                }
            }
            io3.d dVar2 = (io3.d) next;
            AccountId.Personal personal = AccountId.Personal.f51414a;
            if (dVar2 != null) {
                return new PocketSource(dVar2, personal, null);
            }
            x02.a aVar2 = this.f140887w.d;
            this.v = null;
            this.u = 1;
            obj2 = ((q12.d) aVar2).c(personal, this, this.f140888x);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return (PocketSource) obj2;
    }
}
