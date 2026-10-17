package com.revolut.feature.payments.groups.impl.ui_new.group_creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SmartSettlementInfo", "BaseCurrencyExplanation", "CurrencySelector", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps$BaseCurrencyExplanation;", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps$CurrencySelector;", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps$SmartSettlementInfo;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GroupCreationScreenContract$ModalSteps extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps$BaseCurrencyExplanation;", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BaseCurrencyExplanation implements GroupCreationScreenContract$ModalSteps {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BaseCurrencyExplanation f79477a = new BaseCurrencyExplanation();

        @NotNull
        public static final Parcelable.Creator<BaseCurrencyExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BaseCurrencyExplanation.f79477a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BaseCurrencyExplanation[i];
            }
        }

        private BaseCurrencyExplanation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps$CurrencySelector;", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencySelector implements GroupCreationScreenContract$ModalSteps {

        @NotNull
        public static final Parcelable.Creator<CurrencySelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f79478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79479b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new CurrencySelector(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencySelector[i];
            }
        }

        public CurrencySelector(List allowedCurrencies, xi0.b bVar) {
            Intrinsics.checkNotNullParameter(allowedCurrencies, "allowedCurrencies");
            this.f79478a = bVar;
            this.f79479b = allowedCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencySelector)) {
                return false;
            }
            CurrencySelector currencySelector = (CurrencySelector) obj2;
            return Intrinsics.f(this.f79478a, currencySelector.f79478a) && Intrinsics.f(this.f79479b, currencySelector.f79479b);
        }

        public final int hashCode() {
            xi0.b bVar = this.f79478a;
            return this.f79479b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79478a);
            Iterator itV = p.a.v(this.f79479b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps$SmartSettlementInfo;", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreenContract$ModalSteps;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SmartSettlementInfo implements GroupCreationScreenContract$ModalSteps {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SmartSettlementInfo f79480a = new SmartSettlementInfo();

        @NotNull
        public static final Parcelable.Creator<SmartSettlementInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SmartSettlementInfo.f79480a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartSettlementInfo[i];
            }
        }

        private SmartSettlementInfo() {
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
