package com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$SubformScreenAction;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$ToolbarAction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubformScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubformScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BillFormV2 f78728c;
    public final SubformScreenContract$SubformDataSource d;
    public final Clause e;
    public final SubformScreenContract$SubformScreenAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SubformScreenContract$ToolbarAction f78729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f78730h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubformScreenContract$InputData(g.valueOf(parcel.readString()), parcel.readString(), (BillFormV2) parcel.readParcelable(SubformScreenContract$InputData.class.getClassLoader()), (SubformScreenContract$SubformDataSource) parcel.readParcelable(SubformScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(SubformScreenContract$InputData.class.getClassLoader()), (SubformScreenContract$SubformScreenAction) parcel.readParcelable(SubformScreenContract$InputData.class.getClassLoader()), (SubformScreenContract$ToolbarAction) parcel.readParcelable(SubformScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubformScreenContract$InputData[i];
        }
    }

    public SubformScreenContract$InputData(g paymentMethod, String subformName, BillFormV2 subform, SubformScreenContract$SubformDataSource subformDataSource, Clause title, SubformScreenContract$SubformScreenAction action, SubformScreenContract$ToolbarAction subformScreenContract$ToolbarAction, String str, String str2) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(subformName, "subformName");
        Intrinsics.checkNotNullParameter(subform, "subform");
        Intrinsics.checkNotNullParameter(subformDataSource, "subformDataSource");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f78726a = paymentMethod;
        this.f78727b = subformName;
        this.f78728c = subform;
        this.d = subformDataSource;
        this.e = title;
        this.f = action;
        this.f78729g = subformScreenContract$ToolbarAction;
        this.f78730h = str;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubformScreenContract$InputData)) {
            return false;
        }
        SubformScreenContract$InputData subformScreenContract$InputData = (SubformScreenContract$InputData) obj2;
        return this.f78726a == subformScreenContract$InputData.f78726a && Intrinsics.f(this.f78727b, subformScreenContract$InputData.f78727b) && Intrinsics.f(this.f78728c, subformScreenContract$InputData.f78728c) && Intrinsics.f(this.d, subformScreenContract$InputData.d) && Intrinsics.f(this.e, subformScreenContract$InputData.e) && Intrinsics.f(this.f, subformScreenContract$InputData.f) && Intrinsics.f(this.f78729g, subformScreenContract$InputData.f78729g) && Intrinsics.f(this.f78730h, subformScreenContract$InputData.f78730h) && Intrinsics.f(this.i, subformScreenContract$InputData.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.a((this.d.hashCode() + ((this.f78728c.hashCode() + p.a.c(this.f78726a.hashCode() * 31, 31, this.f78727b)) * 31)) * 31, 31, this.e)) * 31;
        SubformScreenContract$ToolbarAction subformScreenContract$ToolbarAction = this.f78729g;
        int iHashCode2 = (iHashCode + (subformScreenContract$ToolbarAction == null ? 0 : subformScreenContract$ToolbarAction.hashCode())) * 31;
        String str = this.f78730h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78726a.name());
        dest.writeString(this.f78727b);
        dest.writeParcelable(this.f78728c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f78729g, i);
        dest.writeString(this.f78730h);
        dest.writeString(this.i);
    }

    public /* synthetic */ SubformScreenContract$InputData(g gVar, String str, BillFormV2 billFormV2, SubformScreenContract$SubformDataSource subformScreenContract$SubformDataSource, TextClause textClause, SubformScreenContract$ToolbarAction.Remove remove, String str2, int i) {
        this(gVar, str, billFormV2, subformScreenContract$SubformDataSource, textClause, SubformScreenContract$SubformScreenAction.Save.f78734a, remove, (i & 128) != 0 ? null : str2, null);
    }
}
