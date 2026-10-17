package dpd;

import java.io.Serializable;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116859w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f116859w |= Integer.MIN_VALUE;
        Serializable serializableB3 = this.v.b3(null, this);
        return serializableB3 == fim.a.COROUTINE_SUSPENDED ? serializableB3 : new m(serializableB3);
    }
}
