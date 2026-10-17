package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/api/navigation/PixRefundNavigation$InputData", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixRefundNavigation$InputData implements PixNavigation$InputData {

    @NotNull
    public static final Parcelable.Creator<PixRefundNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f80523c;
    public final Instant d;
    public final d e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80524g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixRefundNavigation$InputData(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixRefundNavigation$InputData[i];
        }
    }

    public PixRefundNavigation$InputData(String payerName, String groupId, d limit, Instant until, d originalAmount, Instant instant, boolean z) {
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(until, "until");
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        this.f80521a = payerName;
        this.f80522b = groupId;
        this.f80523c = limit;
        this.d = until;
        this.e = originalAmount;
        this.f = instant;
        this.f80524g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixRefundNavigation$InputData)) {
            return false;
        }
        PixRefundNavigation$InputData pixRefundNavigation$InputData = (PixRefundNavigation$InputData) obj2;
        return Intrinsics.f(this.f80521a, pixRefundNavigation$InputData.f80521a) && Intrinsics.f(this.f80522b, pixRefundNavigation$InputData.f80522b) && Intrinsics.f(this.f80523c, pixRefundNavigation$InputData.f80523c) && Intrinsics.f(this.d, pixRefundNavigation$InputData.d) && Intrinsics.f(this.e, pixRefundNavigation$InputData.e) && Intrinsics.f(this.f, pixRefundNavigation$InputData.f) && this.f80524g == pixRefundNavigation$InputData.f80524g;
    }

    public final int hashCode() {
        int iC = v7.c(b.c(v7.c(p.a.c(this.f80521a.hashCode() * 31, 31, this.f80522b), 31, this.f80523c), 31, this.d), 31, this.e);
        Instant instant = this.f;
        return Boolean.hashCode(this.f80524g) + ((iC + (instant == null ? 0 : instant.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80521a);
        dest.writeString(this.f80522b);
        dest.writeSerializable(this.f80523c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f80524g ? 1 : 0);
    }
}
