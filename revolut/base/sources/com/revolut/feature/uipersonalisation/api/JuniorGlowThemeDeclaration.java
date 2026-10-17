package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.uipersonalisation.api.CoverIcon;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/JuniorGlowThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorGlowThemeDeclaration implements GlobalThemeDeclaration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f94500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94501c;
    public final boolean d;

    @NotNull
    public static final Parcelable.Creator<JuniorGlowThemeDeclaration> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) a.f(parcel, "parcel", JuniorGlowThemeDeclaration.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ColorThemeOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new JuniorGlowThemeDeclaration(clause, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorGlowThemeDeclaration[i];
        }
    }

    public JuniorGlowThemeDeclaration(Clause title, ArrayList accentColors, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColors, "accentColors");
        this.f94499a = title;
        this.f94500b = accentColors;
        this.f94501c = z;
        this.d = z3;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: E7, reason: from getter */
    public final boolean getF94471b() {
        return this.f94501c;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return u.c("junior_glow");
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: a1 */
    public final CoverIcon getI() {
        return new CoverIcon.Url("https://assets.revolut.com/mobile/media_library/v5/wallpaper_videos/thumbnail/bg467@2x.png", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorGlowThemeDeclaration)) {
            return false;
        }
        JuniorGlowThemeDeclaration juniorGlowThemeDeclaration = (JuniorGlowThemeDeclaration) obj2;
        return Intrinsics.f(this.f94499a, juniorGlowThemeDeclaration.f94499a) && this.f94500b.equals(juniorGlowThemeDeclaration.f94500b) && this.f94501c == juniorGlowThemeDeclaration.f94501c && this.d == juniorGlowThemeDeclaration.d;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final vjg.a g0() {
        return vjg.a.MAIN;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getId */
    public final String getF94454a() {
        return "junior_glow";
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94470a() {
        return this.f94499a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f94500b, this.f94499a.hashCode() * 31, 31), 31, this.f94501c);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: isDefault, reason: from getter */
    public final boolean getF94537c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94499a, i);
        Iterator itY = a.y(this.f94500b, dest);
        while (itY.hasNext()) {
            ((ColorThemeOption) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f94501c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6 */
    public final List getF94559b() {
        return this.f94500b;
    }
}
