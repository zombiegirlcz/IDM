package com.revolut.feature.apm.blik.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BlikCodeStep", "TermsAcceptanceStep", "LoadingStep", "BlikConfirmationStep", "RemediationPendingPrompt", "NewContact", "RecipientList", "P2PTerms", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$BlikCodeStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$BlikConfirmationStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$LoadingStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$P2PTerms;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$RecipientList;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$RemediationPendingPrompt;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$TermsAcceptanceStep;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlikFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$BlikCodeStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlikCodeStep extends BlikFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlikCodeStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f61672a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlikCodeStep((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlikCodeStep[i];
            }
        }

        public BlikCodeStep(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f61672a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlikCodeStep) && Intrinsics.f(this.f61672a, ((BlikCodeStep) obj2).f61672a);
        }

        public final int hashCode() {
            return this.f61672a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f61672a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$LoadingStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "<init>", "()V", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoadingStep extends BlikFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadingStep f61674a = new LoadingStep();

        @NotNull
        public static final Parcelable.Creator<LoadingStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoadingStep.f61674a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadingStep[i];
            }
        }

        private LoadingStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "<init>", "()V", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact extends BlikFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f61675a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f61675a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        private NewContact() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$P2PTerms;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class P2PTerms extends BlikFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<P2PTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f61676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BlikFlowContract$Step f61677b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(P2PTerms.class, parcel, arrayList, iE, 1);
                }
                return new P2PTerms(arrayList, (BlikFlowContract$Step) parcel.readParcelable(P2PTerms.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new P2PTerms[i];
            }
        }

        public P2PTerms(List terms, BlikFlowContract$Step nextStep) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.f61676a = terms;
            this.f61677b = nextStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof P2PTerms)) {
                return false;
            }
            P2PTerms p2PTerms = (P2PTerms) obj2;
            return Intrinsics.f(this.f61676a, p2PTerms.f61676a) && Intrinsics.f(this.f61677b, p2PTerms.f61677b);
        }

        public final int hashCode() {
            return this.f61677b.hashCode() + (this.f61676a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f61676a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f61677b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$RecipientList;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "<init>", "()V", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientList extends BlikFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientList f61678a = new RecipientList();

        @NotNull
        public static final Parcelable.Creator<RecipientList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientList.f61678a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientList[i];
            }
        }

        private RecipientList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$RemediationPendingPrompt;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "<init>", "()V", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemediationPendingPrompt extends BlikFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemediationPendingPrompt f61679a = new RemediationPendingPrompt();

        @NotNull
        public static final Parcelable.Creator<RemediationPendingPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemediationPendingPrompt.f61679a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemediationPendingPrompt[i];
            }
        }

        private RemediationPendingPrompt() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$TermsAcceptanceStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsAcceptanceStep extends BlikFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TermsAcceptanceStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f61680a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TermsAcceptanceStep.class, parcel, arrayList, iE, 1);
                }
                return new TermsAcceptanceStep(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAcceptanceStep[i];
            }
        }

        public TermsAcceptanceStep(ArrayList terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f61680a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsAcceptanceStep) && this.f61680a.equals(((TermsAcceptanceStep) obj2).f61680a);
        }

        public final int hashCode() {
            return this.f61680a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f61680a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private BlikFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step$BlikConfirmationStep;", "Lcom/revolut/feature/apm/blik/impl/ui/flow/BlikFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlikConfirmationStep extends BlikFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlikConfirmationStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61673a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlikConfirmationStep(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlikConfirmationStep[i];
            }
        }

        public BlikConfirmationStep(String str) {
            this.f61673a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlikConfirmationStep) && Intrinsics.f(this.f61673a, ((BlikConfirmationStep) obj2).f61673a);
        }

        public final int hashCode() {
            String str = this.f61673a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61673a);
        }

        public BlikConfirmationStep() {
            this(null);
        }
    }
}
