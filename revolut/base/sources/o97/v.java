package o97;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f223134c;

    public v(TextLocalisedClause title, ResourceImage icon, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f223132a = id10;
        this.f223133b = title;
        this.f223134c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f223132a.equals(vVar.f223132a) && this.f223133b.equals(vVar.f223133b) && this.f223134c.equals(vVar.f223134c);
    }

    public final int hashCode() {
        return this.f223134c.hashCode() + t61.a.a(this.f223132a.hashCode() * 31, 31, this.f223133b);
    }
}
