package com.revolut.feature.trading.managed_portfolios.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData;", "Landroid/os/Parcelable;", "Contribution", "Benchmark", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData$Benchmark;", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData$Contribution;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManagedPortfolioReferenceData extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData$Benchmark;", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Benchmark implements ManagedPortfolioReferenceData {

        @NotNull
        public static final Parcelable.Creator<Benchmark> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f91239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f91241c;
        public final BigDecimal d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Benchmark(parcel.readInt() != 0, parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Benchmark[i];
            }
        }

        public Benchmark(boolean z, String ref2, String benchmarkName, BigDecimal benchmarkPerformance) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(benchmarkName, "benchmarkName");
            Intrinsics.checkNotNullParameter(benchmarkPerformance, "benchmarkPerformance");
            this.f91239a = z;
            this.f91240b = ref2;
            this.f91241c = benchmarkName;
            this.d = benchmarkPerformance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Benchmark)) {
                return false;
            }
            Benchmark benchmark = (Benchmark) obj2;
            return this.f91239a == benchmark.f91239a && Intrinsics.f(this.f91240b, benchmark.f91240b) && Intrinsics.f(this.f91241c, benchmark.f91241c) && Intrinsics.f(this.d, benchmark.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(Boolean.hashCode(this.f91239a) * 31, 31, this.f91240b), 31, this.f91241c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f91239a ? 1 : 0);
            dest.writeString(this.f91240b);
            dest.writeString(this.f91241c);
            dest.writeSerializable(this.d);
        }

        @Override // com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF91242a() {
            return this.f91239a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData$Contribution;", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/model/ManagedPortfolioReferenceData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contribution implements ManagedPortfolioReferenceData {

        @NotNull
        public static final Parcelable.Creator<Contribution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f91242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91243b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Contribution((d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contribution[i];
            }
        }

        public Contribution(d dVar, boolean z) {
            this.f91242a = z;
            this.f91243b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Contribution)) {
                return false;
            }
            Contribution contribution = (Contribution) obj2;
            return this.f91242a == contribution.f91242a && Intrinsics.f(this.f91243b, contribution.f91243b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f91242a) * 31;
            d dVar = this.f91243b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f91242a ? 1 : 0);
            dest.writeSerializable(this.f91243b);
        }

        @Override // com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF91242a() {
            return this.f91242a;
        }
    }

    /* JADX INFO: renamed from: x */
    boolean getF91242a();
}
