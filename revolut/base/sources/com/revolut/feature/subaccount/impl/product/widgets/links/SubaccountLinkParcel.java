package com.revolut.feature.subaccount.impl.product.widgets.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/product/widgets/links/SubaccountLinkParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubaccountLinkParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubaccountLinkParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subaccount f88984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88985b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubaccountLinkParcel((Subaccount) parcel.readParcelable(SubaccountLinkParcel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubaccountLinkParcel[i];
        }
    }

    public SubaccountLinkParcel(Subaccount subaccount, String link) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f88984a = subaccount;
        this.f88985b = link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubaccountLinkParcel)) {
            return false;
        }
        SubaccountLinkParcel subaccountLinkParcel = (SubaccountLinkParcel) obj2;
        return Intrinsics.f(this.f88984a, subaccountLinkParcel.f88984a) && Intrinsics.f(this.f88985b, subaccountLinkParcel.f88985b);
    }

    public final int hashCode() {
        return this.f88985b.hashCode() + (this.f88984a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88984a, i);
        dest.writeString(this.f88985b);
    }
}
