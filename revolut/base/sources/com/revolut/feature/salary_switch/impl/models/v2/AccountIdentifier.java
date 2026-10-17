package com.revolut.feature.salary_switch.impl.models.v2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kqc.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/v2/AccountIdentifier;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountIdentifier implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountIdentifier> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f85235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85236b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountIdentifier(j.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountIdentifier[i];
        }
    }

    public AccountIdentifier(j type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f85235a = type;
        this.f85236b = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountIdentifier)) {
            return false;
        }
        AccountIdentifier accountIdentifier = (AccountIdentifier) obj2;
        return this.f85235a == accountIdentifier.f85235a && Intrinsics.f(this.f85236b, accountIdentifier.f85236b);
    }

    public final int hashCode() {
        return this.f85236b.hashCode() + (this.f85235a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85235a.name());
        dest.writeString(this.f85236b);
    }
}
