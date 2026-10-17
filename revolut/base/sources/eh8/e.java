package eh8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f125751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f125752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PairedImage f125753c;

    public e(TextLocalisedClause title, TextLocalisedClause subtitle, PairedImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f125751a = title;
        this.f125752b = subtitle;
        this.f125753c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f125751a.equals(eVar.f125751a) && this.f125752b.equals(eVar.f125752b) && this.f125753c.equals(eVar.f125753c);
    }

    public final int hashCode() {
        return this.f125753c.hashCode() + t61.a.a(this.f125751a.hashCode() * 31, 31, this.f125752b);
    }
}
