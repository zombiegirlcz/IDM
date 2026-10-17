package poh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f237995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f237996b;

    public f(zel.f fVar, TextLocalisedClause textLocalisedClause) {
        this.f237995a = fVar;
        this.f237996b = textLocalisedClause;
    }

    @Override // poh.k
    public final Clause a() {
        return this.f237996b;
    }
}
