package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we6.k;
import yte.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/api/navigation/BrazilInboundMandateConfirmationDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrazilInboundMandateConfirmationDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BrazilInboundMandateConfirmationDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f72248c;
    public final String d;
    public final k e;
    public final n f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrazilInboundMandateConfirmationDescriptor$InputData(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), k.valueOf(parcel.readString()), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrazilInboundMandateConfirmationDescriptor$InputData[i];
        }
    }

    public BrazilInboundMandateConfirmationDescriptor$InputData(String institutionId, String institutionName, d amount, String str, k context, n contextType) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f72246a = institutionId;
        this.f72247b = institutionName;
        this.f72248c = amount;
        this.d = str;
        this.e = context;
        this.f = contextType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BrazilInboundMandateConfirmationDescriptor$InputData)) {
            return false;
        }
        BrazilInboundMandateConfirmationDescriptor$InputData brazilInboundMandateConfirmationDescriptor$InputData = (BrazilInboundMandateConfirmationDescriptor$InputData) obj2;
        return Intrinsics.f(this.f72246a, brazilInboundMandateConfirmationDescriptor$InputData.f72246a) && Intrinsics.f(this.f72247b, brazilInboundMandateConfirmationDescriptor$InputData.f72247b) && Intrinsics.f(this.f72248c, brazilInboundMandateConfirmationDescriptor$InputData.f72248c) && Intrinsics.f(this.d, brazilInboundMandateConfirmationDescriptor$InputData.d) && this.e == brazilInboundMandateConfirmationDescriptor$InputData.e && this.f == brazilInboundMandateConfirmationDescriptor$InputData.f;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(this.f72246a.hashCode() * 31, 31, this.f72247b), 31, this.f72248c);
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72246a);
        dest.writeString(this.f72247b);
        dest.writeSerializable(this.f72248c);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f.name());
    }
}
