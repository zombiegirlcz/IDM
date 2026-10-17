package cfa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public TextLocalisedClause u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f23660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23661x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.f23660w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23661x |= Integer.MIN_VALUE;
        return this.f23660w.b(null, this);
    }
}
