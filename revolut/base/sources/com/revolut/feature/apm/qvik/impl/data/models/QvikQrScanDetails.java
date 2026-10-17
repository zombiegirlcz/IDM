package com.revolut.feature.apm.qvik.impl.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/data/models/QvikQrScanDetails;", "Landroid/os/Parcelable;", "Transfer", "Lcom/revolut/feature/apm/qvik/impl/data/models/QvikQrScanDetails$Transfer;", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface QvikQrScanDetails extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/data/models/QvikQrScanDetails$Transfer;", "Lcom/revolut/feature/apm/qvik/impl/data/models/QvikQrScanDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements QvikQrScanDetails {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QvikContact f62791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final QvikQrScanParams f62792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62793c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((QvikContact) parcel.readParcelable(Transfer.class.getClassLoader()), QvikQrScanParams.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(QvikContact recipient, QvikQrScanParams details, String url2) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f62791a = recipient;
            this.f62792b = details;
            this.f62793c = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f62791a, transfer.f62791a) && Intrinsics.f(this.f62792b, transfer.f62792b) && Intrinsics.f(this.f62793c, transfer.f62793c);
        }

        public final int hashCode() {
            return this.f62793c.hashCode() + ((this.f62792b.hashCode() + (this.f62791a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62791a, i);
            this.f62792b.writeToParcel(dest, i);
            dest.writeString(this.f62793c);
        }
    }
}
