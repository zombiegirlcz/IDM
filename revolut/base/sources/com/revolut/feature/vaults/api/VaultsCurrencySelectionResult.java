package com.revolut.feature.vaults.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y7a.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/api/VaultsCurrencySelectionResult;", "Landroid/os/Parcelable;", "Ly7a/w;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VaultsCurrencySelectionResult implements Parcelable, w {

    @NotNull
    public static final Parcelable.Creator<VaultsCurrencySelectionResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94697a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VaultsCurrencySelectionResult(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VaultsCurrencySelectionResult[i];
        }
    }

    public VaultsCurrencySelectionResult(String selectedCurrencyCode) {
        Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
        this.f94697a = selectedCurrencyCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof VaultsCurrencySelectionResult) && Intrinsics.f(this.f94697a, ((VaultsCurrencySelectionResult) obj2).f94697a);
    }

    public final int hashCode() {
        return this.f94697a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94697a);
    }
}
