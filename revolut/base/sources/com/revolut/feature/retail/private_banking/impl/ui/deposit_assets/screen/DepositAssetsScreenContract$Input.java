package com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/private_banking/impl/ui/deposit_assets/screen/DepositAssetsScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_private_banking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DepositAssetsScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DepositAssetsScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f82797a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(tcb.a.valueOf(parcel.readString()));
            }
            return new DepositAssetsScreenContract$Input(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DepositAssetsScreenContract$Input[i];
        }
    }

    public DepositAssetsScreenContract$Input(List availableTypes) {
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        this.f82797a = availableTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DepositAssetsScreenContract$Input) && Intrinsics.f(this.f82797a, ((DepositAssetsScreenContract$Input) obj2).f82797a);
    }

    public final int hashCode() {
        return this.f82797a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f82797a, dest);
        while (itV.hasNext()) {
            dest.writeString(((tcb.a) itV.next()).name());
        }
    }
}
