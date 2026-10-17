package hg2;

import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ h B;
    public int C;
    public String u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f152069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f152070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f152071y;
    public Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, null, null, null, null, this);
    }
}
