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
import vjg.i;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/ParticlesThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ParticlesThemeDeclaration implements GlobalThemeDeclaration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f94521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94522c;

    @NotNull
    public static final Parcelable.Creator<ParticlesThemeDeclaration> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) a.f(parcel, "parcel", ParticlesThemeDeclaration.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ColorThemeOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ParticlesThemeDeclaration(clause, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParticlesThemeDeclaration[i];
        }
    }

    public ParticlesThemeDeclaration(Clause title, List accentColors, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColors, "accentColors");
        this.f94520a = title;
        this.f94521b = accentColors;
        this.f94522c = z;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: E7, reason: from getter */
    public final boolean getF94501c() {
        return this.f94522c;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final i T4() {
        return i.PARTICLES;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return u.c("particles");
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: a1 */
    public final CoverIcon getI() {
        return new CoverIcon.Url("https://assets.revolut.com/mobile/media_library/v5/wallpaper_animations/thumbnail/bg552@3x.png", "https://assets.revolut.com/mobile/media_library/v5/wallpaper_animations/thumbnail_dark/bg552@3x.png");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ParticlesThemeDeclaration)) {
            return false;
        }
        ParticlesThemeDeclaration particlesThemeDeclaration = (ParticlesThemeDeclaration) obj2;
        return Intrinsics.f(this.f94520a, particlesThemeDeclaration.f94520a) && Intrinsics.f(this.f94521b, particlesThemeDeclaration.f94521b) && this.f94522c == particlesThemeDeclaration.f94522c;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final vjg.a g0() {
        return vjg.a.MAIN;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getId */
    public final String getF94454a() {
        return "particles";
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94499a() {
        return this.f94520a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94522c) + p.a.d(this.f94520a.hashCode() * 31, 31, this.f94521b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94520a, i);
        Iterator itV = p.a.v(this.f94521b, dest);
        while (itV.hasNext()) {
            ((ColorThemeOption) itV.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f94522c ? 1 : 0);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6, reason: from getter */
    public final List getF94491b() {
        return this.f94521b;
    }
}
