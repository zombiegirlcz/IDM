package com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/alias_deletion/screens/review_delete/ReviewDeleteAliasScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewDeleteAliasScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReviewDeleteAliasScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f80572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixKey f80573b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewDeleteAliasScreenContract$InputData((AccountId) parcel.readParcelable(ReviewDeleteAliasScreenContract$InputData.class.getClassLoader()), (PixKey) parcel.readParcelable(ReviewDeleteAliasScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReviewDeleteAliasScreenContract$InputData[i];
        }
    }

    public ReviewDeleteAliasScreenContract$InputData(AccountId accountId, PixKey pixKey) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        this.f80572a = accountId;
        this.f80573b = pixKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReviewDeleteAliasScreenContract$InputData)) {
            return false;
        }
        ReviewDeleteAliasScreenContract$InputData reviewDeleteAliasScreenContract$InputData = (ReviewDeleteAliasScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80572a, reviewDeleteAliasScreenContract$InputData.f80572a) && Intrinsics.f(this.f80573b, reviewDeleteAliasScreenContract$InputData.f80573b);
    }

    public final int hashCode() {
        return this.f80573b.hashCode() + (this.f80572a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80572a, i);
        dest.writeParcelable(this.f80573b, i);
    }
}
