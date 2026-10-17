package ahe;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ w0 B;
    public int C;
    public List u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f5034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f5035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f5036y;
    public ohe.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.B = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return w0.c(this.B, null, null, null, this);
    }
}
