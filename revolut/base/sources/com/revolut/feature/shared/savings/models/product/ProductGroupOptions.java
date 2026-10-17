package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroupOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "GroupSection", "GroupOption", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductGroupOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductGroupOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86596c;
    public final List d;
    public final List e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroupOptions$GroupOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Highlight", "DisplayRate", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupOption implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GroupOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f86597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86599c;
        public final DisplayRate d;
        public final String e;
        public final ArrayList f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroupOptions$GroupOption$DisplayRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayRate implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<DisplayRate> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final xi0.b f86600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86601b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayRate(parcel.readString(), (xi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisplayRate[i];
                }
            }

            public DisplayRate(String value, xi0.b currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f86600a = currency;
                this.f86601b = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DisplayRate)) {
                    return false;
                }
                DisplayRate displayRate = (DisplayRate) obj2;
                return Intrinsics.f(this.f86600a, displayRate.f86600a) && Intrinsics.f(this.f86601b, displayRate.f86601b);
            }

            public final int hashCode() {
                return this.f86601b.hashCode() + (this.f86600a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f86600a);
                dest.writeString(this.f86601b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroupOptions$GroupOption$Highlight;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Highlight implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Highlight> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ncd.b f86602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86603b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Highlight(ncd.b.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Highlight[i];
                }
            }

            public Highlight(ncd.b icon, String text) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.f86602a = icon;
                this.f86603b = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Highlight)) {
                    return false;
                }
                Highlight highlight = (Highlight) obj2;
                return this.f86602a == highlight.f86602a && Intrinsics.f(this.f86603b, highlight.f86603b);
            }

            public final int hashCode() {
                return this.f86603b.hashCode() + (this.f86602a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86602a.name());
                dest.writeString(this.f86603b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                g gVarValueOf = g.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                DisplayRate displayRateCreateFromParcel = DisplayRate.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Highlight.CREATOR, parcel, arrayList, iA, 1);
                }
                return new GroupOption(gVarValueOf, string, string2, displayRateCreateFromParcel, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupOption[i];
            }
        }

        public GroupOption(g groupType, String subheader, String title, DisplayRate displayRate, String str, ArrayList highlights) {
            Intrinsics.checkNotNullParameter(groupType, "groupType");
            Intrinsics.checkNotNullParameter(subheader, "subheader");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(displayRate, "displayRate");
            Intrinsics.checkNotNullParameter(highlights, "highlights");
            this.f86597a = groupType;
            this.f86598b = subheader;
            this.f86599c = title;
            this.d = displayRate;
            this.e = str;
            this.f = highlights;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupOption)) {
                return false;
            }
            GroupOption groupOption = (GroupOption) obj2;
            return this.f86597a == groupOption.f86597a && Intrinsics.f(this.f86598b, groupOption.f86598b) && Intrinsics.f(this.f86599c, groupOption.f86599c) && Intrinsics.f(this.d, groupOption.d) && Intrinsics.f(this.e, groupOption.e) && this.f.equals(groupOption.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f86597a.hashCode() * 31, 31, this.f86598b), 31, this.f86599c)) * 31;
            String str = this.e;
            return this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86597a.name());
            dest.writeString(this.f86598b);
            dest.writeString(this.f86599c);
            this.d.writeToParcel(dest, i);
            dest.writeString(this.e);
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((Highlight) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroupOptions$GroupSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupSection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GroupSection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f86605b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(GroupOption.CREATOR, parcel, arrayList, iA, 1);
                }
                return new GroupSection(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupSection[i];
            }
        }

        public GroupSection(String str, List options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.f86604a = str;
            this.f86605b = options;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupSection)) {
                return false;
            }
            GroupSection groupSection = (GroupSection) obj2;
            return Intrinsics.f(this.f86604a, groupSection.f86604a) && Intrinsics.f(this.f86605b, groupSection.f86605b);
        }

        public final int hashCode() {
            String str = this.f86604a;
            return this.f86605b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86604a);
            Iterator itV = p.a.v(this.f86605b, dest);
            while (itV.hasNext()) {
                ((GroupOption) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(GroupOption.CREATOR, parcel, arrayList2, iA2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(GroupSection.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new ProductGroupOptions(string, string2, string3, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductGroupOptions[i];
        }
    }

    public ProductGroupOptions(String title, String str, String str2, List options, List list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f86594a = title;
        this.f86595b = str;
        this.f86596c = str2;
        this.d = options;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductGroupOptions)) {
            return false;
        }
        ProductGroupOptions productGroupOptions = (ProductGroupOptions) obj2;
        return Intrinsics.f(this.f86594a, productGroupOptions.f86594a) && Intrinsics.f(this.f86595b, productGroupOptions.f86595b) && Intrinsics.f(this.f86596c, productGroupOptions.f86596c) && Intrinsics.f(this.d, productGroupOptions.d) && Intrinsics.f(this.e, productGroupOptions.e);
    }

    public final int hashCode() {
        int iHashCode = this.f86594a.hashCode() * 31;
        String str = this.f86595b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86596c;
        int iD = p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        List list = this.e;
        return iD + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86594a);
        dest.writeString(this.f86595b);
        dest.writeString(this.f86596c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((GroupOption) itV.next()).writeToParcel(dest, i);
        }
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((GroupSection) itQ.next()).writeToParcel(dest, i);
        }
    }
}
