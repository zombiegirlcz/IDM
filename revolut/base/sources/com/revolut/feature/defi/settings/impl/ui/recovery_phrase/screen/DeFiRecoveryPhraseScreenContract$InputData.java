package com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/settings/impl/ui/recovery_phrase/screen/DeFiRecoveryPhraseScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiRecoveryPhraseScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiRecoveryPhraseScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f71873b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiRecoveryPhraseScreenContract$InputData(parcel.readString(), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiRecoveryPhraseScreenContract$InputData[i];
        }
    }

    public DeFiRecoveryPhraseScreenContract$InputData(String accountId, k addressType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        this.f71872a = accountId;
        this.f71873b = addressType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiRecoveryPhraseScreenContract$InputData)) {
            return false;
        }
        DeFiRecoveryPhraseScreenContract$InputData deFiRecoveryPhraseScreenContract$InputData = (DeFiRecoveryPhraseScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71872a, deFiRecoveryPhraseScreenContract$InputData.f71872a) && this.f71873b == deFiRecoveryPhraseScreenContract$InputData.f71873b;
    }

    public final int hashCode() {
        return this.f71873b.hashCode() + (this.f71872a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71872a);
        dest.writeString(this.f71873b.name());
    }
}
