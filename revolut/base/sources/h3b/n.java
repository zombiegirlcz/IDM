package h3b;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f149088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyClause f149089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f149090c;

    public n(MoneyClause title, CurrencyClause subTitle, CurrencyImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f149088a = title;
        this.f149089b = subTitle;
        this.f149090c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f149088a.equals(nVar.f149088a) && this.f149089b.equals(nVar.f149089b) && this.f149090c.equals(nVar.f149090c);
    }

    public final int hashCode() {
        return this.f149090c.hashCode() + ((this.f149089b.hashCode() + (this.f149088a.hashCode() * 31)) * 31);
    }
}
