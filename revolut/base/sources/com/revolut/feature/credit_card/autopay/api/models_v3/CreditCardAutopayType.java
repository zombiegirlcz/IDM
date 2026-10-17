package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nb5.e;
import nb5.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType;", "Landroid/os/Parcelable;", "DirectDebit", "RevolutPocket", "BackupCard", "Unsupported", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$BackupCard;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$DirectDebit;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$RevolutPocket;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$Unsupported;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAutopayType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$BackupCard;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackupCard implements CreditCardAutopayType {

        @NotNull
        public static final Parcelable.Creator<BackupCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f70725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f70726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f70727c;
        public final ArrayList d;
        public final List e;
        public final Integer f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f70728g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                e eVarValueOf = e.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(e.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList2.add(e.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i21 = 0; i21 != i6; i21++) {
                    arrayList3.add(nb5.b.valueOf(parcel.readString()));
                }
                int i22 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i22);
                for (int i32 = 0; i32 != i22; i32++) {
                    arrayList4.add(com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf(parcel.readString()));
                }
                return new BackupCard(eVarValueOf, arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackupCard[i];
            }
        }

        public BackupCard(e paymentType, ArrayList disallows, ArrayList requires, ArrayList allowedDay, List allowedPaymentAmountTypes, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(disallows, "disallows");
            Intrinsics.checkNotNullParameter(requires, "requires");
            Intrinsics.checkNotNullParameter(allowedDay, "allowedDay");
            Intrinsics.checkNotNullParameter(allowedPaymentAmountTypes, "allowedPaymentAmountTypes");
            this.f70725a = paymentType;
            this.f70726b = disallows;
            this.f70727c = requires;
            this.d = allowedDay;
            this.e = allowedPaymentAmountTypes;
            this.f = num;
            this.f70728g = num2;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: K4, reason: from getter */
        public final e getF70734a() {
            return this.f70725a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: R1, reason: from getter */
        public final Integer getF() {
            return this.f;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: d6, reason: from getter */
        public final List getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackupCard)) {
                return false;
            }
            BackupCard backupCard = (BackupCard) obj2;
            return this.f70725a == backupCard.f70725a && this.f70726b.equals(backupCard.f70726b) && this.f70727c.equals(backupCard.f70727c) && this.d.equals(backupCard.d) && Intrinsics.f(this.e, backupCard.e) && Intrinsics.f(this.f, backupCard.f) && Intrinsics.f(this.f70728g, backupCard.f70728g);
        }

        public final int hashCode() {
            int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70727c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70726b, this.f70725a.hashCode() * 31, 31), 31), 31), 31, this.e);
            Integer num = this.f;
            int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f70728g;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        public final List l9() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70725a.name());
            Iterator itY = j6.a.y(this.f70726b, dest);
            while (itY.hasNext()) {
                dest.writeString(((e) itY.next()).name());
            }
            Iterator itY2 = j6.a.y(this.f70727c, dest);
            while (itY2.hasNext()) {
                dest.writeString(((e) itY2.next()).name());
            }
            Iterator itY3 = j6.a.y(this.d, dest);
            while (itY3.hasNext()) {
                dest.writeString(((nb5.b) itY3.next()).name());
            }
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeString(((com.revolut.feature.credit_card.autopay.api.models_v3.a) itV.next()).name());
            }
            Integer num = this.f;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Integer num2 = this.f70728g;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$DirectDebit;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebit implements CreditCardAutopayType {

        @NotNull
        public static final Parcelable.Creator<DirectDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f70729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f70730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f70731c;
        public final ArrayList d;
        public final List e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f70732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g f70733h;
        public final wi0.b i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                e eVarValueOf = e.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(e.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList3.add(e.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                for (int i21 = 0; i21 != i6; i21++) {
                    arrayList4.add(nb5.b.valueOf(parcel.readString()));
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i22 = parcel.readInt();
                    arrayList = new ArrayList(i22);
                    for (int i32 = 0; i32 != i22; i32++) {
                        arrayList.add(com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf(parcel.readString()));
                    }
                }
                return new DirectDebit(eVarValueOf, arrayList2, arrayList3, arrayList4, arrayList, parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, g.valueOf(parcel.readString()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebit[i];
            }
        }

        public DirectDebit(e paymentType, ArrayList disallows, ArrayList requires, ArrayList allowedDay, ArrayList arrayList, int i, Integer num, g accountNumberFormat, wi0.b bankCountry) {
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(disallows, "disallows");
            Intrinsics.checkNotNullParameter(requires, "requires");
            Intrinsics.checkNotNullParameter(allowedDay, "allowedDay");
            Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
            Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
            this.f70729a = paymentType;
            this.f70730b = disallows;
            this.f70731c = requires;
            this.d = allowedDay;
            this.e = arrayList;
            this.f = i;
            this.f70732g = num;
            this.f70733h = accountNumberFormat;
            this.i = bankCountry;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: K4, reason: from getter */
        public final e getF70734a() {
            return this.f70729a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: R1 */
        public final Integer getF() {
            return Integer.valueOf(this.f);
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: d6, reason: from getter */
        public final List getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectDebit)) {
                return false;
            }
            DirectDebit directDebit = (DirectDebit) obj2;
            return this.f70729a == directDebit.f70729a && this.f70730b.equals(directDebit.f70730b) && this.f70731c.equals(directDebit.f70731c) && this.d.equals(directDebit.d) && Intrinsics.f(this.e, directDebit.e) && this.f == directDebit.f && Intrinsics.f(this.f70732g, directDebit.f70732g) && this.f70733h == directDebit.f70733h && Intrinsics.f(this.i, directDebit.i);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70731c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70730b, this.f70729a.hashCode() * 31, 31), 31), 31);
            List list = this.e;
            int iB2 = j6.a.b(this.f, (iB + (list == null ? 0 : list.hashCode())) * 31, 31);
            Integer num = this.f70732g;
            return this.i.f297794a.hashCode() + ((this.f70733h.hashCode() + ((iB2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        public final List l9() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70729a.name());
            Iterator itY = j6.a.y(this.f70730b, dest);
            while (itY.hasNext()) {
                dest.writeString(((e) itY.next()).name());
            }
            Iterator itY2 = j6.a.y(this.f70731c, dest);
            while (itY2.hasNext()) {
                dest.writeString(((e) itY2.next()).name());
            }
            Iterator itY3 = j6.a.y(this.d, dest);
            while (itY3.hasNext()) {
                dest.writeString(((nb5.b) itY3.next()).name());
            }
            List list = this.e;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeString(((com.revolut.feature.credit_card.autopay.api.models_v3.a) itQ.next()).name());
                }
            }
            dest.writeInt(this.f);
            Integer num = this.f70732g;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.f70733h.name());
            dest.writeSerializable(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$RevolutPocket;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutPocket implements CreditCardAutopayType {

        @NotNull
        public static final Parcelable.Creator<RevolutPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f70734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f70735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f70736c;
        public final ArrayList d;
        public final List e;
        public final Integer f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f70737g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                e eVarValueOf = e.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(e.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList2.add(e.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i21 = 0; i21 != i6; i21++) {
                    arrayList3.add(nb5.b.valueOf(parcel.readString()));
                }
                int i22 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i22);
                for (int i32 = 0; i32 != i22; i32++) {
                    arrayList4.add(com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf(parcel.readString()));
                }
                return new RevolutPocket(eVarValueOf, arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutPocket[i];
            }
        }

        public RevolutPocket(e paymentType, ArrayList disallows, ArrayList requires, ArrayList allowedDay, List allowedPaymentAmountTypes, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(disallows, "disallows");
            Intrinsics.checkNotNullParameter(requires, "requires");
            Intrinsics.checkNotNullParameter(allowedDay, "allowedDay");
            Intrinsics.checkNotNullParameter(allowedPaymentAmountTypes, "allowedPaymentAmountTypes");
            this.f70734a = paymentType;
            this.f70735b = disallows;
            this.f70736c = requires;
            this.d = allowedDay;
            this.e = allowedPaymentAmountTypes;
            this.f = num;
            this.f70737g = num2;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: K4, reason: from getter */
        public final e getF70734a() {
            return this.f70734a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: R1, reason: from getter */
        public final Integer getF() {
            return this.f;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: d6, reason: from getter */
        public final List getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutPocket)) {
                return false;
            }
            RevolutPocket revolutPocket = (RevolutPocket) obj2;
            return this.f70734a == revolutPocket.f70734a && this.f70735b.equals(revolutPocket.f70735b) && this.f70736c.equals(revolutPocket.f70736c) && this.d.equals(revolutPocket.d) && Intrinsics.f(this.e, revolutPocket.e) && Intrinsics.f(this.f, revolutPocket.f) && Intrinsics.f(this.f70737g, revolutPocket.f70737g);
        }

        public final int hashCode() {
            int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70736c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f70735b, this.f70734a.hashCode() * 31, 31), 31), 31), 31, this.e);
            Integer num = this.f;
            int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f70737g;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        public final List l9() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70734a.name());
            Iterator itY = j6.a.y(this.f70735b, dest);
            while (itY.hasNext()) {
                dest.writeString(((e) itY.next()).name());
            }
            Iterator itY2 = j6.a.y(this.f70736c, dest);
            while (itY2.hasNext()) {
                dest.writeString(((e) itY2.next()).name());
            }
            Iterator itY3 = j6.a.y(this.d, dest);
            while (itY3.hasNext()) {
                dest.writeString(((nb5.b) itY3.next()).name());
            }
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeString(((com.revolut.feature.credit_card.autopay.api.models_v3.a) itV.next()).name());
            }
            Integer num = this.f;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Integer num2 = this.f70737g;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType$Unsupported;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayType;", "<init>", "()V", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unsupported implements CreditCardAutopayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsupported f70738a = new Unsupported();

        @NotNull
        public static final Parcelable.Creator<Unsupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unsupported.f70738a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unsupported[i];
            }
        }

        private Unsupported() {
        }

        public static void a(String str) {
            throw new IllegalStateException("Unsupported type does not support this field ".concat(str));
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: K4 */
        public final e getF70734a() {
            a("paymentType");
            throw null;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: R1 */
        public final Integer getF() {
            a("daysInAdvance");
            throw null;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        /* JADX INFO: renamed from: d6 */
        public final List getE() {
            a("allowedPaymentAmountTypes");
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType
        public final List l9() {
            a("allowedDay");
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: K4 */
    e getF70734a();

    /* JADX INFO: renamed from: R1 */
    Integer getF();

    /* JADX INFO: renamed from: d6 */
    List getE();

    List l9();
}
