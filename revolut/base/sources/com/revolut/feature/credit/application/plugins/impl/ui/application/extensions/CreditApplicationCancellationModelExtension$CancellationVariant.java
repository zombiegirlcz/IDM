package com.revolut.feature.credit.application.plugins.impl.ui.application.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant", "Landroid/os/Parcelable;", "<init>", "()V", "BECancellation", "LeaveNow", "ConfirmCancellation", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant$BECancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant$ConfirmCancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant$LeaveNow;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditApplicationCancellationModelExtension$CancellationVariant implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant$BECancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BECancellation extends CreditApplicationCancellationModelExtension$CancellationVariant {

        @NotNull
        public static final Parcelable.Creator<BECancellation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DropOutConfig.ConfirmationContent f67098a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BECancellation((DropOutConfig.ConfirmationContent) parcel.readParcelable(BECancellation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BECancellation[i];
            }
        }

        public BECancellation(DropOutConfig.ConfirmationContent dropOutConfig) {
            Intrinsics.checkNotNullParameter(dropOutConfig, "dropOutConfig");
            this.f67098a = dropOutConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BECancellation) && Intrinsics.f(this.f67098a, ((BECancellation) obj2).f67098a);
        }

        public final int hashCode() {
            return this.f67098a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67098a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant$ConfirmCancellation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmCancellation extends CreditApplicationCancellationModelExtension$CancellationVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmCancellation f67099a = new ConfirmCancellation();

        @NotNull
        public static final Parcelable.Creator<ConfirmCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmCancellation.f67099a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmCancellation[i];
            }
        }

        private ConfirmCancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant$LeaveNow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditApplicationCancellationModelExtension$CancellationVariant;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LeaveNow extends CreditApplicationCancellationModelExtension$CancellationVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LeaveNow f67100a = new LeaveNow();

        @NotNull
        public static final Parcelable.Creator<LeaveNow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LeaveNow.f67100a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LeaveNow[i];
            }
        }

        private LeaveNow() {
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

    private CreditApplicationCancellationModelExtension$CancellationVariant() {
    }
}
