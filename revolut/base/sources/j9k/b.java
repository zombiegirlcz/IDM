package j9k;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public Set u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f172353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f61.a f172354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f172355y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f61.a aVar, gim.c cVar) {
        super(cVar);
        this.f172354x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172353w = obj2;
        this.f172355y |= Integer.MIN_VALUE;
        return this.f172354x.A(null, this);
    }
}
