package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketRevPointOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Ldj0/d;", "a", "Ldj0/d;", "()Ldj0/d;", "fiatAmount", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "pointsAmount", "c", "Ljava/lang/String;", "token", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicketRevPointOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransitTicketRevPointOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fiatAmount")
    @NotNull
    private final dj0.d fiatAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsAmount")
    @NotNull
    private final BigDecimal pointsAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final String token;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitTicketRevPointOption((dj0.d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicketRevPointOption[i];
        }
    }

    public TransitTicketRevPointOption(dj0.d fiatAmount, BigDecimal pointsAmount, String str) {
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
        this.fiatAmount = fiatAmount;
        this.pointsAmount = pointsAmount;
        this.token = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final dj0.d getFiatAmount() {
        return this.fiatAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getPointsAmount() {
        return this.pointsAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicketRevPointOption)) {
            return false;
        }
        TransitTicketRevPointOption transitTicketRevPointOption = (TransitTicketRevPointOption) obj2;
        return Intrinsics.f(this.fiatAmount, transitTicketRevPointOption.fiatAmount) && Intrinsics.f(this.pointsAmount, transitTicketRevPointOption.pointsAmount) && Intrinsics.f(this.token, transitTicketRevPointOption.token);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.pointsAmount, this.fiatAmount.hashCode() * 31, 31);
        String str = this.token;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.fiatAmount);
        dest.writeSerializable(this.pointsAmount);
        dest.writeString(this.token);
    }
}
