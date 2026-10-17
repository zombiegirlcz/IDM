package qqe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f248524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f248525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactImage f248526c;

    public e(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ContactImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f248524a = title;
        this.f248525b = textLocalisedClause;
        this.f248526c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f248524a.equals(eVar.f248524a) && Intrinsics.f(this.f248525b, eVar.f248525b) && this.f248526c.equals(eVar.f248526c);
    }

    public final int hashCode() {
        int iHashCode = this.f248524a.hashCode() * 31;
        Clause clause = this.f248525b;
        return this.f248526c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
