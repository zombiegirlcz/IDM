package com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "NoCards", "PaymentSelection", "Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep$NoCards;", "Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep$PaymentSelection;", "Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep$ProductArticle;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MigrateSubscriptionsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep$NoCards;", "Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep;", "<init>", "()V", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoCards implements MigrateSubscriptionsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoCards f80261a = new NoCards();

        @NotNull
        public static final Parcelable.Creator<NoCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoCards.f80261a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoCards[i];
            }
        }

        private NoCards() {
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep$PaymentSelection;", "Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentSelection implements MigrateSubscriptionsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PaymentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Provider f80262a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentSelection(parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentSelection[i];
            }
        }

        public PaymentSelection(Provider provider) {
            this.f80262a = provider;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Provider provider = this.f80262a;
            if (provider == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                provider.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep$ProductArticle;", "Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsControllerContract$ModalStep;", "<init>", "()V", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements MigrateSubscriptionsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f80263a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f80263a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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
