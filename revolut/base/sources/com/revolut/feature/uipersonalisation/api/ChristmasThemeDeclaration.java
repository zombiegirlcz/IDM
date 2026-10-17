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
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/ChristmasThemeDeclaration;", "Lcom/revolut/feature/uipersonalisation/api/GlobalThemeDeclaration;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChristmasThemeDeclaration implements GlobalThemeDeclaration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94460b;

    @NotNull
    public static final Parcelable.Creator<ChristmasThemeDeclaration> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChristmasThemeDeclaration((Clause) parcel.readParcelable(ChristmasThemeDeclaration.class.getClassLoader()), (Clause) parcel.readParcelable(ChristmasThemeDeclaration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChristmasThemeDeclaration[i];
        }
    }

    public ChristmasThemeDeclaration(Clause title, Clause accentColorTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accentColorTitle, "accentColorTitle");
        this.f94459a = title;
        this.f94460b = accentColorTitle;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final List X6() {
        return u.c("christmas");
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final CoverIcon a1() {
        return new CoverIcon.Url("https://assets.revolut.com/mobile/media_library/v6/wallpaper_videos/thumbnail/bg139@2x.png");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final f e2() {
        MonthDay monthDayOf = MonthDay.of(Month.DECEMBER, 8);
        Intrinsics.checkNotNullExpressionValue(monthDayOf, "of(...)");
        MonthDay monthDayOf2 = MonthDay.of(Month.JANUARY, 8);
        Intrinsics.checkNotNullExpressionValue(monthDayOf2, "of(...)");
        return new f(monthDayOf, monthDayOf2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChristmasThemeDeclaration)) {
            return false;
        }
        ChristmasThemeDeclaration christmasThemeDeclaration = (ChristmasThemeDeclaration) obj2;
        return Intrinsics.f(this.f94459a, christmasThemeDeclaration.f94459a) && Intrinsics.f(this.f94460b, christmasThemeDeclaration.f94460b);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final a g0() {
        return a.MAIN;
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    public final String getId() {
        return "christmas";
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final Clause getF94459a() {
        return this.f94459a;
    }

    public final int hashCode() {
        return this.f94460b.hashCode() + (this.f94459a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94459a, i);
        dest.writeParcelable(this.f94460b, i);
    }

    @Override // com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration
    /* JADX INFO: renamed from: y6 */
    public final List getF94446b() {
        return u.c(new ColorThemeOption(j.DEFAULT, this.f94460b, k.ALWAYS));
    }
}
