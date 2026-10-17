package dpd;

import java.io.Serializable;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public final /* synthetic */ k A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f116861x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f116862y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.A = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        Serializable serializableZ2 = k.Z2(this.A, null, null, null, this);
        return serializableZ2 == fim.a.COROUTINE_SUSPENDED ? serializableZ2 : new m(serializableZ2);
    }
}
