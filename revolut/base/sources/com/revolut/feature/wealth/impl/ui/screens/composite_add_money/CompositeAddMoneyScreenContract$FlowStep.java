package com.revolut.feature.wealth.impl.ui.screens.composite_add_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ScaPrompt", "PreActionPrompt", "Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep$PreActionPrompt;", "Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep$ScaPrompt;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CompositeAddMoneyScreenContract$FlowStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep$PreActionPrompt;", "Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreActionPrompt implements CompositeAddMoneyScreenContract$FlowStep {

        @NotNull
        public static final Parcelable.Creator<PreActionPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f95579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f95580b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreActionPrompt((ParcelableControllerDescriptor) parcel.readParcelable(PreActionPrompt.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreActionPrompt[i];
            }
        }

        public PreActionPrompt(ParcelableControllerDescriptor descriptor, d inputMoney) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(inputMoney, "inputMoney");
            this.f95579a = descriptor;
            this.f95580b = inputMoney;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreActionPrompt)) {
                return false;
            }
            PreActionPrompt preActionPrompt = (PreActionPrompt) obj2;
            return Intrinsics.f(this.f95579a, preActionPrompt.f95579a) && Intrinsics.f(this.f95580b, preActionPrompt.f95580b);
        }

        public final int hashCode() {
            return this.f95580b.hashCode() + (this.f95579a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95579a, i);
            dest.writeSerializable(this.f95580b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep$ScaPrompt;", "Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScaPrompt implements CompositeAddMoneyScreenContract$FlowStep {

        @NotNull
        public static final Parcelable.Creator<ScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f95581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DepositInfo f95582b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScaPrompt((UUID) parcel.readSerializable(), (DepositInfo) parcel.readParcelable(ScaPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScaPrompt[i];
            }
        }

        public ScaPrompt(UUID legalEntityId, DepositInfo depositInfo) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(depositInfo, "depositInfo");
            this.f95581a = legalEntityId;
            this.f95582b = depositInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScaPrompt)) {
                return false;
            }
            ScaPrompt scaPrompt = (ScaPrompt) obj2;
            return Intrinsics.f(this.f95581a, scaPrompt.f95581a) && Intrinsics.f(this.f95582b, scaPrompt.f95582b);
        }

        public final int hashCode() {
            return this.f95582b.hashCode() + (this.f95581a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95581a);
            dest.writeParcelable(this.f95582b, i);
        }
    }
}
