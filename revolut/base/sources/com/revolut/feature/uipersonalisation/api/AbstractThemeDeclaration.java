package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.uipersonalisation.api.CoverIcon;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xjg.m;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/AbstractThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AbstractThemeDeclaration implements GlobalThemeDeclaration {

    @NotNull
    public static final Parcelable.Creator<AbstractThemeDeclaration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f94446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94447c;
    public final m d;
    public final Toning e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", AbstractThemeDeclaration.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ColorThemeOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AbstractThemeDeclaration(clause, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), Toning.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AbstractThemeDeclaration[i];
        }
    }

    public AbstractThemeDeclaration(Clause title, List accentColors, String str, m mVar, Toning toning) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColors, "accentColors");
        Intrinsics.checkNotNullParameter(toning, "toning");
        this.f94445a = title;
        this.f94446b = accentColors;
        this.f94447c = str;
        this.d = mVar;
        this.e = toning;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: C2, reason: from getter */
    public final String getF94447c() {
        return this.f94447c;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: F8, reason: from getter */
    public final Toning getE() {
        return this.e;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return v.k("abstract", "abstract_lite");
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: a1 */
    public final CoverIcon getI() {
        return new CoverIcon.Url("https://assets.revolut.com/mobile/media_library/v5/wallpaper_videos/thumbnail/bg016@2x.png", "https://assets.revolut.com/mobile/media_library/v5/wallpaper_videos/thumbnail_dark/bg016@2x.png");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AbstractThemeDeclaration)) {
            return false;
        }
        AbstractThemeDeclaration abstractThemeDeclaration = (AbstractThemeDeclaration) obj2;
        return Intrinsics.f(this.f94445a, abstractThemeDeclaration.f94445a) && Intrinsics.f(this.f94446b, abstractThemeDeclaration.f94446b) && Intrinsics.f(this.f94447c, abstractThemeDeclaration.f94447c) && this.d == abstractThemeDeclaration.d && Intrinsics.f(this.e, abstractThemeDeclaration.e);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final vjg.a g0() {
        return vjg.a.MAIN;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getId */
    public final String getF94454a() {
        return "abstract";
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94499a() {
        return this.f94445a;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f94445a.hashCode() * 31, 31, this.f94446b);
        String str = this.f94447c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.d;
        return this.e.hashCode() + ((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: l7, reason: from getter */
    public final m getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94445a, i);
        Iterator itV = p.a.v(this.f94446b, dest);
        while (itV.hasNext()) {
            ((ColorThemeOption) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f94447c);
        m mVar = this.d;
        if (mVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(mVar.name());
        }
        this.e.writeToParcel(dest, i);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6, reason: from getter */
    public final List getF94491b() {
        return this.f94446b;
    }
}
