package yl4;

import fnc.s;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.g0;
import kotlin.text.n;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements MatchResult {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f314654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f314655b = j.b(new y99.c(this, 22));

    public b(o oVar) {
        this.f314654a = oVar;
    }

    @Override // kotlin.text.MatchResult
    public final s a() {
        return g0.b(this.f314654a);
    }

    @Override // kotlin.text.MatchResult
    public final n b() {
        return this.f314654a.f187921c;
    }

    @Override // kotlin.text.MatchResult
    public final List c() {
        return this.f314654a.c();
    }

    public final Map d() {
        return (Map) this.f314655b.getValue();
    }

    @Override // kotlin.text.MatchResult
    public final IntRange getRange() {
        return this.f314654a.getRange();
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        return this.f314654a.getValue();
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        return this.f314654a.next();
    }
}
