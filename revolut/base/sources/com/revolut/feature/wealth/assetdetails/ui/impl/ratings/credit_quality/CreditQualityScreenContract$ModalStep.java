package com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.common.InfoDialogFactory$DialogConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/assetdetails/ui/impl/ratings/credit_quality/CreditQualityScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InfoDialog", "Lcom/revolut/feature/wealth/assetdetails/ui/impl/ratings/credit_quality/CreditQualityScreenContract$ModalStep$InfoDialog;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditQualityScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/ratings/credit_quality/CreditQualityScreenContract$ModalStep$InfoDialog;", "Lcom/revolut/feature/wealth/assetdetails/ui/impl/ratings/credit_quality/CreditQualityScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoDialog extends CreditQualityScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InfoDialogFactory$DialogConfig f95428a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoDialog(InfoDialogFactory$DialogConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoDialog[i];
            }
        }

        public InfoDialog(InfoDialogFactory$DialogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f95428a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InfoDialog) && Intrinsics.f(this.f95428a, ((InfoDialog) obj2).f95428a);
        }

        public final int hashCode() {
            return this.f95428a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f95428a.writeToParcel(dest, i);
        }
    }

    private CreditQualityScreenContract$ModalStep() {
    }
}
