package aw0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.WalletPassTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f10414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel.Default f10415c;
    public final Image d;
    public final boolean e;
    public final hb f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Parcelable f10416g;

    public lb(Clause title, TextLocalisedClause subtitle, AvatarModel.Default avatar, CdnImage cdnImage, boolean z, hb backgroundStyle, WalletPassTarget walletPassTarget) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(backgroundStyle, "backgroundStyle");
        this.f10413a = title;
        this.f10414b = subtitle;
        this.f10415c = avatar;
        this.d = cdnImage;
        this.e = z;
        this.f = backgroundStyle;
        this.f10416g = walletPassTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj2;
        return Intrinsics.f(this.f10413a, lbVar.f10413a) && Intrinsics.f(this.f10414b, lbVar.f10414b) && Intrinsics.f(this.f10415c, lbVar.f10415c) && Intrinsics.f(this.d, lbVar.d) && this.e == lbVar.e && this.f == lbVar.f && Intrinsics.f(this.f10416g, lbVar.f10416g);
    }

    public final int hashCode() {
        int iHashCode = (this.f10415c.hashCode() + t61.a.a(this.f10413a.hashCode() * 31, 31, this.f10414b)) * 31;
        Image image = this.d;
        int iHashCode2 = (this.f.hashCode() + j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.e)) * 31;
        Parcelable parcelable = this.f10416g;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public /* synthetic */ lb(TextLocalisedQuantityClause textLocalisedQuantityClause, TextLocalisedClause textLocalisedClause, AvatarModel.Default r112, boolean z, WalletPassTarget walletPassTarget) {
        this(textLocalisedQuantityClause, textLocalisedClause, r112, null, z, hb.Default, walletPassTarget);
    }
}
