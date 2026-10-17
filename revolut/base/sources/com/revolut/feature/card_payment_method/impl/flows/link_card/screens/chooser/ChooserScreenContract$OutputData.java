package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_payment_method.impl.flows.link_card.flow.LinkCardFlowContract$LinkCardToPocketInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/card_payment_method/impl/flows/link_card/screens/chooser/ChooserScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooserScreenContract$OutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChooserScreenContract$OutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkCardFlowContract$LinkCardToPocketInfo f65272a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooserScreenContract$OutputData(parcel.readInt() == 0 ? null : LinkCardFlowContract$LinkCardToPocketInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserScreenContract$OutputData[i];
        }
    }

    public ChooserScreenContract$OutputData(LinkCardFlowContract$LinkCardToPocketInfo linkCardFlowContract$LinkCardToPocketInfo) {
        this.f65272a = linkCardFlowContract$LinkCardToPocketInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ChooserScreenContract$OutputData) && Intrinsics.f(this.f65272a, ((ChooserScreenContract$OutputData) obj2).f65272a);
    }

    public final int hashCode() {
        LinkCardFlowContract$LinkCardToPocketInfo linkCardFlowContract$LinkCardToPocketInfo = this.f65272a;
        if (linkCardFlowContract$LinkCardToPocketInfo == null) {
            return 0;
        }
        return linkCardFlowContract$LinkCardToPocketInfo.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        LinkCardFlowContract$LinkCardToPocketInfo linkCardFlowContract$LinkCardToPocketInfo = this.f65272a;
        if (linkCardFlowContract$LinkCardToPocketInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkCardFlowContract$LinkCardToPocketInfo.writeToParcel(dest, i);
        }
    }
}
