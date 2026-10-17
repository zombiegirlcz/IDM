package com.revolut.feature.credit.card.impl.ui.instalment.past;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter", "Landroid/os/Parcelable;", "Current", "Past", "Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter$Current;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter$Past;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardInstalmentsScreenContract$InstalmentFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter$Current;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Current implements CreditCardInstalmentsScreenContract$InstalmentFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Current f69410a = new Current();

        @NotNull
        public static final Parcelable.Creator<Current> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Current.f69410a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Current[i];
            }
        }

        private Current() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter$Past;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreenContract$InstalmentFilter;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Past implements CreditCardInstalmentsScreenContract$InstalmentFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Past f69411a = new Past();

        @NotNull
        public static final Parcelable.Creator<Past> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Past.f69411a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Past[i];
            }
        }

        private Past() {
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
