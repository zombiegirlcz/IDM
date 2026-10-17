package com.revolut.sso.impl.ui.password_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Mode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/password_flow/PasswordFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PasswordFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PasswordFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Claim f106614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PasswordFlowContract$Mode f106615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f106616c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Claim claim = (Claim) parcel.readParcelable(PasswordFlowContract$InputData.class.getClassLoader());
            PasswordFlowContract$Mode passwordFlowContract$Mode = (PasswordFlowContract$Mode) parcel.readParcelable(PasswordFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PasswordFlowContract$InputData(claim, passwordFlowContract$Mode, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PasswordFlowContract$InputData[i];
        }
    }

    public PasswordFlowContract$InputData(Claim claim, PasswordFlowContract$Mode mode, Boolean bool) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f106614a = claim;
        this.f106615b = mode;
        this.f106616c = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PasswordFlowContract$InputData)) {
            return false;
        }
        PasswordFlowContract$InputData passwordFlowContract$InputData = (PasswordFlowContract$InputData) obj2;
        return Intrinsics.f(this.f106614a, passwordFlowContract$InputData.f106614a) && Intrinsics.f(this.f106615b, passwordFlowContract$InputData.f106615b) && Intrinsics.f(this.f106616c, passwordFlowContract$InputData.f106616c);
    }

    public final int hashCode() {
        Claim claim = this.f106614a;
        int iHashCode = (this.f106615b.hashCode() + ((claim == null ? 0 : claim.hashCode()) * 31)) * 31;
        Boolean bool = this.f106616c;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106614a, i);
        dest.writeParcelable(this.f106615b, i);
        Boolean bool = this.f106616c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public PasswordFlowContract$InputData() {
        this(null, new PasswordFlowContract$Mode.Default(0), null);
    }
}
