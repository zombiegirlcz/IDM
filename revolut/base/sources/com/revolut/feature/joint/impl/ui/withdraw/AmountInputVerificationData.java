package com.revolut.feature.joint.impl.ui.withdraw;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/withdraw/AmountInputVerificationData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountInputVerificationData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76603c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AmountInputVerificationData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.joint.impl.ui.withdraw.AmountInputVerificationData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountInputVerificationData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountInputVerificationData[i];
        }
    }

    public AmountInputVerificationData(boolean z, boolean z3, boolean z4) {
        this.f76601a = z;
        this.f76602b = z3;
        this.f76603c = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountInputVerificationData)) {
            return false;
        }
        AmountInputVerificationData amountInputVerificationData = (AmountInputVerificationData) obj2;
        return this.f76601a == amountInputVerificationData.f76601a && this.f76602b == amountInputVerificationData.f76602b && this.f76603c == amountInputVerificationData.f76603c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76603c) + j6.a.c(Boolean.hashCode(this.f76601a) * 31, 31, this.f76602b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f76601a ? 1 : 0);
        dest.writeInt(this.f76602b ? 1 : 0);
        dest.writeInt(this.f76603c ? 1 : 0);
    }
}
