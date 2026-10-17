package com.revolut.feature.direct_deposit.impl.ui_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.kompot.navigable.flow.FlowStep;
import h96.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Account", "Setup", "FormPreview", "Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step$Account;", "Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step$FormPreview;", "Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step$Setup;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DirectDepositFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step$Account;", "Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step;", "<init>", "()V", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Account implements DirectDepositFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Account f71948a = new Account();

        @NotNull
        public static final Parcelable.Creator<Account> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Account.f71948a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Account[i];
            }
        }

        private Account() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step$FormPreview;", "Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormPreview implements DirectDepositFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FormPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f71949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DepositAmount f71951c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FormPreview(d.valueOf(parcel.readString()), parcel.readString(), (DepositAmount) parcel.readParcelable(FormPreview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FormPreview[i];
            }
        }

        public FormPreview(d mode, String companyName, DepositAmount depositAmount) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            this.f71949a = mode;
            this.f71950b = companyName;
            this.f71951c = depositAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FormPreview)) {
                return false;
            }
            FormPreview formPreview = (FormPreview) obj2;
            return this.f71949a == formPreview.f71949a && Intrinsics.f(this.f71950b, formPreview.f71950b) && Intrinsics.f(this.f71951c, formPreview.f71951c);
        }

        public final int hashCode() {
            return this.f71951c.hashCode() + p.a.c(this.f71949a.hashCode() * 31, 31, this.f71950b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71949a.name());
            dest.writeString(this.f71950b);
            dest.writeParcelable(this.f71951c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step$Setup;", "Lcom/revolut/feature/direct_deposit/impl/ui_kompot/flow/DirectDepositFlowContract$Step;", "<init>", "()V", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Setup implements DirectDepositFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Setup f71952a = new Setup();

        @NotNull
        public static final Parcelable.Creator<Setup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Setup.f71952a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Setup[i];
            }
        }

        private Setup() {
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
