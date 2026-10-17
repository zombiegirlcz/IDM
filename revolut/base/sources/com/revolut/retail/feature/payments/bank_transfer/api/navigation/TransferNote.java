package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote;", "Landroid/os/Parcelable;", "<init>", "()V", "SimpleNote", "NewZealandNote", "StructuredNote", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$NewZealandNote;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$SimpleNote;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$StructuredNote;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferNote implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$NewZealandNote;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewZealandNote extends TransferNote {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101982c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<NewZealandNote> CREATOR = new b();
        public static final NewZealandNote d = new NewZealandNote("", "", "");

        /* JADX INFO: renamed from: com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote$NewZealandNote$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewZealandNote(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewZealandNote[i];
            }
        }

        public NewZealandNote(String particulars, String code, String reference) {
            Intrinsics.checkNotNullParameter(particulars, "particulars");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f101980a = particulars;
            this.f101981b = code;
            this.f101982c = reference;
        }

        public static NewZealandNote a(NewZealandNote newZealandNote, String particulars, String code, String reference, int i) {
            if ((i & 1) != 0) {
                particulars = newZealandNote.f101980a;
            }
            if ((i & 2) != 0) {
                code = newZealandNote.f101981b;
            }
            if ((i & 4) != 0) {
                reference = newZealandNote.f101982c;
            }
            newZealandNote.getClass();
            Intrinsics.checkNotNullParameter(particulars, "particulars");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(reference, "reference");
            return new NewZealandNote(particulars, code, reference);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewZealandNote)) {
                return false;
            }
            NewZealandNote newZealandNote = (NewZealandNote) obj2;
            return Intrinsics.f(this.f101980a, newZealandNote.f101980a) && Intrinsics.f(this.f101981b, newZealandNote.f101981b) && Intrinsics.f(this.f101982c, newZealandNote.f101982c);
        }

        public final int hashCode() {
            return this.f101982c.hashCode() + p.a.c(this.f101980a.hashCode() * 31, 31, this.f101981b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101980a);
            dest.writeString(this.f101981b);
            dest.writeString(this.f101982c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$SimpleNote;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SimpleNote extends TransferNote {

        @NotNull
        public static final Parcelable.Creator<SimpleNote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101983a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleNote(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimpleNote[i];
            }
        }

        public SimpleNote(String note) {
            Intrinsics.checkNotNullParameter(note, "note");
            this.f101983a = note;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SimpleNote) && Intrinsics.f(this.f101983a, ((SimpleNote) obj2).f101983a);
        }

        public final int hashCode() {
            return this.f101983a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101983a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$StructuredNote;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote;", "", "toString", "()Ljava/lang/String;", "ReferenceValue", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StructuredNote extends TransferNote {

        @NotNull
        public static final Parcelable.Creator<StructuredNote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f101985b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/TransferNote$StructuredNote$ReferenceValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReferenceValue implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f101986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f101987b;

            @NotNull
            public static final Parcelable.Creator<ReferenceValue> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReferenceValue(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ReferenceValue[i];
                }
            }

            static {
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                new ReferenceValue("", "");
            }

            public ReferenceValue(String value, String maskedValue) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(maskedValue, "maskedValue");
                this.f101986a = value;
                this.f101987b = maskedValue;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ReferenceValue)) {
                    return false;
                }
                ReferenceValue referenceValue = (ReferenceValue) obj2;
                return Intrinsics.f(this.f101986a, referenceValue.f101986a) && Intrinsics.f(this.f101987b, referenceValue.f101987b);
            }

            public final int hashCode() {
                return this.f101987b.hashCode() + (this.f101986a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f101986a);
                dest.writeString(this.f101987b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string2 = parcel.readString();
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                    for (int i5 = 0; i5 != i3; i5++) {
                        linkedHashMap2.put(parcel.readString(), ReferenceValue.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap.put(string2, linkedHashMap2);
                }
                return new StructuredNote(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StructuredNote[i];
            }
        }

        public StructuredNote(String selectedOption, Map values) {
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f101984a = selectedOption;
            this.f101985b = values;
        }

        public static StructuredNote a(StructuredNote structuredNote, String selectedOption, Map values, int i) {
            if ((i & 1) != 0) {
                selectedOption = structuredNote.f101984a;
            }
            if ((i & 2) != 0) {
                values = structuredNote.f101985b;
            }
            structuredNote.getClass();
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            Intrinsics.checkNotNullParameter(values, "values");
            return new StructuredNote(selectedOption, values);
        }

        public final Map b() {
            return (Map) this.f101985b.get(this.f101984a);
        }

        public final StructuredNote c(String optionType, String fieldType, ReferenceValue newReferenceValue) {
            Intrinsics.checkNotNullParameter(optionType, "optionType");
            Intrinsics.checkNotNullParameter(fieldType, "fieldType");
            Intrinsics.checkNotNullParameter(newReferenceValue, "newReferenceValue");
            Map map = this.f101985b;
            Map mapG = (Map) map.get(optionType);
            if (mapG == null) {
                mapG = r0.g();
            }
            return a(this, null, r0.q(map, new Pair(optionType, r0.q(mapG, new Pair(fieldType, newReferenceValue)))), 1);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StructuredNote)) {
                return false;
            }
            StructuredNote structuredNote = (StructuredNote) obj2;
            return Intrinsics.f(this.f101984a, structuredNote.f101984a) && Intrinsics.f(this.f101985b, structuredNote.f101985b);
        }

        public final int hashCode() {
            return this.f101985b.hashCode() + (this.f101984a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101984a);
            Iterator itZ = j6.a.z(this.f101985b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                Iterator itZ2 = j6.a.z((Map) entry.getValue(), dest);
                while (itZ2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) itZ2.next();
                    dest.writeString((String) entry2.getKey());
                    ((ReferenceValue) entry2.getValue()).writeToParcel(dest, i);
                }
            }
        }
    }

    private TransferNote() {
    }
}
