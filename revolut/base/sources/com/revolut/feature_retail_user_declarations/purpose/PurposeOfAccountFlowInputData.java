package com.revolut.feature_retail_user_declarations.purpose;

import android.os.Parcel;
import android.os.Parcelable;
import cci.g;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/PurposeOfAccountFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PurposeOfAccountFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PurposeOfAccountFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PurposeOfAccountProductType f97709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97710c;
    public final rbl.a d;
    public final WorkflowScreenConfiguration e;
    public final Boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            PurposeOfAccountProductType purposeOfAccountProductType = (PurposeOfAccountProductType) parcel.readParcelable(PurposeOfAccountFlowInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(g.valueOf(parcel.readString()));
            }
            return new PurposeOfAccountFlowInputData(bVar, purposeOfAccountProductType, arrayList, rbl.a.valueOf(parcel.readString()), (WorkflowScreenConfiguration) parcel.readParcelable(PurposeOfAccountFlowInputData.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurposeOfAccountFlowInputData[i];
        }
    }

    public PurposeOfAccountFlowInputData(b bVar, PurposeOfAccountProductType productType, List selectedPurposes, rbl.a backNavigationType, WorkflowScreenConfiguration workflowScreenConfiguration, Boolean bool) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f97708a = bVar;
        this.f97709b = productType;
        this.f97710c = selectedPurposes;
        this.d = backNavigationType;
        this.e = workflowScreenConfiguration;
        this.f = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PurposeOfAccountFlowInputData)) {
            return false;
        }
        PurposeOfAccountFlowInputData purposeOfAccountFlowInputData = (PurposeOfAccountFlowInputData) obj2;
        return Intrinsics.f(this.f97708a, purposeOfAccountFlowInputData.f97708a) && Intrinsics.f(this.f97709b, purposeOfAccountFlowInputData.f97709b) && Intrinsics.f(this.f97710c, purposeOfAccountFlowInputData.f97710c) && this.d == purposeOfAccountFlowInputData.d && Intrinsics.f(this.e, purposeOfAccountFlowInputData.e) && Intrinsics.f(this.f, purposeOfAccountFlowInputData.f);
    }

    public final int hashCode() {
        b bVar = this.f97708a;
        int iHashCode = (this.d.hashCode() + p.a.d((this.f97709b.hashCode() + ((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31)) * 31, 31, this.f97710c)) * 31;
        WorkflowScreenConfiguration workflowScreenConfiguration = this.e;
        int iHashCode2 = (iHashCode + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97708a);
        dest.writeParcelable(this.f97709b, i);
        Iterator itV = p.a.v(this.f97710c, dest);
        while (itV.hasNext()) {
            dest.writeString(((g) itV.next()).name());
        }
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public PurposeOfAccountFlowInputData(b bVar, PurposeOfAccountProductType purposeOfAccountProductType, List list, rbl.a aVar, WorkflowScreenConfiguration workflowScreenConfiguration, Boolean bool, int i) {
        this(bVar, purposeOfAccountProductType, (i & 4) != 0 ? f0.f322471a : list, (i & 8) != 0 ? rbl.a.CLOSE : aVar, (i & 16) != 0 ? null : workflowScreenConfiguration, (i & 32) != 0 ? null : bool);
    }
}
