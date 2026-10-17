package com.revolut.feature_retail_user_declarations.email.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/email/screen/EmailScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmailScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f97583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97585c;
    public final boolean d;
    public final AnalyticsProduct e;
    public final EmailFlowInputData.EmailScreenItemData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EmailFlowInputData.PrefillEmailData f97586g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailScreenContract$InputData((AnalyticsProduct) parcel.readParcelable(EmailScreenContract$InputData.class.getClassLoader()), EmailFlowInputData.EmailScreenItemData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EmailFlowInputData.PrefillEmailData.CREATOR.createFromParcel(parcel), (wi0.b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailScreenContract$InputData[i];
        }
    }

    public EmailScreenContract$InputData(AnalyticsProduct analyticsProduct, EmailFlowInputData.EmailScreenItemData item, EmailFlowInputData.PrefillEmailData prefillEmailData, wi0.b country, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f97583a = country;
        this.f97584b = z;
        this.f97585c = z3;
        this.d = z4;
        this.e = analyticsProduct;
        this.f = item;
        this.f97586g = prefillEmailData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmailScreenContract$InputData)) {
            return false;
        }
        EmailScreenContract$InputData emailScreenContract$InputData = (EmailScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97583a, emailScreenContract$InputData.f97583a) && this.f97584b == emailScreenContract$InputData.f97584b && this.f97585c == emailScreenContract$InputData.f97585c && this.d == emailScreenContract$InputData.d && Intrinsics.f(this.e, emailScreenContract$InputData.e) && Intrinsics.f(this.f, emailScreenContract$InputData.f) && Intrinsics.f(this.f97586g, emailScreenContract$InputData.f97586g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + l.a(j6.a.c(j6.a.c(j6.a.c(this.f97583a.f297794a.hashCode() * 31, 31, this.f97584b), 31, this.f97585c), 31, this.d), 31, this.e)) * 31;
        EmailFlowInputData.PrefillEmailData prefillEmailData = this.f97586g;
        return iHashCode + (prefillEmailData == null ? 0 : prefillEmailData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97583a);
        dest.writeInt(this.f97584b ? 1 : 0);
        dest.writeInt(this.f97585c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        this.f.writeToParcel(dest, i);
        EmailFlowInputData.PrefillEmailData prefillEmailData = this.f97586g;
        if (prefillEmailData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            prefillEmailData.writeToParcel(dest, i);
        }
    }
}
