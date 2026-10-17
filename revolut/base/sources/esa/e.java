package esa;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f128918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f128919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactImage f128920c;

    public e(TextClause title, Clause clause, ContactImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f128918a = title;
        this.f128919b = clause;
        this.f128920c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f128918a.equals(eVar.f128918a) && this.f128919b.equals(eVar.f128919b) && this.f128920c.equals(eVar.f128920c);
    }

    public final int hashCode() {
        return this.f128920c.hashCode() + p.a.a(this.f128918a.hashCode() * 31, 31, this.f128919b);
    }
}
