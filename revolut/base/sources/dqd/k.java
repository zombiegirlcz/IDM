package dqd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f116948a = yhm.j.b(new dmj.b(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f116949b = yhm.j.b(new dmj.b(13));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f116950c = yhm.j.b(new dmj.b(14));
    public final Lazy d = yhm.j.b(new dmj.b(15));

    public static final class a {
        private a() {
        }
    }

    public final TextLocalisedClause a() {
        return (TextLocalisedClause) this.f116949b.getValue();
    }

    public final TextLocalisedClause b() {
        return (TextLocalisedClause) this.f116948a.getValue();
    }

    public final TextLocalisedClause c() {
        return (TextLocalisedClause) this.f116950c.getValue();
    }
}
