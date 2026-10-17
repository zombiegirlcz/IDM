package com.revolut.feature.pricingplans.models.cancel;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Header", "FeeAndRefundItem", "DetailDialogScreenConfig", "ActionButton", "SimpleTextItem", "Footer", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanCancelScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanCancelScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Header f81160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleTextItem f81161c;
    public final List d;
    public final ActionButton e;
    public final ActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Footer f81162g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig$ActionButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ActionButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81165c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionButton(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionButton[i];
            }
        }

        public ActionButton(String str, String label, String str2) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f81163a = str;
            this.f81164b = label;
            this.f81165c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) obj2;
            return Intrinsics.f(this.f81163a, actionButton.f81163a) && Intrinsics.f(this.f81164b, actionButton.f81164b) && Intrinsics.f(this.f81165c, actionButton.f81165c);
        }

        public final int hashCode() {
            String str = this.f81163a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81164b);
            String str2 = this.f81165c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81163a);
            dest.writeString(this.f81164b);
            dest.writeString(this.f81165c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig$DetailDialogScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailDialogScreenConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DetailDialogScreenConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f81168c;
        public final ActionButton d;
        public final ActionButton e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SimpleTextItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new DetailDialogScreenConfig(string, string2, arrayList, parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ActionButton.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailDialogScreenConfig[i];
            }
        }

        public DetailDialogScreenConfig(String title, String str, List items, ActionButton actionButton, ActionButton actionButton2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f81166a = title;
            this.f81167b = str;
            this.f81168c = items;
            this.d = actionButton;
            this.e = actionButton2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailDialogScreenConfig)) {
                return false;
            }
            DetailDialogScreenConfig detailDialogScreenConfig = (DetailDialogScreenConfig) obj2;
            return Intrinsics.f(this.f81166a, detailDialogScreenConfig.f81166a) && Intrinsics.f(this.f81167b, detailDialogScreenConfig.f81167b) && Intrinsics.f(this.f81168c, detailDialogScreenConfig.f81168c) && Intrinsics.f(this.d, detailDialogScreenConfig.d) && Intrinsics.f(this.e, detailDialogScreenConfig.e);
        }

        public final int hashCode() {
            int iHashCode = this.f81166a.hashCode() * 31;
            String str = this.f81167b;
            int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f81168c);
            ActionButton actionButton = this.d;
            int iHashCode2 = (iD + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            ActionButton actionButton2 = this.e;
            return iHashCode2 + (actionButton2 != null ? actionButton2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81166a);
            dest.writeString(this.f81167b);
            Iterator itV = p.a.v(this.f81168c, dest);
            while (itV.hasNext()) {
                ((SimpleTextItem) itV.next()).writeToParcel(dest, i);
            }
            ActionButton actionButton = this.d;
            if (actionButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                actionButton.writeToParcel(dest, i);
            }
            ActionButton actionButton2 = this.e;
            if (actionButton2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                actionButton2.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig$FeeAndRefundItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeAndRefundItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FeeAndRefundItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailDialogScreenConfig f81171c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeAndRefundItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DetailDialogScreenConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeAndRefundItem[i];
            }
        }

        public FeeAndRefundItem(String title, String str, DetailDialogScreenConfig detailDialogScreenConfig) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f81169a = title;
            this.f81170b = str;
            this.f81171c = detailDialogScreenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeAndRefundItem)) {
                return false;
            }
            FeeAndRefundItem feeAndRefundItem = (FeeAndRefundItem) obj2;
            return Intrinsics.f(this.f81169a, feeAndRefundItem.f81169a) && Intrinsics.f(this.f81170b, feeAndRefundItem.f81170b) && Intrinsics.f(this.f81171c, feeAndRefundItem.f81171c);
        }

        public final int hashCode() {
            int iHashCode = this.f81169a.hashCode() * 31;
            String str = this.f81170b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DetailDialogScreenConfig detailDialogScreenConfig = this.f81171c;
            return iHashCode2 + (detailDialogScreenConfig != null ? detailDialogScreenConfig.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81169a);
            dest.writeString(this.f81170b);
            DetailDialogScreenConfig detailDialogScreenConfig = this.f81171c;
            if (detailDialogScreenConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                detailDialogScreenConfig.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig$Footer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Footer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Footer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f81172a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PricingPlanTextDescriptor.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Footer(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer(List descriptors) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.f81172a = descriptors;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Footer) && Intrinsics.f(this.f81172a, ((Footer) obj2).f81172a);
        }

        public final int hashCode() {
            return this.f81172a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f81172a, dest);
            while (itV.hasNext()) {
                ((PricingPlanTextDescriptor) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig$Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Header implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f81174b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PricingPlanTextDescriptor.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Header(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header(String title, List subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.f81173a = title;
            this.f81174b = subtitle;
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
            return Intrinsics.f(this.f81173a, header.f81173a) && Intrinsics.f(this.f81174b, header.f81174b);
        }

        public final int hashCode() {
            return this.f81174b.hashCode() + (this.f81173a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81173a);
            Iterator itV = p.a.v(this.f81174b, dest);
            while (itV.hasNext()) {
                ((PricingPlanTextDescriptor) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/PricingPlanCancelScreenConfig$SimpleTextItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SimpleTextItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SimpleTextItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81176b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleTextItem(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimpleTextItem[i];
            }
        }

        public SimpleTextItem(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f81175a = title;
            this.f81176b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SimpleTextItem)) {
                return false;
            }
            SimpleTextItem simpleTextItem = (SimpleTextItem) obj2;
            return Intrinsics.f(this.f81175a, simpleTextItem.f81175a) && Intrinsics.f(this.f81176b, simpleTextItem.f81176b);
        }

        public final int hashCode() {
            int iHashCode = this.f81175a.hashCode() * 31;
            String str = this.f81176b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81175a);
            dest.writeString(this.f81176b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            SimpleTextItem simpleTextItemCreateFromParcel = parcel.readInt() == 0 ? null : SimpleTextItem.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FeeAndRefundItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PricingPlanCancelScreenConfig(string, headerCreateFromParcel, simpleTextItemCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Footer.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanCancelScreenConfig[i];
        }
    }

    public PricingPlanCancelScreenConfig(String str, Header header, SimpleTextItem simpleTextItem, List feesAndRefunds, ActionButton actionButton, ActionButton actionButton2, Footer footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(feesAndRefunds, "feesAndRefunds");
        this.f81159a = str;
        this.f81160b = header;
        this.f81161c = simpleTextItem;
        this.d = feesAndRefunds;
        this.e = actionButton;
        this.f = actionButton2;
        this.f81162g = footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanCancelScreenConfig)) {
            return false;
        }
        PricingPlanCancelScreenConfig pricingPlanCancelScreenConfig = (PricingPlanCancelScreenConfig) obj2;
        return Intrinsics.f(this.f81159a, pricingPlanCancelScreenConfig.f81159a) && Intrinsics.f(this.f81160b, pricingPlanCancelScreenConfig.f81160b) && Intrinsics.f(this.f81161c, pricingPlanCancelScreenConfig.f81161c) && Intrinsics.f(this.d, pricingPlanCancelScreenConfig.d) && Intrinsics.f(this.e, pricingPlanCancelScreenConfig.e) && Intrinsics.f(this.f, pricingPlanCancelScreenConfig.f) && Intrinsics.f(this.f81162g, pricingPlanCancelScreenConfig.f81162g);
    }

    public final int hashCode() {
        String str = this.f81159a;
        int iHashCode = (this.f81160b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        SimpleTextItem simpleTextItem = this.f81161c;
        int iD = p.a.d((iHashCode + (simpleTextItem == null ? 0 : simpleTextItem.hashCode())) * 31, 31, this.d);
        ActionButton actionButton = this.e;
        int iHashCode2 = (iD + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        ActionButton actionButton2 = this.f;
        int iHashCode3 = (iHashCode2 + (actionButton2 == null ? 0 : actionButton2.hashCode())) * 31;
        Footer footer = this.f81162g;
        return iHashCode3 + (footer != null ? footer.f81172a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81159a);
        this.f81160b.writeToParcel(dest, i);
        SimpleTextItem simpleTextItem = this.f81161c;
        if (simpleTextItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            simpleTextItem.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((FeeAndRefundItem) itV.next()).writeToParcel(dest, i);
        }
        ActionButton actionButton = this.e;
        if (actionButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            actionButton.writeToParcel(dest, i);
        }
        ActionButton actionButton2 = this.f;
        if (actionButton2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            actionButton2.writeToParcel(dest, i);
        }
        Footer footer = this.f81162g;
        if (footer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footer.writeToParcel(dest, i);
        }
    }
}
