package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption;", "Landroid/os/Parcelable;", "<init>", "()V", "Specific", "Now", "Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption$Now;", "Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption$Specific;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DateTimeOption implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption$Now;", "Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Now extends DateTimeOption {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Now f63385a = new Now();

        @NotNull
        public static final Parcelable.Creator<Now> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Now.f63385a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Now[i];
            }
        }

        private Now() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption$Specific;", "Lcom/revolut/feature/backend_flow/domain/models/DateTimeOption;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Specific extends DateTimeOption {

        @NotNull
        public static final Parcelable.Creator<Specific> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f63386a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Specific((LocalDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Specific[i];
            }
        }

        public Specific(LocalDateTime value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63386a = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getF63386a() {
            return this.f63386a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Specific) && Intrinsics.f(this.f63386a, ((Specific) obj2).f63386a);
        }

        public final int hashCode() {
            return this.f63386a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f63386a);
        }
    }

    private DateTimeOption() {
    }
}
