package com.revolut.feature.credit.application.plugins.impl.ui.close.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ft3.a1;
import ft3.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/close/flow/CreditApplicationCloseFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationCloseFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationCloseFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f67212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f67213c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationCloseFlowContract$InputData(parcel.readString(), (d1) parcel.readSerializable(), (a1) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationCloseFlowContract$InputData[i];
        }
    }

    public CreditApplicationCloseFlowContract$InputData(String str, d1 productClassification, a1 entryPointPayload, boolean z) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        this.f67211a = str;
        this.f67212b = productClassification;
        this.f67213c = entryPointPayload;
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
        if (!(obj2 instanceof CreditApplicationCloseFlowContract$InputData)) {
            return false;
        }
        CreditApplicationCloseFlowContract$InputData creditApplicationCloseFlowContract$InputData = (CreditApplicationCloseFlowContract$InputData) obj2;
        return Intrinsics.f(this.f67211a, creditApplicationCloseFlowContract$InputData.f67211a) && Intrinsics.f(this.f67212b, creditApplicationCloseFlowContract$InputData.f67212b) && Intrinsics.f(this.f67213c, creditApplicationCloseFlowContract$InputData.f67213c) && this.d == creditApplicationCloseFlowContract$InputData.d;
    }

    public final int hashCode() {
        String str = this.f67211a;
        return Boolean.hashCode(this.d) + ((this.f67213c.hashCode() + ((this.f67212b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67211a);
        dest.writeSerializable(this.f67212b);
        dest.writeSerializable(this.f67213c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
