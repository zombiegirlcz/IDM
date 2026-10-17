package com.revolut.feature.joint.impl.ui.withdraw;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/withdraw/AmountData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountData implements Parcelable {
    public static final AmountData d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f76598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76600c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AmountData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.joint.impl.ui.withdraw.AmountData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountData((d) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountData[i];
        }
    }

    static {
        d.Companion.getClass();
        d = new AmountData(d.d, "", false);
    }

    public AmountData(d money, String moneyAmountInput, boolean z) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(moneyAmountInput, "moneyAmountInput");
        this.f76598a = money;
        this.f76599b = moneyAmountInput;
        this.f76600c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountData)) {
            return false;
        }
        AmountData amountData = (AmountData) obj2;
        return Intrinsics.f(this.f76598a, amountData.f76598a) && Intrinsics.f(this.f76599b, amountData.f76599b) && this.f76600c == amountData.f76600c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76600c) + p.a.c(this.f76598a.hashCode() * 31, 31, this.f76599b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f76598a);
        dest.writeString(this.f76599b);
        dest.writeInt(this.f76600c ? 1 : 0);
    }
}
