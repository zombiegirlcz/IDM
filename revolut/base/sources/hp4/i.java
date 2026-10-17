package hp4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f154451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f154452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f154453c;
    public final List d;

    public i(List items) {
        TextLocalisedClause title = new TextLocalisedClause(R$string.cardholder_account_info_title, null, null, 14);
        TextLocalisedClause subtitle = new TextLocalisedClause(R$string.cardholder_account_info_subtitle, null, null, 14);
        LayeredImage descriptionImage = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(descriptionImage, "descriptionImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154451a = title;
        this.f154452b = subtitle;
        this.f154453c = descriptionImage;
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
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154451a, iVar.f154451a) && Intrinsics.f(this.f154452b, iVar.f154452b) && Intrinsics.f(this.f154453c, iVar.f154453c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.e(this.f154453c, t61.a.a(this.f154451a.hashCode() * 31, 31, this.f154452b), 31);
    }
}
