package com.revolut.feature.payments.bills_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/navigation/SplitBillInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SplitBillInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitMembersType f79197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f79199c;
    public final Clause d;
    public final boolean e;
    public final cp9.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f79200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f79201h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SplitMembersType splitMembersType = (SplitMembersType) j6.a.f(parcel, "parcel", SplitBillInputData.class);
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SplitBillInputData.class, parcel, arrayList2, iE, 1);
            }
            Clause clause = (Clause) parcel.readParcelable(SplitBillInputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(SplitBillInputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            cp9.a aVarValueOf = cp9.a.valueOf(parcel.readString());
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SplitLineItem.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new SplitBillInputData(splitMembersType, arrayList2, clause, clause2, z, aVarValueOf, z3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillInputData[i];
        }
    }

    public SplitBillInputData(SplitMembersType splitMembers, List bills, Clause title, Clause button, boolean z, cp9.a splitType, boolean z3, List list) {
        Intrinsics.checkNotNullParameter(splitMembers, "splitMembers");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        this.f79197a = splitMembers;
        this.f79198b = bills;
        this.f79199c = title;
        this.d = button;
        this.e = z;
        this.f = splitType;
        this.f79200g = z3;
        this.f79201h = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillInputData)) {
            return false;
        }
        SplitBillInputData splitBillInputData = (SplitBillInputData) obj2;
        return Intrinsics.f(this.f79197a, splitBillInputData.f79197a) && Intrinsics.f(this.f79198b, splitBillInputData.f79198b) && Intrinsics.f(this.f79199c, splitBillInputData.f79199c) && Intrinsics.f(this.d, splitBillInputData.d) && this.e == splitBillInputData.e && this.f == splitBillInputData.f && this.f79200g == splitBillInputData.f79200g && Intrinsics.f(this.f79201h, splitBillInputData.f79201h);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f.hashCode() + j6.a.c(p.a.a(p.a.a(p.a.d(this.f79197a.hashCode() * 31, 31, this.f79198b), 31, this.f79199c), 31, this.d), 31, this.e)) * 31, 31, this.f79200g);
        List list = this.f79201h;
        return iC + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79197a, i);
        Iterator itV = p.a.v(this.f79198b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f79199c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f.name());
        dest.writeInt(this.f79200g ? 1 : 0);
        List list = this.f79201h;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((SplitLineItem) itQ.next()).writeToParcel(dest, i);
        }
    }

    public /* synthetic */ SplitBillInputData(SplitMembersType splitMembersType, List list, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z, cp9.a aVar) {
        this(splitMembersType, list, textLocalisedClause, textLocalisedClause2, z, aVar, false, null);
    }
}
