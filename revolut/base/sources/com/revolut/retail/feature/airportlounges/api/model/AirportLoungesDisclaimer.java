package com.revolut.retail.feature.airportlounges.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/AirportLoungesDisclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesDisclaimer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesDisclaimer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirportLoungesDisclaimerModal f98913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98914c;
    public final s0 d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesDisclaimer(parcel.readString(), AirportLoungesDisclaimerModal.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, s0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesDisclaimer[i];
        }
    }

    public AirportLoungesDisclaimer(String documentId, AirportLoungesDisclaimerModal modal, boolean z, s0 acceptanceRule) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(modal, "modal");
        Intrinsics.checkNotNullParameter(acceptanceRule, "acceptanceRule");
        this.f98912a = documentId;
        this.f98913b = modal;
        this.f98914c = z;
        this.d = acceptanceRule;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungesDisclaimer)) {
            return false;
        }
        AirportLoungesDisclaimer airportLoungesDisclaimer = (AirportLoungesDisclaimer) obj2;
        return Intrinsics.f(this.f98912a, airportLoungesDisclaimer.f98912a) && Intrinsics.f(this.f98913b, airportLoungesDisclaimer.f98913b) && this.f98914c == airportLoungesDisclaimer.f98914c && this.d == airportLoungesDisclaimer.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f98913b.hashCode() + (this.f98912a.hashCode() * 31)) * 31, 31, this.f98914c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98912a);
        this.f98913b.writeToParcel(dest, i);
        dest.writeInt(this.f98914c ? 1 : 0);
        dest.writeString(this.d.name());
    }
}
