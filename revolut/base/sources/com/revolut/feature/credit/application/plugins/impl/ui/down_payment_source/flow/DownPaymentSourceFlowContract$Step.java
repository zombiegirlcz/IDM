package com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Sources", "Details", "Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step$Details;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step$Sources;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DownPaymentSourceFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step$Details;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements DownPaymentSourceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oy3.a f67610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f67611b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.createStringArrayList(), (oy3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(ArrayList selectedSourceIds, oy3.a details) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(selectedSourceIds, "selectedSourceIds");
            this.f67610a = details;
            this.f67611b = selectedSourceIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f67610a, details.f67610a) && Intrinsics.f(this.f67611b, details.f67611b);
        }

        public final int hashCode() {
            return this.f67611b.hashCode() + (this.f67610a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67610a);
            dest.writeStringList(this.f67611b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step$Sources;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/flow/DownPaymentSourceFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Sources implements DownPaymentSourceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Sources f67612a = new Sources();

        @NotNull
        public static final Parcelable.Creator<Sources> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Sources.f67612a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sources[i];
            }
        }

        private Sources() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
