package yr9;

import java.util.List;
import nb6.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public List u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f316155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f316156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f316157y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f316156x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f316155w = obj2;
        this.f316157y |= Integer.MIN_VALUE;
        return this.f316156x.Z2(null, null, this);
    }
}
