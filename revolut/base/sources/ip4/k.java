package ip4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f167657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f167658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f167659c;
    public final List d;

    public k(TextLocalisedClause textLocalisedClause, ContactImage contactImage, List items, int i) {
        TextLocalisedClause title = new TextLocalisedClause(R$string.additional_cards_cardholders_details_settings_title, null, null, 14);
        textLocalisedClause = (i & 2) != 0 ? null : textLocalisedClause;
        contactImage = (i & 4) != 0 ? null : contactImage;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167657a = title;
        this.f167658b = textLocalisedClause;
        this.f167659c = contactImage;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f167657a, kVar.f167657a) && Intrinsics.f(this.f167658b, kVar.f167658b) && Intrinsics.f(this.f167659c, kVar.f167659c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f167657a.hashCode() * 31;
        Clause clause = this.f167658b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f167659c;
        return this.d.hashCode() + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }
}
