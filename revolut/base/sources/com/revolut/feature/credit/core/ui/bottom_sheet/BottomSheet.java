package com.revolut.feature.credit.core.ui.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class BottomSheet {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock;", "Landroid/os/Parcelable;", "SingleAction", "DualAction", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock$DualAction;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock$SingleAction;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ActionBlock extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock$DualAction;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DualAction implements ActionBlock {

            @NotNull
            public static final Parcelable.Creator<DualAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ActionBlockItem f69815a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ActionBlockItem f69816b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f69817c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Parcelable.Creator<ActionBlockItem> creator = ActionBlockItem.CREATOR;
                    return new DualAction(creator.createFromParcel(parcel), creator.createFromParcel(parcel), (Clause) parcel.readParcelable(DualAction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DualAction[i];
                }
            }

            public DualAction(ActionBlockItem primary, ActionBlockItem secondary, Clause clause) {
                Intrinsics.checkNotNullParameter(primary, "primary");
                Intrinsics.checkNotNullParameter(secondary, "secondary");
                this.f69815a = primary;
                this.f69816b = secondary;
                this.f69817c = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DualAction)) {
                    return false;
                }
                DualAction dualAction = (DualAction) obj2;
                return Intrinsics.f(this.f69815a, dualAction.f69815a) && Intrinsics.f(this.f69816b, dualAction.f69816b) && Intrinsics.f(this.f69817c, dualAction.f69817c);
            }

            public final int hashCode() {
                int iHashCode = (this.f69816b.hashCode() + (this.f69815a.hashCode() * 31)) * 31;
                Clause clause = this.f69817c;
                return iHashCode + (clause == null ? 0 : clause.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f69815a.writeToParcel(dest, i);
                this.f69816b.writeToParcel(dest, i);
                dest.writeParcelable(this.f69817c, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock$SingleAction;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlock;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SingleAction implements ActionBlock {

            @NotNull
            public static final Parcelable.Creator<SingleAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ActionBlockItem f69818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f69819b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SingleAction(ActionBlockItem.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(SingleAction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SingleAction[i];
                }
            }

            public SingleAction(ActionBlockItem action, Clause clause) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.f69818a = action;
                this.f69819b = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SingleAction)) {
                    return false;
                }
                SingleAction singleAction = (SingleAction) obj2;
                return Intrinsics.f(this.f69818a, singleAction.f69818a) && Intrinsics.f(this.f69819b, singleAction.f69819b);
            }

            public final int hashCode() {
                int iHashCode = this.f69818a.hashCode() * 31;
                Clause clause = this.f69819b;
                return iHashCode + (clause == null ? 0 : clause.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f69818a.writeToParcel(dest, i);
                dest.writeParcelable(this.f69819b, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionBlockItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionBlockItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ActionBlockItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f69820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActionStyle f69821b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionBlockItem((Clause) parcel.readParcelable(ActionBlockItem.class.getClassLoader()), (ActionStyle) parcel.readParcelable(ActionBlockItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionBlockItem[i];
            }
        }

        public ActionBlockItem(Clause title, ActionStyle style) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f69820a = title;
            this.f69821b = style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionBlockItem)) {
                return false;
            }
            ActionBlockItem actionBlockItem = (ActionBlockItem) obj2;
            return Intrinsics.f(this.f69820a, actionBlockItem.f69820a) && Intrinsics.f(this.f69821b, actionBlockItem.f69821b);
        }

        public final int hashCode() {
            return this.f69821b.hashCode() + (this.f69820a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69820a, i);
            dest.writeParcelable(this.f69821b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class ActionItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ActionItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f69822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f69823b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionItem((Clause) parcel.readParcelable(ActionItem.class.getClassLoader()), (Clause) parcel.readParcelable(ActionItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionItem[i];
            }
        }

        public ActionItem(Clause title, Clause clause) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f69822a = title;
            this.f69823b = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionItem)) {
                return false;
            }
            ActionItem actionItem = (ActionItem) obj2;
            return Intrinsics.f(this.f69822a, actionItem.f69822a) && Intrinsics.f(this.f69823b, actionItem.f69823b);
        }

        public final int hashCode() {
            int iHashCode = this.f69822a.hashCode() * 31;
            Clause clause = this.f69823b;
            return iHashCode + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69822a, i);
            dest.writeParcelable(this.f69823b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle;", "Landroid/os/Parcelable;", "Accent", "SemiAccent", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle$Accent;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle$SemiAccent;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ActionStyle extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle$Accent;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle;", "<init>", "()V", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Accent implements ActionStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Accent f69824a = new Accent();

            @NotNull
            public static final Parcelable.Creator<Accent> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Accent.f69824a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Accent[i];
                }
            }

            private Accent() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle$SemiAccent;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ActionStyle;", "<init>", "()V", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SemiAccent implements ActionStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SemiAccent f69825a = new SemiAccent();

            @NotNull
            public static final Parcelable.Creator<SemiAccent> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SemiAccent.f69825a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SemiAccent[i];
                }
            }

            private SemiAccent() {
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
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$ItemSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemSection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ItemSection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f69837a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ItemSection.class, parcel, arrayList, iE, 1);
                }
                return new ItemSection(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemSection[i];
            }
        }

        public ItemSection(List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f69837a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ItemSection) && Intrinsics.f(this.f69837a, ((ItemSection) obj2).f69837a);
        }

        public final int hashCode() {
            return this.f69837a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f69837a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private BottomSheet() {
    }

    public static ActionsBottomSheetController a(Clause title, Clause clause, GlyphImage glyphImage, List list, ActionBlock actionBlock, AnalyticsProduct.Retail analyticsProduct, AnalyticsContext analyticsContext, int i) {
        GlyphImage glyphImage2 = (i & 4) != 0 ? null : glyphImage;
        if ((i & 8) != 0) {
            list = f0.f322471a;
        }
        List sections = list;
        AnalyticsContext analyticsContext2 = (i & 64) != 0 ? null : analyticsContext;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ActionsBottomSheetController(new BottomSheet$InputData$Action(title, clause, glyphImage2, sections, f0.f322471a, null, actionBlock, analyticsProduct, analyticsContext2));
    }

    public static ActionsBottomSheetController b(Clause title, Clause clause, GlyphImage glyphImage, List list, ActionItem actionItem, ActionBlock.SingleAction singleAction, AnalyticsProduct.Retail analyticsProduct, int i) {
        Clause clause2 = (i & 2) != 0 ? null : clause;
        GlyphImage glyphImage2 = (i & 4) != 0 ? null : glyphImage;
        if ((i & 8) != 0) {
            list = f0.f322471a;
        }
        List itemsSection = list;
        ActionItem actionItem2 = (i & 16) != 0 ? null : actionItem;
        ActionBlock.SingleAction singleAction2 = (i & 32) != 0 ? null : singleAction;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(itemsSection, "itemsSection");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ActionsBottomSheetController(new BottomSheet$InputData$Action(title, clause2, glyphImage2, f0.f322471a, itemsSection, actionItem2, singleAction2, analyticsProduct, null));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item;", "Landroid/os/Parcelable;", "CellItem", "PlainText", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item$CellItem;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item$PlainText;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Item extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item$PlainText;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PlainText implements Item {

            @NotNull
            public static final Parcelable.Creator<PlainText> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f69835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f69836b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PlainText((Clause) parcel.readParcelable(PlainText.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PlainText[i];
                }
            }

            public PlainText(Clause text, String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                this.f69835a = id10;
                this.f69836b = text;
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
                return Intrinsics.f(this.f69835a, plainText.f69835a) && Intrinsics.f(this.f69836b, plainText.f69836b);
            }

            public final int hashCode() {
                return this.f69836b.hashCode() + (this.f69835a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f69835a);
                dest.writeParcelable(this.f69836b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item$CellItem;", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$Item;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/core/ui/bottom_sheet/a", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CellItem implements Item {

            @NotNull
            public static final Parcelable.Creator<CellItem> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f69831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f69832b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f69833c;
            public final Clause d;
            public final boolean e;
            public final com.revolut.feature.credit.core.ui.bottom_sheet.a f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final int f69834g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CellItem(parcel.readString(), (Clause) parcel.readParcelable(CellItem.class.getClassLoader()), (Clause) parcel.readParcelable(CellItem.class.getClassLoader()), (Clause) parcel.readParcelable(CellItem.class.getClassLoader()), parcel.readInt() != 0, com.revolut.feature.credit.core.ui.bottom_sheet.a.valueOf(parcel.readString()), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CellItem[i];
                }
            }

            public CellItem(String id10, Clause text, Clause clause, Clause clause2, boolean z, com.revolut.feature.credit.core.ui.bottom_sheet.a endTextAppearance, int i) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
                this.f69831a = id10;
                this.f69832b = text;
                this.f69833c = clause;
                this.d = clause2;
                this.e = z;
                this.f = endTextAppearance;
                this.f69834g = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CellItem)) {
                    return false;
                }
                CellItem cellItem = (CellItem) obj2;
                return Intrinsics.f(this.f69831a, cellItem.f69831a) && Intrinsics.f(this.f69832b, cellItem.f69832b) && Intrinsics.f(this.f69833c, cellItem.f69833c) && Intrinsics.f(this.d, cellItem.d) && this.e == cellItem.e && this.f == cellItem.f && this.f69834g == cellItem.f69834g;
            }

            public final int hashCode() {
                int iA = p.a.a(this.f69831a.hashCode() * 31, 31, this.f69832b);
                Clause clause = this.f69833c;
                int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.d;
                return Integer.hashCode(this.f69834g) + ((this.f.hashCode() + j6.a.c((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.e)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f69831a);
                dest.writeParcelable(this.f69832b, i);
                dest.writeParcelable(this.f69833c, i);
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeString(this.f.name());
                dest.writeInt(this.f69834g);
            }

            public /* synthetic */ CellItem(String str, Clause clause, Clause clause2, Clause clause3, boolean z, com.revolut.feature.credit.core.ui.bottom_sheet.a aVar, int i, int i2) {
                this(str, clause, clause2, (i2 & 8) != 0 ? null : clause3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? com.revolut.feature.credit.core.ui.bottom_sheet.a.CAPTION : aVar, (i2 & 64) != 0 ? R$attr.uikit_dp16 : i);
            }
        }
    }
}
