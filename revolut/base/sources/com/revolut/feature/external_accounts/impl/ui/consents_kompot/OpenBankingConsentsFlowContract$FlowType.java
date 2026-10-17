package com.revolut.feature.external_accounts.impl.ui.consents_kompot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Australia", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType$Australia;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType$Default;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingConsentsFlowContract$FlowType implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType$Australia;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Australia extends OpenBankingConsentsFlowContract$FlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Australia f72741a = new Australia();

        @NotNull
        public static final Parcelable.Creator<Australia> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Australia.f72741a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Australia[i];
            }
        }

        private Australia() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType$Default;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlowContract$FlowType;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends OpenBankingConsentsFlowContract$FlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f72742a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f72742a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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

    private OpenBankingConsentsFlowContract$FlowType() {
    }
}
