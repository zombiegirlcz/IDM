package vb3;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f287388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f287389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f287390c;
    public final Image d;
    public final ArrayList e;

    public n(TextClause title, TextLocalisedClause description, ArrayList actions, Image icon, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f287388a = title;
        this.f287389b = description;
        this.f287390c = actions;
        this.d = icon;
        this.e = items;
    }

    @Override // jki.n
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f287388a.equals(nVar.f287388a) && this.f287389b.equals(nVar.f287389b) && this.f287390c.equals(nVar.f287390c) && this.d.equals(nVar.d) && this.e.equals(nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a10.b.c(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f287390c, t61.a.a(this.f287388a.hashCode() * 31, 31, this.f287389b), 31), 31);
    }
}
