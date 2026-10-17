package com.revolut.feature.onboarding.impl.qes.waiting_qes_result;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitingForQesResultScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WaitingForQesResultScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingForQesResultScreenContract$Mode f78531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78533c;
    public final Clause d;
    public final ESignatureWorkflowConfiguration e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitingForQesResultScreenContract$InputData((WaitingForQesResultScreenContract$Mode) parcel.readParcelable(WaitingForQesResultScreenContract$InputData.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), (Clause) parcel.readParcelable(WaitingForQesResultScreenContract$InputData.class.getClassLoader()), (ESignatureWorkflowConfiguration) parcel.readParcelable(WaitingForQesResultScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitingForQesResultScreenContract$InputData[i];
        }
    }

    public WaitingForQesResultScreenContract$InputData(WaitingForQesResultScreenContract$Mode mode, List termsIds, String str, Clause dialogTitle, ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(termsIds, "termsIds");
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        this.f78531a = mode;
        this.f78532b = termsIds;
        this.f78533c = str;
        this.d = dialogTitle;
        this.e = eSignatureWorkflowConfiguration;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitingForQesResultScreenContract$InputData)) {
            return false;
        }
        WaitingForQesResultScreenContract$InputData waitingForQesResultScreenContract$InputData = (WaitingForQesResultScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78531a, waitingForQesResultScreenContract$InputData.f78531a) && Intrinsics.f(this.f78532b, waitingForQesResultScreenContract$InputData.f78532b) && Intrinsics.f(this.f78533c, waitingForQesResultScreenContract$InputData.f78533c) && Intrinsics.f(this.d, waitingForQesResultScreenContract$InputData.d) && Intrinsics.f(this.e, waitingForQesResultScreenContract$InputData.e) && this.f == waitingForQesResultScreenContract$InputData.f;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f78531a.hashCode() * 31, 31, this.f78532b);
        String str = this.f78533c;
        int iA = p.a.a((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = this.e;
        return Boolean.hashCode(this.f) + ((iA + (eSignatureWorkflowConfiguration != null ? eSignatureWorkflowConfiguration.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78531a, i);
        dest.writeStringList(this.f78532b);
        dest.writeString(this.f78533c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }
}
