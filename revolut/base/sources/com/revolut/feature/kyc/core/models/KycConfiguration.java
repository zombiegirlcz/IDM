package com.revolut.feature.kyc.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/core/models/KycConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f77522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KycProviderConfiguration f77523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77524c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(b0.valueOf(parcel.readString()));
            }
            return new KycConfiguration(arrayList, KycProviderConfiguration.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycConfiguration[i];
        }
    }

    public KycConfiguration(ArrayList steps, KycProviderConfiguration provider, String checkId) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        this.f77522a = steps;
        this.f77523b = provider;
        this.f77524c = checkId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycConfiguration)) {
            return false;
        }
        KycConfiguration kycConfiguration = (KycConfiguration) obj2;
        return this.f77522a.equals(kycConfiguration.f77522a) && Intrinsics.f(this.f77523b, kycConfiguration.f77523b) && Intrinsics.f(this.f77524c, kycConfiguration.f77524c);
    }

    public final int hashCode() {
        return this.f77524c.hashCode() + ((this.f77523b.hashCode() + (this.f77522a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f77522a, dest);
        while (itY.hasNext()) {
            dest.writeString(((b0) itY.next()).name());
        }
        this.f77523b.writeToParcel(dest, i);
        dest.writeString(this.f77524c);
    }
}
