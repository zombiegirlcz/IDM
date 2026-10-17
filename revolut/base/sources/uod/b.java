package uod;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CdnImage f281622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdnImage f281623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f281624c;
    public final ResourceImage d;
    public final ResourceImage e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f281625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextLocalisedClause f281626h;
    public final NumberClause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f281627j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f281628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f281629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f281630n;

    public b(CdnImage backgroundImage, CdnImage cardBackgroundImage, Image image, ResourceImage topCardIcon, ResourceImage revolutLogo, TextLocalisedClause userName, TextLocalisedClause joinDateLabel, TextLocalisedClause countriesCountLabel, NumberClause countriesCount, PercentageClause percentageClause, TextLocalisedClause textLocalisedClause, TextClause textClause, TextLocalisedClause textLocalisedClause2, ArrayList actions) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(cardBackgroundImage, "cardBackgroundImage");
        Intrinsics.checkNotNullParameter(topCardIcon, "topCardIcon");
        Intrinsics.checkNotNullParameter(revolutLogo, "revolutLogo");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(joinDateLabel, "joinDateLabel");
        Intrinsics.checkNotNullParameter(countriesCountLabel, "countriesCountLabel");
        Intrinsics.checkNotNullParameter(countriesCount, "countriesCount");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f281622a = backgroundImage;
        this.f281623b = cardBackgroundImage;
        this.f281624c = image;
        this.d = topCardIcon;
        this.e = revolutLogo;
        this.f = userName;
        this.f281625g = joinDateLabel;
        this.f281626h = countriesCountLabel;
        this.i = countriesCount;
        this.f281627j = percentageClause;
        this.k = textLocalisedClause;
        this.f281628l = textClause;
        this.f281629m = textLocalisedClause2;
        this.f281630n = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f281622a.equals(bVar.f281622a) && this.f281623b.equals(bVar.f281623b) && Intrinsics.f(this.f281624c, bVar.f281624c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.f281625g.equals(bVar.f281625g) && this.f281626h.equals(bVar.f281626h) && this.i.equals(bVar.i) && Intrinsics.f(this.f281627j, bVar.f281627j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f281628l, bVar.f281628l) && Intrinsics.f(this.f281629m, bVar.f281629m) && this.f281630n.equals(bVar.f281630n);
    }

    public final int hashCode() {
        int iHashCode = (this.f281623b.hashCode() + (this.f281622a.hashCode() * 31)) * 31;
        Image image = this.f281624c;
        int iHashCode2 = (this.i.hashCode() + t61.a.a(t61.a.a(t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.e, org.bouncycastle.jcajce.provider.digest.a.b(this.d, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31), 31, this.f), 31, this.f281625g), 31, this.f281626h)) * 31;
        Clause clause = this.f281627j;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.k;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f281628l;
        int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f281629m;
        return this.f281630n.hashCode() + ((iHashCode5 + (clause4 != null ? clause4.hashCode() : 0)) * 31);
    }
}
