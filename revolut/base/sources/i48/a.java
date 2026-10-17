package i48;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public TextLocalisedClause u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f158308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f158309x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f158308w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f158309x |= Integer.MIN_VALUE;
        return this.f158308w.b(null, this);
    }
}
