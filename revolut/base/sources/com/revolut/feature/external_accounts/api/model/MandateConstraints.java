package com.revolut.feature.external_accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/MandateConstraints;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MandateConstraints implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MandateConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f72228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f72229c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MandateConstraints((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MandateConstraints[i];
        }
    }

    public MandateConstraints(d maximumIndividualLimit, d maximumMonthlyLimit, d usedMonthlyLimit) {
        Intrinsics.checkNotNullParameter(maximumIndividualLimit, "maximumIndividualLimit");
        Intrinsics.checkNotNullParameter(maximumMonthlyLimit, "maximumMonthlyLimit");
        Intrinsics.checkNotNullParameter(usedMonthlyLimit, "usedMonthlyLimit");
        this.f72227a = maximumIndividualLimit;
        this.f72228b = maximumMonthlyLimit;
        this.f72229c = usedMonthlyLimit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getF72227a() {
        return this.f72227a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF72228b() {
        return this.f72228b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MandateConstraints)) {
            return false;
        }
        MandateConstraints mandateConstraints = (MandateConstraints) obj2;
        return Intrinsics.f(this.f72227a, mandateConstraints.f72227a) && Intrinsics.f(this.f72228b, mandateConstraints.f72228b) && Intrinsics.f(this.f72229c, mandateConstraints.f72229c);
    }

    public final int hashCode() {
        return this.f72229c.hashCode() + v7.c(this.f72227a.hashCode() * 31, 31, this.f72228b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72227a);
        dest.writeSerializable(this.f72228b);
        dest.writeSerializable(this.f72229c);
    }
}
