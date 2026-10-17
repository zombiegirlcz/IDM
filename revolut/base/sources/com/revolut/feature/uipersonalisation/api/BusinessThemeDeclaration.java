package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vjg.e;
import xjg.j;
import xjg.k;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/BusinessThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BusinessThemeDeclaration implements GlobalThemeDeclaration {

    @NotNull
    public static final Parcelable.Creator<BusinessThemeDeclaration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f94456c;
    public final boolean d;
    public final boolean e;
    public final Toning f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f94457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f94458h;
    public final CoverIcon i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BusinessThemeDeclaration(parcel.readString(), (Clause) parcel.readParcelable(BusinessThemeDeclaration.class.getClassLoader()), (Clause) parcel.readParcelable(BusinessThemeDeclaration.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, Toning.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), (CoverIcon) parcel.readParcelable(BusinessThemeDeclaration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BusinessThemeDeclaration[i];
        }
    }

    public BusinessThemeDeclaration(String id10, Clause title, Clause accentColorTitle, boolean z, boolean z3, Toning toning, String coverIconId, e eVar, CoverIcon coverIcon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColorTitle, "accentColorTitle");
        Intrinsics.checkNotNullParameter(toning, "toning");
        Intrinsics.checkNotNullParameter(coverIconId, "coverIconId");
        Intrinsics.checkNotNullParameter(coverIcon, "coverIcon");
        this.f94454a = id10;
        this.f94455b = title;
        this.f94456c = accentColorTitle;
        this.d = z;
        this.e = z3;
        this.f = toning;
        this.f94457g = coverIconId;
        this.f94458h = eVar;
        this.i = coverIcon;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: F8, reason: from getter */
    public final Toning getF94472c() {
        return this.f;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return u.c(this.f94454a);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: a1, reason: from getter */
    public final CoverIcon getI() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BusinessThemeDeclaration)) {
            return false;
        }
        BusinessThemeDeclaration businessThemeDeclaration = (BusinessThemeDeclaration) obj2;
        return Intrinsics.f(this.f94454a, businessThemeDeclaration.f94454a) && Intrinsics.f(this.f94455b, businessThemeDeclaration.f94455b) && Intrinsics.f(this.f94456c, businessThemeDeclaration.f94456c) && this.d == businessThemeDeclaration.d && this.e == businessThemeDeclaration.e && Intrinsics.f(this.f, businessThemeDeclaration.f) && Intrinsics.f(this.f94457g, businessThemeDeclaration.f94457g) && this.f94458h == businessThemeDeclaration.f94458h && Intrinsics.f(this.i, businessThemeDeclaration.i);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final vjg.a g0() {
        return vjg.a.MAIN;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF94454a() {
        return this.f94454a;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94470a() {
        return this.f94455b;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: h8, reason: from getter */
    public final e getD() {
        return this.f94458h;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f.hashCode() + j6.a.c(j6.a.c(p.a.a(p.a.a(this.f94454a.hashCode() * 31, 31, this.f94455b), 31, this.f94456c), 31, this.d), 31, this.e)) * 31, 31, this.f94457g);
        e eVar = this.f94458h;
        return this.i.hashCode() + ((iC + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: isDefault, reason: from getter */
    public final boolean getF94537c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94454a);
        dest.writeParcelable(this.f94455b, i);
        dest.writeParcelable(this.f94456c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f94457g);
        e eVar = this.f94458h;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeParcelable(this.i, i);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6 */
    public final List getF94559b() {
        return u.c(new ColorThemeOption(j.DEFAULT, this.f94456c, k.ALWAYS));
    }
}
