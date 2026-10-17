package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import dj0.d;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "Landroid/os/Parcelable;", "<init>", "()V", "BillFieldAddress", "BillFieldMoney", "BillFieldDateMonth", "BillFieldDateOfBirth", "BillFieldText", "BillFieldSubform", "BillFieldSection", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldAddress;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldDateMonth;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldDateOfBirth;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldMoney;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldSection;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldSubform;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldText;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BillFieldV2 implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldAddress;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldAddress extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f61256b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillFieldAddress(parcel.readString(), (Address) parcel.readParcelable(BillFieldAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldAddress[i];
            }
        }

        public BillFieldAddress(String label, Address address) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f61255a = label;
            this.f61256b = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldAddress)) {
                return false;
            }
            BillFieldAddress billFieldAddress = (BillFieldAddress) obj2;
            return Intrinsics.f(this.f61255a, billFieldAddress.f61255a) && Intrinsics.f(this.f61256b, billFieldAddress.f61256b);
        }

        public final int hashCode() {
            int iHashCode = this.f61255a.hashCode() * 31;
            Address address = this.f61256b;
            return iHashCode + (address == null ? 0 : address.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61255a);
            dest.writeParcelable(this.f61256b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldDateMonth;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldDateMonth extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldDateMonth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final YearMonth f61258b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillFieldDateMonth(parcel.readString(), (YearMonth) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldDateMonth[i];
            }
        }

        public BillFieldDateMonth(String label, YearMonth value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f61257a = label;
            this.f61258b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldDateMonth)) {
                return false;
            }
            BillFieldDateMonth billFieldDateMonth = (BillFieldDateMonth) obj2;
            return Intrinsics.f(this.f61257a, billFieldDateMonth.f61257a) && Intrinsics.f(this.f61258b, billFieldDateMonth.f61258b);
        }

        public final int hashCode() {
            return this.f61258b.hashCode() + (this.f61257a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61257a);
            dest.writeSerializable(this.f61258b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldDateOfBirth;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldDateOfBirth extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldDateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f61260b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillFieldDateOfBirth(parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldDateOfBirth[i];
            }
        }

        public BillFieldDateOfBirth(String label, LocalDate value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f61259a = label;
            this.f61260b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldDateOfBirth)) {
                return false;
            }
            BillFieldDateOfBirth billFieldDateOfBirth = (BillFieldDateOfBirth) obj2;
            return Intrinsics.f(this.f61259a, billFieldDateOfBirth.f61259a) && Intrinsics.f(this.f61260b, billFieldDateOfBirth.f61260b);
        }

        public final int hashCode() {
            return this.f61260b.hashCode() + (this.f61259a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61259a);
            dest.writeSerializable(this.f61260b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldMoney;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldMoney extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f61262b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillFieldMoney((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldMoney[i];
            }
        }

        public BillFieldMoney(d value, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f61261a = label;
            this.f61262b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldMoney)) {
                return false;
            }
            BillFieldMoney billFieldMoney = (BillFieldMoney) obj2;
            return Intrinsics.f(this.f61261a, billFieldMoney.f61261a) && Intrinsics.f(this.f61262b, billFieldMoney.f61262b);
        }

        public final int hashCode() {
            return this.f61262b.hashCode() + (this.f61261a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61261a);
            dest.writeSerializable(this.f61262b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldSection;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldSection extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldSection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f61264b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillFieldSection.class, parcel, arrayList, iE, 1);
                }
                return new BillFieldSection(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldSection[i];
            }
        }

        public BillFieldSection(String str, ArrayList fields) {
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.f61263a = str;
            this.f61264b = fields;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldSection)) {
                return false;
            }
            BillFieldSection billFieldSection = (BillFieldSection) obj2;
            return Intrinsics.f(this.f61263a, billFieldSection.f61263a) && this.f61264b.equals(billFieldSection.f61264b);
        }

        public final int hashCode() {
            String str = this.f61263a;
            return this.f61264b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61263a);
            Iterator itY = j6.a.y(this.f61264b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldSubform;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldSubform extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldSubform> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f61266b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillFieldSubform.class, parcel, arrayList, iE, 1);
                }
                return new BillFieldSubform(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldSubform[i];
            }
        }

        public BillFieldSubform(String label, ArrayList fields) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.f61265a = label;
            this.f61266b = fields;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldSubform)) {
                return false;
            }
            BillFieldSubform billFieldSubform = (BillFieldSubform) obj2;
            return Intrinsics.f(this.f61265a, billFieldSubform.f61265a) && this.f61266b.equals(billFieldSubform.f61266b);
        }

        public final int hashCode() {
            return this.f61266b.hashCode() + (this.f61265a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61265a);
            Iterator itY = j6.a.y(this.f61266b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2$BillFieldText;", "Lcom/revolut/feature/apm/bills/core/api/model/BillFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFieldText extends BillFieldV2 {

        @NotNull
        public static final Parcelable.Creator<BillFieldText> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BillFormField.Tooltip f61269c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillFieldText(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillFormField.Tooltip.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFieldText[i];
            }
        }

        public BillFieldText(String label, String value, BillFormField.Tooltip tooltip) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f61267a = label;
            this.f61268b = value;
            this.f61269c = tooltip;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFieldText)) {
                return false;
            }
            BillFieldText billFieldText = (BillFieldText) obj2;
            return Intrinsics.f(this.f61267a, billFieldText.f61267a) && Intrinsics.f(this.f61268b, billFieldText.f61268b) && Intrinsics.f(this.f61269c, billFieldText.f61269c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f61267a.hashCode() * 31, 31, this.f61268b);
            BillFormField.Tooltip tooltip = this.f61269c;
            return iC + (tooltip == null ? 0 : tooltip.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61267a);
            dest.writeString(this.f61268b);
            BillFormField.Tooltip tooltip = this.f61269c;
            if (tooltip == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                tooltip.writeToParcel(dest, i);
            }
        }
    }

    private BillFieldV2() {
    }
}
