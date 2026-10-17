package com.revolut.feature_pdf_view;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_pdf_view/NetworkErrorSetup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pdf_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NetworkErrorSetup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NetworkErrorSetup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f97435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f97436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97437c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NetworkErrorSetup((Clause) parcel.readParcelable(NetworkErrorSetup.class.getClassLoader()), (Clause) parcel.readParcelable(NetworkErrorSetup.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NetworkErrorSetup[i];
        }
    }

    public NetworkErrorSetup(Clause title, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f97435a = title;
        this.f97436b = clause;
        this.f97437c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NetworkErrorSetup)) {
            return false;
        }
        NetworkErrorSetup networkErrorSetup = (NetworkErrorSetup) obj2;
        return Intrinsics.f(this.f97435a, networkErrorSetup.f97435a) && Intrinsics.f(this.f97436b, networkErrorSetup.f97436b) && this.f97437c == networkErrorSetup.f97437c;
    }

    public final int hashCode() {
        int iHashCode = this.f97435a.hashCode() * 31;
        Clause clause = this.f97436b;
        return Boolean.hashCode(this.f97437c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97435a, i);
        dest.writeParcelable(this.f97436b, i);
        dest.writeInt(this.f97437c ? 1 : 0);
    }
}
