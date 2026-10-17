package xkl;

import akl.r;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f306878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f306879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Claim.BioPublicKey f306880y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str, Claim.BioPublicKey bioPublicKey, Continuation continuation) {
        super(2, continuation);
        this.f306878w = iVar;
        this.f306879x = str;
        this.f306880y = bioPublicKey;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f306878w, this.f306879x, this.f306880y, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        akl.l lVar = this.f306878w.f306887p;
        this.v = null;
        this.u = 1;
        Object objE = ((r) lVar).e(this.f306879x, str, this.f306880y, null, this);
        return objE == aVar ? aVar : objE;
    }
}
