package com.revolut.feature.pix.screens.token_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.pix.api.model.TokenVerificationRequest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/screens/token_verification/TokenVerificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TokenVerificationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TokenVerificationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f80761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f80762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TokenVerificationRequest f80763c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TokenVerificationScreenContract$InputData((AccountId) parcel.readParcelable(TokenVerificationScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TokenVerificationScreenContract$InputData.class.getClassLoader()), (TokenVerificationRequest) parcel.readParcelable(TokenVerificationScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TokenVerificationScreenContract$InputData[i];
        }
    }

    public TokenVerificationScreenContract$InputData(AccountId accountId, Clause title, TokenVerificationRequest verificationRequest) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(verificationRequest, "verificationRequest");
        this.f80761a = accountId;
        this.f80762b = title;
        this.f80763c = verificationRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TokenVerificationScreenContract$InputData)) {
            return false;
        }
        TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData = (TokenVerificationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80761a, tokenVerificationScreenContract$InputData.f80761a) && Intrinsics.f(this.f80762b, tokenVerificationScreenContract$InputData.f80762b) && Intrinsics.f(this.f80763c, tokenVerificationScreenContract$InputData.f80763c);
    }

    public final int hashCode() {
        return this.f80763c.hashCode() + p.a.a(this.f80761a.hashCode() * 31, 31, this.f80762b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80761a, i);
        dest.writeParcelable(this.f80762b, i);
        dest.writeParcelable(this.f80763c, i);
    }
}
