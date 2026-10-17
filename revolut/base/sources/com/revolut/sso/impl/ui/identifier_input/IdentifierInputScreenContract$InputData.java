package com.revolut.sso.impl.ui.identifier_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentifierInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IdentifierInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoApi$DefaultIdentifier f106563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierInputScreenContract$Mode f106564b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentifierInputScreenContract$InputData((RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(IdentifierInputScreenContract$InputData.class.getClassLoader()), (IdentifierInputScreenContract$Mode) parcel.readParcelable(IdentifierInputScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IdentifierInputScreenContract$InputData[i];
        }
    }

    public IdentifierInputScreenContract$InputData(RevolutSsoApi$DefaultIdentifier preferredIdentifier, IdentifierInputScreenContract$Mode mode) {
        Intrinsics.checkNotNullParameter(preferredIdentifier, "preferredIdentifier");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f106563a = preferredIdentifier;
        this.f106564b = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IdentifierInputScreenContract$InputData)) {
            return false;
        }
        IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData = (IdentifierInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106563a, identifierInputScreenContract$InputData.f106563a) && Intrinsics.f(this.f106564b, identifierInputScreenContract$InputData.f106564b);
    }

    public final int hashCode() {
        return this.f106564b.hashCode() + (this.f106563a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106563a, i);
        dest.writeParcelable(this.f106564b, i);
    }
}
