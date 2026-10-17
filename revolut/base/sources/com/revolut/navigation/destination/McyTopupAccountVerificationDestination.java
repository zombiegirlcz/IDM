package com.revolut.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/navigation/destination/McyTopupAccountVerificationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McyTopupAccountVerificationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<McyTopupAccountVerificationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopupMethodType f98465c;
    public final TopUpMethodsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new McyTopupAccountVerificationDestination(TopupMethodType.valueOf(parcel.readString()), TopUpMethodsContext.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new McyTopupAccountVerificationDestination[i];
        }
    }

    public McyTopupAccountVerificationDestination(TopupMethodType topUpMethodType, TopUpMethodsContext topUpMethodsContext, d amount, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpMethodType, "topUpMethodType");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        this.f98463a = str;
        this.f98464b = amount;
        this.f98465c = topUpMethodType;
        this.d = topUpMethodsContext;
    }

    /* JADX INFO: renamed from: I5, reason: from getter */
    public final TopupMethodType getF98465c() {
        return this.f98465c;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final d getF98464b() {
        return this.f98464b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TopUpMethodsContext getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof McyTopupAccountVerificationDestination)) {
            return false;
        }
        McyTopupAccountVerificationDestination mcyTopupAccountVerificationDestination = (McyTopupAccountVerificationDestination) obj2;
        return Intrinsics.f(this.f98463a, mcyTopupAccountVerificationDestination.f98463a) && Intrinsics.f(this.f98464b, mcyTopupAccountVerificationDestination.f98464b) && this.f98465c == mcyTopupAccountVerificationDestination.f98465c && Intrinsics.f(this.d, mcyTopupAccountVerificationDestination.d);
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF98463a() {
        return this.f98463a;
    }

    public final int hashCode() {
        String str = this.f98463a;
        return this.d.hashCode() + ((this.f98465c.hashCode() + v7.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f98464b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98463a);
        dest.writeSerializable(this.f98464b);
        dest.writeString(this.f98465c.name());
        this.d.writeToParcel(dest, i);
    }
}
