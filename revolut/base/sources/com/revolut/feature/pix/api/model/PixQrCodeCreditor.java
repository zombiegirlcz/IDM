package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeCreditor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeCreditor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeCreditor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrCodeParty f80432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeAgent f80433b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeCreditor(parcel.readInt() == 0 ? null : PixQrCodeParty.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PixQrCodeAgent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeCreditor[i];
        }
    }

    public PixQrCodeCreditor(PixQrCodeParty pixQrCodeParty, PixQrCodeAgent pixQrCodeAgent) {
        this.f80432a = pixQrCodeParty;
        this.f80433b = pixQrCodeAgent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeCreditor)) {
            return false;
        }
        PixQrCodeCreditor pixQrCodeCreditor = (PixQrCodeCreditor) obj2;
        return Intrinsics.f(this.f80432a, pixQrCodeCreditor.f80432a) && Intrinsics.f(this.f80433b, pixQrCodeCreditor.f80433b);
    }

    public final int hashCode() {
        PixQrCodeParty pixQrCodeParty = this.f80432a;
        int iHashCode = (pixQrCodeParty == null ? 0 : pixQrCodeParty.hashCode()) * 31;
        PixQrCodeAgent pixQrCodeAgent = this.f80433b;
        return iHashCode + (pixQrCodeAgent != null ? pixQrCodeAgent.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        PixQrCodeParty pixQrCodeParty = this.f80432a;
        if (pixQrCodeParty == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeParty.writeToParcel(dest, i);
        }
        PixQrCodeAgent pixQrCodeAgent = this.f80433b;
        if (pixQrCodeAgent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeAgent.writeToParcel(dest, i);
        }
    }
}
