package qna;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f247900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f247901c;
    public final Image d;
    public final boolean e;

    public d(String id10, Clause title, Clause subtitle, Image icon, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f247899a = id10;
        this.f247900b = title;
        this.f247901c = subtitle;
        this.d = icon;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f247899a, dVar.f247899a) && Intrinsics.f(this.f247900b, dVar.f247900b) && Intrinsics.f(this.f247901c, dVar.f247901c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a10.b.c(this.d, p.a.a(p.a.a(this.f247899a.hashCode() * 31, 31, this.f247900b), 31, this.f247901c), 31);
    }
}
