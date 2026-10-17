package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.x2;
import dej.y2;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionPhoneNumberPorting;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionPhoneNumberPorting implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionPhoneNumberPorting> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f100489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100490c;
    public final Instant d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y2 f100491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f100492h;
    public final EsimPhoneNumberPortingProgress i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionPhoneNumberPorting(parcel.readString(), x2.valueOf(parcel.readString()), parcel.readInt() != 0, (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), y2.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : EsimPhoneNumberPortingProgress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionPhoneNumberPorting[i];
        }
    }

    public EsimSubscriptionPhoneNumberPorting(String id10, x2 direction, boolean z, Instant instant, Instant instant2, Instant instant3, y2 state, String str, EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f100488a = id10;
        this.f100489b = direction;
        this.f100490c = z;
        this.d = instant;
        this.e = instant2;
        this.f = instant3;
        this.f100491g = state;
        this.f100492h = str;
        this.i = esimPhoneNumberPortingProgress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionPhoneNumberPorting)) {
            return false;
        }
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = (EsimSubscriptionPhoneNumberPorting) obj2;
        return Intrinsics.f(this.f100488a, esimSubscriptionPhoneNumberPorting.f100488a) && this.f100489b == esimSubscriptionPhoneNumberPorting.f100489b && this.f100490c == esimSubscriptionPhoneNumberPorting.f100490c && Intrinsics.f(this.d, esimSubscriptionPhoneNumberPorting.d) && Intrinsics.f(this.e, esimSubscriptionPhoneNumberPorting.e) && Intrinsics.f(this.f, esimSubscriptionPhoneNumberPorting.f) && this.f100491g == esimSubscriptionPhoneNumberPorting.f100491g && Intrinsics.f(this.f100492h, esimSubscriptionPhoneNumberPorting.f100492h) && Intrinsics.f(this.i, esimSubscriptionPhoneNumberPorting.i);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f100489b.hashCode() + (this.f100488a.hashCode() * 31)) * 31, 31, this.f100490c);
        Instant instant = this.d;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.e;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.f;
        int iHashCode3 = (this.f100491g.hashCode() + ((iHashCode2 + (instant3 == null ? 0 : instant3.hashCode())) * 31)) * 31;
        String str = this.f100492h;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress = this.i;
        return iHashCode4 + (esimPhoneNumberPortingProgress != null ? esimPhoneNumberPortingProgress.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100488a);
        dest.writeString(this.f100489b.name());
        dest.writeInt(this.f100490c ? 1 : 0);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f100491g.name());
        dest.writeString(this.f100492h);
        EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress = this.i;
        if (esimPhoneNumberPortingProgress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingProgress.writeToParcel(dest, i);
        }
    }
}
