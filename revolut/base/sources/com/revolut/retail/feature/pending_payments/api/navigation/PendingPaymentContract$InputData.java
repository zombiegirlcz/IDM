package com.revolut.retail.feature.pending_payments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Apm", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$InputData$Apm;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PendingPaymentContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$InputData$Apm;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Apm implements PendingPaymentContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Apm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f102400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f102402c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Apm(parcel.readParcelable(Apm.class.getClassLoader()), parcel.readInt() != 0, (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Apm[i];
            }
        }

        public /* synthetic */ Apm(Parcelable parcelable, boolean z) {
            this(parcelable, true, null, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Apm)) {
                return false;
            }
            Apm apm = (Apm) obj2;
            return Intrinsics.f(this.f102400a, apm.f102400a) && this.f102401b == apm.f102401b && Intrinsics.f(this.f102402c, apm.f102402c) && this.d == apm.d;
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f102400a.hashCode() * 31, 31, this.f102401b);
            b bVar = this.f102402c;
            return Boolean.hashCode(this.d) + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102400a, i);
            dest.writeInt(this.f102401b ? 1 : 0);
            dest.writeSerializable(this.f102402c);
            dest.writeInt(this.d ? 1 : 0);
        }

        public Apm(Parcelable parcel, boolean z, b bVar, boolean z3) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f102400a = parcel;
            this.f102401b = z;
            this.f102402c = bVar;
            this.d = z3;
        }
    }
}
