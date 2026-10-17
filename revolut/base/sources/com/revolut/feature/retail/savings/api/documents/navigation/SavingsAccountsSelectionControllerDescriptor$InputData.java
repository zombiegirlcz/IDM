package com.revolut.feature.retail.savings.api.documents.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.b;
import prk.o;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/api/documents/navigation/SavingsAccountsSelectionControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAccountsSelectionControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SavingsAccountsSelectionControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f83140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83141b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(b.valueOf(parcel.readString()));
            }
            return new SavingsAccountsSelectionControllerDescriptor$InputData(arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAccountsSelectionControllerDescriptor$InputData[i];
        }
    }

    public SavingsAccountsSelectionControllerDescriptor$InputData(List accountTypes, Set selectedSavingsIds) {
        Intrinsics.checkNotNullParameter(selectedSavingsIds, "selectedSavingsIds");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        this.f83140a = selectedSavingsIds;
        this.f83141b = accountTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAccountsSelectionControllerDescriptor$InputData)) {
            return false;
        }
        SavingsAccountsSelectionControllerDescriptor$InputData savingsAccountsSelectionControllerDescriptor$InputData = (SavingsAccountsSelectionControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f83140a, savingsAccountsSelectionControllerDescriptor$InputData.f83140a) && Intrinsics.f(this.f83141b, savingsAccountsSelectionControllerDescriptor$InputData.f83141b);
    }

    public final int hashCode() {
        return this.f83141b.hashCode() + (this.f83140a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f83140a, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itV2 = p.a.v(this.f83141b, dest);
        while (itV2.hasNext()) {
            dest.writeString(((b) itV2.next()).name());
        }
    }

    public SavingsAccountsSelectionControllerDescriptor$InputData() {
        this(v.k(b.PERSONAL, b.YOUTH), h0.f322473a);
    }
}
