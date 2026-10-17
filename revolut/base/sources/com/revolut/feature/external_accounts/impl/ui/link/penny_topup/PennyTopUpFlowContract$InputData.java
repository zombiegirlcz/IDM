package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PennyTopUpFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PennyTopUpFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f73022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f73023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73024c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new PennyTopUpFlowContract$InputData(dVar, parcel.readString(), parcel.readString(), parcel.readString(), arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PennyTopUpFlowContract$InputData[i];
        }
    }

    public PennyTopUpFlowContract$InputData(dj0.d amount, String workflowId, String workflowStepId, String str, List applicableCountries, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f73022a = amount;
        this.f73023b = applicableCountries;
        this.f73024c = z;
        this.d = workflowId;
        this.e = workflowStepId;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PennyTopUpFlowContract$InputData)) {
            return false;
        }
        PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData = (PennyTopUpFlowContract$InputData) obj2;
        return Intrinsics.f(this.f73022a, pennyTopUpFlowContract$InputData.f73022a) && Intrinsics.f(this.f73023b, pennyTopUpFlowContract$InputData.f73023b) && this.f73024c == pennyTopUpFlowContract$InputData.f73024c && Intrinsics.f(this.d, pennyTopUpFlowContract$InputData.d) && Intrinsics.f(this.e, pennyTopUpFlowContract$InputData.e) && Intrinsics.f(this.f, pennyTopUpFlowContract$InputData.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(p.a.d(this.f73022a.hashCode() * 31, 31, this.f73023b), 31, this.f73024c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73022a);
        Iterator itV = p.a.v(this.f73023b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeInt(this.f73024c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
