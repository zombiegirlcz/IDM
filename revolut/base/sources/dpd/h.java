package dpd;

import java.io.Serializable;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f116863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f116864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f116865y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f116865y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f116864x = obj2;
        this.z |= Integer.MIN_VALUE;
        Serializable serializableC3 = this.f116865y.c3(null, null, null, this);
        return serializableC3 == fim.a.COROUTINE_SUSPENDED ? serializableC3 : new m(serializableC3);
    }
}
