package roh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m implements poh.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.k f256021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256022b;

    public m(zel.k kVar, TextLocalisedClause textLocalisedClause) {
        this.f256021a = kVar;
        this.f256022b = textLocalisedClause;
    }

    @Override // poh.k
    public final Clause a() {
        return this.f256022b;
    }
}
