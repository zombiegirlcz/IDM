package com.revolut.feature.external_accounts.impl.ui.link.screens.branches;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/screens/branches/BranchesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BranchesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BranchesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f73048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f73049c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BranchesScreenContract$InputData((Clause) parcel.readParcelable(BranchesScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(BranchesScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BranchesScreenContract$InputData[i];
        }
    }

    public BranchesScreenContract$InputData(Clause title, Clause hint, String institutionId, boolean z) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f73047a = institutionId;
        this.f73048b = title;
        this.f73049c = hint;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BranchesScreenContract$InputData)) {
            return false;
        }
        BranchesScreenContract$InputData branchesScreenContract$InputData = (BranchesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73047a, branchesScreenContract$InputData.f73047a) && Intrinsics.f(this.f73048b, branchesScreenContract$InputData.f73048b) && Intrinsics.f(this.f73049c, branchesScreenContract$InputData.f73049c) && this.d == branchesScreenContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.a(p.a.a(this.f73047a.hashCode() * 31, 31, this.f73048b), 31, this.f73049c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73047a);
        dest.writeParcelable(this.f73048b, i);
        dest.writeParcelable(this.f73049c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
