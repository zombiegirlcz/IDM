package wll;

import akl.l;
import akl.r;
import com.revolut.sso.impl.domain.models.Claim;
import gim.i;
import gkl.m;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hd.e f298526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f298527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Claim f298528y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hd.e eVar, String str, Claim claim, Set set, Continuation continuation) {
        super(2, continuation);
        this.f298526w = eVar;
        this.f298527x = str;
        this.f298528y = claim;
        this.z = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f298526w, this.f298527x, this.f298528y, this.z, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        l lVar = (l) this.f298526w.f151344b;
        Claim.INSTANCE.getClass();
        Claim claim = this.f298528y;
        m mVarA = Claim.Companion.a(claim);
        this.v = null;
        this.u = 1;
        Object objF = ((r) lVar).f(this.f298527x, str, mVarA, claim, this.z, this);
        return objF == aVar ? aVar : objF;
    }
}
