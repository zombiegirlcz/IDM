package com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kbk.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "FullBenefitsList", "DocumentsList", "DeclineGift", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$DeclineGift;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$DocumentsList;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$FullBenefitsList;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$Intro;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanGiftingReceiverFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$DeclineGift;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclineGift extends PlanGiftingReceiverFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclineGift> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f102461b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclineGift((Clause) parcel.readParcelable(DeclineGift.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclineGift[i];
            }
        }

        public DeclineGift(Clause clause, String giftId) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            this.f102460a = giftId;
            this.f102461b = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclineGift)) {
                return false;
            }
            DeclineGift declineGift = (DeclineGift) obj2;
            return Intrinsics.f(this.f102460a, declineGift.f102460a) && Intrinsics.f(this.f102461b, declineGift.f102461b);
        }

        public final int hashCode() {
            int iHashCode = this.f102460a.hashCode() * 31;
            Clause clause = this.f102461b;
            return iHashCode + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102460a);
            dest.writeParcelable(this.f102461b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$DocumentsList;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsList extends PlanGiftingReceiverFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f102462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f102463b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", DocumentsList.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(DocumentsList.class, parcel, arrayList, iE, 1);
                }
                return new DocumentsList(clause, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsList[i];
            }
        }

        public DocumentsList(Clause title, List documents) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f102462a = title;
            this.f102463b = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentsList)) {
                return false;
            }
            DocumentsList documentsList = (DocumentsList) obj2;
            return Intrinsics.f(this.f102462a, documentsList.f102462a) && Intrinsics.f(this.f102463b, documentsList.f102463b);
        }

        public final int hashCode() {
            return this.f102463b.hashCode() + (this.f102462a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102462a, i);
            Iterator itV = p.a.v(this.f102463b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$FullBenefitsList;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullBenefitsList extends PlanGiftingReceiverFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FullBenefitsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlanGiftingRefund f102466c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullBenefitsList(parcel.readString(), parcel.readString(), (PlanGiftingRefund) parcel.readParcelable(FullBenefitsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullBenefitsList[i];
            }
        }

        public FullBenefitsList(String giftId, String giftedPlanId, PlanGiftingRefund planGiftingRefund) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
            this.f102464a = giftId;
            this.f102465b = giftedPlanId;
            this.f102466c = planGiftingRefund;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FullBenefitsList)) {
                return false;
            }
            FullBenefitsList fullBenefitsList = (FullBenefitsList) obj2;
            return Intrinsics.f(this.f102464a, fullBenefitsList.f102464a) && Intrinsics.f(this.f102465b, fullBenefitsList.f102465b) && Intrinsics.f(this.f102466c, fullBenefitsList.f102466c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f102464a.hashCode() * 31, 31, this.f102465b);
            PlanGiftingRefund planGiftingRefund = this.f102466c;
            return iC + (planGiftingRefund == null ? 0 : planGiftingRefund.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102464a);
            dest.writeString(this.f102465b);
            dest.writeParcelable(this.f102466c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step$Intro;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends PlanGiftingReceiverFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlanGiftingClaimingExitRule f102468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f102469c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro(parcel.readString(), (PlanGiftingClaimingExitRule) parcel.readParcelable(Intro.class.getClassLoader()), k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(String giftId, PlanGiftingClaimingExitRule exitRule, k variant) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            Intrinsics.checkNotNullParameter(exitRule, "exitRule");
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.f102467a = giftId;
            this.f102468b = exitRule;
            this.f102469c = variant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Intro)) {
                return false;
            }
            Intro intro = (Intro) obj2;
            return Intrinsics.f(this.f102467a, intro.f102467a) && Intrinsics.f(this.f102468b, intro.f102468b) && this.f102469c == intro.f102469c;
        }

        public final int hashCode() {
            return this.f102469c.hashCode() + ((this.f102468b.hashCode() + (this.f102467a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102467a);
            dest.writeParcelable(this.f102468b, i);
            dest.writeString(this.f102469c.name());
        }
    }

    private PlanGiftingReceiverFlowContract$Step() {
    }
}
