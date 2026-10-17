package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimRandomPhoneNumberOption;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimRandomPhoneNumberOption implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EsimRandomPhoneNumberOption f100458a = new EsimRandomPhoneNumberOption();

    @NotNull
    public static final Parcelable.Creator<EsimRandomPhoneNumberOption> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return EsimRandomPhoneNumberOption.f100458a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimRandomPhoneNumberOption[i];
        }
    }

    private EsimRandomPhoneNumberOption() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
