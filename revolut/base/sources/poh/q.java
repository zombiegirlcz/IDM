package poh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.a f238007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f238008b;

    public q(zel.a aVar, TextLocalisedClause textLocalisedClause) {
        this.f238007a = aVar;
        this.f238008b = textLocalisedClause;
    }

    @Override // poh.k
    public final Clause a() {
        return this.f238008b;
    }
}
