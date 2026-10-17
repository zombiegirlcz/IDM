package com.revolut.ui_kit.payments.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/ui_kit/payments/transition/TransferToChatTransition;", "Lcom/revolut/kompot/navigable/TransitionAnimation$ViewDelegated;", "", "toString", "()Ljava/lang/String;", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferToChatTransition implements TransitionAnimation.ViewDelegated {

    @NotNull
    public static final Parcelable.Creator<TransferToChatTransition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107123b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferToChatTransition(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferToChatTransition[i];
        }
    }

    public TransferToChatTransition(int i, String transactionIdToAnimate) {
        Intrinsics.checkNotNullParameter(transactionIdToAnimate, "transactionIdToAnimate");
        this.f107122a = i;
        this.f107123b = transactionIdToAnimate;
    }

    @Override // com.revolut.kompot.navigable.TransitionAnimation
    public final boolean I0() {
        return false;
    }

    @Override // com.revolut.kompot.navigable.TransitionAnimation.ViewDelegated
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final int getF107122a() {
        return this.f107122a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferToChatTransition)) {
            return false;
        }
        TransferToChatTransition transferToChatTransition = (TransferToChatTransition) obj2;
        return this.f107122a == transferToChatTransition.f107122a && Intrinsics.f(this.f107123b, transferToChatTransition.f107123b);
    }

    public final int hashCode() {
        return this.f107123b.hashCode() + (Integer.hashCode(this.f107122a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f107122a);
        dest.writeString(this.f107123b);
    }
}
