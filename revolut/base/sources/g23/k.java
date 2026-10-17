package g23;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public l u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f139804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139805x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f139806y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f139806y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f139805x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f139806y.Z2(this);
    }
}
