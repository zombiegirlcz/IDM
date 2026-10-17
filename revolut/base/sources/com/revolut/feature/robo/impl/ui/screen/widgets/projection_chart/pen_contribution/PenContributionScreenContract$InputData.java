package com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/widgets/projection_chart/pen_contribution/PenContributionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PenContributionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PenContributionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f85221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f85222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f85223c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PenContributionScreenContract$InputData((Clause) parcel.readParcelable(PenContributionScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(PenContributionScreenContract$InputData.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PenContributionScreenContract$InputData[i];
        }
    }

    public PenContributionScreenContract$InputData(Clause title, Clause clause, d money, d minMoney, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(minMoney, "minMoney");
        this.f85221a = title;
        this.f85222b = clause;
        this.f85223c = money;
        this.d = minMoney;
        this.e = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PenContributionScreenContract$InputData)) {
            return false;
        }
        PenContributionScreenContract$InputData penContributionScreenContract$InputData = (PenContributionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85221a, penContributionScreenContract$InputData.f85221a) && Intrinsics.f(this.f85222b, penContributionScreenContract$InputData.f85222b) && Intrinsics.f(this.f85223c, penContributionScreenContract$InputData.f85223c) && Intrinsics.f(this.d, penContributionScreenContract$InputData.d) && Intrinsics.f(this.e, penContributionScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f85221a.hashCode() * 31;
        Clause clause = this.f85222b;
        int iC = v7.c(v7.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f85223c), 31, this.d);
        d dVar = this.e;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85221a, i);
        dest.writeParcelable(this.f85222b, i);
        dest.writeSerializable(this.f85223c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
