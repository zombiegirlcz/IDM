package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanDocumentsBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanDocumentsBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDocumentsBottomSheetScreenContract$TitleConfig f103520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f103521b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PlanDocumentsBottomSheetScreenContract$TitleConfig planDocumentsBottomSheetScreenContract$TitleConfig = (PlanDocumentsBottomSheetScreenContract$TitleConfig) j6.a.f(parcel, "parcel", PlanDocumentsBottomSheetScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PlanDocumentsBottomSheetScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new PlanDocumentsBottomSheetScreenContract$InputData(planDocumentsBottomSheetScreenContract$TitleConfig, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanDocumentsBottomSheetScreenContract$InputData[i];
        }
    }

    public PlanDocumentsBottomSheetScreenContract$InputData(PlanDocumentsBottomSheetScreenContract$TitleConfig titleConfig, List documents) {
        Intrinsics.checkNotNullParameter(titleConfig, "titleConfig");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f103520a = titleConfig;
        this.f103521b = documents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanDocumentsBottomSheetScreenContract$InputData)) {
            return false;
        }
        PlanDocumentsBottomSheetScreenContract$InputData planDocumentsBottomSheetScreenContract$InputData = (PlanDocumentsBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103520a, planDocumentsBottomSheetScreenContract$InputData.f103520a) && Intrinsics.f(this.f103521b, planDocumentsBottomSheetScreenContract$InputData.f103521b);
    }

    public final int hashCode() {
        return this.f103521b.hashCode() + (this.f103520a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103520a, i);
        Iterator itV = p.a.v(this.f103521b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
