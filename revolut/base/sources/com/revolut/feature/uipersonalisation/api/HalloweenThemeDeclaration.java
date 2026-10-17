package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.uipersonalisation.api.CoverIcon;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vjg.a;
import vjg.f;
import xjg.j;
import xjg.k;
import xjg.m;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/HalloweenThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HalloweenThemeDeclaration implements GlobalThemeDeclaration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Toning f94495c;

    @NotNull
    public static final Parcelable.Creator<HalloweenThemeDeclaration> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HalloweenThemeDeclaration((Clause) parcel.readParcelable(HalloweenThemeDeclaration.class.getClassLoader()), (Clause) parcel.readParcelable(HalloweenThemeDeclaration.class.getClassLoader()), Toning.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HalloweenThemeDeclaration[i];
        }
    }

    public HalloweenThemeDeclaration(Clause title, Clause accentColorTitle, Toning toning) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColorTitle, "accentColorTitle");
        Intrinsics.checkNotNullParameter(toning, "toning");
        this.f94493a = title;
        this.f94494b = accentColorTitle;
        this.f94495c = toning;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: F8, reason: from getter */
    public final Toning getE() {
        return this.f94495c;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return v.k("halloween", "halloween_lite");
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: a1 */
    public final CoverIcon getI() {
        return new CoverIcon.Url("https://assets.revolut.com/mobile/media_library/v5/wallpaper_videos/thumbnail/bg116@2x.png");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final f e2() {
        MonthDay monthDayOf = MonthDay.of(Month.OCTOBER, 1);
        Intrinsics.checkNotNullExpressionValue(monthDayOf, "of(...)");
        MonthDay monthDayOf2 = MonthDay.of(Month.NOVEMBER, 2);
        Intrinsics.checkNotNullExpressionValue(monthDayOf2, "of(...)");
        return new f(monthDayOf, monthDayOf2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HalloweenThemeDeclaration)) {
            return false;
        }
        HalloweenThemeDeclaration halloweenThemeDeclaration = (HalloweenThemeDeclaration) obj2;
        return Intrinsics.f(this.f94493a, halloweenThemeDeclaration.f94493a) && Intrinsics.f(this.f94494b, halloweenThemeDeclaration.f94494b) && Intrinsics.f(this.f94495c, halloweenThemeDeclaration.f94495c);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final a g0() {
        return a.MAIN;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getId */
    public final String getF94454a() {
        return "halloween";
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94499a() {
        return this.f94493a;
    }

    public final int hashCode() {
        return this.f94495c.hashCode() + p.a.a(this.f94493a.hashCode() * 31, 31, this.f94494b);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: l7 */
    public final m getD() {
        return m.NIGHT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94493a, i);
        dest.writeParcelable(this.f94494b, i);
        this.f94495c.writeToParcel(dest, i);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6 */
    public final List getF94491b() {
        return u.c(new ColorThemeOption(j.ORANGE, this.f94494b, k.ALWAYS));
    }
}
