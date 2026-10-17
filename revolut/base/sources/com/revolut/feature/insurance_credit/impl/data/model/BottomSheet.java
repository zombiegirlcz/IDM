package com.revolut.feature.insurance_credit.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "Footer", "Button", "Action", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75736c;
    public final List d;
    public final Footer e;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Dismiss", "Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Action$Dismiss;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Action$Dismiss;", "Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Action;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Dismiss extends Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Dismiss f75737a = new Dismiss();

            @NotNull
            public static final Parcelable.Creator<Dismiss> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Dismiss.f75737a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dismiss[i];
                }
            }

            private Dismiss() {
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

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f75739b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), (Action) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f75738a = text;
            this.f75739b = action;
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
            return Intrinsics.f(this.f75738a, button.f75738a) && Intrinsics.f(this.f75739b, button.f75739b);
        }

        public final int hashCode() {
            return this.f75739b.hashCode() + (this.f75738a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75738a);
            dest.writeParcelable(this.f75739b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Footer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Footer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Footer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Button f75741b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer(String str, Button button) {
            this.f75740a = str;
            this.f75741b = button;
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
            return Intrinsics.f(this.f75740a, footer.f75740a) && Intrinsics.f(this.f75741b, footer.f75741b);
        }

        public final int hashCode() {
            String str = this.f75740a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Button button = this.f75741b;
            return iHashCode + (button != null ? button.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75740a);
            Button button = this.f75741b;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Item;", "Landroid/os/Parcelable;", "<init>", "()V", "Cell", "Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Item$Cell;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Item implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Item$Cell;", "Lcom/revolut/feature/insurance_credit/impl/data/model/BottomSheet$Item;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cell extends Item {

            @NotNull
            public static final Parcelable.Creator<Cell> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f75742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75743b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cell(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cell[i];
                }
            }

            public Cell(String title, String value) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f75742a = title;
                this.f75743b = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Cell)) {
                    return false;
                }
                Cell cell = (Cell) obj2;
                return Intrinsics.f(this.f75742a, cell.f75742a) && Intrinsics.f(this.f75743b, cell.f75743b);
            }

            public final int hashCode() {
                return this.f75743b.hashCode() + (this.f75742a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75742a);
                dest.writeString(this.f75743b);
            }
        }

        private Item() {
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BottomSheet.class, parcel, arrayList, iE, 1);
                }
            }
            return new BottomSheet(string, string2, string3, arrayList, parcel.readInt() != 0 ? Footer.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomSheet[i];
        }
    }

    public BottomSheet(String title, String str, String str2, ArrayList arrayList, Footer footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f75734a = title;
        this.f75735b = str;
        this.f75736c = str2;
        this.d = arrayList;
        this.e = footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BottomSheet)) {
            return false;
        }
        BottomSheet bottomSheet = (BottomSheet) obj2;
        return Intrinsics.f(this.f75734a, bottomSheet.f75734a) && Intrinsics.f(this.f75735b, bottomSheet.f75735b) && Intrinsics.f(this.f75736c, bottomSheet.f75736c) && Intrinsics.f(this.d, bottomSheet.d) && Intrinsics.f(this.e, bottomSheet.e);
    }

    public final int hashCode() {
        int iHashCode = this.f75734a.hashCode() * 31;
        String str = this.f75735b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75736c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Footer footer = this.e;
        return iHashCode4 + (footer != null ? footer.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75734a);
        dest.writeString(this.f75735b);
        dest.writeString(this.f75736c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        Footer footer = this.e;
        if (footer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footer.writeToParcel(dest, i);
        }
    }
}
