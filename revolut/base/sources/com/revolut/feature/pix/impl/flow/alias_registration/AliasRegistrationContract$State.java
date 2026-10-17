package com.revolut.feature.pix.impl.flow.alias_registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasRegistrationContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AliasRegistrationContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationType f80576a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AliasRegistrationContract$State((AliasRegistrationType) parcel.readParcelable(AliasRegistrationContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AliasRegistrationContract$State[i];
        }
    }

    public AliasRegistrationContract$State(AliasRegistrationType aliasRegistrationType) {
        this.f80576a = aliasRegistrationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AliasRegistrationContract$State) && Intrinsics.f(this.f80576a, ((AliasRegistrationContract$State) obj2).f80576a);
    }

    public final int hashCode() {
        AliasRegistrationType aliasRegistrationType = this.f80576a;
        if (aliasRegistrationType == null) {
            return 0;
        }
        return aliasRegistrationType.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80576a, i);
    }

    public AliasRegistrationContract$State() {
        this(null);
    }
}
