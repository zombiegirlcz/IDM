package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/ExistingSubscriptionCheck;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExistingSubscriptionCheck implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExistingSubscriptionCheck> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84809c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RewardFooterCell.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ExistingSubscriptionCheck(string, string2, parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExistingSubscriptionCheck[i];
        }
    }

    public ExistingSubscriptionCheck(String subscriptionCheckTitle, String cancellationInstructionsTitle, String str, String str2, ArrayList cancellationInstructions) {
        Intrinsics.checkNotNullParameter(subscriptionCheckTitle, "subscriptionCheckTitle");
        Intrinsics.checkNotNullParameter(cancellationInstructionsTitle, "cancellationInstructionsTitle");
        Intrinsics.checkNotNullParameter(cancellationInstructions, "cancellationInstructions");
        this.f84807a = subscriptionCheckTitle;
        this.f84808b = cancellationInstructionsTitle;
        this.f84809c = cancellationInstructions;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExistingSubscriptionCheck)) {
            return false;
        }
        ExistingSubscriptionCheck existingSubscriptionCheck = (ExistingSubscriptionCheck) obj2;
        return Intrinsics.f(this.f84807a, existingSubscriptionCheck.f84807a) && Intrinsics.f(this.f84808b, existingSubscriptionCheck.f84808b) && this.f84809c.equals(existingSubscriptionCheck.f84809c) && Intrinsics.f(this.d, existingSubscriptionCheck.d) && Intrinsics.f(this.e, existingSubscriptionCheck.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f84809c, p.a.c(this.f84807a.hashCode() * 31, 31, this.f84808b), 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84807a);
        dest.writeString(this.f84808b);
        Iterator itY = j6.a.y(this.f84809c, dest);
        while (itY.hasNext()) {
            ((RewardFooterCell) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
