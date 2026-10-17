package m78;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f203345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203346y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f203345x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203344w = obj2;
        this.f203346y |= Integer.MIN_VALUE;
        return this.f203345x.b(null, this);
    }
}
