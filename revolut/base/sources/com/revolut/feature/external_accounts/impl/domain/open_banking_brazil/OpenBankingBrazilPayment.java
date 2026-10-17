package com.revolut.feature.external_accounts.impl.domain.open_banking_brazil;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og6.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "og6/h", "PaymentInformation", "InfoGroup", "Item", "EditableMoneyField", "EditableDateField", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingBrazilPayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenBankingBrazilPayment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f72395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72396c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PaymentInformation f72397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f72398h;
    public final ThirdPartyBrazil i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f72399j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilPayment$EditableDateField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditableDateField implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EditableDateField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f72401b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditableDateField(parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditableDateField[i];
            }
        }

        public EditableDateField(String id10, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f72400a = id10;
            this.f72401b = localDate;
        }

        public static EditableDateField a(EditableDateField editableDateField, LocalDate localDate) {
            String id10 = editableDateField.f72400a;
            editableDateField.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            return new EditableDateField(id10, localDate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditableDateField)) {
                return false;
            }
            EditableDateField editableDateField = (EditableDateField) obj2;
            return Intrinsics.f(this.f72400a, editableDateField.f72400a) && Intrinsics.f(this.f72401b, editableDateField.f72401b);
        }

        public final int hashCode() {
            int iHashCode = this.f72400a.hashCode() * 31;
            LocalDate localDate = this.f72401b;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72400a);
            dest.writeSerializable(this.f72401b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilPayment$EditableMoneyField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditableMoneyField implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EditableMoneyField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f72404c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditableMoneyField((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditableMoneyField[i];
            }
        }

        public EditableMoneyField(d maxValueMoney, d dVar, String id10, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(maxValueMoney, "maxValueMoney");
            this.f72402a = id10;
            this.f72403b = z;
            this.f72404c = maxValueMoney;
            this.d = dVar;
        }

        public static EditableMoneyField a(EditableMoneyField editableMoneyField, d dVar) {
            String id10 = editableMoneyField.f72402a;
            boolean z = editableMoneyField.f72403b;
            d maxValueMoney = editableMoneyField.f72404c;
            editableMoneyField.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(maxValueMoney, "maxValueMoney");
            return new EditableMoneyField(maxValueMoney, dVar, id10, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditableMoneyField)) {
                return false;
            }
            EditableMoneyField editableMoneyField = (EditableMoneyField) obj2;
            return Intrinsics.f(this.f72402a, editableMoneyField.f72402a) && this.f72403b == editableMoneyField.f72403b && Intrinsics.f(this.f72404c, editableMoneyField.f72404c) && Intrinsics.f(this.d, editableMoneyField.d);
        }

        public final int hashCode() {
            int iC = v7.c(j6.a.c(this.f72402a.hashCode() * 31, 31, this.f72403b), 31, this.f72404c);
            d dVar = this.d;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72402a);
            dest.writeInt(this.f72403b ? 1 : 0);
            dest.writeSerializable(this.f72404c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilPayment$InfoGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoGroup implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InfoGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f72405a;

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
                return new InfoGroup(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoGroup[i];
            }
        }

        public InfoGroup(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f72405a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InfoGroup) && this.f72405a.equals(((InfoGroup) obj2).f72405a);
        }

        public final int hashCode() {
            return this.f72405a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f72405a, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilPayment$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EditableMoneyField f72408c;
        public final EditableDateField d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EditableMoneyField.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EditableDateField.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String title, String value, EditableMoneyField editableMoneyField, EditableDateField editableDateField) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72406a = title;
            this.f72407b = value;
            this.f72408c = editableMoneyField;
            this.d = editableDateField;
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
            return Intrinsics.f(this.f72406a, item.f72406a) && Intrinsics.f(this.f72407b, item.f72407b) && Intrinsics.f(this.f72408c, item.f72408c) && Intrinsics.f(this.d, item.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f72406a.hashCode() * 31, 31, this.f72407b);
            EditableMoneyField editableMoneyField = this.f72408c;
            int iHashCode = (iC + (editableMoneyField == null ? 0 : editableMoneyField.hashCode())) * 31;
            EditableDateField editableDateField = this.d;
            return iHashCode + (editableDateField != null ? editableDateField.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72406a);
            dest.writeString(this.f72407b);
            EditableMoneyField editableMoneyField = this.f72408c;
            if (editableMoneyField == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                editableMoneyField.writeToParcel(dest, i);
            }
            EditableDateField editableDateField = this.d;
            if (editableDateField == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                editableDateField.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilPayment$PaymentInformation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentInformation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f72409a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(InfoGroup.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PaymentInformation(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentInformation[i];
            }
        }

        public PaymentInformation(List groups) {
            Intrinsics.checkNotNullParameter(groups, "groups");
            this.f72409a = groups;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentInformation) && Intrinsics.f(this.f72409a, ((PaymentInformation) obj2).f72409a);
        }

        public final int hashCode() {
            return this.f72409a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f72409a, dest);
            while (itV.hasNext()) {
                ((InfoGroup) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenBankingBrazilPayment(parcel.readString(), h.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PaymentInformation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (ThirdPartyBrazil) parcel.readParcelable(OpenBankingBrazilPayment.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingBrazilPayment[i];
        }
    }

    public OpenBankingBrazilPayment(String consentId, h type, String title, String paymentDescription, String str, d dVar, PaymentInformation paymentInformation, Long l2, ThirdPartyBrazil thirdParty, String str2) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paymentDescription, "paymentDescription");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        this.f72394a = consentId;
        this.f72395b = type;
        this.f72396c = title;
        this.d = paymentDescription;
        this.e = str;
        this.f = dVar;
        this.f72397g = paymentInformation;
        this.f72398h = l2;
        this.i = thirdParty;
        this.f72399j = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingBrazilPayment)) {
            return false;
        }
        OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) obj2;
        return Intrinsics.f(this.f72394a, openBankingBrazilPayment.f72394a) && this.f72395b == openBankingBrazilPayment.f72395b && Intrinsics.f(this.f72396c, openBankingBrazilPayment.f72396c) && Intrinsics.f(this.d, openBankingBrazilPayment.d) && Intrinsics.f(this.e, openBankingBrazilPayment.e) && Intrinsics.f(this.f, openBankingBrazilPayment.f) && Intrinsics.f(this.f72397g, openBankingBrazilPayment.f72397g) && Intrinsics.f(this.f72398h, openBankingBrazilPayment.f72398h) && Intrinsics.f(this.i, openBankingBrazilPayment.i) && Intrinsics.f(this.f72399j, openBankingBrazilPayment.f72399j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f72395b.hashCode() + (this.f72394a.hashCode() * 31)) * 31, 31, this.f72396c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PaymentInformation paymentInformation = this.f72397g;
        int iHashCode3 = (iHashCode2 + (paymentInformation == null ? 0 : paymentInformation.f72409a.hashCode())) * 31;
        Long l2 = this.f72398h;
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        String str2 = this.f72399j;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72394a);
        dest.writeString(this.f72395b.name());
        dest.writeString(this.f72396c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        PaymentInformation paymentInformation = this.f72397g;
        if (paymentInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentInformation.writeToParcel(dest, i);
        }
        Long l2 = this.f72398h;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f72399j);
    }
}
