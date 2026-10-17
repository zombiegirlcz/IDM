package com.revolut.feature.pay_later.impl.models.right_to_cancel;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelSummaryContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "DetailRow", "Info", "Explainer", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RightToCancelSummaryContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RightToCancelSummaryContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f78857c;
    public final Explainer d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78858g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelSummaryContent$DetailRow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailRow implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DetailRow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Info f78861c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailRow(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Info.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailRow[i];
            }
        }

        public DetailRow(String label, String value, Info info, boolean z) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f78859a = label;
            this.f78860b = value;
            this.f78861c = info;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) obj2;
            return Intrinsics.f(this.f78859a, detailRow.f78859a) && Intrinsics.f(this.f78860b, detailRow.f78860b) && Intrinsics.f(this.f78861c, detailRow.f78861c) && this.d == detailRow.d;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f78859a.hashCode() * 31, 31, this.f78860b);
            Info info = this.f78861c;
            return Boolean.hashCode(this.d) + ((iC + (info == null ? 0 : info.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78859a);
            dest.writeString(this.f78860b);
            Info info = this.f78861c;
            if (info == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                info.writeToParcel(dest, i);
            }
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelSummaryContent$Explainer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Explainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Explainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f78863b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelSummaryContent$Explainer$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a1 f78864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f78865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f78866c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(a1.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(a1 icon, String title, String description) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f78864a = icon;
                this.f78865b = title;
                this.f78866c = description;
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
                return this.f78864a == item.f78864a && Intrinsics.f(this.f78865b, item.f78865b) && Intrinsics.f(this.f78866c, item.f78866c);
            }

            public final int hashCode() {
                return this.f78866c.hashCode() + p.a.c(this.f78864a.hashCode() * 31, 31, this.f78865b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f78864a.name());
                dest.writeString(this.f78865b);
                dest.writeString(this.f78866c);
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
                return new Explainer(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Explainer[i];
            }
        }

        public Explainer(String title, ArrayList items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f78862a = title;
            this.f78863b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Explainer)) {
                return false;
            }
            Explainer explainer = (Explainer) obj2;
            return Intrinsics.f(this.f78862a, explainer.f78862a) && this.f78863b.equals(explainer.f78863b);
        }

        public final int hashCode() {
            return this.f78863b.hashCode() + (this.f78862a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78862a);
            Iterator itY = j6.a.y(this.f78863b, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelSummaryContent$Info;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f78869c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(String title, String description, String buttonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            this.f78867a = title;
            this.f78868b = description;
            this.f78869c = buttonText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Info)) {
                return false;
            }
            Info info = (Info) obj2;
            return Intrinsics.f(this.f78867a, info.f78867a) && Intrinsics.f(this.f78868b, info.f78868b) && Intrinsics.f(this.f78869c, info.f78869c);
        }

        public final int hashCode() {
            return this.f78869c.hashCode() + p.a.c(this.f78867a.hashCode() * 31, 31, this.f78868b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78867a);
            dest.writeString(this.f78868b);
            dest.writeString(this.f78869c);
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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DetailRow.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RightToCancelSummaryContent(string, string2, arrayList, parcel.readInt() == 0 ? null : Explainer.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RightToCancelSummaryContent[i];
        }
    }

    public RightToCancelSummaryContent(String title, String description, ArrayList details, Explainer explainer, String str, String primaryButtonText, String secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f78855a = title;
        this.f78856b = description;
        this.f78857c = details;
        this.d = explainer;
        this.e = str;
        this.f = primaryButtonText;
        this.f78858g = secondaryButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RightToCancelSummaryContent)) {
            return false;
        }
        RightToCancelSummaryContent rightToCancelSummaryContent = (RightToCancelSummaryContent) obj2;
        return Intrinsics.f(this.f78855a, rightToCancelSummaryContent.f78855a) && Intrinsics.f(this.f78856b, rightToCancelSummaryContent.f78856b) && this.f78857c.equals(rightToCancelSummaryContent.f78857c) && Intrinsics.f(this.d, rightToCancelSummaryContent.d) && Intrinsics.f(this.e, rightToCancelSummaryContent.e) && Intrinsics.f(this.f, rightToCancelSummaryContent.f) && Intrinsics.f(this.f78858g, rightToCancelSummaryContent.f78858g);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f78857c, p.a.c(this.f78855a.hashCode() * 31, 31, this.f78856b), 31);
        Explainer explainer = this.d;
        int iHashCode = (iB + (explainer == null ? 0 : explainer.hashCode())) * 31;
        String str = this.e;
        return this.f78858g.hashCode() + p.a.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78855a);
        dest.writeString(this.f78856b);
        Iterator itY = j6.a.y(this.f78857c, dest);
        while (itY.hasNext()) {
            ((DetailRow) itY.next()).writeToParcel(dest, i);
        }
        Explainer explainer = this.d;
        if (explainer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            explainer.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f78858g);
    }
}
