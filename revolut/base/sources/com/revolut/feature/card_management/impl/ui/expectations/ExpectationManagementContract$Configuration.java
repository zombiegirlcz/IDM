package com.revolut.feature.card_management.impl.ui.expectations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_management/impl/ui/expectations/ExpectationManagementContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpectationManagementContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpectationManagementContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f64852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f64854c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpectationManagementContract$Configuration(d.valueOf(parcel.readString()), parcel.readString(), (NaviCommand) parcel.readParcelable(ExpectationManagementContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpectationManagementContract$Configuration[i];
        }
    }

    public ExpectationManagementContract$Configuration(d reason, String cardId, NaviCommand nextCommand) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        this.f64852a = reason;
        this.f64853b = cardId;
        this.f64854c = nextCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpectationManagementContract$Configuration)) {
            return false;
        }
        ExpectationManagementContract$Configuration expectationManagementContract$Configuration = (ExpectationManagementContract$Configuration) obj2;
        return this.f64852a == expectationManagementContract$Configuration.f64852a && Intrinsics.f(this.f64853b, expectationManagementContract$Configuration.f64853b) && Intrinsics.f(this.f64854c, expectationManagementContract$Configuration.f64854c);
    }

    public final int hashCode() {
        return this.f64854c.hashCode() + p.a.c(this.f64852a.hashCode() * 31, 31, this.f64853b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64852a.name());
        dest.writeString(this.f64853b);
        dest.writeParcelable(this.f64854c, i);
    }
}
