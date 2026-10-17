package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xel.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/national_identifiers/kompot/document/NationalIdentifierDocumentContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalIdentifierDocumentContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<NationalIdentifierDocumentContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f104208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xel.a f104209b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NationalIdentifierDocumentContract$RetainedState((f) parcel.readSerializable(), (xel.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NationalIdentifierDocumentContract$RetainedState[i];
        }
    }

    public NationalIdentifierDocumentContract$RetainedState(f document, xel.a aVar) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f104208a = document;
        this.f104209b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NationalIdentifierDocumentContract$RetainedState)) {
            return false;
        }
        NationalIdentifierDocumentContract$RetainedState nationalIdentifierDocumentContract$RetainedState = (NationalIdentifierDocumentContract$RetainedState) obj2;
        return Intrinsics.f(this.f104208a, nationalIdentifierDocumentContract$RetainedState.f104208a) && Intrinsics.f(this.f104209b, nationalIdentifierDocumentContract$RetainedState.f104209b);
    }

    public final int hashCode() {
        int iHashCode = this.f104208a.hashCode() * 31;
        xel.a aVar = this.f104209b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104208a);
        dest.writeSerializable(this.f104209b);
    }
}
