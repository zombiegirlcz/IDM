package p48;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public int A;
    public long u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f232847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f232848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f232849y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f232849y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c3(this);
    }
}
