package com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferScreenMode;", "Landroid/os/Parcelable;", "<init>", "()V", "PredefinedFilter", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferScreenMode$PredefinedFilter;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WhoToTransferScreenMode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferScreenMode$PredefinedFilter;", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferScreenMode;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PredefinedFilter extends WhoToTransferScreenMode {

        @NotNull
        public static final Parcelable.Creator<PredefinedFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f80054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80055b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PredefinedFilter.class, parcel, arrayList, iE, 1);
                }
                return new PredefinedFilter(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PredefinedFilter[i];
            }
        }

        public PredefinedFilter(List filters, boolean z) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f80054a = filters;
            this.f80055b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PredefinedFilter)) {
                return false;
            }
            PredefinedFilter predefinedFilter = (PredefinedFilter) obj2;
            return Intrinsics.f(this.f80054a, predefinedFilter.f80054a) && this.f80055b == predefinedFilter.f80055b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f80055b) + (this.f80054a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f80054a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f80055b ? 1 : 0);
        }
    }

    private WhoToTransferScreenMode() {
    }
}
