package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_complete_number_transfer_bottom_sheet/EsimCompleteNumberTransferBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimCompleteNumberTransferBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimCompleteNumberTransferBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f101187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f101188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f101189c;
    public final List d;
    public final EsimCompleteNumberTransferBottomSheetScreenContract$Action e;
    public final EsimGiftRecipient f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", EsimCompleteNumberTransferBottomSheetScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimCompleteNumberTransferBottomSheetScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            Clause clause2 = (Clause) parcel.readParcelable(EsimCompleteNumberTransferBottomSheetScreenContract$InputData.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimCompleteNumberTransferBottomSheetScreenContract$Action.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(clause, arrayList, clause2, arrayList2, parcel.readInt() == 0 ? null : EsimCompleteNumberTransferBottomSheetScreenContract$Action.CREATOR.createFromParcel(parcel), (EsimGiftRecipient) parcel.readParcelable(EsimCompleteNumberTransferBottomSheetScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimCompleteNumberTransferBottomSheetScreenContract$InputData[i];
        }
    }

    public EsimCompleteNumberTransferBottomSheetScreenContract$InputData(Clause title, List portingSteps, Clause clause, List inlineActions, EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(portingSteps, "portingSteps");
        Intrinsics.checkNotNullParameter(inlineActions, "inlineActions");
        this.f101187a = title;
        this.f101188b = portingSteps;
        this.f101189c = clause;
        this.d = inlineActions;
        this.e = esimCompleteNumberTransferBottomSheetScreenContract$Action;
        this.f = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimCompleteNumberTransferBottomSheetScreenContract$InputData)) {
            return false;
        }
        EsimCompleteNumberTransferBottomSheetScreenContract$InputData esimCompleteNumberTransferBottomSheetScreenContract$InputData = (EsimCompleteNumberTransferBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101187a, esimCompleteNumberTransferBottomSheetScreenContract$InputData.f101187a) && Intrinsics.f(this.f101188b, esimCompleteNumberTransferBottomSheetScreenContract$InputData.f101188b) && Intrinsics.f(this.f101189c, esimCompleteNumberTransferBottomSheetScreenContract$InputData.f101189c) && Intrinsics.f(this.d, esimCompleteNumberTransferBottomSheetScreenContract$InputData.d) && Intrinsics.f(this.e, esimCompleteNumberTransferBottomSheetScreenContract$InputData.e) && Intrinsics.f(this.f, esimCompleteNumberTransferBottomSheetScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f101187a.hashCode() * 31, 31, this.f101188b);
        Clause clause = this.f101189c;
        int iD2 = p.a.d((iD + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action = this.e;
        int iHashCode = (iD2 + (esimCompleteNumberTransferBottomSheetScreenContract$Action == null ? 0 : esimCompleteNumberTransferBottomSheetScreenContract$Action.hashCode())) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f;
        return iHashCode + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101187a, i);
        Iterator itV = p.a.v(this.f101188b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f101189c, i);
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            ((EsimCompleteNumberTransferBottomSheetScreenContract$Action) itV2.next()).writeToParcel(dest, i);
        }
        EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action = this.e;
        if (esimCompleteNumberTransferBottomSheetScreenContract$Action == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimCompleteNumberTransferBottomSheetScreenContract$Action.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f, i);
    }

    public EsimCompleteNumberTransferBottomSheetScreenContract$InputData(Clause clause, List list, Clause clause2, ArrayList arrayList, EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action, EsimGiftRecipient esimGiftRecipient, int i) {
        this(clause, list, (i & 4) != 0 ? null : clause2, (i & 8) != 0 ? f0.f322471a : arrayList, (i & 16) != 0 ? new EsimCompleteNumberTransferBottomSheetScreenContract$Action(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null) : esimCompleteNumberTransferBottomSheetScreenContract$Action, (i & 32) != 0 ? null : esimGiftRecipient);
    }
}
