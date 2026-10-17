package zq5;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public String u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f324385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f324386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f324387y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f324387y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324386x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f324387y.b(null, null, null, this);
    }
}
