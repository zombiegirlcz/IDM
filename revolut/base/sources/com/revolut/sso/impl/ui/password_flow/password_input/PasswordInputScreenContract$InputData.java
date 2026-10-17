package com.revolut.sso.impl.ui.password_flow.password_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/password_flow/password_input/PasswordInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PasswordInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PasswordInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f106637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f106638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f106639c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(PasswordInputScreenContract$InputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PasswordInputScreenContract$InputData(clause, z, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PasswordInputScreenContract$InputData[i];
        }
    }

    public PasswordInputScreenContract$InputData(Clause clause, boolean z, Boolean bool) {
        this.f106637a = clause;
        this.f106638b = z;
        this.f106639c = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PasswordInputScreenContract$InputData)) {
            return false;
        }
        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = (PasswordInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106637a, passwordInputScreenContract$InputData.f106637a) && this.f106638b == passwordInputScreenContract$InputData.f106638b && Intrinsics.f(this.f106639c, passwordInputScreenContract$InputData.f106639c);
    }

    public final int hashCode() {
        Clause clause = this.f106637a;
        int iC = j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f106638b);
        Boolean bool = this.f106639c;
        return iC + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106637a, i);
        dest.writeInt(this.f106638b ? 1 : 0);
        Boolean bool = this.f106639c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public PasswordInputScreenContract$InputData() {
        this(null, true, null);
    }
}
