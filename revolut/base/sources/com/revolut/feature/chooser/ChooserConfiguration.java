package com.revolut.feature.chooser;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/chooser/ChooserConfiguration;", "Lcom/revolut/feature/chooser/ChooserScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "ConfigurationType", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooserConfiguration implements ChooserScreenContract$Configuration {

    @NotNull
    public static final Parcelable.Creator<ChooserConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfigurationType f65891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65892c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f65894h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f65895j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f65896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnalyticsProduct f65897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f65898n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/chooser/ChooserConfiguration$ConfigurationType;", "Landroid/os/Parcelable;", "Companion", "a", "NamedConfiguration", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ConfigurationType extends Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f65900a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser/ChooserConfiguration$ConfigurationType$NamedConfiguration;", "Lcom/revolut/feature/chooser/ChooserConfiguration$ConfigurationType;", "", "toString", "()Ljava/lang/String;", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NamedConfiguration implements ConfigurationType {

            @NotNull
            public static final Parcelable.Creator<NamedConfiguration> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65899a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NamedConfiguration(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NamedConfiguration[i];
                }
            }

            public NamedConfiguration(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f65899a = name;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NamedConfiguration) && Intrinsics.f(this.f65899a, ((NamedConfiguration) obj2).f65899a);
            }

            public final int hashCode() {
                return this.f65899a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65899a);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.chooser.ChooserConfiguration$ConfigurationType$a, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f65900a = new Companion();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final NamedConfiguration f65901b = new NamedConfiguration("Default");

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final NamedConfiguration f65902c = new NamedConfiguration("Country");
            public static final NamedConfiguration d = new NamedConfiguration("Region");
            public static final NamedConfiguration e;

            static {
                new NamedConfiguration("ProfileRegion");
                e = new NamedConfiguration("Currency");
                new NamedConfiguration("Nationality");
                new NamedConfiguration("SecondNationality");
                new NamedConfiguration("DocType");
                new NamedConfiguration("ProfileCountry");
                new NamedConfiguration("Title");
            }

            private Companion() {
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChooserScreenContract$Model.CREATOR, parcel, arrayList, iA, 1);
            }
            ConfigurationType configurationType = (ConfigurationType) parcel.readParcelable(ChooserConfiguration.class.getClassLoader());
            boolean z12 = true;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z12 = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z29 = z;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z29;
            } else {
                z3 = z29;
                z29 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = z6;
            } else {
                z11 = z6;
                z6 = false;
            }
            return new ChooserConfiguration(arrayList, configurationType, string, z12, string2, string3, string4, z29, z3, z4, z6, parcel.readInt(), (AnalyticsProduct) parcel.readParcelable(ChooserConfiguration.class.getClassLoader()), parcel.readInt() != 0 ? z11 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserConfiguration[i];
        }
    }

    public ChooserConfiguration(List items, ConfigurationType configurationType, String str, boolean z, String str2, String str3, String str4, boolean z3, boolean z4, boolean z6, boolean z11, int i, AnalyticsProduct automaticEventProduct, boolean z12) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(configurationType, "configurationType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65890a = items;
        this.f65891b = configurationType;
        this.f65892c = str;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.f65893g = str4;
        this.f65894h = z3;
        this.i = z4;
        this.f65895j = z6;
        this.k = z11;
        this.f65896l = i;
        this.f65897m = automaticEventProduct;
        this.f65898n = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooserConfiguration)) {
            return false;
        }
        ChooserConfiguration chooserConfiguration = (ChooserConfiguration) obj2;
        return Intrinsics.f(this.f65890a, chooserConfiguration.f65890a) && Intrinsics.f(this.f65891b, chooserConfiguration.f65891b) && Intrinsics.f(this.f65892c, chooserConfiguration.f65892c) && this.d == chooserConfiguration.d && Intrinsics.f(this.e, chooserConfiguration.e) && Intrinsics.f(this.f, chooserConfiguration.f) && Intrinsics.f(this.f65893g, chooserConfiguration.f65893g) && this.f65894h == chooserConfiguration.f65894h && this.i == chooserConfiguration.i && this.f65895j == chooserConfiguration.f65895j && this.k == chooserConfiguration.k && this.f65896l == chooserConfiguration.f65896l && Intrinsics.f(this.f65897m, chooserConfiguration.f65897m) && this.f65898n == chooserConfiguration.f65898n;
    }

    public final int hashCode() {
        int iHashCode = (this.f65891b.hashCode() + (this.f65890a.hashCode() * 31)) * 31;
        String str = this.f65892c;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65893g;
        return Boolean.hashCode(this.f65898n) + l.a(j6.a.b(this.f65896l, j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f65894h), 31, this.i), 31, this.f65895j), 31, this.k), 31), 31, this.f65897m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f65890a, dest);
        while (itV.hasNext()) {
            ((ChooserScreenContract$Model) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f65891b, i);
        dest.writeString(this.f65892c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f65893g);
        dest.writeInt(this.f65894h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f65895j ? 1 : 0);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f65896l);
        dest.writeParcelable(this.f65897m, i);
        dest.writeInt(this.f65898n ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChooserConfiguration(List list, ConfigurationType configurationType, String str, boolean z, String str2, String str3, boolean z3, int i, AnalyticsProduct.Retail retail, boolean z4, int i2) {
        ConfigurationType configurationType2;
        AnalyticsProduct.Retail retailG;
        if ((i2 & 2) != 0) {
            ConfigurationType.INSTANCE.getClass();
            configurationType2 = ConfigurationType.Companion.f65901b;
        } else {
            configurationType2 = configurationType;
        }
        String str4 = (i2 & 4) != 0 ? null : str;
        boolean z6 = (i2 & 8) != 0 ? true : z;
        String str5 = (i2 & 16) != 0 ? null : str2;
        String str6 = (i2 & 64) != 0 ? null : str3;
        boolean z11 = (i2 & 256) != 0 ? true : z3;
        boolean z12 = (i2 & 1024) == 0;
        int i3 = (i2 & 2048) != 0 ? R$string.chooser_search_empty_message : i;
        if ((i2 & 4096) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.o;
            retailG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            retailG = retail;
        }
        this(list, configurationType2, str4, z6, str5, null, str6, true, z11, false, z12, i3, retailG, (i2 & 8192) != 0 ? false : z4);
    }
}
