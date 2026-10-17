package com.revolut.feature.pockets.api.ui.mcy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/api/ui/mcy/PocketDetailsMcyDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketDetailsMcyDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PocketDetailsMcyDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f80798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f80799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80800c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketDetailsMcyDestination((b) parcel.readSerializable(), l.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketDetailsMcyDestination[i];
        }
    }

    public PocketDetailsMcyDestination(b currency, l pocketType, String walletId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f80798a = currency;
        this.f80799b = pocketType;
        this.f80800c = walletId;
    }

    /* JADX INFO: renamed from: T8, reason: from getter */
    public final b getF80798a() {
        return this.f80798a;
    }

    /* JADX INFO: renamed from: X4, reason: from getter */
    public final l getF80799b() {
        return this.f80799b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF80800c() {
        return this.f80800c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketDetailsMcyDestination)) {
            return false;
        }
        PocketDetailsMcyDestination pocketDetailsMcyDestination = (PocketDetailsMcyDestination) obj2;
        return Intrinsics.f(this.f80798a, pocketDetailsMcyDestination.f80798a) && this.f80799b == pocketDetailsMcyDestination.f80799b && Intrinsics.f(this.f80800c, pocketDetailsMcyDestination.f80800c);
    }

    public final int hashCode() {
        return this.f80800c.hashCode() + t61.a.c(this.f80799b, this.f80798a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80798a);
        dest.writeString(this.f80799b.name());
        dest.writeString(this.f80800c);
    }
}
