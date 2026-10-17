package r93;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f252500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f252501x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, gim.c cVar) {
        super(cVar);
        this.f252500w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f252501x |= Integer.MIN_VALUE;
        return this.f252500w.d3(null, null, null, this);
    }
}
