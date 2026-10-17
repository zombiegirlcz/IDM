package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$CreationProcessState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryCreationFlowContract$CreationProcessState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BeneficiaryCreationFlowContract$CreationProcessState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryInfoState f99737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f99738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BeneficiaryCreationFlowContract$CopState f99739c;
    public final Address d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            BeneficiaryInfoState beneficiaryInfoState = (BeneficiaryInfoState) j6.a.f(parcel, "parcel", BeneficiaryCreationFlowContract$CreationProcessState.class);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BeneficiaryCreationFlowContract$CreationProcessState.class, parcel, arrayList, iE, 1);
                }
            }
            return new BeneficiaryCreationFlowContract$CreationProcessState(beneficiaryInfoState, arrayList, parcel.readInt() != 0 ? BeneficiaryCreationFlowContract$CopState.CREATOR.createFromParcel(parcel) : null, (Address) parcel.readParcelable(BeneficiaryCreationFlowContract$CreationProcessState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiaryCreationFlowContract$CreationProcessState[i];
        }
    }

    public BeneficiaryCreationFlowContract$CreationProcessState(BeneficiaryInfoState mainInfoState, List list, BeneficiaryCreationFlowContract$CopState beneficiaryCreationFlowContract$CopState, Address address) {
        Intrinsics.checkNotNullParameter(mainInfoState, "mainInfoState");
        this.f99737a = mainInfoState;
        this.f99738b = list;
        this.f99739c = beneficiaryCreationFlowContract$CopState;
        this.d = address;
    }

    public static BeneficiaryCreationFlowContract$CreationProcessState a(BeneficiaryCreationFlowContract$CreationProcessState beneficiaryCreationFlowContract$CreationProcessState, BeneficiaryInfoState mainInfoState, List list, BeneficiaryCreationFlowContract$CopState beneficiaryCreationFlowContract$CopState, Address address, int i) {
        if ((i & 1) != 0) {
            mainInfoState = beneficiaryCreationFlowContract$CreationProcessState.f99737a;
        }
        if ((i & 2) != 0) {
            list = beneficiaryCreationFlowContract$CreationProcessState.f99738b;
        }
        if ((i & 4) != 0) {
            beneficiaryCreationFlowContract$CopState = beneficiaryCreationFlowContract$CreationProcessState.f99739c;
        }
        if ((i & 8) != 0) {
            address = beneficiaryCreationFlowContract$CreationProcessState.d;
        }
        beneficiaryCreationFlowContract$CreationProcessState.getClass();
        Intrinsics.checkNotNullParameter(mainInfoState, "mainInfoState");
        return new BeneficiaryCreationFlowContract$CreationProcessState(mainInfoState, list, beneficiaryCreationFlowContract$CopState, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiaryCreationFlowContract$CreationProcessState)) {
            return false;
        }
        BeneficiaryCreationFlowContract$CreationProcessState beneficiaryCreationFlowContract$CreationProcessState = (BeneficiaryCreationFlowContract$CreationProcessState) obj2;
        return Intrinsics.f(this.f99737a, beneficiaryCreationFlowContract$CreationProcessState.f99737a) && Intrinsics.f(this.f99738b, beneficiaryCreationFlowContract$CreationProcessState.f99738b) && Intrinsics.f(this.f99739c, beneficiaryCreationFlowContract$CreationProcessState.f99739c) && Intrinsics.f(this.d, beneficiaryCreationFlowContract$CreationProcessState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f99737a.hashCode() * 31;
        List list = this.f99738b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BeneficiaryCreationFlowContract$CopState beneficiaryCreationFlowContract$CopState = this.f99739c;
        int iHashCode3 = (iHashCode2 + (beneficiaryCreationFlowContract$CopState == null ? 0 : beneficiaryCreationFlowContract$CopState.hashCode())) * 31;
        Address address = this.d;
        return iHashCode3 + (address != null ? address.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99737a, i);
        List list = this.f99738b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        BeneficiaryCreationFlowContract$CopState beneficiaryCreationFlowContract$CopState = this.f99739c;
        if (beneficiaryCreationFlowContract$CopState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            beneficiaryCreationFlowContract$CopState.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
    }
}
