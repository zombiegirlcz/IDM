package com.revolut.feature.pockets.impl.ui.pockets_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "GlobalExchangeAccessCheck", "MultiIban", "Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep$GlobalExchangeAccessCheck;", "Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep$MultiIban;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PocketsListContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep$GlobalExchangeAccessCheck;", "Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GlobalExchangeAccessCheck extends PocketsListContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<GlobalExchangeAccessCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f80909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bla.c f80910c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GlobalExchangeAccessCheck(parcel.readString(), (wi0.b) parcel.readSerializable(), parcel.readInt() == 0 ? null : bla.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GlobalExchangeAccessCheck[i];
            }
        }

        public GlobalExchangeAccessCheck(String currencyCode, wi0.b bVar, bla.c cVar) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f80908a = currencyCode;
            this.f80909b = bVar;
            this.f80910c = cVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GlobalExchangeAccessCheck)) {
                return false;
            }
            GlobalExchangeAccessCheck globalExchangeAccessCheck = (GlobalExchangeAccessCheck) obj2;
            return Intrinsics.f(this.f80908a, globalExchangeAccessCheck.f80908a) && Intrinsics.f(this.f80909b, globalExchangeAccessCheck.f80909b) && this.f80910c == globalExchangeAccessCheck.f80910c;
        }

        public final int hashCode() {
            int iHashCode = this.f80908a.hashCode() * 31;
            wi0.b bVar = this.f80909b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
            bla.c cVar = this.f80910c;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80908a);
            dest.writeSerializable(this.f80909b);
            bla.c cVar = this.f80910c;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep$MultiIban;", "Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultiIban extends PocketsListContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MultiIban> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f80911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f80912b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultiIban((wi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultiIban[i];
            }
        }

        public MultiIban(wi0.b countryCode, xi0.b currency) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f80911a = countryCode;
            this.f80912b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MultiIban)) {
                return false;
            }
            MultiIban multiIban = (MultiIban) obj2;
            return Intrinsics.f(this.f80911a, multiIban.f80911a) && Intrinsics.f(this.f80912b, multiIban.f80912b);
        }

        public final int hashCode() {
            return this.f80912b.hashCode() + (this.f80911a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80911a);
            dest.writeSerializable(this.f80912b);
        }
    }

    private PocketsListContract$ModalStep() {
    }
}
