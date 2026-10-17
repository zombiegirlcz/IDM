package com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "EditTopUpOrder", "AutoTopUpMethodsScreen", "CustomTopUpOrderAmount", "Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step$AutoTopUpMethodsScreen;", "Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step$CustomTopUpOrderAmount;", "Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step$EditTopUpOrder;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AutoTopUpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step$AutoTopUpMethodsScreen;", "Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoTopUpMethodsScreen extends AutoTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AutoTopUpMethodsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f88181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f88182b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoTopUpMethodsScreen((xi0.b) parcel.readSerializable(), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoTopUpMethodsScreen[i];
            }
        }

        public AutoTopUpMethodsScreen(xi0.b currency, l pocketType) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f88181a = currency;
            this.f88182b = pocketType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoTopUpMethodsScreen)) {
                return false;
            }
            AutoTopUpMethodsScreen autoTopUpMethodsScreen = (AutoTopUpMethodsScreen) obj2;
            return Intrinsics.f(this.f88181a, autoTopUpMethodsScreen.f88181a) && this.f88182b == autoTopUpMethodsScreen.f88182b;
        }

        public final int hashCode() {
            return this.f88182b.hashCode() + (this.f88181a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88181a);
            dest.writeString(this.f88182b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step$CustomTopUpOrderAmount;", "Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomTopUpOrderAmount extends AutoTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomTopUpOrderAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f88183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qxd.a f88184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f88185c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomTopUpOrderAmount((xi0.b) parcel.readSerializable(), qxd.a.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomTopUpOrderAmount[i];
            }
        }

        public CustomTopUpOrderAmount(xi0.b currency, qxd.a editMode, d dVar) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(editMode, "editMode");
            this.f88183a = currency;
            this.f88184b = editMode;
            this.f88185c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomTopUpOrderAmount)) {
                return false;
            }
            CustomTopUpOrderAmount customTopUpOrderAmount = (CustomTopUpOrderAmount) obj2;
            return Intrinsics.f(this.f88183a, customTopUpOrderAmount.f88183a) && this.f88184b == customTopUpOrderAmount.f88184b && Intrinsics.f(this.f88185c, customTopUpOrderAmount.f88185c);
        }

        public final int hashCode() {
            int iHashCode = (this.f88184b.hashCode() + (this.f88183a.hashCode() * 31)) * 31;
            d dVar = this.f88185c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88183a);
            dest.writeString(this.f88184b.name());
            dest.writeSerializable(this.f88185c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step$EditTopUpOrder;", "Lcom/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditTopUpOrder extends AutoTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditTopUpOrder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f88186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AutoTopUpState f88187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88188c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditTopUpOrder((xi0.b) parcel.readSerializable(), (AutoTopUpState) parcel.readParcelable(EditTopUpOrder.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTopUpOrder[i];
            }
        }

        public EditTopUpOrder(xi0.b currency, AutoTopUpState autoTopUpState, String str) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(autoTopUpState, "autoTopUpState");
            this.f88186a = currency;
            this.f88187b = autoTopUpState;
            this.f88188c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditTopUpOrder)) {
                return false;
            }
            EditTopUpOrder editTopUpOrder = (EditTopUpOrder) obj2;
            return Intrinsics.f(this.f88186a, editTopUpOrder.f88186a) && Intrinsics.f(this.f88187b, editTopUpOrder.f88187b) && Intrinsics.f(this.f88188c, editTopUpOrder.f88188c);
        }

        public final int hashCode() {
            int iHashCode = (this.f88187b.hashCode() + (this.f88186a.hashCode() * 31)) * 31;
            String str = this.f88188c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88186a);
            dest.writeParcelable(this.f88187b, i);
            dest.writeString(this.f88188c);
        }
    }

    private AutoTopUpFlowContract$Step() {
    }
}
