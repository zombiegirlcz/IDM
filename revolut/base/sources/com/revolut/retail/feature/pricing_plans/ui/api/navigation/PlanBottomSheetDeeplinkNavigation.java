package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PlanBottomSheetDeeplinkNavigation {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation;", "Landroid/os/Parcelable;", "<init>", "()V", "Credit", "Debit", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards$Credit;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards$Debit;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class RevPointsCards extends PlanBottomSheetDeeplinkNavigation implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards$Credit;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Credit extends RevPointsCards {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Credit f102905a = new Credit();

            @NotNull
            public static final Parcelable.Creator<Credit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Credit.f102905a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Credit[i];
                }
            }

            private Credit() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards$Debit;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$RevPointsCards;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Debit extends RevPointsCards {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Debit f102906a = new Debit();

            @NotNull
            public static final Parcelable.Creator<Debit> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Debit.f102906a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Debit[i];
                }
            }

            private Debit() {
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

        private RevPointsCards() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation;", "Landroid/os/Parcelable;", "<init>", "()V", "MMF", "Savings", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts$MMF;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts$Savings;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SavingsAccounts extends PlanBottomSheetDeeplinkNavigation implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts$MMF;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MMF extends SavingsAccounts {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MMF f102907a = new MMF();

            @NotNull
            public static final Parcelable.Creator<MMF> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MMF.f102907a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MMF[i];
                }
            }

            private MMF() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts$Savings;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBottomSheetDeeplinkNavigation$SavingsAccounts;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Savings extends SavingsAccounts {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Savings f102908a = new Savings();

            @NotNull
            public static final Parcelable.Creator<Savings> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Savings.f102908a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Savings[i];
                }
            }

            private Savings() {
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

        private SavingsAccounts() {
        }
    }

    private PlanBottomSheetDeeplinkNavigation() {
    }
}
