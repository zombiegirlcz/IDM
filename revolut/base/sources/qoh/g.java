package qoh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import poh.k;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.c f248215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f248216b;

    public g(zel.c cVar, TextLocalisedClause textLocalisedClause) {
        this.f248215a = cVar;
        this.f248216b = textLocalisedClause;
    }

    @Override // poh.k
    public final Clause a() {
        return this.f248216b;
    }
}
