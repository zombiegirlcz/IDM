package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.k1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPortingStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "dej/k1", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPortingStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPortingStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f100418c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPortingStep(parcel.readString(), EsimHyperText.CREATOR.createFromParcel(parcel), k1.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPortingStep[i];
        }
    }

    public EsimPortingStep(String title, EsimHyperText subtitle, k1 state) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f100416a = title;
        this.f100417b = subtitle;
        this.f100418c = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPortingStep)) {
            return false;
        }
        EsimPortingStep esimPortingStep = (EsimPortingStep) obj2;
        return Intrinsics.f(this.f100416a, esimPortingStep.f100416a) && Intrinsics.f(this.f100417b, esimPortingStep.f100417b) && this.f100418c == esimPortingStep.f100418c;
    }

    public final int hashCode() {
        return this.f100418c.hashCode() + ((this.f100417b.hashCode() + (this.f100416a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100416a);
        this.f100417b.writeToParcel(dest, i);
        dest.writeString(this.f100418c.name());
    }
}
