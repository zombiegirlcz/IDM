package com.revolut.feature.credit.card.impl.ui.instalment.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "PrePurchase", "PostPurchase", "StatementFinancing", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData$PostPurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData$PrePurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData$StatementFinancing;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardInstalmentDetailsFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData$PostPurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostPurchase implements CreditCardInstalmentDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PostPurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69350b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostPurchase(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostPurchase[i];
            }
        }

        public PostPurchase(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69349a = facilityId;
            this.f69350b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PostPurchase)) {
                return false;
            }
            PostPurchase postPurchase = (PostPurchase) obj2;
            return Intrinsics.f(this.f69349a, postPurchase.f69349a) && Intrinsics.f(this.f69350b, postPurchase.f69350b);
        }

        public final int hashCode() {
            return this.f69350b.hashCode() + (this.f69349a.hashCode() * 31);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF69354b() {
            return this.f69350b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69349a);
            dest.writeString(this.f69350b);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69353a() {
            return this.f69349a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData$PrePurchase;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrePurchase implements CreditCardInstalmentDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PrePurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69352b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrePurchase(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrePurchase[i];
            }
        }

        public PrePurchase(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69351a = facilityId;
            this.f69352b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrePurchase)) {
                return false;
            }
            PrePurchase prePurchase = (PrePurchase) obj2;
            return Intrinsics.f(this.f69351a, prePurchase.f69351a) && Intrinsics.f(this.f69352b, prePurchase.f69352b);
        }

        public final int hashCode() {
            return this.f69352b.hashCode() + (this.f69351a.hashCode() * 31);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF69354b() {
            return this.f69352b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69351a);
            dest.writeString(this.f69352b);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69353a() {
            return this.f69351a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/flow/CreditCardInstalmentDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementFinancing implements CreditCardInstalmentDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<StatementFinancing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69354b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementFinancing(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementFinancing[i];
            }
        }

        public StatementFinancing(String facilityId, String planId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69353a = facilityId;
            this.f69354b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementFinancing)) {
                return false;
            }
            StatementFinancing statementFinancing = (StatementFinancing) obj2;
            return Intrinsics.f(this.f69353a, statementFinancing.f69353a) && Intrinsics.f(this.f69354b, statementFinancing.f69354b);
        }

        public final int hashCode() {
            return this.f69354b.hashCode() + (this.f69353a.hashCode() * 31);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF69354b() {
            return this.f69354b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69353a);
            dest.writeString(this.f69354b);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF69353a() {
            return this.f69353a;
        }
    }

    /* JADX INFO: renamed from: n0 */
    String getF69354b();

    /* JADX INFO: renamed from: y */
    String getF69353a();
}
