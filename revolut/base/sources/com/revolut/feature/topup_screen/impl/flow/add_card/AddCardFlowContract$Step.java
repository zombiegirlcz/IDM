package com.revolut.feature.topup_screen.impl.flow.add_card;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CardDetails", "PerformAddCard", "Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step$CardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step$PerformAddCard;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddCardFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step$CardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardDetails extends AddCardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardDetails f90593a = new CardDetails();

        @NotNull
        public static final Parcelable.Creator<CardDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardDetails.f90593a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDetails[i];
            }
        }

        private CardDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step$PerformAddCard;", "Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PerformAddCard extends AddCardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PerformAddCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupWithNewCardFlowDescriptor$InputData f90594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f90595b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData = (TopupWithNewCardFlowDescriptor$InputData) j6.a.f(parcel, "parcel", PerformAddCard.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new PerformAddCard(topupWithNewCardFlowDescriptor$InputData, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerformAddCard[i];
            }
        }

        public PerformAddCard(TopupWithNewCardFlowDescriptor$InputData inputData, Set initialCardIds) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(initialCardIds, "initialCardIds");
            this.f90594a = inputData;
            this.f90595b = initialCardIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PerformAddCard)) {
                return false;
            }
            PerformAddCard performAddCard = (PerformAddCard) obj2;
            return Intrinsics.f(this.f90594a, performAddCard.f90594a) && Intrinsics.f(this.f90595b, performAddCard.f90595b);
        }

        public final int hashCode() {
            return this.f90595b.hashCode() + (this.f90594a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90594a, i);
            Iterator itV = n.v(this.f90595b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    private AddCardFlowContract$Step() {
    }
}
