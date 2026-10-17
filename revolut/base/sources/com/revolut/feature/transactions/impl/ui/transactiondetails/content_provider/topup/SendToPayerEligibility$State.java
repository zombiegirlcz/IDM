package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.r1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State", "Landroid/os/Parcelable;", "Disabled", "Enabled", "Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State$Disabled;", "Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State$Enabled;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SendToPayerEligibility$State extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State$Disabled;", "Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State;", "<init>", "()V", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Disabled implements SendToPayerEligibility$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Disabled f92099a = new Disabled();

        @NotNull
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Disabled.f92099a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disabled[i];
            }
        }

        private Disabled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State$Enabled;", "Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$State;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Enabled implements SendToPayerEligibility$State {

        @NotNull
        public static final Parcelable.Creator<Enabled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r1 f92100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f5j.a f92101b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Enabled((r1) parcel.readSerializable(), (f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Enabled[i];
            }
        }

        public Enabled(r1 r1Var, f5j.a aVar) {
            this.f92100a = r1Var;
            this.f92101b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj2;
            return Intrinsics.f(this.f92100a, enabled.f92100a) && Intrinsics.f(this.f92101b, enabled.f92101b);
        }

        public final int hashCode() {
            r1 r1Var = this.f92100a;
            int iHashCode = (r1Var == null ? 0 : r1Var.hashCode()) * 31;
            f5j.a aVar = this.f92101b;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92100a);
            dest.writeSerializable(this.f92101b);
        }
    }
}
