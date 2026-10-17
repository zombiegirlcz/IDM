package com.revolut.feature.transport.impl.ui.transit_checkout.fields;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue;", "Landroid/os/Parcelable;", "TextField", "DateField", "AddressField", "DateTimeField", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$AddressField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$DateField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$DateTimeField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$TextField;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransitCheckoutFieldValue extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$AddressField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressField implements TransitCheckoutFieldValue {

        @NotNull
        public static final Parcelable.Creator<AddressField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f92569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92571c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressField(parcel.readString(), (Address) parcel.readParcelable(AddressField.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressField[i];
            }
        }

        public AddressField(String str, Address address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.f92569a = address;
            this.f92570b = str;
            this.f92571c = o51.a.a(address, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressField)) {
                return false;
            }
            AddressField addressField = (AddressField) obj2;
            return Intrinsics.f(this.f92569a, addressField.f92569a) && Intrinsics.f(this.f92570b, addressField.f92570b);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF92577a() {
            return this.f92571c;
        }

        public final int hashCode() {
            int iHashCode = this.f92569a.hashCode() * 31;
            String str = this.f92570b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92569a, i);
            dest.writeString(this.f92570b);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        public final Clause z0() {
            return new TextClause(o51.a.b(this.f92569a, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$DateField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateField implements TransitCheckoutFieldValue {

        @NotNull
        public static final Parcelable.Creator<DateField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f92572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f92573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92574c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateField(parcel.readLong(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateField[i];
            }
        }

        public DateField(long j2, LocalDate selectedDate) {
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            this.f92572a = j2;
            this.f92573b = selectedDate;
            String string = selectedDate.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.f92574c = string;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateField)) {
                return false;
            }
            DateField dateField = (DateField) obj2;
            return this.f92572a == dateField.f92572a && Intrinsics.f(this.f92573b, dateField.f92573b);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF92577a() {
            return this.f92574c;
        }

        public final int hashCode() {
            return this.f92573b.hashCode() + (Long.hashCode(this.f92572a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f92572a);
            dest.writeSerializable(this.f92573b);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        public final Clause z0() {
            return new TimeClause(this.f92572a, TimeClause.Format.DateLong.f57962b, null, null, 12);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$DateTimeField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateTimeField implements TransitCheckoutFieldValue {

        @NotNull
        public static final Parcelable.Creator<DateTimeField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f92575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalTime f92576b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateTimeField((LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateTimeField[i];
            }
        }

        public DateTimeField(LocalDate localDate, LocalTime localTime) {
            this.f92575a = localDate;
            this.f92576b = localTime;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.time.ZonedDateTime] */
        public final String a() {
            LocalTime localTime;
            LocalDate localDate = this.f92575a;
            if (localDate == null || (localTime = this.f92576b) == null) {
                m70.a.c(t0.f186434a);
                return "";
            }
            String str = LocalDateTime.of(localDate, localTime).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateTimeField)) {
                return false;
            }
            DateTimeField dateTimeField = (DateTimeField) obj2;
            return Intrinsics.f(this.f92575a, dateTimeField.f92575a) && Intrinsics.f(this.f92576b, dateTimeField.f92576b);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        /* JADX INFO: renamed from: getValue */
        public final String getF92577a() {
            return a();
        }

        public final int hashCode() {
            LocalDate localDate = this.f92575a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalTime localTime = this.f92576b;
            return iHashCode + (localTime != null ? localTime.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92575a);
            dest.writeSerializable(this.f92576b);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        public final Clause z0() {
            return new TextClause(a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue$TextField;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/fields/TransitCheckoutFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextField implements TransitCheckoutFieldValue {

        @NotNull
        public static final Parcelable.Creator<TextField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92577a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextField(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextField[i];
            }
        }

        public TextField(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f92577a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TextField) && Intrinsics.f(this.f92577a, ((TextField) obj2).f92577a);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF92577a() {
            return this.f92577a;
        }

        public final int hashCode() {
            return this.f92577a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92577a);
        }

        @Override // com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue
        public final Clause z0() {
            return new TextClause(this.f92577a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    /* JADX INFO: renamed from: getValue */
    String getF92577a();

    Clause z0();
}
