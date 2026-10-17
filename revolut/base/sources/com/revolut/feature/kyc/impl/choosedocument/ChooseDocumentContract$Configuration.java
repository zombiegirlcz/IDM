package com.revolut.feature.kyc.impl.choosedocument;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/choosedocument/ChooseDocumentContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooseDocumentContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChooseDocumentContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f77586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f77587c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooseDocumentContract$Configuration(parcel.readInt() != 0, r.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ChooseDocumentContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooseDocumentContract$Configuration[i];
        }
    }

    public ChooseDocumentContract$Configuration(boolean z, r kycScope, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f77585a = z;
        this.f77586b = kycScope;
        this.f77587c = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooseDocumentContract$Configuration)) {
            return false;
        }
        ChooseDocumentContract$Configuration chooseDocumentContract$Configuration = (ChooseDocumentContract$Configuration) obj2;
        return this.f77585a == chooseDocumentContract$Configuration.f77585a && this.f77586b == chooseDocumentContract$Configuration.f77586b && Intrinsics.f(this.f77587c, chooseDocumentContract$Configuration.f77587c);
    }

    public final int hashCode() {
        return this.f77587c.hashCode() + ((this.f77586b.hashCode() + (Boolean.hashCode(this.f77585a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f77585a ? 1 : 0);
        dest.writeString(this.f77586b.name());
        dest.writeParcelable(this.f77587c, i);
    }
}
