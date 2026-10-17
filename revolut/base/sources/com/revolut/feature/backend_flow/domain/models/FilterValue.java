package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "Landroid/os/Parcelable;", "<init>", "()V", "StringValue", "BooleanValue", "IntValue", "LongValue", "DateTimeValue", "DateValue", "TimeValue", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$BooleanValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$DateTimeValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$DateValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$IntValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$LongValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$StringValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue$TimeValue;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FilterValue implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$BooleanValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BooleanValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<BooleanValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f63452a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BooleanValue(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BooleanValue[i];
            }
        }

        public BooleanValue(boolean z) {
            this.f63452a = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF63452a() {
            return this.f63452a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BooleanValue) && this.f63452a == ((BooleanValue) obj2).f63452a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63452a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f63452a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$DateTimeValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateTimeValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<DateTimeValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTimeOption f63453a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateTimeValue((DateTimeOption) parcel.readParcelable(DateTimeValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateTimeValue[i];
            }
        }

        public DateTimeValue(DateTimeOption dateTimeOption) {
            Intrinsics.checkNotNullParameter(dateTimeOption, "dateTimeOption");
            this.f63453a = dateTimeOption;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DateTimeOption getF63453a() {
            return this.f63453a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateTimeValue) && Intrinsics.f(this.f63453a, ((DateTimeValue) obj2).f63453a);
        }

        public final int hashCode() {
            return this.f63453a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63453a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$DateValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<DateValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateOption f63454a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateValue((DateOption) parcel.readParcelable(DateValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateValue[i];
            }
        }

        public DateValue(DateOption dateOption) {
            Intrinsics.checkNotNullParameter(dateOption, "dateOption");
            this.f63454a = dateOption;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DateOption getF63454a() {
            return this.f63454a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateValue) && Intrinsics.f(this.f63454a, ((DateValue) obj2).f63454a);
        }

        public final int hashCode() {
            return this.f63454a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63454a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$IntValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IntValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<IntValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63455a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntValue(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntValue[i];
            }
        }

        public IntValue(int i) {
            this.f63455a = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF63455a() {
            return this.f63455a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IntValue) && this.f63455a == ((IntValue) obj2).f63455a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f63455a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f63455a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$LongValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LongValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<LongValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63456a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LongValue(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LongValue[i];
            }
        }

        public LongValue(long j2) {
            this.f63456a = j2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF63456a() {
            return this.f63456a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LongValue) && this.f63456a == ((LongValue) obj2).f63456a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f63456a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f63456a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$StringValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StringValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<StringValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63457a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringValue(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StringValue[i];
            }
        }

        public StringValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63457a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StringValue) && Intrinsics.f(this.f63457a, ((StringValue) obj2).f63457a);
        }

        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF63457a() {
            return this.f63457a;
        }

        public final int hashCode() {
            return this.f63457a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63457a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FilterValue$TimeValue;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimeValue extends FilterValue {

        @NotNull
        public static final Parcelable.Creator<TimeValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeOption f63458a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimeValue((TimeOption) parcel.readParcelable(TimeValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimeValue[i];
            }
        }

        public TimeValue(TimeOption timeOption) {
            Intrinsics.checkNotNullParameter(timeOption, "timeOption");
            this.f63458a = timeOption;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TimeOption getF63458a() {
            return this.f63458a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TimeValue) && Intrinsics.f(this.f63458a, ((TimeValue) obj2).f63458a);
        }

        public final int hashCode() {
            return this.f63458a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63458a, i);
        }
    }

    private FilterValue() {
    }
}
