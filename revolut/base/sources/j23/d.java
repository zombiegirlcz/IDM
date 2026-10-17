package j23;

import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public int A;
    public a u;
    public ty0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f170662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f170663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f170664y;
    public final /* synthetic */ a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f170664y = obj2;
        this.A |= Integer.MIN_VALUE;
        return a.e(this.z, null, this);
    }
}
