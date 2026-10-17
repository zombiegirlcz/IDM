package rpb;

import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.c {
    public VaultWidgetContext.Type u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f256351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256352x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f256351w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256352x |= Integer.MIN_VALUE;
        return this.f256351w.a(null, null, this);
    }
}
