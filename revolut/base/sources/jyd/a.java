package jyd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.StatementUrlState;
import gim.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {
    public Data u;
    public StatementUrlState.InPreparation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f179410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f179411x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f179412y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f179411x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f179410w = obj2;
        this.f179412y |= Integer.MIN_VALUE;
        return b.a(this.f179411x, null, this);
    }
}
