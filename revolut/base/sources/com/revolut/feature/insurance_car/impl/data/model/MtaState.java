package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kl7.y0;
import kl7.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kl7/z0", "kl7/y0", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MtaState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f75263c;
    public final MtaQuote d;
    public final MtaQuoteError e;
    public final y0 f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaState(parcel.readString(), parcel.readString(), z0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MtaQuote.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MtaQuoteError.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? y0.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaState[i];
        }
    }

    public MtaState(String mtaId, String applicationId, z0 status, MtaQuote mtaQuote, MtaQuoteError mtaQuoteError, y0 y0Var) {
        Intrinsics.checkNotNullParameter(mtaId, "mtaId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f75261a = mtaId;
        this.f75262b = applicationId;
        this.f75263c = status;
        this.d = mtaQuote;
        this.e = mtaQuoteError;
        this.f = y0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaState)) {
            return false;
        }
        MtaState mtaState = (MtaState) obj2;
        return Intrinsics.f(this.f75261a, mtaState.f75261a) && Intrinsics.f(this.f75262b, mtaState.f75262b) && this.f75263c == mtaState.f75263c && Intrinsics.f(this.d, mtaState.d) && Intrinsics.f(this.e, mtaState.e) && this.f == mtaState.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f75263c.hashCode() + p.a.c(this.f75261a.hashCode() * 31, 31, this.f75262b)) * 31;
        MtaQuote mtaQuote = this.d;
        int iHashCode2 = (iHashCode + (mtaQuote == null ? 0 : mtaQuote.hashCode())) * 31;
        MtaQuoteError mtaQuoteError = this.e;
        int iHashCode3 = (iHashCode2 + (mtaQuoteError == null ? 0 : mtaQuoteError.hashCode())) * 31;
        y0 y0Var = this.f;
        return iHashCode3 + (y0Var != null ? y0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75261a);
        dest.writeString(this.f75262b);
        dest.writeString(this.f75263c.name());
        MtaQuote mtaQuote = this.d;
        if (mtaQuote == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mtaQuote.writeToParcel(dest, i);
        }
        MtaQuoteError mtaQuoteError = this.e;
        if (mtaQuoteError == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mtaQuoteError.writeToParcel(dest, i);
        }
        y0 y0Var = this.f;
        if (y0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(y0Var.name());
        }
    }
}
