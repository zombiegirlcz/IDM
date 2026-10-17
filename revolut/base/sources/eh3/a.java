package eh3;

import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public Set u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c93.f f125702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f125703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f125704y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f125704y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125703x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f125704y.a(null, null, null, this);
    }
}
