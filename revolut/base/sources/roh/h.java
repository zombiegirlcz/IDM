package roh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h implements poh.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.a f256013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256014b;

    public h(zel.a aVar, TextLocalisedClause textLocalisedClause) {
        this.f256013a = aVar;
        this.f256014b = textLocalisedClause;
    }

    @Override // poh.k
    public final Clause a() {
        return this.f256014b;
    }
}
