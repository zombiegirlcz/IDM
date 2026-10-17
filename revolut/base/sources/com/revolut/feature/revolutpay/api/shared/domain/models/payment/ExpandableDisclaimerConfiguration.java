package com.revolut.feature.revolutpay.api.shared.domain.models.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment/ExpandableDisclaimerConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpandableDisclaimerConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpandableDisclaimerConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f84340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f84341b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpandableDisclaimerConfiguration((Clause) parcel.readParcelable(ExpandableDisclaimerConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(ExpandableDisclaimerConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpandableDisclaimerConfiguration[i];
        }
    }

    public ExpandableDisclaimerConfiguration(Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f84340a = title;
        this.f84341b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpandableDisclaimerConfiguration)) {
            return false;
        }
        ExpandableDisclaimerConfiguration expandableDisclaimerConfiguration = (ExpandableDisclaimerConfiguration) obj2;
        return Intrinsics.f(this.f84340a, expandableDisclaimerConfiguration.f84340a) && Intrinsics.f(this.f84341b, expandableDisclaimerConfiguration.f84341b);
    }

    public final int hashCode() {
        return this.f84341b.hashCode() + (this.f84340a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84340a, i);
        dest.writeParcelable(this.f84341b, i);
    }
}
