package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.uipersonalisation.api.CoverIcon;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vjg.e;
import xjg.m;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/HorizonThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HorizonThemeDeclaration implements GlobalThemeDeclaration {

    @NotNull
    public static final Parcelable.Creator<HorizonThemeDeclaration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f94497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f94498c;
    public final boolean d;
    public final Toning e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", HorizonThemeDeclaration.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ColorThemeOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HorizonThemeDeclaration(clause, Toning.CREATOR.createFromParcel(parcel), arrayList, parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HorizonThemeDeclaration[i];
        }
    }

    public HorizonThemeDeclaration(Clause title, Toning toning, List accentColors, e eVar, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColors, "accentColors");
        Intrinsics.checkNotNullParameter(toning, "toning");
        this.f94496a = title;
        this.f94497b = accentColors;
        this.f94498c = eVar;
        this.d = z;
        this.e = toning;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: E7, reason: from getter */
    public final boolean getF94501c() {
        return this.d;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: F8, reason: from getter */
    public final Toning getE() {
        return this.e;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return u.c("horizon");
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: a1 */
    public final CoverIcon getI() {
        return new CoverIcon.Url("https://assets.revolut.com/mobile/media_library/v5/wallpaper_videos/thumbnail/bg327@2x.png", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HorizonThemeDeclaration)) {
            return false;
        }
        HorizonThemeDeclaration horizonThemeDeclaration = (HorizonThemeDeclaration) obj2;
        return Intrinsics.f(this.f94496a, horizonThemeDeclaration.f94496a) && Intrinsics.f(this.f94497b, horizonThemeDeclaration.f94497b) && this.f94498c == horizonThemeDeclaration.f94498c && this.d == horizonThemeDeclaration.d && Intrinsics.f(this.e, horizonThemeDeclaration.e);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final vjg.a g0() {
        return vjg.a.REDEEMABLE;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getId */
    public final String getF94454a() {
        return "horizon";
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94499a() {
        return this.f94496a;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: h8, reason: from getter */
    public final e getD() {
        return this.f94498c;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f94496a.hashCode() * 31, 31, this.f94497b);
        e eVar = this.f94498c;
        return this.e.hashCode() + j6.a.c((iD + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.d);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: l7 */
    public final m getD() {
        return m.DAY;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94496a, i);
        Iterator itV = p.a.v(this.f94497b, dest);
        while (itV.hasNext()) {
            ((ColorThemeOption) itV.next()).writeToParcel(dest, i);
        }
        e eVar = this.f94498c;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(dest, i);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6, reason: from getter */
    public final List getF94491b() {
        return this.f94497b;
    }

    public /* synthetic */ HorizonThemeDeclaration(TextLocalisedClause textLocalisedClause, List list) {
        this(textLocalisedClause, new Toning((String) null, 2), list, e.CHALLENGE, true);
    }
}
