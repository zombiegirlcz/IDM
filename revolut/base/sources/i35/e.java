package i35;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f158098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f158099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f158100c;
    public final List d;

    public e(Clause title, TextLocalisedClause subtitle, LayeredImage image, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158098a = title;
        this.f158099b = subtitle;
        this.f158100c = image;
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
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f158098a.equals(eVar.f158098a) && this.f158099b.equals(eVar.f158099b) && this.f158100c.equals(eVar.f158100c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.e(this.f158100c, t61.a.a(this.f158098a.hashCode() * 31, 31, this.f158099b), 31);
    }
}
