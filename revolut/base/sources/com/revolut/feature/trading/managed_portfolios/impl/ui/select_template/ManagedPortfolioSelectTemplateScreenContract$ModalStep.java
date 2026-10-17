package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RiskDialog", "ConfirmChangeDialog", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep$ConfirmChangeDialog;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep$RiskDialog;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManagedPortfolioSelectTemplateScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep$ConfirmChangeDialog;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmChangeDialog implements ManagedPortfolioSelectTemplateScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmChangeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Template f91440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Template f91441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ilc.a f91442c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmChangeDialog((Template) parcel.readParcelable(ConfirmChangeDialog.class.getClassLoader()), (Template) parcel.readParcelable(ConfirmChangeDialog.class.getClassLoader()), ilc.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmChangeDialog[i];
            }
        }

        public ConfirmChangeDialog(Template selectedTemplate, Template recommendedTemplate, ilc.a roboContext) {
            Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
            Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
            Intrinsics.checkNotNullParameter(roboContext, "roboContext");
            this.f91440a = selectedTemplate;
            this.f91441b = recommendedTemplate;
            this.f91442c = roboContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmChangeDialog)) {
                return false;
            }
            ConfirmChangeDialog confirmChangeDialog = (ConfirmChangeDialog) obj2;
            return Intrinsics.f(this.f91440a, confirmChangeDialog.f91440a) && Intrinsics.f(this.f91441b, confirmChangeDialog.f91441b) && this.f91442c == confirmChangeDialog.f91442c;
        }

        public final int hashCode() {
            return this.f91442c.hashCode() + ((this.f91441b.hashCode() + (this.f91440a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91440a, i);
            dest.writeParcelable(this.f91441b, i);
            dest.writeString(this.f91442c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep$RiskDialog;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskDialog implements ManagedPortfolioSelectTemplateScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RiskDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Template f91443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Template f91444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ilc.a f91445c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskDialog((Template) parcel.readParcelable(RiskDialog.class.getClassLoader()), (Template) parcel.readParcelable(RiskDialog.class.getClassLoader()), ilc.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskDialog[i];
            }
        }

        public RiskDialog(Template selectedTemplate, Template recommendedTemplate, ilc.a roboContext) {
            Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
            Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
            Intrinsics.checkNotNullParameter(roboContext, "roboContext");
            this.f91443a = selectedTemplate;
            this.f91444b = recommendedTemplate;
            this.f91445c = roboContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskDialog)) {
                return false;
            }
            RiskDialog riskDialog = (RiskDialog) obj2;
            return Intrinsics.f(this.f91443a, riskDialog.f91443a) && Intrinsics.f(this.f91444b, riskDialog.f91444b) && this.f91445c == riskDialog.f91445c;
        }

        public final int hashCode() {
            return this.f91445c.hashCode() + ((this.f91444b.hashCode() + (this.f91443a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91443a, i);
            dest.writeParcelable(this.f91444b, i);
            dest.writeString(this.f91445c.name());
        }
    }
}
