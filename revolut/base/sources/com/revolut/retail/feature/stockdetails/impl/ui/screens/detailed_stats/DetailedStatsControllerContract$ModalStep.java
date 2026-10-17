package com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot.CustomisedStatsDialogProvider;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SectionGlossary", "StatInfo", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep$SectionGlossary;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep$StatInfo;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DetailedStatsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep$SectionGlossary;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionGlossary implements DetailedStatsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SectionGlossary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GlossaryScreenContract$InputData f103918a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionGlossary(GlossaryScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionGlossary[i];
            }
        }

        public SectionGlossary(GlossaryScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103918a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SectionGlossary) && Intrinsics.f(this.f103918a, ((SectionGlossary) obj2).f103918a);
        }

        public final int hashCode() {
            return this.f103918a.f104001a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103918a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep$StatInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatInfo implements DetailedStatsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StatInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomisedStatsDialogProvider.DialogContent f103919a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatInfo(CustomisedStatsDialogProvider.DialogContent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatInfo[i];
            }
        }

        public StatInfo(CustomisedStatsDialogProvider.DialogContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f103919a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StatInfo) && Intrinsics.f(this.f103919a, ((StatInfo) obj2).f103919a);
        }

        public final int hashCode() {
            return this.f103919a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103919a.writeToParcel(dest, i);
        }
    }
}
