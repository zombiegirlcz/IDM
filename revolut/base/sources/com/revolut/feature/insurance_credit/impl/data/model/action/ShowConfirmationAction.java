package com.revolut.feature.insurance_credit.impl.data.model.action;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowConfirmationAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ConfirmationScreenContent", "InfoItem", "Details", "DetailItem", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowConfirmationAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShowConfirmationAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationScreenContent f75771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancelAction f75772b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowConfirmationAction$ConfirmationScreenContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationScreenContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ConfirmationScreenContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f75775c;
        public final Details d;
        public final Button e;
        public final Button f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(InfoItem.CREATOR, parcel, arrayList, iA, 1);
                    }
                }
                return new ConfirmationScreenContent(string, string2, arrayList, parcel.readInt() == 0 ? null : Details.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationScreenContent[i];
            }
        }

        public ConfirmationScreenContent(String str, String str2, ArrayList arrayList, Details details, Button button, Button button2) {
            this.f75773a = str;
            this.f75774b = str2;
            this.f75775c = arrayList;
            this.d = details;
            this.e = button;
            this.f = button2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmationScreenContent)) {
                return false;
            }
            ConfirmationScreenContent confirmationScreenContent = (ConfirmationScreenContent) obj2;
            return Intrinsics.f(this.f75773a, confirmationScreenContent.f75773a) && Intrinsics.f(this.f75774b, confirmationScreenContent.f75774b) && Intrinsics.f(this.f75775c, confirmationScreenContent.f75775c) && Intrinsics.f(this.d, confirmationScreenContent.d) && Intrinsics.f(this.e, confirmationScreenContent.e) && Intrinsics.f(this.f, confirmationScreenContent.f);
        }

        public final int hashCode() {
            String str = this.f75773a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f75774b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.f75775c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Details details = this.d;
            int iHashCode4 = (iHashCode3 + (details == null ? 0 : details.hashCode())) * 31;
            Button button = this.e;
            int iHashCode5 = (iHashCode4 + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.f;
            return iHashCode5 + (button2 != null ? button2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75773a);
            dest.writeString(this.f75774b);
            List list = this.f75775c;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    ((InfoItem) itQ.next()).writeToParcel(dest, i);
                }
            }
            Details details = this.d;
            if (details == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                details.writeToParcel(dest, i);
            }
            Button button = this.e;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, i);
            }
            Button button2 = this.f;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowConfirmationAction$DetailItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DetailItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f75778c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailItem(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailItem[i];
            }
        }

        public DetailItem(String str, String title, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f75776a = str;
            this.f75777b = title;
            this.f75778c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailItem)) {
                return false;
            }
            DetailItem detailItem = (DetailItem) obj2;
            return Intrinsics.f(this.f75776a, detailItem.f75776a) && Intrinsics.f(this.f75777b, detailItem.f75777b) && Intrinsics.f(this.f75778c, detailItem.f75778c);
        }

        public final int hashCode() {
            String str = this.f75776a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75777b);
            String str2 = this.f75778c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75776a);
            dest.writeString(this.f75777b);
            dest.writeString(this.f75778c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowConfirmationAction$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75780b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(DetailItem.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Details(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String str, ArrayList arrayList) {
            this.f75779a = str;
            this.f75780b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f75779a, details.f75779a) && Intrinsics.f(this.f75780b, details.f75780b);
        }

        public final int hashCode() {
            String str = this.f75779a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.f75780b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75779a);
            List list = this.f75780b;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((DetailItem) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ShowConfirmationAction$InfoItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InfoItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75782b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoItem(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoItem[i];
            }
        }

        public InfoItem(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f75781a = title;
            this.f75782b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InfoItem)) {
                return false;
            }
            InfoItem infoItem = (InfoItem) obj2;
            return Intrinsics.f(this.f75781a, infoItem.f75781a) && Intrinsics.f(this.f75782b, infoItem.f75782b);
        }

        public final int hashCode() {
            int iHashCode = this.f75781a.hashCode() * 31;
            String str = this.f75782b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75781a);
            dest.writeString(this.f75782b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShowConfirmationAction(ConfirmationScreenContent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShowConfirmationAction[i];
        }
    }

    public ShowConfirmationAction(ConfirmationScreenContent screenContent, CancelAction cancelAction) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f75771a = screenContent;
        this.f75772b = cancelAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShowConfirmationAction)) {
            return false;
        }
        ShowConfirmationAction showConfirmationAction = (ShowConfirmationAction) obj2;
        return Intrinsics.f(this.f75771a, showConfirmationAction.f75771a) && Intrinsics.f(this.f75772b, showConfirmationAction.f75772b);
    }

    public final int hashCode() {
        int iHashCode = this.f75771a.hashCode() * 31;
        CancelAction cancelAction = this.f75772b;
        return iHashCode + (cancelAction == null ? 0 : cancelAction.f75755a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f75771a.writeToParcel(dest, i);
        CancelAction cancelAction = this.f75772b;
        if (cancelAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cancelAction.writeToParcel(dest, i);
        }
    }
}
