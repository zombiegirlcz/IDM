package com.revolut.feature.credit.application.close.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.close.models.CreditApplicationClosePayload;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/close/ui/screen/CreditApplicationCloseScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationCloseScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationCloseScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationClosePayload f66220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66222c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationCloseScreenContract$InputData((CreditApplicationClosePayload) parcel.readParcelable(CreditApplicationCloseScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationCloseScreenContract$InputData[i];
        }
    }

    public CreditApplicationCloseScreenContract$InputData(CreditApplicationClosePayload payload, boolean z, String str) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f66220a = payload;
        this.f66221b = z;
        this.f66222c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationCloseScreenContract$InputData)) {
            return false;
        }
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = (CreditApplicationCloseScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66220a, creditApplicationCloseScreenContract$InputData.f66220a) && this.f66221b == creditApplicationCloseScreenContract$InputData.f66221b && Intrinsics.f(this.f66222c, creditApplicationCloseScreenContract$InputData.f66222c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f66220a.hashCode() * 31, 31, this.f66221b);
        String str = this.f66222c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66220a, i);
        dest.writeInt(this.f66221b ? 1 : 0);
        dest.writeString(this.f66222c);
    }
}
