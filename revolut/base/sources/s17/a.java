package s17;

import aii.u;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public u u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f259102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259103y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f259102x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259101w = obj2;
        this.f259103y |= Integer.MIN_VALUE;
        return this.f259102x.c(null, null, this);
    }
}
