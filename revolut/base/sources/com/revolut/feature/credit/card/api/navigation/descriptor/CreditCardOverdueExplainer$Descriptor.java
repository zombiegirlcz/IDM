package com.revolut.feature.credit.card.api.navigation.descriptor;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/navigation/descriptor/CreditCardOverdueExplainer$Descriptor", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardOverdueExplainer$Descriptor implements ParcelableControllerDescriptor<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreditCardOverdueExplainer$Descriptor f68994a = new CreditCardOverdueExplainer$Descriptor();

    @NotNull
    public static final Parcelable.Creator<CreditCardOverdueExplainer$Descriptor> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CreditCardOverdueExplainer$Descriptor.f68994a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardOverdueExplainer$Descriptor[i];
        }
    }

    private CreditCardOverdueExplainer$Descriptor() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
