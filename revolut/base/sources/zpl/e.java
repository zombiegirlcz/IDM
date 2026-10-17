package zpl;

import akl.l;
import akl.r;
import com.revolut.sso.impl.domain.models.Claim;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f324324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f324325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Claim.PublicKey f324326y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, Claim.PublicKey publicKey, Continuation continuation) {
        super(2, continuation);
        this.f324324w = gVar;
        this.f324325x = str;
        this.f324326y = publicKey;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f324324w, this.f324325x, this.f324326y, continuation);
        eVar.v = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        l lVar = this.f324324w.f324332n;
        this.v = null;
        this.u = 1;
        Object objE = ((r) lVar).e(this.f324325x, str, this.f324326y, null, this);
        return objE == aVar ? aVar : objE;
    }
}
