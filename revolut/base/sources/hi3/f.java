package hi3;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public int A;
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f152478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f152480y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f152480y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(this, null, null);
    }
}
