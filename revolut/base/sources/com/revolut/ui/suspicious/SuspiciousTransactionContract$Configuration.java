package com.revolut.ui.suspicious;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/ui/suspicious/SuspiciousTransactionContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107083b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionContract$Configuration(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionContract$Configuration[i];
        }
    }

    public SuspiciousTransactionContract$Configuration(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f107082a = cardId;
        this.f107083b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionContract$Configuration)) {
            return false;
        }
        SuspiciousTransactionContract$Configuration suspiciousTransactionContract$Configuration = (SuspiciousTransactionContract$Configuration) obj2;
        return Intrinsics.f(this.f107082a, suspiciousTransactionContract$Configuration.f107082a) && this.f107083b == suspiciousTransactionContract$Configuration.f107083b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107083b) + (this.f107082a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f107082a);
        dest.writeInt(this.f107083b ? 1 : 0);
    }
}
