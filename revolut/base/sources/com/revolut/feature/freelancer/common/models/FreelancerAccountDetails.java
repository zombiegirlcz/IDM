package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.a0;
import lr6.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerAccountDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerAccountDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSettings f73269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerPermissions f73270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f73271c;
    public final List d;
    public final List e;
    public final FreelancerAccountClosure f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FreelancerSettings freelancerSettingsCreateFromParcel = FreelancerSettings.CREATOR.createFromParcel(parcel);
            FreelancerPermissions freelancerPermissionsCreateFromParcel = FreelancerPermissions.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(a0.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(b0.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            while (iA != i6) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(MerchantDisabledFeature.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new FreelancerAccountDetails(freelancerSettingsCreateFromParcel, freelancerPermissionsCreateFromParcel, arrayList, arrayList2, arrayList3, FreelancerAccountClosure.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerAccountDetails[i];
        }
    }

    public FreelancerAccountDetails(FreelancerSettings settings, FreelancerPermissions permissions, List eligiblePaymentMethods, List enabledFeatures, List disabledFeatures, FreelancerAccountClosure accountClosure) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(eligiblePaymentMethods, "eligiblePaymentMethods");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        Intrinsics.checkNotNullParameter(disabledFeatures, "disabledFeatures");
        Intrinsics.checkNotNullParameter(accountClosure, "accountClosure");
        this.f73269a = settings;
        this.f73270b = permissions;
        this.f73271c = eligiblePaymentMethods;
        this.d = enabledFeatures;
        this.e = disabledFeatures;
        this.f = accountClosure;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerAccountDetails)) {
            return false;
        }
        FreelancerAccountDetails freelancerAccountDetails = (FreelancerAccountDetails) obj2;
        return Intrinsics.f(this.f73269a, freelancerAccountDetails.f73269a) && Intrinsics.f(this.f73270b, freelancerAccountDetails.f73270b) && Intrinsics.f(this.f73271c, freelancerAccountDetails.f73271c) && Intrinsics.f(this.d, freelancerAccountDetails.d) && Intrinsics.f(this.e, freelancerAccountDetails.e) && Intrinsics.f(this.f, freelancerAccountDetails.f);
    }

    public final int hashCode() {
        return this.f.f73265a.hashCode() + p.a.d(p.a.d(p.a.d((this.f73270b.hashCode() + (this.f73269a.hashCode() * 31)) * 31, 31, this.f73271c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f73269a.writeToParcel(dest, i);
        this.f73270b.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f73271c, dest);
        while (itV.hasNext()) {
            dest.writeString(((a0) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeString(((b0) itV2.next()).name());
        }
        Iterator itV3 = p.a.v(this.e, dest);
        while (itV3.hasNext()) {
            ((MerchantDisabledFeature) itV3.next()).writeToParcel(dest, i);
        }
        this.f.writeToParcel(dest, i);
    }
}
