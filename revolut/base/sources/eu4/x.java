package eu4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f129522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f129523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f129524c;

    public x(TextLocalisedClause title, Clause subtitle, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f129522a = title;
        this.f129523b = subtitle;
        this.f129524c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f129522a.equals(xVar.f129522a) && this.f129523b.equals(xVar.f129523b) && this.f129524c.equals(xVar.f129524c);
    }

    public final int hashCode() {
        return this.f129524c.hashCode() + p.a.b(this.f129522a.hashCode() * 31, 31, this.f129523b);
    }
}
