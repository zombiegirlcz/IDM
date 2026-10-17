package com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/model/NationalitiesInput;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalitiesInput implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NationalitiesInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f104193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104194b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(NationalityInput.CREATOR, parcel, arrayList, iA, 1);
            }
            return new NationalitiesInput(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NationalitiesInput[i];
        }
    }

    public NationalitiesInput(List nationalities, boolean z) {
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        this.f104193a = nationalities;
        this.f104194b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NationalitiesInput)) {
            return false;
        }
        NationalitiesInput nationalitiesInput = (NationalitiesInput) obj2;
        return Intrinsics.f(this.f104193a, nationalitiesInput.f104193a) && this.f104194b == nationalitiesInput.f104194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104194b) + (this.f104193a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f104193a, dest);
        while (itV.hasNext()) {
            ((NationalityInput) itV.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f104194b ? 1 : 0);
    }
}
