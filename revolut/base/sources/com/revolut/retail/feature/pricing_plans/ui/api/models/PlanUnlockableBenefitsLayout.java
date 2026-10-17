package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Header", "ContentItem", "Button", "Icon", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanUnlockableBenefitsLayout implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanUnlockableBenefitsLayout> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Header f102717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f102719c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button;", "Landroid/os/Parcelable;", "<init>", "()V", "Primary", "Secondary", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button$Primary;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button$Secondary;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Button implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button$Primary;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Primary extends Button {

            @NotNull
            public static final Parcelable.Creator<Primary> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f102721b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Primary(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Primary[i];
                }
            }

            public Primary(String title, String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f102720a = title;
                this.f102721b = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Primary)) {
                    return false;
                }
                Primary primary = (Primary) obj2;
                return Intrinsics.f(this.f102720a, primary.f102720a) && Intrinsics.f(this.f102721b, primary.f102721b);
            }

            public final int hashCode() {
                return this.f102721b.hashCode() + (this.f102720a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102720a);
                dest.writeString(this.f102721b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button$Secondary;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Button;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Secondary extends Button {

            @NotNull
            public static final Parcelable.Creator<Secondary> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f102723b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Secondary(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Secondary[i];
                }
            }

            public Secondary(String title, String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f102722a = title;
                this.f102723b = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Secondary)) {
                    return false;
                }
                Secondary secondary = (Secondary) obj2;
                return Intrinsics.f(this.f102722a, secondary.f102722a) && Intrinsics.f(this.f102723b, secondary.f102723b);
            }

            public final int hashCode() {
                return this.f102723b.hashCode() + (this.f102722a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102722a);
                dest.writeString(this.f102723b);
            }
        }

        private Button() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$ContentItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContentItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ContentItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Icon f102725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102726c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContentItem(parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContentItem[i];
            }
        }

        public ContentItem(String title, Icon icon, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f102724a = title;
            this.f102725b = icon;
            this.f102726c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) obj2;
            return Intrinsics.f(this.f102724a, contentItem.f102724a) && Intrinsics.f(this.f102725b, contentItem.f102725b) && Intrinsics.f(this.f102726c, contentItem.f102726c);
        }

        public final int hashCode() {
            int iHashCode = this.f102724a.hashCode() * 31;
            Icon icon = this.f102725b;
            int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.f102731a.hashCode())) * 31;
            String str = this.f102726c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102724a);
            Icon icon = this.f102725b;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
            dest.writeString(this.f102726c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Header implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102729c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f102730g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Header(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header(String id10, String str, String subtitle, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.f102727a = id10;
            this.f102728b = str;
            this.f102729c = subtitle;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.f102730g = str5;
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
            return Intrinsics.f(this.f102727a, header.f102727a) && Intrinsics.f(this.f102728b, header.f102728b) && Intrinsics.f(this.f102729c, header.f102729c) && Intrinsics.f(this.d, header.d) && Intrinsics.f(this.e, header.e) && Intrinsics.f(this.f, header.f) && Intrinsics.f(this.f102730g, header.f102730g);
        }

        public final int hashCode() {
            int iHashCode = this.f102727a.hashCode() * 31;
            String str = this.f102728b;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f102729c);
            String str2 = this.d;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f102730g;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102727a);
            dest.writeString(this.f102728b);
            dest.writeString(this.f102729c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f102730g);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanUnlockableBenefitsLayout$Icon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102731a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Icon(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Icon[i];
            }
        }

        public Icon(String assetName) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            this.f102731a = assetName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Icon) && Intrinsics.f(this.f102731a, ((Icon) obj2).f102731a);
        }

        public final int hashCode() {
            return this.f102731a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102731a);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ContentItem.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(PlanUnlockableBenefitsLayout.class, parcel, arrayList2, iE, 1);
            }
            return new PlanUnlockableBenefitsLayout(headerCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanUnlockableBenefitsLayout[i];
        }
    }

    public PlanUnlockableBenefitsLayout(Header header, ArrayList content, ArrayList buttons) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f102717a = header;
        this.f102718b = content;
        this.f102719c = buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanUnlockableBenefitsLayout)) {
            return false;
        }
        PlanUnlockableBenefitsLayout planUnlockableBenefitsLayout = (PlanUnlockableBenefitsLayout) obj2;
        return Intrinsics.f(this.f102717a, planUnlockableBenefitsLayout.f102717a) && this.f102718b.equals(planUnlockableBenefitsLayout.f102718b) && this.f102719c.equals(planUnlockableBenefitsLayout.f102719c);
    }

    public final int hashCode() {
        return this.f102719c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f102718b, this.f102717a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f102717a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f102718b, dest);
        while (itY.hasNext()) {
            ((ContentItem) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f102719c, dest);
        while (itY2.hasNext()) {
            dest.writeParcelable((Parcelable) itY2.next(), i);
        }
    }
}
