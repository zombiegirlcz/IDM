package com.revolut.feature.security_hub.impl.repository;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/LimitValue;", "Landroid/os/Parcelable;", "Amount", "Counter", "Lcom/revolut/feature/security_hub/impl/repository/LimitValue$Amount;", "Lcom/revolut/feature/security_hub/impl/repository/LimitValue$Counter;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LimitValue implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f85472b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/LimitValue$Amount;", "Lcom/revolut/feature/security_hub/impl/repository/LimitValue;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount extends LimitValue {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f85473c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Amount(d money) {
            super(money.f115082a, money.f115083b);
            Intrinsics.checkNotNullParameter(money, "money");
            this.f85473c = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f85473c, ((Amount) obj2).f85473c);
        }

        public final int hashCode() {
            return this.f85473c.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85473c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/LimitValue$Counter;", "Lcom/revolut/feature/security_hub/impl/repository/LimitValue;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Counter extends LimitValue {

        @NotNull
        public static final Parcelable.Creator<Counter> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85474c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Counter(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Counter[i];
            }
        }

        public Counter(long j2) {
            super(j2, null);
            this.f85474c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Counter) && this.f85474c == ((Counter) obj2).f85474c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f85474c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f85474c);
        }
    }

    public LimitValue(long j2, xi0.b bVar) {
        this.f85471a = j2;
        this.f85472b = bVar;
    }
}
