package com.revolut.feature.uipersonalisation.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xjg.j;
import xjg.m;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/models/AppTheme;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppTheme implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppTheme> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalThemeDeclaration f94561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f94562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f94563c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppTheme((GlobalThemeDeclaration) parcel.readParcelable(AppTheme.class.getClassLoader()), m.valueOf(parcel.readString()), j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppTheme[i];
        }
    }

    public AppTheme(GlobalThemeDeclaration theme, m themeMode, j colorTheme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        this.f94561a = theme;
        this.f94562b = themeMode;
        this.f94563c = colorTheme;
    }

    public static AppTheme a(AppTheme appTheme, GlobalThemeDeclaration theme, m themeMode, j colorTheme, int i) {
        if ((i & 1) != 0) {
            theme = appTheme.f94561a;
        }
        if ((i & 2) != 0) {
            themeMode = appTheme.f94562b;
        }
        if ((i & 4) != 0) {
            colorTheme = appTheme.f94563c;
        }
        appTheme.getClass();
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        return new AppTheme(theme, themeMode, colorTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj2;
        return Intrinsics.f(this.f94561a, appTheme.f94561a) && this.f94562b == appTheme.f94562b && this.f94563c == appTheme.f94563c;
    }

    public final int hashCode() {
        return this.f94563c.hashCode() + ((this.f94562b.hashCode() + (this.f94561a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94561a, i);
        dest.writeString(this.f94562b.name());
        dest.writeString(this.f94563c.name());
    }
}
