package com.revolut.feature.pay_later.impl.models.right_to_cancel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelCancellationOutcome;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "xi9/a", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RightToCancelCancellationOutcome implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RightToCancelCancellationOutcome> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi9.a f78849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78851c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RightToCancelCancellationOutcome(xi9.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RightToCancelCancellationOutcome[i];
        }
    }

    public RightToCancelCancellationOutcome(xi9.a outcome, String title, String description, String primaryButtonText, String str) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f78849a = outcome;
        this.f78850b = title;
        this.f78851c = description;
        this.d = primaryButtonText;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RightToCancelCancellationOutcome)) {
            return false;
        }
        RightToCancelCancellationOutcome rightToCancelCancellationOutcome = (RightToCancelCancellationOutcome) obj2;
        return this.f78849a == rightToCancelCancellationOutcome.f78849a && Intrinsics.f(this.f78850b, rightToCancelCancellationOutcome.f78850b) && Intrinsics.f(this.f78851c, rightToCancelCancellationOutcome.f78851c) && Intrinsics.f(this.d, rightToCancelCancellationOutcome.d) && Intrinsics.f(this.e, rightToCancelCancellationOutcome.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f78849a.hashCode() * 31, 31, this.f78850b), 31, this.f78851c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78849a.name());
        dest.writeString(this.f78850b);
        dest.writeString(this.f78851c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
