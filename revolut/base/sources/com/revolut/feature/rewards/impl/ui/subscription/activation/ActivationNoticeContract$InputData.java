package com.revolut.feature.rewards.impl.ui.subscription.activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rewards.ActivationNotice;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/subscription/activation/ActivationNoticeContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivationNoticeContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ActivationNoticeContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivationNotice f84991c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivationNoticeContract$InputData(parcel.readString(), parcel.readString(), (ActivationNotice) parcel.readParcelable(ActivationNoticeContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivationNoticeContract$InputData[i];
        }
    }

    public ActivationNoticeContract$InputData(String perkId, String merchantAvatar, ActivationNotice activationNotice) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
        Intrinsics.checkNotNullParameter(activationNotice, "activationNotice");
        this.f84989a = perkId;
        this.f84990b = merchantAvatar;
        this.f84991c = activationNotice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivationNoticeContract$InputData)) {
            return false;
        }
        ActivationNoticeContract$InputData activationNoticeContract$InputData = (ActivationNoticeContract$InputData) obj2;
        return Intrinsics.f(this.f84989a, activationNoticeContract$InputData.f84989a) && Intrinsics.f(this.f84990b, activationNoticeContract$InputData.f84990b) && Intrinsics.f(this.f84991c, activationNoticeContract$InputData.f84991c);
    }

    public final int hashCode() {
        return this.f84991c.hashCode() + p.a.c(this.f84989a.hashCode() * 31, 31, this.f84990b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84989a);
        dest.writeString(this.f84990b);
        dest.writeParcelable(this.f84991c, i);
    }
}
