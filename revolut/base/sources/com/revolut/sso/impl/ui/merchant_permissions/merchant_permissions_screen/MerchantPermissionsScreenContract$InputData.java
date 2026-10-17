package com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.impl.domain.models.ChallengeClient;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/merchant_permissions/merchant_permissions_screen/MerchantPermissionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MerchantPermissionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MerchantPermissionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserInfoAccount f106588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChallengeClient f106589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f106590c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UserInfoAccount userInfoAccountCreateFromParcel = UserInfoAccount.CREATOR.createFromParcel(parcel);
            ChallengeClient challengeClientCreateFromParcel = ChallengeClient.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(MerchantPermissionsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new MerchantPermissionsScreenContract$InputData(userInfoAccountCreateFromParcel, challengeClientCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MerchantPermissionsScreenContract$InputData[i];
        }
    }

    public MerchantPermissionsScreenContract$InputData(UserInfoAccount userInfoAccount, ChallengeClient challengeClient, ArrayList consents) {
        Intrinsics.checkNotNullParameter(userInfoAccount, "userInfoAccount");
        Intrinsics.checkNotNullParameter(challengeClient, "challengeClient");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f106588a = userInfoAccount;
        this.f106589b = challengeClient;
        this.f106590c = consents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MerchantPermissionsScreenContract$InputData)) {
            return false;
        }
        MerchantPermissionsScreenContract$InputData merchantPermissionsScreenContract$InputData = (MerchantPermissionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106588a, merchantPermissionsScreenContract$InputData.f106588a) && Intrinsics.f(this.f106589b, merchantPermissionsScreenContract$InputData.f106589b) && this.f106590c.equals(merchantPermissionsScreenContract$InputData.f106590c);
    }

    public final int hashCode() {
        return this.f106590c.hashCode() + ((this.f106589b.hashCode() + (this.f106588a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f106588a.writeToParcel(dest, i);
        this.f106589b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f106590c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
