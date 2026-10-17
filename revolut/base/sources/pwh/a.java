package pwh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f240481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f240482c;
    public final UrlImage d;
    public final String e;

    public a(String id10, TextClause title, TextClause textClause, UrlImage icon, String deeplink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f240480a = id10;
        this.f240481b = title;
        this.f240482c = textClause;
        this.d = icon;
        this.e = deeplink;
    }

    public final String a() {
        return this.e;
    }

    public final Image b() {
        return this.d;
    }

    public final String c() {
        return this.f240480a;
    }

    public final Clause d() {
        return this.f240482c;
    }

    public final Clause e() {
        return this.f240481b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f240480a.equals(aVar.f240480a) && this.f240481b.equals(aVar.f240481b) && Intrinsics.f(this.f240482c, aVar.f240482c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f240480a.hashCode() * 31, 31, this.f240481b);
        Clause clause = this.f240482c;
        return this.e.hashCode() + v7.g(this.d, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
