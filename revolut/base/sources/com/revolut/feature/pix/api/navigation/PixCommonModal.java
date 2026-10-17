package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.pix.api.model.PixQrCodeAdditionalInformation;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixCommonModal;", "Landroid/os/Parcelable;", "ShowAddress", "ShowAdditionalInformation", "ShowMoneyBreakdown", "Lcom/revolut/feature/pix/api/navigation/PixCommonModal$ShowAdditionalInformation;", "Lcom/revolut/feature/pix/api/navigation/PixCommonModal$ShowAddress;", "Lcom/revolut/feature/pix/api/navigation/PixCommonModal$ShowMoneyBreakdown;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixCommonModal extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixCommonModal$ShowAdditionalInformation;", "Lcom/revolut/feature/pix/api/navigation/PixCommonModal;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAdditionalInformation implements PixCommonModal {

        @NotNull
        public static final Parcelable.Creator<ShowAdditionalInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f80503a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PixQrCodeAdditionalInformation.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ShowAdditionalInformation(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAdditionalInformation[i];
            }
        }

        public ShowAdditionalInformation(List additionalInformation) {
            Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
            this.f80503a = additionalInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAdditionalInformation) && Intrinsics.f(this.f80503a, ((ShowAdditionalInformation) obj2).f80503a);
        }

        public final int hashCode() {
            return this.f80503a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f80503a, dest);
            while (itV.hasNext()) {
                ((PixQrCodeAdditionalInformation) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixCommonModal$ShowAddress;", "Lcom/revolut/feature/pix/api/navigation/PixCommonModal;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAddress implements PixCommonModal {

        @NotNull
        public static final Parcelable.Creator<ShowAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f80504a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowAddress((Address) parcel.readParcelable(ShowAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAddress[i];
            }
        }

        public ShowAddress(Address address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.f80504a = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAddress) && Intrinsics.f(this.f80504a, ((ShowAddress) obj2).f80504a);
        }

        public final int hashCode() {
            return this.f80504a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80504a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixCommonModal$ShowMoneyBreakdown;", "Lcom/revolut/feature/pix/api/navigation/PixCommonModal;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowMoneyBreakdown implements PixCommonModal {

        @NotNull
        public static final Parcelable.Creator<ShowMoneyBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f80506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f80507c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowMoneyBreakdown((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowMoneyBreakdown[i];
            }
        }

        public ShowMoneyBreakdown(d dVar, d dVar2, d dVar3, d dVar4) {
            this.f80505a = dVar;
            this.f80506b = dVar2;
            this.f80507c = dVar3;
            this.d = dVar4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowMoneyBreakdown)) {
                return false;
            }
            ShowMoneyBreakdown showMoneyBreakdown = (ShowMoneyBreakdown) obj2;
            return Intrinsics.f(this.f80505a, showMoneyBreakdown.f80505a) && Intrinsics.f(this.f80506b, showMoneyBreakdown.f80506b) && Intrinsics.f(this.f80507c, showMoneyBreakdown.f80507c) && Intrinsics.f(this.d, showMoneyBreakdown.d);
        }

        public final int hashCode() {
            d dVar = this.f80505a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            d dVar2 = this.f80506b;
            int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            d dVar3 = this.f80507c;
            int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
            d dVar4 = this.d;
            return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80505a);
            dest.writeSerializable(this.f80506b);
            dest.writeSerializable(this.f80507c);
            dest.writeSerializable(this.d);
        }
    }
}
