package com.revolut.feature.trading.managed_portfolios.impl.domain.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent;", "Landroid/os/Parcelable;", "PieChart", "AnimatedComponent", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent$AnimatedComponent;", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent$PieChart;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TemplateIntroScreenContent extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent$AnimatedComponent;", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnimatedComponent implements TemplateIntroScreenContent {

        @NotNull
        public static final Parcelable.Creator<AnimatedComponent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91257a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnimatedComponent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnimatedComponent[i];
            }
        }

        public AnimatedComponent(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f91257a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnimatedComponent) && Intrinsics.f(this.f91257a, ((AnimatedComponent) obj2).f91257a);
        }

        public final int hashCode() {
            return this.f91257a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91257a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent$PieChart;", "Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreenContent;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PieChart implements TemplateIntroScreenContent {

        @NotNull
        public static final Parcelable.Creator<PieChart> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f91258a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TemplateIntroPieChartItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PieChart(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PieChart[i];
            }
        }

        public PieChart(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f91258a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PieChart) && this.f91258a.equals(((PieChart) obj2).f91258a);
        }

        public final int hashCode() {
            return this.f91258a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f91258a, dest);
            while (itY.hasNext()) {
                ((TemplateIntroPieChartItem) itY.next()).writeToParcel(dest, i);
            }
        }
    }
}
