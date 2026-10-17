package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import ehe.n;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import xjg.m;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$ThemeInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationContract$ThemeInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationContract$ThemeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppTheme f63778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppTheme f63779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GlobalThemeDeclaration f63780c;
    public final boolean d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f63781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f63782h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            AppTheme appTheme = (AppTheme) j6.a.f(parcel, "parcel", ThemeCustomisationContract$ThemeInfo.class);
            AppTheme appTheme2 = (AppTheme) parcel.readParcelable(ThemeCustomisationContract$ThemeInfo.class.getClassLoader());
            GlobalThemeDeclaration globalThemeDeclaration = (GlobalThemeDeclaration) parcel.readParcelable(ThemeCustomisationContract$ThemeInfo.class.getClassLoader());
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(ThemesInteractor$Theme.CREATOR, parcel, arrayList, iA2, i);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(m.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            int iE = 0;
            while (iE != i6) {
                iE = j6.a.e(ThemeCustomisationContract$ThemeInfo.class, parcel, arrayList3, iE, i);
            }
            int i21 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i21);
            while (iA != i21) {
                iA = o.a(parcel, linkedHashSet, iA, i);
            }
            return new ThemeCustomisationContract$ThemeInfo(appTheme, appTheme2, globalThemeDeclaration, z, arrayList, arrayList2, arrayList3, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationContract$ThemeInfo[i];
        }
    }

    public ThemeCustomisationContract$ThemeInfo(AppTheme selectedStyle, AppTheme originalStyle, GlobalThemeDeclaration globalThemeDeclaration, boolean z, List availableThemes, AbstractList availableModes, List availableAccents, Set viewedFeaturedThemes) {
        Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
        Intrinsics.checkNotNullParameter(originalStyle, "originalStyle");
        Intrinsics.checkNotNullParameter(availableThemes, "availableThemes");
        Intrinsics.checkNotNullParameter(availableModes, "availableModes");
        Intrinsics.checkNotNullParameter(availableAccents, "availableAccents");
        Intrinsics.checkNotNullParameter(viewedFeaturedThemes, "viewedFeaturedThemes");
        this.f63778a = selectedStyle;
        this.f63779b = originalStyle;
        this.f63780c = globalThemeDeclaration;
        this.d = z;
        this.e = availableThemes;
        this.f = availableModes;
        this.f63781g = availableAccents;
        this.f63782h = viewedFeaturedThemes;
    }

    public final ThemesInteractor$Theme a() {
        Object obj2;
        List list = this.e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i);
            ThemesInteractor$Theme themesInteractor$Theme = (ThemesInteractor$Theme) obj2;
            GlobalThemeDeclaration globalThemeDeclaration = this.f63780c;
            if (globalThemeDeclaration != null ? Intrinsics.f(themesInteractor$Theme.f63800a.getF94454a(), globalThemeDeclaration.getF94454a()) : Intrinsics.f(themesInteractor$Theme.f63800a.getF94454a(), this.f63778a.f94561a.getF94454a())) {
                break;
            }
            i++;
        }
        return (ThemesInteractor$Theme) obj2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationContract$ThemeInfo)) {
            return false;
        }
        ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = (ThemeCustomisationContract$ThemeInfo) obj2;
        return Intrinsics.f(this.f63778a, themeCustomisationContract$ThemeInfo.f63778a) && Intrinsics.f(this.f63779b, themeCustomisationContract$ThemeInfo.f63779b) && Intrinsics.f(this.f63780c, themeCustomisationContract$ThemeInfo.f63780c) && this.d == themeCustomisationContract$ThemeInfo.d && Intrinsics.f(this.e, themeCustomisationContract$ThemeInfo.e) && Intrinsics.f(this.f, themeCustomisationContract$ThemeInfo.f) && Intrinsics.f(this.f63781g, themeCustomisationContract$ThemeInfo.f63781g) && Intrinsics.f(this.f63782h, themeCustomisationContract$ThemeInfo.f63782h);
    }

    public final int hashCode() {
        int iHashCode = (this.f63779b.hashCode() + (this.f63778a.hashCode() * 31)) * 31;
        GlobalThemeDeclaration globalThemeDeclaration = this.f63780c;
        return this.f63782h.hashCode() + p.a.d(p.a.d(p.a.d(j6.a.c((iHashCode + (globalThemeDeclaration == null ? 0 : globalThemeDeclaration.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f63781g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63778a, i);
        dest.writeParcelable(this.f63779b, i);
        dest.writeParcelable(this.f63780c, i);
        dest.writeInt(this.d ? 1 : 0);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((ThemesInteractor$Theme) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f, dest);
        while (itV2.hasNext()) {
            dest.writeString(((m) itV2.next()).name());
        }
        Iterator itV3 = p.a.v(this.f63781g, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
        Iterator itV4 = n.v(this.f63782h, dest);
        while (itV4.hasNext()) {
            dest.writeString((String) itV4.next());
        }
    }
}
