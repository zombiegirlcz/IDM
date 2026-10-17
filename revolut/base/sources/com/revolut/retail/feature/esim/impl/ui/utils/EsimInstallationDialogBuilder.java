package com.revolut.retail.feature.esim.impl.ui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class EsimInstallationDialogBuilder {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/utils/EsimInstallationDialogBuilder$TryAgainPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TryAgainPayload implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TryAgainPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101488b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TryAgainPayload(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TryAgainPayload[i];
            }
        }

        public TryAgainPayload(String esimProfileId, String str) {
            Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
            this.f101487a = esimProfileId;
            this.f101488b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TryAgainPayload)) {
                return false;
            }
            TryAgainPayload tryAgainPayload = (TryAgainPayload) obj2;
            return Intrinsics.f(this.f101487a, tryAgainPayload.f101487a) && Intrinsics.f(this.f101488b, tryAgainPayload.f101488b);
        }

        public final int hashCode() {
            int iHashCode = this.f101487a.hashCode() * 31;
            String str = this.f101488b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101487a);
            dest.writeString(this.f101488b);
        }
    }
}
