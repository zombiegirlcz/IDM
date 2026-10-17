package rv1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f257675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f257676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257677y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f257676x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257675w = obj2;
        this.f257677y |= Integer.MIN_VALUE;
        return this.f257676x.a(null, this);
    }
}
