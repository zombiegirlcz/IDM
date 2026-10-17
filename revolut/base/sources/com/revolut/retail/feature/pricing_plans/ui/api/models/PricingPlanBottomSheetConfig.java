package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Background", "Header", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanBottomSheetConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanBottomSheetConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Header f102814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f102815c;
    public final Background d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetConfig$Background;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/j", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Background implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Background> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f102816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102817b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Background(j.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Background[i];
            }
        }

        public Background(j type, String code) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(code, "code");
            this.f102816a = type;
            this.f102817b = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Background)) {
                return false;
            }
            Background background = (Background) obj2;
            return this.f102816a == background.f102816a && Intrinsics.f(this.f102817b, background.f102817b);
        }

        public final int hashCode() {
            return this.f102817b.hashCode() + (this.f102816a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102816a.name());
            dest.writeString(this.f102817b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetConfig$Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Icon", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Header implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Icon f102820c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetConfig$Header$Icon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Icon implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Icon> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102821a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f102822b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Icon(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Icon[i];
                }
            }

            public Icon(String str, String str2) {
                this.f102821a = str;
                this.f102822b = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj2;
                return Intrinsics.f(this.f102821a, icon.f102821a) && Intrinsics.f(this.f102822b, icon.f102822b);
            }

            public final int hashCode() {
                String str = this.f102821a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f102822b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102821a);
                dest.writeString(this.f102822b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Header(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header(String title, String str, Icon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f102818a = title;
            this.f102819b = str;
            this.f102820c = icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Header)) {
                return false;
            }
            Header header = (Header) obj2;
            return Intrinsics.f(this.f102818a, header.f102818a) && Intrinsics.f(this.f102819b, header.f102819b) && Intrinsics.f(this.f102820c, header.f102820c);
        }

        public final int hashCode() {
            int iHashCode = this.f102818a.hashCode() * 31;
            String str = this.f102819b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Icon icon = this.f102820c;
            return iHashCode2 + (icon != null ? icon.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102818a);
            dest.writeString(this.f102819b);
            Icon icon = this.f102820c;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PricingPlanBottomSheetConfig.class, parcel, arrayList, iE, 1);
            }
            return new PricingPlanBottomSheetConfig(string, headerCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Background.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanBottomSheetConfig[i];
        }
    }

    public PricingPlanBottomSheetConfig(String str, Header header, List content, Background background) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f102813a = str;
        this.f102814b = header;
        this.f102815c = content;
        this.d = background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanBottomSheetConfig)) {
            return false;
        }
        PricingPlanBottomSheetConfig pricingPlanBottomSheetConfig = (PricingPlanBottomSheetConfig) obj2;
        return Intrinsics.f(this.f102813a, pricingPlanBottomSheetConfig.f102813a) && Intrinsics.f(this.f102814b, pricingPlanBottomSheetConfig.f102814b) && Intrinsics.f(this.f102815c, pricingPlanBottomSheetConfig.f102815c) && Intrinsics.f(this.d, pricingPlanBottomSheetConfig.d);
    }

    public final int hashCode() {
        String str = this.f102813a;
        int iD = p.a.d((this.f102814b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f102815c);
        Background background = this.d;
        return iD + (background != null ? background.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102813a);
        this.f102814b.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f102815c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Background background = this.d;
        if (background == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            background.writeToParcel(dest, i);
        }
    }
}
