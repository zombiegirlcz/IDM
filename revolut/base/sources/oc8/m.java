package oc8;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f224120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f224121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f224122y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.z = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f224122y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b3(null, this);
    }
}
