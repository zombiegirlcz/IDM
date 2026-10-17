package com.revolut.sso.impl.ui.consent.common.unexpected_location;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/consent/common/unexpected_location/UnexpectedLocationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnexpectedLocationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UnexpectedLocationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentChallenge f106464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentChallenge.Qr.Delegated.Selection.Identity f106465b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnexpectedLocationScreenContract$InputData((ConsentChallenge) parcel.readParcelable(UnexpectedLocationScreenContract$InputData.class.getClassLoader()), (ConsentChallenge.Qr.Delegated.Selection.Identity) parcel.readParcelable(UnexpectedLocationScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnexpectedLocationScreenContract$InputData[i];
        }
    }

    public UnexpectedLocationScreenContract$InputData(ConsentChallenge challenge, ConsentChallenge.Qr.Delegated.Selection.Identity identity) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f106464a = challenge;
        this.f106465b = identity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UnexpectedLocationScreenContract$InputData)) {
            return false;
        }
        UnexpectedLocationScreenContract$InputData unexpectedLocationScreenContract$InputData = (UnexpectedLocationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106464a, unexpectedLocationScreenContract$InputData.f106464a) && Intrinsics.f(this.f106465b, unexpectedLocationScreenContract$InputData.f106465b);
    }

    public final int hashCode() {
        int iHashCode = this.f106464a.hashCode() * 31;
        ConsentChallenge.Qr.Delegated.Selection.Identity identity = this.f106465b;
        return iHashCode + (identity == null ? 0 : identity.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106464a, i);
        dest.writeParcelable(this.f106465b, i);
    }
}
