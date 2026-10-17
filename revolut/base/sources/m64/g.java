package m64;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f203001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f203002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f203003c;
    public final List d;

    public g(ResourceImage navigationImage, TextLocalisedClause title, TextLocalisedClause button, aim.e items) {
        Intrinsics.checkNotNullParameter(navigationImage, "navigationImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203001a = navigationImage;
        this.f203002b = title;
        this.f203003c = button;
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
        return this.f203001a.equals(gVar.f203001a) && this.f203002b.equals(gVar.f203002b) && this.f203003c.equals(gVar.f203003c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f203001a.hashCode() * 31, 31, this.f203002b), 31, this.f203003c);
    }
}
