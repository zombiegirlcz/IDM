package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/ActivationNotice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivationNotice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActivationNotice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RewardFooterDetailsItem f84804c;
    public final ArrayList d;
    public final RewardFooterUrlActionButton e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RewardFooterDetailsItem rewardFooterDetailsItemCreateFromParcel = parcel.readInt() == 0 ? null : RewardFooterDetailsItem.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RewardFooterDetailsItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ActivationNotice(string, string2, rewardFooterDetailsItemCreateFromParcel, arrayList, parcel.readInt() != 0 ? RewardFooterUrlActionButton.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivationNotice[i];
        }
    }

    public ActivationNotice(String str, String str2, RewardFooterDetailsItem rewardFooterDetailsItem, ArrayList detailRows, RewardFooterUrlActionButton rewardFooterUrlActionButton, String str3) {
        Intrinsics.checkNotNullParameter(detailRows, "detailRows");
        this.f84802a = str;
        this.f84803b = str2;
        this.f84804c = rewardFooterDetailsItem;
        this.d = detailRows;
        this.e = rewardFooterUrlActionButton;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivationNotice)) {
            return false;
        }
        ActivationNotice activationNotice = (ActivationNotice) obj2;
        return Intrinsics.f(this.f84802a, activationNotice.f84802a) && Intrinsics.f(this.f84803b, activationNotice.f84803b) && Intrinsics.f(this.f84804c, activationNotice.f84804c) && this.d.equals(activationNotice.d) && Intrinsics.f(this.e, activationNotice.e) && Intrinsics.f(this.f, activationNotice.f);
    }

    public final int hashCode() {
        String str = this.f84802a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84803b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RewardFooterDetailsItem rewardFooterDetailsItem = this.f84804c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (rewardFooterDetailsItem == null ? 0 : rewardFooterDetailsItem.hashCode())) * 31, 31);
        RewardFooterUrlActionButton rewardFooterUrlActionButton = this.e;
        int iHashCode3 = (iB + (rewardFooterUrlActionButton == null ? 0 : rewardFooterUrlActionButton.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84802a);
        dest.writeString(this.f84803b);
        RewardFooterDetailsItem rewardFooterDetailsItem = this.f84804c;
        if (rewardFooterDetailsItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardFooterDetailsItem.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((RewardFooterDetailsItem) itY.next()).writeToParcel(dest, i);
        }
        RewardFooterUrlActionButton rewardFooterUrlActionButton = this.e;
        if (rewardFooterUrlActionButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardFooterUrlActionButton.writeToParcel(dest, i);
        }
        dest.writeString(this.f);
    }
}
