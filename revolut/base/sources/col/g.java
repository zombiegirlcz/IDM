package col;

import com.revolut.sso.impl.domain.models.Challenge;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public Challenge u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f25575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25576y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f25575x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25574w = obj2;
        this.f25576y |= Integer.MIN_VALUE;
        return this.f25575x.d3(null, false, this);
    }
}
