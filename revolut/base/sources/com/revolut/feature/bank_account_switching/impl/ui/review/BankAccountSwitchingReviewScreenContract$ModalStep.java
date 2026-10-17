package com.revolut.feature.bank_account_switching.impl.ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.domain.RequestStatus$Link;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.domain.TermsStep;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TermsAndConditions", "LtdConfirmation", "LinkList", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep$LinkList;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep$LtdConfirmation;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep$TermsAndConditions;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankAccountSwitchingReviewScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep$LinkList;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkList implements BankAccountSwitchingReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LinkList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f63964a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(RequestStatus$Link.CREATOR, parcel, arrayList, iA, 1);
                }
                return new LinkList(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkList[i];
            }
        }

        public LinkList(List links) {
            Intrinsics.checkNotNullParameter(links, "links");
            this.f63964a = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkList) && Intrinsics.f(this.f63964a, ((LinkList) obj2).f63964a);
        }

        public final int hashCode() {
            return this.f63964a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f63964a, dest);
            while (itV.hasNext()) {
                ((RequestStatus$Link) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep$LtdConfirmation;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LtdConfirmation implements BankAccountSwitchingReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LtdConfirmation f63965a = new LtdConfirmation();

        @NotNull
        public static final Parcelable.Creator<LtdConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LtdConfirmation.f63965a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LtdConfirmation[i];
            }
        }

        private LtdConfirmation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep$TermsAndConditions;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions implements BankAccountSwitchingReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f63966a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TermsStep.CREATOR, parcel, arrayList, iA, 1);
                }
                return new TermsAndConditions(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        public TermsAndConditions(List terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f63966a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsAndConditions) && Intrinsics.f(this.f63966a, ((TermsAndConditions) obj2).f63966a);
        }

        public final int hashCode() {
            return this.f63966a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f63966a, dest);
            while (itV.hasNext()) {
                ((TermsStep) itV.next()).writeToParcel(dest, i);
            }
        }
    }
}
