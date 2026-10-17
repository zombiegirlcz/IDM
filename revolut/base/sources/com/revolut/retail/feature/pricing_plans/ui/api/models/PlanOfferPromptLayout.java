package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ggk/d0", "Header", "Content", "Subtitle", "Style", "Asset", "Background", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanOfferPromptLayout implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanOfferPromptLayout> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Header f102690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Content f102691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Background f102692c;
    public final PricingPlanLayoutFooter d;
    public final d0 e;
    public final List f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Asset;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/d", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Asset implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Asset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f102693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102694b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Asset(d.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Asset[i];
            }
        }

        public Asset(d type, String url2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f102693a = type;
            this.f102694b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj2;
            return this.f102693a == asset.f102693a && Intrinsics.f(this.f102694b, asset.f102694b);
        }

        public final int hashCode() {
            return this.f102694b.hashCode() + (this.f102693a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102693a.name());
            dest.writeString(this.f102694b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Background;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/e", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Background implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Background> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f102695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Asset f102697c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Background(e.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Background[i];
            }
        }

        public Background(e type, String str, Asset asset) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f102695a = type;
            this.f102696b = str;
            this.f102697c = asset;
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
            return this.f102695a == background.f102695a && Intrinsics.f(this.f102696b, background.f102696b) && Intrinsics.f(this.f102697c, background.f102697c);
        }

        public final int hashCode() {
            int iHashCode = this.f102695a.hashCode() * 31;
            String str = this.f102696b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Asset asset = this.f102697c;
            return iHashCode2 + (asset != null ? asset.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102695a.name());
            dest.writeString(this.f102696b);
            Asset asset = this.f102697c;
            if (asset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                asset.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Content;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Style f102698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PricingPlanLayoutHyperText f102700c;
        public final Asset d;
        public final Subtitle e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Content(parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel), parcel.readString(), PricingPlanLayoutHyperText.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Subtitle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(Style style, String title, PricingPlanLayoutHyperText description, Asset asset, Subtitle subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f102698a = style;
            this.f102699b = title;
            this.f102700c = description;
            this.d = asset;
            this.e = subtitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Content)) {
                return false;
            }
            Content content = (Content) obj2;
            return Intrinsics.f(this.f102698a, content.f102698a) && Intrinsics.f(this.f102699b, content.f102699b) && Intrinsics.f(this.f102700c, content.f102700c) && Intrinsics.f(this.d, content.d) && Intrinsics.f(this.e, content.e);
        }

        public final int hashCode() {
            Style style = this.f102698a;
            int iHashCode = (this.f102700c.hashCode() + p.a.c((style == null ? 0 : style.f102702a.hashCode()) * 31, 31, this.f102699b)) * 31;
            Asset asset = this.d;
            int iHashCode2 = (iHashCode + (asset == null ? 0 : asset.hashCode())) * 31;
            Subtitle subtitle = this.e;
            return iHashCode2 + (subtitle != null ? subtitle.f102703a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Style style = this.f102698a;
            if (style == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                style.writeToParcel(dest, i);
            }
            dest.writeString(this.f102699b);
            this.f102700c.writeToParcel(dest, i);
            Asset asset = this.d;
            if (asset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                asset.writeToParcel(dest, i);
            }
            Subtitle subtitle = this.e;
            if (subtitle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                subtitle.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Header implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102701a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Header(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f102701a = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Header) && Intrinsics.f(this.f102701a, ((Header) obj2).f102701a);
        }

        public final int hashCode() {
            return this.f102701a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102701a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Style;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/f", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Style implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Style> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f102702a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Style(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Style[i];
            }
        }

        public Style(f display) {
            Intrinsics.checkNotNullParameter(display, "display");
            this.f102702a = display;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Style) && this.f102702a == ((Style) obj2).f102702a;
        }

        public final int hashCode() {
            return this.f102702a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102702a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Subtitle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subtitle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Subtitle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f102703a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanOfferPromptLayout$Subtitle$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/g", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102704a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PricingPlanAction f102705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f102706c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString(), (PricingPlanAction) parcel.readParcelable(Item.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String text, PricingPlanAction pricingPlanAction, g style) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f102704a = text;
                this.f102705b = pricingPlanAction;
                this.f102706c = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj2;
                return Intrinsics.f(this.f102704a, item.f102704a) && Intrinsics.f(this.f102705b, item.f102705b) && this.f102706c == item.f102706c;
            }

            public final int hashCode() {
                int iHashCode = this.f102704a.hashCode() * 31;
                PricingPlanAction pricingPlanAction = this.f102705b;
                return this.f102706c.hashCode() + ((iHashCode + (pricingPlanAction == null ? 0 : pricingPlanAction.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102704a);
                dest.writeParcelable(this.f102705b, i);
                dest.writeString(this.f102706c.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Subtitle(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subtitle[i];
            }
        }

        public Subtitle(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f102703a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Subtitle) && this.f102703a.equals(((Subtitle) obj2).f102703a);
        }

        public final int hashCode() {
            return this.f102703a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f102703a, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Header headerCreateFromParcel = parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel);
            Content contentCreateFromParcel = Content.CREATOR.createFromParcel(parcel);
            Background backgroundCreateFromParcel = parcel.readInt() == 0 ? null : Background.CREATOR.createFromParcel(parcel);
            PricingPlanLayoutFooter pricingPlanLayoutFooterCreateFromParcel = parcel.readInt() == 0 ? null : PricingPlanLayoutFooter.CREATOR.createFromParcel(parcel);
            d0 d0VarValueOf = d0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PlanOfferPromptLayout.class, parcel, arrayList, iE, 1);
                }
            }
            return new PlanOfferPromptLayout(headerCreateFromParcel, contentCreateFromParcel, backgroundCreateFromParcel, pricingPlanLayoutFooterCreateFromParcel, d0VarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanOfferPromptLayout[i];
        }
    }

    public PlanOfferPromptLayout(Header header, Content content, Background background, PricingPlanLayoutFooter pricingPlanLayoutFooter, d0 format, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f102690a = header;
        this.f102691b = content;
        this.f102692c = background;
        this.d = pricingPlanLayoutFooter;
        this.e = format;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanOfferPromptLayout)) {
            return false;
        }
        PlanOfferPromptLayout planOfferPromptLayout = (PlanOfferPromptLayout) obj2;
        return Intrinsics.f(this.f102690a, planOfferPromptLayout.f102690a) && Intrinsics.f(this.f102691b, planOfferPromptLayout.f102691b) && Intrinsics.f(this.f102692c, planOfferPromptLayout.f102692c) && Intrinsics.f(this.d, planOfferPromptLayout.d) && this.e == planOfferPromptLayout.e && Intrinsics.f(this.f, planOfferPromptLayout.f);
    }

    public final int hashCode() {
        Header header = this.f102690a;
        int iHashCode = (this.f102691b.hashCode() + ((header == null ? 0 : header.f102701a.hashCode()) * 31)) * 31;
        Background background = this.f102692c;
        int iHashCode2 = (iHashCode + (background == null ? 0 : background.hashCode())) * 31;
        PricingPlanLayoutFooter pricingPlanLayoutFooter = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (pricingPlanLayoutFooter == null ? 0 : pricingPlanLayoutFooter.hashCode())) * 31)) * 31;
        List list = this.f;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Header header = this.f102690a;
        if (header == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            header.writeToParcel(dest, i);
        }
        this.f102691b.writeToParcel(dest, i);
        Background background = this.f102692c;
        if (background == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            background.writeToParcel(dest, i);
        }
        PricingPlanLayoutFooter pricingPlanLayoutFooter = this.d;
        if (pricingPlanLayoutFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanLayoutFooter.writeToParcel(dest, i);
        }
        dest.writeString(this.e.name());
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
