package ksc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f189417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f189418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f189419c;

    public j(TextLocalisedClause title, Clause subtitle, ResourceImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f189417a = title;
        this.f189418b = subtitle;
        this.f189419c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f189417a.equals(jVar.f189417a) && this.f189418b.equals(jVar.f189418b) && this.f189419c.equals(jVar.f189419c);
    }

    public final int hashCode() {
        return this.f189419c.hashCode() + p.a.b(this.f189417a.hashCode() * 31, 31, this.f189418b);
    }
}
