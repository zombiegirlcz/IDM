package com.revolut.feature.wealth.models.robo;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/robo/PortfolioGoal;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioGoal implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PortfolioGoal> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YearMonth f95700b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioGoal((d) parcel.readSerializable(), (YearMonth) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioGoal[i];
        }
    }

    public PortfolioGoal(d targetAmount, YearMonth targetYearMonth) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(targetYearMonth, "targetYearMonth");
        this.f95699a = targetAmount;
        this.f95700b = targetYearMonth;
    }

    public final LocalDate a() {
        LocalDate localDateAtDay = this.f95700b.atDay(1);
        Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
        return localDateAtDay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioGoal)) {
            return false;
        }
        PortfolioGoal portfolioGoal = (PortfolioGoal) obj2;
        return Intrinsics.f(this.f95699a, portfolioGoal.f95699a) && Intrinsics.f(this.f95700b, portfolioGoal.f95700b);
    }

    public final int hashCode() {
        return this.f95700b.hashCode() + (this.f95699a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95699a);
        dest.writeSerializable(this.f95700b);
    }
}
