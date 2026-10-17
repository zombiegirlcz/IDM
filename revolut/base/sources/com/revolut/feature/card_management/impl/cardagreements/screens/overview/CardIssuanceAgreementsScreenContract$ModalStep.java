package com.revolut.feature.card_management.impl.cardagreements.screens.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/card_management/impl/cardagreements/screens/overview/CardIssuanceAgreementsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShowDisposableCardInfo", "Lcom/revolut/feature/card_management/impl/cardagreements/screens/overview/CardIssuanceAgreementsScreenContract$ModalStep$ShowDisposableCardInfo;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardIssuanceAgreementsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardagreements/screens/overview/CardIssuanceAgreementsScreenContract$ModalStep$ShowDisposableCardInfo;", "Lcom/revolut/feature/card_management/impl/cardagreements/screens/overview/CardIssuanceAgreementsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowDisposableCardInfo implements CardIssuanceAgreementsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowDisposableCardInfo f64816a = new ShowDisposableCardInfo();

        @NotNull
        public static final Parcelable.Creator<ShowDisposableCardInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowDisposableCardInfo.f64816a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDisposableCardInfo[i];
            }
        }

        private ShowDisposableCardInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ShowDisposableCardInfo);
        }

        public final int hashCode() {
            return -889294059;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
