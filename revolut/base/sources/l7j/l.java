package l7j;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f192675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f192676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f192677c;

    public l(MoneyClause title, TextLocalisedClause subtitle, CurrencyImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f192675a = title;
        this.f192676b = subtitle;
        this.f192677c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f192675a.equals(lVar.f192675a) && this.f192676b.equals(lVar.f192676b) && this.f192677c.equals(lVar.f192677c);
    }

    public final int hashCode() {
        return this.f192677c.hashCode() + t61.a.a(this.f192675a.hashCode() * 31, 31, this.f192676b);
    }
}
