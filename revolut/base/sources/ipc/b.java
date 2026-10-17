package ipc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public dj0.d u;
    public TextLocalisedClause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f167724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f167725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f167726y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f167725x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f167724w = obj2;
        this.f167726y |= Integer.MIN_VALUE;
        return this.f167725x.b(null, null, null, this);
    }
}
