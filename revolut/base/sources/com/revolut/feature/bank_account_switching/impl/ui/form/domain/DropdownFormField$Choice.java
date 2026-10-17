package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/form/domain/DropdownFormField$Choice", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropdownFormField$Choice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DropdownFormField$Choice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63909b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DropdownFormField$Choice(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DropdownFormField$Choice[i];
        }
    }

    public DropdownFormField$Choice(String value, String label) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f63908a = value;
        this.f63909b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DropdownFormField$Choice)) {
            return false;
        }
        DropdownFormField$Choice dropdownFormField$Choice = (DropdownFormField$Choice) obj2;
        return Intrinsics.f(this.f63908a, dropdownFormField$Choice.f63908a) && Intrinsics.f(this.f63909b, dropdownFormField$Choice.f63909b);
    }

    public final int hashCode() {
        return this.f63909b.hashCode() + (this.f63908a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63908a);
        dest.writeString(this.f63909b);
    }
}
