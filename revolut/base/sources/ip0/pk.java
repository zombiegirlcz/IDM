package ip0;

import com.revolut.core.ui_kit.delegates.GiftCardDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pk implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f165841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f165843c;
    public final TextLocalisedClause d;

    public pk(Image cardImage, boolean z, MoneyClause moneyClause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter("SECTION_IMAGE_ID", "listId");
        Intrinsics.checkNotNullParameter(cardImage, "cardImage");
        this.f165841a = cardImage;
        this.f165842b = z;
        this.f165843c = moneyClause;
        this.d = textLocalisedClause;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new GiftCardDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return "SECTION_IMAGE_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj2;
        return this.f165841a.equals(pkVar.f165841a) && this.f165842b == pkVar.f165842b && Intrinsics.f(this.f165843c, pkVar.f165843c) && Intrinsics.f(this.d, pkVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(a10.b.c(this.f165841a, 1854470215, 31), 31, this.f165842b);
        MoneyClause moneyClause = this.f165843c;
        int iHashCode = (iC + (moneyClause == null ? 0 : moneyClause.hashCode())) * 31;
        TextLocalisedClause textLocalisedClause = this.d;
        return (iHashCode + (textLocalisedClause != null ? textLocalisedClause.hashCode() : 0)) * 31;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof pk ? (pk) oldItem : null) == null) {
            return null;
        }
        return new qk(!r9.f165841a.equals(this.f165841a), !Intrinsics.f(r9.f165843c, this.f165843c), !Intrinsics.f(r9.d, this.d), !true, ((pk) oldItem).f165842b != this.f165842b);
    }
}
