package nd1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public int A;
    public Iterator u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f214282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f214284y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f214284y = obj2;
        this.A |= Integer.MIN_VALUE;
        return i.a(this.z, this);
    }
}
