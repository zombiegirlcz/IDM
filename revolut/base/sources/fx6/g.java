package fx6;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f138750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f138751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f138752c;
    public final List d;

    public g(TextLocalisedClause title, TextLocalisedClause buttonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138750a = title;
        this.f138751b = buttonText;
        this.f138752c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f138750a.equals(gVar.f138750a) && this.f138751b.equals(gVar.f138751b) && this.f138752c == gVar.f138752c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f138750a.hashCode() * 31, 31, this.f138751b), 31, this.f138752c);
    }
}
