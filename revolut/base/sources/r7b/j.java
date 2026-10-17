package r7b;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f252068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f252069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f252070c;
    public final Image d;

    public j(TextLocalisedClause title, TextClause subtitle, TimeClause description, Image icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f252068a = title;
        this.f252069b = subtitle;
        this.f252070c = description;
        this.d = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f252068a.equals(jVar.f252068a) && this.f252069b.equals(jVar.f252069b) && this.f252070c.equals(jVar.f252070c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.d(this.f252070c, v7.b(this.f252068a.hashCode() * 31, 31, this.f252069b), 31);
    }
}
