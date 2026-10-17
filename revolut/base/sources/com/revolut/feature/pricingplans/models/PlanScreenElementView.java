package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u001d\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0016!\"#$%&'()*+,-./0123456¨\u00067"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "Landroid/os/Parcelable;", "<init>", "()V", "CellBanner", "ListView", "PlainText", "UnorderedList", "ExpansionArea", "SlotManagerBanner", "Footer", "Grid", "PrimaryButton", "SecondaryButton", "HorizontalButtons", "CellTuple", "ActionWidget", "Pager", "Icon", "Badge", "ActionButton", "Action", "DescriptionOptions", "HorizontalScroller", "Tile", "Card", "HeroCard", "Media", "FeaturedActionWidget", "LargeCard", "Timeline", "hha/b", "hha/c", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ActionWidget;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Card;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellTuple;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ExpansionArea;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$FeaturedActionWidget;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Footer;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Grid;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HeroCard;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HorizontalButtons;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HorizontalScroller;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$LargeCard;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ListView;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Media;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Pager;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$PlainText;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$PrimaryButton;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$SecondaryButton;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$SlotManagerBanner;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Tile;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Timeline;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$UnorderedList;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanScreenElementView implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81005a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f81005a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Action) && Intrinsics.f(this.f81005a, ((Action) obj2).f81005a);
        }

        public final int hashCode() {
            return this.f81005a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81005a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ActionButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ActionButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f81007b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionButton(parcel.readString(), Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionButton[i];
            }
        }

        public ActionButton(String label, Action action) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f81006a = label;
            this.f81007b = action;
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
            return Intrinsics.f(this.f81006a, actionButton.f81006a) && Intrinsics.f(this.f81007b, actionButton.f81007b);
        }

        public final int hashCode() {
            return this.f81007b.f81005a.hashCode() + (this.f81006a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81006a);
            this.f81007b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ActionWidget;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionWidget extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<ActionWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81010c;
        public final Icon d;
        public final ActionButton e;
        public final ActionButton f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionWidget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ActionButton.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionWidget[i];
            }
        }

        public ActionWidget(String str, String title, String str2, Icon icon, ActionButton actionButton, ActionButton actionButton2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f81008a = str;
            this.f81009b = title;
            this.f81010c = str2;
            this.d = icon;
            this.e = actionButton;
            this.f = actionButton2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionWidget)) {
                return false;
            }
            ActionWidget actionWidget = (ActionWidget) obj2;
            return Intrinsics.f(this.f81008a, actionWidget.f81008a) && Intrinsics.f(this.f81009b, actionWidget.f81009b) && Intrinsics.f(this.f81010c, actionWidget.f81010c) && Intrinsics.f(this.d, actionWidget.d) && Intrinsics.f(this.e, actionWidget.e) && Intrinsics.f(this.f, actionWidget.f);
        }

        public final int hashCode() {
            String str = this.f81008a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81009b);
            String str2 = this.f81010c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            Icon icon = this.d;
            int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            ActionButton actionButton = this.e;
            int iHashCode3 = (iHashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            ActionButton actionButton2 = this.f;
            return iHashCode3 + (actionButton2 != null ? actionButton2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81008a);
            dest.writeString(this.f81009b);
            dest.writeString(this.f81010c);
            Icon icon = this.d;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
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
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Badge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/pricingplans/models/a", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Badge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Icon f81011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.pricingplans.models.a f81012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81013c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Badge(parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.revolut.feature.pricingplans.models.a.valueOf(parcel.readString()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Badge[i];
            }
        }

        public Badge(Icon icon, com.revolut.feature.pricingplans.models.a aVar, String str) {
            this.f81011a = icon;
            this.f81012b = aVar;
            this.f81013c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj2;
            return Intrinsics.f(this.f81011a, badge.f81011a) && this.f81012b == badge.f81012b && Intrinsics.f(this.f81013c, badge.f81013c);
        }

        public final int hashCode() {
            Icon icon = this.f81011a;
            int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
            com.revolut.feature.pricingplans.models.a aVar = this.f81012b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f81013c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Icon icon = this.f81011a;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
            com.revolut.feature.pricingplans.models.a aVar = this.f81012b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeString(this.f81013c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Card;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Image", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81016c;
        public final Image d;
        public final Icon e;
        public final Action f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Card$Image;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Image implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81017a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Image(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f81017a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Image) && Intrinsics.f(this.f81017a, ((Image) obj2).f81017a);
            }

            public final int hashCode() {
                return this.f81017a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81017a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), parcel.readString(), Image.CREATOR.createFromParcel(parcel), Icon.CREATOR.createFromParcel(parcel), Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(String str, String title, String description, Image image, Icon icon, Action deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f81014a = str;
            this.f81015b = title;
            this.f81016c = description;
            this.d = image;
            this.e = icon;
            this.f = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Card)) {
                return false;
            }
            Card card = (Card) obj2;
            return Intrinsics.f(this.f81014a, card.f81014a) && Intrinsics.f(this.f81015b, card.f81015b) && Intrinsics.f(this.f81016c, card.f81016c) && Intrinsics.f(this.d, card.d) && Intrinsics.f(this.e, card.e) && Intrinsics.f(this.f, card.f);
        }

        public final int hashCode() {
            String str = this.f81014a;
            return this.f.f81005a.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81015b), 31, this.f81016c), 31, this.d.f81017a)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81014a);
            dest.writeString(this.f81015b);
            dest.writeString(this.f81016c);
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/pricingplans/models/b", "TitleParam", "Icon", "Accessory", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CellBanner extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<CellBanner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f81020c;
        public final List d;
        public final Icon e;
        public final ActionButton f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Action f81021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Badge f81022h;
        public final Accessory i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f81023j;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory;", "Landroid/os/Parcelable;", "<init>", "()V", "Tag", "Text", "Button", "Icon", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Button;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Icon;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Tag;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Text;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Accessory implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Button;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Button extends Accessory {

                @NotNull
                public static final Parcelable.Creator<Button> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f81024a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f81025b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Button(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Button[i];
                    }
                }

                public Button(String label, String deeplink) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    this.f81024a = label;
                    this.f81025b = deeplink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj2;
                    return Intrinsics.f(this.f81024a, button.f81024a) && Intrinsics.f(this.f81025b, button.f81025b);
                }

                public final int hashCode() {
                    return this.f81025b.hashCode() + (this.f81024a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f81024a);
                    dest.writeString(this.f81025b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Icon;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Icon extends Accessory {

                @NotNull
                public static final Parcelable.Creator<Icon> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f81026a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f81027b;

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
                    this.f81026a = str;
                    this.f81027b = str2;
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
                    return Intrinsics.f(this.f81026a, icon.f81026a) && Intrinsics.f(this.f81027b, icon.f81027b);
                }

                public final int hashCode() {
                    String str = this.f81026a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f81027b;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f81026a);
                    dest.writeString(this.f81027b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Tag;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Tag extends Accessory {

                @NotNull
                public static final Parcelable.Creator<Tag> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f81028a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f81029b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Tag(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Tag[i];
                    }
                }

                public Tag(String label, String str) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    this.f81028a = label;
                    this.f81029b = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Tag)) {
                        return false;
                    }
                    Tag tag2 = (Tag) obj2;
                    return Intrinsics.f(this.f81028a, tag2.f81028a) && Intrinsics.f(this.f81029b, tag2.f81029b);
                }

                public final int hashCode() {
                    int iHashCode = this.f81028a.hashCode() * 31;
                    String str = this.f81029b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f81028a);
                    dest.writeString(this.f81029b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory$Text;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Text extends Accessory {

                @NotNull
                public static final Parcelable.Creator<Text> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f81030a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f81031b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Text(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Text[i];
                    }
                }

                public Text(String str, String str2) {
                    this.f81030a = str;
                    this.f81031b = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj2;
                    return Intrinsics.f(this.f81030a, text.f81030a) && Intrinsics.f(this.f81031b, text.f81031b);
                }

                public final int hashCode() {
                    String str = this.f81030a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f81031b;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f81030a);
                    dest.writeString(this.f81031b);
                }
            }

            private Accessory() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$Icon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Icon implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Icon> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hha.b f81032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f81033b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f81034c;
            public final String d;
            public final boolean e;
            public final hha.c f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Icon(hha.b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, hha.c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Icon[i];
                }
            }

            public Icon(hha.b type, Integer num, String str, String str2, boolean z, hha.c progressType) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(progressType, "progressType");
                this.f81032a = type;
                this.f81033b = num;
                this.f81034c = str;
                this.d = str2;
                this.e = z;
                this.f = progressType;
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
                return this.f81032a == icon.f81032a && Intrinsics.f(this.f81033b, icon.f81033b) && Intrinsics.f(this.f81034c, icon.f81034c) && Intrinsics.f(this.d, icon.d) && this.e == icon.e && this.f == icon.f;
            }

            public final int hashCode() {
                int iHashCode = this.f81032a.hashCode() * 31;
                Integer num = this.f81033b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f81034c;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                return this.f.hashCode() + j6.a.c((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81032a.name());
                Integer num = this.f81033b;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeString(this.f81034c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeString(this.f.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellBanner$TitleParam;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TitleParam implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<TitleParam> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f81036b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TitleParam(parcel.readString(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TitleParam[i];
                }
            }

            public TitleParam(String text, b bVar) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f81035a = text;
                this.f81036b = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TitleParam)) {
                    return false;
                }
                TitleParam titleParam = (TitleParam) obj2;
                return Intrinsics.f(this.f81035a, titleParam.f81035a) && this.f81036b == titleParam.f81036b;
            }

            public final int hashCode() {
                int iHashCode = this.f81035a.hashCode() * 31;
                b bVar = this.f81036b;
                return iHashCode + (bVar == null ? 0 : bVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81035a);
                b bVar = this.f81036b;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList arrayList = null;
                b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(PricingPlanTextDescriptor.CREATOR, parcel, arrayList2, iA2, 1);
                }
                Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
                ActionButton actionButtonCreateFromParcel = parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel);
                Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
                Badge badgeCreateFromParcel = parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel);
                Accessory accessory = (Accessory) parcel.readParcelable(CellBanner.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int i2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i2);
                    while (iA != i2) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(TitleParam.CREATOR, parcel, arrayList3, iA, 1);
                    }
                    arrayList = arrayList3;
                }
                return new CellBanner(string, string2, bVarValueOf, arrayList2, iconCreateFromParcel, actionButtonCreateFromParcel, actionCreateFromParcel, badgeCreateFromParcel, accessory, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CellBanner[i];
            }
        }

        public CellBanner(String str, String title, b bVar, List description, Icon icon, ActionButton actionButton, Action action, Badge badge, Accessory accessory, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f81018a = str;
            this.f81019b = title;
            this.f81020c = bVar;
            this.d = description;
            this.e = icon;
            this.f = actionButton;
            this.f81021g = action;
            this.f81022h = badge;
            this.i = accessory;
            this.f81023j = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CellBanner)) {
                return false;
            }
            CellBanner cellBanner = (CellBanner) obj2;
            return Intrinsics.f(this.f81018a, cellBanner.f81018a) && Intrinsics.f(this.f81019b, cellBanner.f81019b) && this.f81020c == cellBanner.f81020c && Intrinsics.f(this.d, cellBanner.d) && Intrinsics.f(this.e, cellBanner.e) && Intrinsics.f(this.f, cellBanner.f) && Intrinsics.f(this.f81021g, cellBanner.f81021g) && Intrinsics.f(this.f81022h, cellBanner.f81022h) && Intrinsics.f(this.i, cellBanner.i) && Intrinsics.f(this.f81023j, cellBanner.f81023j);
        }

        public final int hashCode() {
            String str = this.f81018a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81019b);
            b bVar = this.f81020c;
            int iD = p.a.d((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.d);
            Icon icon = this.e;
            int iHashCode = (iD + (icon == null ? 0 : icon.hashCode())) * 31;
            ActionButton actionButton = this.f;
            int iHashCode2 = (iHashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            Action action = this.f81021g;
            int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.f81005a.hashCode())) * 31;
            Badge badge = this.f81022h;
            int iHashCode4 = (iHashCode3 + (badge == null ? 0 : badge.hashCode())) * 31;
            Accessory accessory = this.i;
            int iHashCode5 = (iHashCode4 + (accessory == null ? 0 : accessory.hashCode())) * 31;
            List list = this.f81023j;
            return iHashCode5 + (list != null ? list.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81018a);
            dest.writeString(this.f81019b);
            b bVar = this.f81020c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((PricingPlanTextDescriptor) itV.next()).writeToParcel(dest, i);
            }
            Icon icon = this.e;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
            ActionButton actionButton = this.f;
            if (actionButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                actionButton.writeToParcel(dest, i);
            }
            Action action = this.f81021g;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
            Badge badge = this.f81022h;
            if (badge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badge.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.i, i);
            List list = this.f81023j;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((TitleParam) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$CellTuple;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CellTuple extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<CellTuple> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DescriptionOptions f81039c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CellTuple(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DescriptionOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CellTuple[i];
            }
        }

        public CellTuple(String str, String title, DescriptionOptions descriptionOptions) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f81037a = str;
            this.f81038b = title;
            this.f81039c = descriptionOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CellTuple)) {
                return false;
            }
            CellTuple cellTuple = (CellTuple) obj2;
            return Intrinsics.f(this.f81037a, cellTuple.f81037a) && Intrinsics.f(this.f81038b, cellTuple.f81038b) && Intrinsics.f(this.f81039c, cellTuple.f81039c);
        }

        public final int hashCode() {
            String str = this.f81037a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81038b);
            DescriptionOptions descriptionOptions = this.f81039c;
            return iC + (descriptionOptions != null ? descriptionOptions.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81037a);
            dest.writeString(this.f81038b);
            DescriptionOptions descriptionOptions = this.f81039c;
            if (descriptionOptions == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                descriptionOptions.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$DescriptionOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DescriptionOptions implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DescriptionOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81041b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DescriptionOptions(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DescriptionOptions[i];
            }
        }

        public DescriptionOptions(String str, String str2) {
            this.f81040a = str;
            this.f81041b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DescriptionOptions)) {
                return false;
            }
            DescriptionOptions descriptionOptions = (DescriptionOptions) obj2;
            return Intrinsics.f(this.f81040a, descriptionOptions.f81040a) && Intrinsics.f(this.f81041b, descriptionOptions.f81041b);
        }

        public final int hashCode() {
            String str = this.f81040a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81041b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81040a);
            dest.writeString(this.f81041b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ExpansionArea;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpansionArea extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<ExpansionArea> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f81044c;

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
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CellBanner.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ExpansionArea(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpansionArea[i];
            }
        }

        public ExpansionArea(String str, String title, ArrayList items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f81042a = str;
            this.f81043b = title;
            this.f81044c = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExpansionArea)) {
                return false;
            }
            ExpansionArea expansionArea = (ExpansionArea) obj2;
            return Intrinsics.f(this.f81042a, expansionArea.f81042a) && Intrinsics.f(this.f81043b, expansionArea.f81043b) && this.f81044c.equals(expansionArea.f81044c);
        }

        public final int hashCode() {
            String str = this.f81042a;
            return this.f81044c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81043b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81042a);
            dest.writeString(this.f81043b);
            Iterator itY = j6.a.y(this.f81044c, dest);
            while (itY.hasNext()) {
                ((CellBanner) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$FeaturedActionWidget;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "PrimaryButton", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeaturedActionWidget extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<FeaturedActionWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81047c;
        public final String d;
        public final Icon e;
        public final Badge f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PrimaryButton f81048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Action f81049h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$FeaturedActionWidget$PrimaryButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PrimaryButton implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PrimaryButton> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81051b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Icon f81052c;
            public final Action d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PrimaryButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), Action.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PrimaryButton[i];
                }
            }

            public PrimaryButton(String str, String label, Icon icon, Action deeplink) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f81050a = str;
                this.f81051b = label;
                this.f81052c = icon;
                this.d = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PrimaryButton)) {
                    return false;
                }
                PrimaryButton primaryButton = (PrimaryButton) obj2;
                return Intrinsics.f(this.f81050a, primaryButton.f81050a) && Intrinsics.f(this.f81051b, primaryButton.f81051b) && Intrinsics.f(this.f81052c, primaryButton.f81052c) && Intrinsics.f(this.d, primaryButton.d);
            }

            public final int hashCode() {
                String str = this.f81050a;
                int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81051b);
                Icon icon = this.f81052c;
                return this.d.f81005a.hashCode() + ((iC + (icon != null ? icon.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81050a);
                dest.writeString(this.f81051b);
                Icon icon = this.f81052c;
                if (icon == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    icon.writeToParcel(dest, i);
                }
                this.d.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeaturedActionWidget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PrimaryButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeaturedActionWidget[i];
            }
        }

        public FeaturedActionWidget(String str, String str2, String subtitle, String str3, Icon icon, Badge badge, PrimaryButton primaryButton, Action action) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.f81045a = str;
            this.f81046b = str2;
            this.f81047c = subtitle;
            this.d = str3;
            this.e = icon;
            this.f = badge;
            this.f81048g = primaryButton;
            this.f81049h = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeaturedActionWidget)) {
                return false;
            }
            FeaturedActionWidget featuredActionWidget = (FeaturedActionWidget) obj2;
            return Intrinsics.f(this.f81045a, featuredActionWidget.f81045a) && Intrinsics.f(this.f81046b, featuredActionWidget.f81046b) && Intrinsics.f(this.f81047c, featuredActionWidget.f81047c) && Intrinsics.f(this.d, featuredActionWidget.d) && Intrinsics.f(this.e, featuredActionWidget.e) && Intrinsics.f(this.f, featuredActionWidget.f) && Intrinsics.f(this.f81048g, featuredActionWidget.f81048g) && Intrinsics.f(this.f81049h, featuredActionWidget.f81049h);
        }

        public final int hashCode() {
            String str = this.f81045a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81046b;
            int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f81047c);
            String str3 = this.d;
            int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            Icon icon = this.e;
            int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
            Badge badge = this.f;
            int iHashCode4 = (iHashCode3 + (badge == null ? 0 : badge.hashCode())) * 31;
            PrimaryButton primaryButton = this.f81048g;
            int iHashCode5 = (iHashCode4 + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31;
            Action action = this.f81049h;
            return iHashCode5 + (action != null ? action.f81005a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81045a);
            dest.writeString(this.f81046b);
            dest.writeString(this.f81047c);
            dest.writeString(this.d);
            Icon icon = this.e;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
            Badge badge = this.f;
            if (badge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badge.writeToParcel(dest, i);
            }
            PrimaryButton primaryButton = this.f81048g;
            if (primaryButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                primaryButton.writeToParcel(dest, i);
            }
            Action action = this.f81049h;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Footer;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Footer extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<Footer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f81054b;

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
                return new Footer(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer(String str, List description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f81053a = str;
            this.f81054b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj2;
            return Intrinsics.f(this.f81053a, footer.f81053a) && Intrinsics.f(this.f81054b, footer.f81054b);
        }

        public final int hashCode() {
            String str = this.f81053a;
            return this.f81054b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81053a);
            Iterator itV = p.a.v(this.f81054b, dest);
            while (itV.hasNext()) {
                ((PricingPlanTextDescriptor) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Grid;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "GridCell", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Grid extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<Grid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f81057c;
        public final ActionButton d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Grid$GridCell;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GridCell implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<GridCell> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Icon f81060c;
            public final Badge d;
            public final Action e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GridCell(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GridCell[i];
                }
            }

            public GridCell(String str, String str2, Icon icon, Badge badge, Action action) {
                this.f81058a = str;
                this.f81059b = str2;
                this.f81060c = icon;
                this.d = badge;
                this.e = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof GridCell)) {
                    return false;
                }
                GridCell gridCell = (GridCell) obj2;
                return Intrinsics.f(this.f81058a, gridCell.f81058a) && Intrinsics.f(this.f81059b, gridCell.f81059b) && Intrinsics.f(this.f81060c, gridCell.f81060c) && Intrinsics.f(this.d, gridCell.d) && Intrinsics.f(this.e, gridCell.e);
            }

            public final int hashCode() {
                String str = this.f81058a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f81059b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Icon icon = this.f81060c;
                int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
                Badge badge = this.d;
                int iHashCode4 = (iHashCode3 + (badge == null ? 0 : badge.hashCode())) * 31;
                Action action = this.e;
                return iHashCode4 + (action != null ? action.f81005a.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81058a);
                dest.writeString(this.f81059b);
                Icon icon = this.f81060c;
                if (icon == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    icon.writeToParcel(dest, i);
                }
                Badge badge = this.d;
                if (badge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    badge.writeToParcel(dest, i);
                }
                Action action = this.e;
                if (action == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    action.writeToParcel(dest, i);
                }
            }
        }

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
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(GridCell.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Grid(string, string2, arrayList, parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Grid[i];
            }
        }

        public Grid(String str, String str2, ArrayList items, ActionButton actionButton) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f81055a = str;
            this.f81056b = str2;
            this.f81057c = items;
            this.d = actionButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Grid)) {
                return false;
            }
            Grid grid = (Grid) obj2;
            return Intrinsics.f(this.f81055a, grid.f81055a) && Intrinsics.f(this.f81056b, grid.f81056b) && this.f81057c.equals(grid.f81057c) && Intrinsics.f(this.d, grid.d);
        }

        public final int hashCode() {
            String str = this.f81055a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81056b;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f81057c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            ActionButton actionButton = this.d;
            return iB + (actionButton != null ? actionButton.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81055a);
            dest.writeString(this.f81056b);
            Iterator itY = j6.a.y(this.f81057c, dest);
            while (itY.hasNext()) {
                ((GridCell) itY.next()).writeToParcel(dest, i);
            }
            ActionButton actionButton = this.d;
            if (actionButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                actionButton.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HeroCard;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Image", "HeroAction", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HeroCard extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<HeroCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f81063c;
        public final Action d;
        public final HeroAction e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HeroCard$HeroAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HeroAction implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<HeroAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81064a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Icon f81065b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Action f81066c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new HeroAction(parcel.readString(), Icon.CREATOR.createFromParcel(parcel), Action.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HeroAction[i];
                }
            }

            public HeroAction(String label, Icon icon, Action deeplink) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f81064a = label;
                this.f81065b = icon;
                this.f81066c = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof HeroAction)) {
                    return false;
                }
                HeroAction heroAction = (HeroAction) obj2;
                return Intrinsics.f(this.f81064a, heroAction.f81064a) && Intrinsics.f(this.f81065b, heroAction.f81065b) && Intrinsics.f(this.f81066c, heroAction.f81066c);
            }

            public final int hashCode() {
                return this.f81066c.f81005a.hashCode() + ((this.f81065b.hashCode() + (this.f81064a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81064a);
                this.f81065b.writeToParcel(dest, i);
                this.f81066c.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HeroCard$Image;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Image implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81067a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Image(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f81067a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Image) && Intrinsics.f(this.f81067a, ((Image) obj2).f81067a);
            }

            public final int hashCode() {
                return this.f81067a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81067a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HeroCard(parcel.readString(), parcel.readString(), Image.CREATOR.createFromParcel(parcel), Action.CREATOR.createFromParcel(parcel), HeroAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HeroCard[i];
            }
        }

        public HeroCard(String title, String description, Image image, Action deeplink, HeroAction action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f81061a = title;
            this.f81062b = description;
            this.f81063c = image;
            this.d = deeplink;
            this.e = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HeroCard)) {
                return false;
            }
            HeroCard heroCard = (HeroCard) obj2;
            return Intrinsics.f(this.f81061a, heroCard.f81061a) && Intrinsics.f(this.f81062b, heroCard.f81062b) && Intrinsics.f(this.f81063c, heroCard.f81063c) && Intrinsics.f(this.d, heroCard.d) && Intrinsics.f(this.e, heroCard.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f81061a.hashCode() * 31, 31, this.f81062b), 31, this.f81063c.f81067a), 31, this.d.f81005a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81061a);
            dest.writeString(this.f81062b);
            this.f81063c.writeToParcel(dest, i);
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HorizontalButtons;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Button", "com/revolut/feature/pricingplans/models/c", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HorizontalButtons extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<HorizontalButtons> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f81069b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HorizontalButtons$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Action f81072c;
            public final c d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Button(parcel.readString(), parcel.readString(), Action.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Button[i];
                }
            }

            public Button(String str, String label, Action deeplink, c style) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f81070a = str;
                this.f81071b = label;
                this.f81072c = deeplink;
                this.d = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj2;
                return Intrinsics.f(this.f81070a, button.f81070a) && Intrinsics.f(this.f81071b, button.f81071b) && Intrinsics.f(this.f81072c, button.f81072c) && this.d == button.d;
            }

            public final int hashCode() {
                String str = this.f81070a;
                return this.d.hashCode() + p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81071b), 31, this.f81072c.f81005a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81070a);
                dest.writeString(this.f81071b);
                this.f81072c.writeToParcel(dest, i);
                dest.writeString(this.d.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Button.CREATOR, parcel, arrayList, iA, 1);
                }
                return new HorizontalButtons(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HorizontalButtons[i];
            }
        }

        public HorizontalButtons(String str, ArrayList buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.f81068a = str;
            this.f81069b = buttons;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HorizontalButtons)) {
                return false;
            }
            HorizontalButtons horizontalButtons = (HorizontalButtons) obj2;
            return Intrinsics.f(this.f81068a, horizontalButtons.f81068a) && this.f81069b.equals(horizontalButtons.f81069b);
        }

        public final int hashCode() {
            String str = this.f81068a;
            return this.f81069b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81068a);
            Iterator itY = j6.a.y(this.f81069b, dest);
            while (itY.hasNext()) {
                ((Button) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$HorizontalScroller;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/pricingplans/models/d", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HorizontalScroller extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<HorizontalScroller> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Icon f81075c;
        public final ArrayList d;
        public final d e;
        public final ActionButton f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(HorizontalScroller.class, parcel, arrayList, iE, 1);
                }
                return new HorizontalScroller(string, string2, iconCreateFromParcel, arrayList, d.valueOf(parcel.readString()), parcel.readInt() != 0 ? ActionButton.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HorizontalScroller[i];
            }
        }

        public HorizontalScroller(String str, String str2, Icon icon, ArrayList items, d style, ActionButton actionButton) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f81073a = str;
            this.f81074b = str2;
            this.f81075c = icon;
            this.d = items;
            this.e = style;
            this.f = actionButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HorizontalScroller)) {
                return false;
            }
            HorizontalScroller horizontalScroller = (HorizontalScroller) obj2;
            return Intrinsics.f(this.f81073a, horizontalScroller.f81073a) && Intrinsics.f(this.f81074b, horizontalScroller.f81074b) && Intrinsics.f(this.f81075c, horizontalScroller.f81075c) && this.d.equals(horizontalScroller.d) && this.e == horizontalScroller.e && Intrinsics.f(this.f, horizontalScroller.f);
        }

        public final int hashCode() {
            String str = this.f81073a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81074b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Icon icon = this.f81075c;
            int iHashCode3 = (this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31, 31)) * 31;
            ActionButton actionButton = this.f;
            return iHashCode3 + (actionButton != null ? actionButton.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81073a);
            dest.writeString(this.f81074b);
            Icon icon = this.f81075c;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeString(this.e.name());
            ActionButton actionButton = this.f;
            if (actionButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                actionButton.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Icon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f81078c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Icon(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Icon[i];
            }
        }

        public Icon(String str, Integer num, String str2) {
            this.f81076a = str;
            this.f81077b = str2;
            this.f81078c = num;
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
            return Intrinsics.f(this.f81076a, icon.f81076a) && Intrinsics.f(this.f81077b, icon.f81077b) && Intrinsics.f(this.f81078c, icon.f81078c);
        }

        public final int hashCode() {
            String str = this.f81076a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81077b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f81078c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81076a);
            dest.writeString(this.f81077b);
            Integer num = this.f81078c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$LargeCard;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Image", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LargeCard extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<LargeCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81081c;
        public final Image d;
        public final Badge e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Action f81082g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$LargeCard$Image;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Image implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81083a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Image(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f81083a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Image) && Intrinsics.f(this.f81083a, ((Image) obj2).f81083a);
            }

            public final int hashCode() {
                return this.f81083a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81083a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LargeCard(parcel.readString(), parcel.readString(), parcel.readString(), Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LargeCard[i];
            }
        }

        public LargeCard(String str, String title, String str2, Image image, Badge badge, boolean z, Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f81079a = str;
            this.f81080b = title;
            this.f81081c = str2;
            this.d = image;
            this.e = badge;
            this.f = z;
            this.f81082g = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LargeCard)) {
                return false;
            }
            LargeCard largeCard = (LargeCard) obj2;
            return Intrinsics.f(this.f81079a, largeCard.f81079a) && Intrinsics.f(this.f81080b, largeCard.f81080b) && Intrinsics.f(this.f81081c, largeCard.f81081c) && Intrinsics.f(this.d, largeCard.d) && Intrinsics.f(this.e, largeCard.e) && this.f == largeCard.f && Intrinsics.f(this.f81082g, largeCard.f81082g);
        }

        public final int hashCode() {
            String str = this.f81079a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81080b);
            String str2 = this.f81081c;
            int iC2 = p.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d.f81083a);
            Badge badge = this.e;
            int iC3 = j6.a.c((iC2 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.f);
            Action action = this.f81082g;
            return iC3 + (action != null ? action.f81005a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81079a);
            dest.writeString(this.f81080b);
            dest.writeString(this.f81081c);
            this.d.writeToParcel(dest, i);
            Badge badge = this.e;
            if (badge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badge.writeToParcel(dest, i);
            }
            dest.writeInt(this.f ? 1 : 0);
            Action action = this.f81082g;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ListView;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Action", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ListView extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<ListView> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f81085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f81086c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$ListView$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81088b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Action f81089c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString(), parcel.readString(), Action.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Action[i];
                }
            }

            public Action(String str, String label, Action action) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(action, "action");
                this.f81087a = str;
                this.f81088b = label;
                this.f81089c = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj2;
                return Intrinsics.f(this.f81087a, action.f81087a) && Intrinsics.f(this.f81088b, action.f81088b) && Intrinsics.f(this.f81089c, action.f81089c);
            }

            public final int hashCode() {
                String str = this.f81087a;
                return this.f81089c.f81005a.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81088b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81087a);
                dest.writeString(this.f81088b);
                this.f81089c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ListView.class, parcel, arrayList, iE, 1);
                }
                return new ListView(string, actionCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ListView[i];
            }
        }

        public ListView(String str, Action action, ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f81084a = str;
            this.f81085b = action;
            this.f81086c = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ListView)) {
                return false;
            }
            ListView listView = (ListView) obj2;
            return Intrinsics.f(this.f81084a, listView.f81084a) && Intrinsics.f(this.f81085b, listView.f81085b) && this.f81086c.equals(listView.f81086c);
        }

        public final int hashCode() {
            String str = this.f81084a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Action action = this.f81085b;
            return this.f81086c.hashCode() + ((iHashCode + (action != null ? action.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81084a);
            Action action = this.f81085b;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
            Iterator itY = j6.a.y(this.f81086c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Media;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/pricingplans/models/e", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Media extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<Media> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f81091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81092c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Media(parcel.readString(), e.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Media[i];
            }
        }

        public Media(String str, e contentType, String url2) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f81090a = str;
            this.f81091b = contentType;
            this.f81092c = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Media)) {
                return false;
            }
            Media media = (Media) obj2;
            return Intrinsics.f(this.f81090a, media.f81090a) && this.f81091b == media.f81091b && Intrinsics.f(this.f81092c, media.f81092c);
        }

        public final int hashCode() {
            String str = this.f81090a;
            return this.f81092c.hashCode() + ((this.f81091b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81090a);
            dest.writeString(this.f81091b.name());
            dest.writeString(this.f81092c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Pager;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Page", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pager extends PlanScreenElementView implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Pager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f81093a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Pager$Page;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Page implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Page> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f81096c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(Page.class, parcel, arrayList, iE, 1);
                    }
                    return new Page(string, string2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Page[i];
                }
            }

            public Page(String str, String title, List items) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                this.f81094a = str;
                this.f81095b = title;
                this.f81096c = items;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj2;
                return Intrinsics.f(this.f81094a, page.f81094a) && Intrinsics.f(this.f81095b, page.f81095b) && Intrinsics.f(this.f81096c, page.f81096c);
            }

            public final int hashCode() {
                String str = this.f81094a;
                return this.f81096c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81095b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81094a);
                dest.writeString(this.f81095b);
                Iterator itV = p.a.v(this.f81096c, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
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
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Page.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Pager(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pager[i];
            }
        }

        public Pager(ArrayList pages) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.f81093a = pages;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pager) && this.f81093a.equals(((Pager) obj2).f81093a);
        }

        public final int hashCode() {
            return this.f81093a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f81093a, dest);
            while (itY.hasNext()) {
                ((Page) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$PlainText;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlainText extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<PlainText> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f81098b;

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
                return new PlainText(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlainText[i];
            }
        }

        public PlainText(String str, List text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f81097a = str;
            this.f81098b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlainText)) {
                return false;
            }
            PlainText plainText = (PlainText) obj2;
            return Intrinsics.f(this.f81097a, plainText.f81097a) && Intrinsics.f(this.f81098b, plainText.f81098b);
        }

        public final int hashCode() {
            String str = this.f81097a;
            return this.f81098b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81097a);
            Iterator itV = p.a.v(this.f81098b, dest);
            while (itV.hasNext()) {
                ((PricingPlanTextDescriptor) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$PrimaryButton;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrimaryButton extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Action f81101c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrimaryButton[i];
            }
        }

        public PrimaryButton(String str, String label, Action action) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f81099a = str;
            this.f81100b = label;
            this.f81101c = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) obj2;
            return Intrinsics.f(this.f81099a, primaryButton.f81099a) && Intrinsics.f(this.f81100b, primaryButton.f81100b) && Intrinsics.f(this.f81101c, primaryButton.f81101c);
        }

        public final int hashCode() {
            String str = this.f81099a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81100b);
            Action action = this.f81101c;
            return iC + (action != null ? action.f81005a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81099a);
            dest.writeString(this.f81100b);
            Action action = this.f81101c;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$SecondaryButton;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecondaryButton extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<SecondaryButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Action f81104c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecondaryButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecondaryButton[i];
            }
        }

        public SecondaryButton(String str, String label, Action action) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f81102a = str;
            this.f81103b = label;
            this.f81104c = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SecondaryButton)) {
                return false;
            }
            SecondaryButton secondaryButton = (SecondaryButton) obj2;
            return Intrinsics.f(this.f81102a, secondaryButton.f81102a) && Intrinsics.f(this.f81103b, secondaryButton.f81103b) && Intrinsics.f(this.f81104c, secondaryButton.f81104c);
        }

        public final int hashCode() {
            String str = this.f81102a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81103b);
            Action action = this.f81104c;
            return iC + (action != null ? action.f81005a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81102a);
            dest.writeString(this.f81103b);
            Action action = this.f81104c;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$SlotManagerBanner;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "<init>", "()V", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SlotManagerBanner extends PlanScreenElementView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SlotManagerBanner f81105a = new SlotManagerBanner();

        @NotNull
        public static final Parcelable.Creator<SlotManagerBanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SlotManagerBanner.f81105a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SlotManagerBanner[i];
            }
        }

        private SlotManagerBanner() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Tile;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tile extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<Tile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81108c;
        public final Icon d;
        public final Badge e;
        public final Action f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tile[i];
            }
        }

        public Tile(String str, String str2, String str3, Icon icon, Badge badge, Action action) {
            this.f81106a = str;
            this.f81107b = str2;
            this.f81108c = str3;
            this.d = icon;
            this.e = badge;
            this.f = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tile)) {
                return false;
            }
            Tile tile = (Tile) obj2;
            return Intrinsics.f(this.f81106a, tile.f81106a) && Intrinsics.f(this.f81107b, tile.f81107b) && Intrinsics.f(this.f81108c, tile.f81108c) && Intrinsics.f(this.d, tile.d) && Intrinsics.f(this.e, tile.e) && Intrinsics.f(this.f, tile.f);
        }

        public final int hashCode() {
            String str = this.f81106a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81107b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81108c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Icon icon = this.d;
            int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
            Badge badge = this.e;
            int iHashCode5 = (iHashCode4 + (badge == null ? 0 : badge.hashCode())) * 31;
            Action action = this.f;
            return iHashCode5 + (action != null ? action.f81005a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81106a);
            dest.writeString(this.f81107b);
            dest.writeString(this.f81108c);
            Icon icon = this.d;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                icon.writeToParcel(dest, i);
            }
            Badge badge = this.e;
            if (badge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badge.writeToParcel(dest, i);
            }
            Action action = this.f;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Timeline;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Step", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Timeline extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<Timeline> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f81110b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$Timeline$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Step implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Step> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81112b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Step(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Step[i];
                }
            }

            public Step(String title, String description) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f81111a = title;
                this.f81112b = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Step)) {
                    return false;
                }
                Step step = (Step) obj2;
                return Intrinsics.f(this.f81111a, step.f81111a) && Intrinsics.f(this.f81112b, step.f81112b);
            }

            public final int hashCode() {
                return this.f81112b.hashCode() + (this.f81111a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81111a);
                dest.writeString(this.f81112b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Timeline(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Timeline[i];
            }
        }

        public Timeline(String id10, List steps) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.f81109a = id10;
            this.f81110b = steps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Timeline)) {
                return false;
            }
            Timeline timeline = (Timeline) obj2;
            return Intrinsics.f(this.f81109a, timeline.f81109a) && Intrinsics.f(this.f81110b, timeline.f81110b);
        }

        public final int hashCode() {
            return this.f81110b.hashCode() + (this.f81109a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81109a);
            Iterator itV = p.a.v(this.f81110b, dest);
            while (itV.hasNext()) {
                ((Step) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$UnorderedList;", "Lcom/revolut/feature/pricingplans/models/PlanScreenElementView;", "", "toString", "()Ljava/lang/String;", "Item", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnorderedList extends PlanScreenElementView {

        @NotNull
        public static final Parcelable.Creator<UnorderedList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f81114b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PlanScreenElementView$UnorderedList$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81115a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f81115a = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Item) && Intrinsics.f(this.f81115a, ((Item) obj2).f81115a);
            }

            public final int hashCode() {
                return this.f81115a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81115a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new UnorderedList(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnorderedList[i];
            }
        }

        public UnorderedList(String id10, List items) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f81113a = id10;
            this.f81114b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnorderedList)) {
                return false;
            }
            UnorderedList unorderedList = (UnorderedList) obj2;
            return Intrinsics.f(this.f81113a, unorderedList.f81113a) && Intrinsics.f(this.f81114b, unorderedList.f81114b);
        }

        public final int hashCode() {
            return this.f81114b.hashCode() + (this.f81113a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81113a);
            Iterator itV = p.a.v(this.f81114b, dest);
            while (itV.hasNext()) {
                ((Item) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    private PlanScreenElementView() {
    }
}
