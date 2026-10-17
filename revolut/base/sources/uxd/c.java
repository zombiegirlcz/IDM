package uxd;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f283978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f283979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f283980c;

    public c(MoneyClause title, TextLocalisedClause description, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f283978a = title;
        this.f283979b = description;
        this.f283980c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f283978a.equals(cVar.f283978a) && this.f283979b.equals(cVar.f283979b) && Intrinsics.f(this.f283980c, cVar.f283980c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f283978a.hashCode() * 31, 31, this.f283979b);
        Image image = this.f283980c;
        return iA + (image == null ? 0 : image.hashCode());
    }
}
