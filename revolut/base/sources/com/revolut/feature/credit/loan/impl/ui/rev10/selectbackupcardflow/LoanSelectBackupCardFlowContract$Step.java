package com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Article", "ToggleBackupCard", "SelectNewCard", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step$Article;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step$SelectNewCard;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step$ToggleBackupCard;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanSelectBackupCardFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step$Article;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Article extends LoanSelectBackupCardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Article f70591a = new Article();

        @NotNull
        public static final Parcelable.Creator<Article> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Article.f70591a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Article[i];
            }
        }

        private Article() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step$SelectNewCard;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectNewCard extends LoanSelectBackupCardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectNewCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanBackupCard f70592a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectNewCard((LoanBackupCard) parcel.readParcelable(SelectNewCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectNewCard[i];
            }
        }

        public SelectNewCard(LoanBackupCard backupCard) {
            Intrinsics.checkNotNullParameter(backupCard, "backupCard");
            this.f70592a = backupCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectNewCard) && Intrinsics.f(this.f70592a, ((SelectNewCard) obj2).f70592a);
        }

        public final int hashCode() {
            return this.f70592a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70592a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step$ToggleBackupCard;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ToggleBackupCard extends LoanSelectBackupCardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToggleBackupCard f70593a = new ToggleBackupCard();

        @NotNull
        public static final Parcelable.Creator<ToggleBackupCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ToggleBackupCard.f70593a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToggleBackupCard[i];
            }
        }

        private ToggleBackupCard() {
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

    private LoanSelectBackupCardFlowContract$Step() {
    }
}
