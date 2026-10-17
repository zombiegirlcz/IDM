package svk;

import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nel.n;
import oel.l;
import s06.e;
import vkm.q;
import w4l.h;
import yhm.o;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f266031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kul.b f266032x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, n nVar, kul.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f266031w = nVar;
        this.f266032x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f266031w, this.f266032x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = this.f266031w.f214596b;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jhi.b bVarG = mo3.a.g(cVar.f266033l.z(y0.b(str), h.f294642c), null, null, 3);
            this.u = 1;
            obj2 = q.z(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Map map = (Map) obj2;
        l lVar = map != null ? (l) map.get(str) : null;
        kul.b bVar = this.f266032x;
        if (lVar == null) {
            bVar.invoke();
            return Unit.f186387a;
        }
        String str2 = lVar.e;
        if (str2 != null) {
            yji.n.P2(cVar, cVar.b3(str2), null, new e(cVar, 17, lVar, bVar), 1);
        } else {
            String str3 = lVar.f224649c;
            if (str3 != null) {
                cVar.N2(cVar.b3(str3), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new sl5.a(bVar, 25));
            } else {
                bVar.invoke();
            }
        }
        return Unit.f186387a;
    }
}
