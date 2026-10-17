package com.revolut.feature.transactions.impl.ui.kompot.details.block_provider;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transactions/impl/ui/kompot/details/block_provider/InvoiceBlockProvider$InvoiceLinkAction", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceBlockProvider$InvoiceLinkAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvoiceBlockProvider$InvoiceLinkAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92041a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoiceBlockProvider$InvoiceLinkAction(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceBlockProvider$InvoiceLinkAction[i];
        }
    }

    public InvoiceBlockProvider$InvoiceLinkAction(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f92041a = url2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvoiceBlockProvider$InvoiceLinkAction) && Intrinsics.f(this.f92041a, ((InvoiceBlockProvider$InvoiceLinkAction) obj2).f92041a);
    }

    public final int hashCode() {
        return this.f92041a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92041a);
    }
}
