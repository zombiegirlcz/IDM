package gq5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f145571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f145572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactImage f145573c;

    public f(TextClause title, Clause clause, ContactImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f145571a = title;
        this.f145572b = clause;
        this.f145573c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f145571a.equals(fVar.f145571a) && Intrinsics.f(this.f145572b, fVar.f145572b) && this.f145573c.equals(fVar.f145573c);
    }

    public final int hashCode() {
        int iHashCode = this.f145571a.hashCode() * 31;
        Clause clause = this.f145572b;
        return this.f145573c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
