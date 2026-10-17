package l42;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f192036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f192037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f192038c;
    public final ContactImage d;
    public final LayeredImage e;

    public c(MoneyClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause date, ContactImage contactImage, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f192036a = title;
        this.f192037b = textLocalisedClause;
        this.f192038c = date;
        this.d = contactImage;
        this.e = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f192036a.equals(cVar.f192036a) && this.f192037b.equals(cVar.f192037b) && this.f192038c.equals(cVar.f192038c) && this.d.equals(cVar.d) && this.e.equals(cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + t61.a.a(t61.a.a(this.f192036a.hashCode() * 31, 31, this.f192037b), 31, this.f192038c)) * 31);
    }
}
