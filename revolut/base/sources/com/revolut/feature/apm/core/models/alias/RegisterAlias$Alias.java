package com.revolut.feature.apm.core.models.alias;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/models/alias/RegisterAlias$Alias", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegisterAlias$Alias implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RegisterAlias$Alias> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f61898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61899b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RegisterAlias$Alias((AliasType) parcel.readParcelable(RegisterAlias$Alias.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RegisterAlias$Alias[i];
        }
    }

    public RegisterAlias$Alias(AliasType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f61898a = type;
        this.f61899b = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RegisterAlias$Alias)) {
            return false;
        }
        RegisterAlias$Alias registerAlias$Alias = (RegisterAlias$Alias) obj2;
        return Intrinsics.f(this.f61898a, registerAlias$Alias.f61898a) && Intrinsics.f(this.f61899b, registerAlias$Alias.f61899b);
    }

    public final int hashCode() {
        return this.f61899b.hashCode() + (this.f61898a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61898a, i);
        dest.writeString(this.f61899b);
    }
}
