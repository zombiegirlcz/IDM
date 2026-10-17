package com.revolut.feature.payments_migration.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.BlockId;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "MoveSubscriptions", "AccountDetailsPaymentMigration", "CardsPaymentMigration", "SearchInBlock", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$AccountDetailsPaymentMigration;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$CardsPaymentMigration;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$MoveSubscriptions;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$SearchInBlock;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentsMigrationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$AccountDetailsPaymentMigration;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetailsPaymentMigration extends PaymentsMigrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountDetailsPaymentMigration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Provider f80251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80252b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetailsPaymentMigration(parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetailsPaymentMigration[i];
            }
        }

        public AccountDetailsPaymentMigration(Provider provider, boolean z) {
            this.f80251a = provider;
            this.f80252b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountDetailsPaymentMigration)) {
                return false;
            }
            AccountDetailsPaymentMigration accountDetailsPaymentMigration = (AccountDetailsPaymentMigration) obj2;
            return Intrinsics.f(this.f80251a, accountDetailsPaymentMigration.f80251a) && this.f80252b == accountDetailsPaymentMigration.f80252b;
        }

        public final int hashCode() {
            Provider provider = this.f80251a;
            return Boolean.hashCode(this.f80252b) + ((provider == null ? 0 : provider.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Provider provider = this.f80251a;
            if (provider == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                provider.writeToParcel(dest, i);
            }
            dest.writeInt(this.f80252b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$CardsPaymentMigration;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardsPaymentMigration extends PaymentsMigrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardsPaymentMigration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Provider f80253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80254b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardsPaymentMigration(parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardsPaymentMigration[i];
            }
        }

        public CardsPaymentMigration(Provider provider, boolean z) {
            this.f80253a = provider;
            this.f80254b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardsPaymentMigration)) {
                return false;
            }
            CardsPaymentMigration cardsPaymentMigration = (CardsPaymentMigration) obj2;
            return Intrinsics.f(this.f80253a, cardsPaymentMigration.f80253a) && this.f80254b == cardsPaymentMigration.f80254b;
        }

        public final int hashCode() {
            Provider provider = this.f80253a;
            return Boolean.hashCode(this.f80254b) + ((provider == null ? 0 : provider.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Provider provider = this.f80253a;
            if (provider == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                provider.writeToParcel(dest, i);
            }
            dest.writeInt(this.f80254b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$MoveSubscriptions;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step;", "<init>", "()V", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveSubscriptions extends PaymentsMigrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MoveSubscriptions f80255a = new MoveSubscriptions();

        @NotNull
        public static final Parcelable.Creator<MoveSubscriptions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveSubscriptions.f80255a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveSubscriptions[i];
            }
        }

        private MoveSubscriptions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step$SearchInBlock;", "Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchInBlock extends PaymentsMigrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SearchInBlock> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f80258c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = BlockId.CREATOR.createFromParcel(parcel).f80208a;
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SearchInBlock.class, parcel, arrayList, iE, 1);
                }
                return new SearchInBlock(arrayList, parcel.readInt() != 0, str, string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchInBlock[i];
            }
        }

        public SearchInBlock(List blocks, boolean z, String blockId, String title) {
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            this.f80256a = blockId;
            this.f80257b = title;
            this.f80258c = blocks;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SearchInBlock)) {
                return false;
            }
            SearchInBlock searchInBlock = (SearchInBlock) obj2;
            return Intrinsics.f(this.f80256a, searchInBlock.f80256a) && Intrinsics.f(this.f80257b, searchInBlock.f80257b) && Intrinsics.f(this.f80258c, searchInBlock.f80258c) && this.d == searchInBlock.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.d(p.a.c(this.f80256a.hashCode() * 31, 31, this.f80257b), 31, this.f80258c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            BlockId.a(this.f80256a, dest);
            dest.writeString(this.f80257b);
            Iterator itV = p.a.v(this.f80258c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private PaymentsMigrationFlowContract$Step() {
    }
}
