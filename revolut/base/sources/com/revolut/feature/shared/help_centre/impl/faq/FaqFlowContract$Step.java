package com.revolut.feature.shared.help_centre.impl.faq;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Search", "TopLevelFaq", "FaqList", "FaqArticle", "EditFaqFeedback", "FormChooser", "SomethingElse", "LoadExplicit", "CardsTroubleshooter", "SeeAllCards", "CardTroubleshooter", "TransactionsTroubleshooterByFaqKey", "AllUpcomingTransactions", "UpcomingTransactionTroubleshooter", "TransactionTroubleshooterActions", "InboundCall", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$AllUpcomingTransactions;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$CardTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$CardsTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$EditFaqFeedback;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FormChooser;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$LoadExplicit;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$Search;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$SeeAllCards;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$SomethingElse;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$TopLevelFaq;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$TransactionTroubleshooterActions;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$TransactionsTroubleshooterByFaqKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$UpcomingTransactionTroubleshooter;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FaqFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$AllUpcomingTransactions;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllUpcomingTransactions extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AllUpcomingTransactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FaqNodeBase f86163a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllUpcomingTransactions((FaqNodeBase) parcel.readParcelable(AllUpcomingTransactions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllUpcomingTransactions[i];
            }
        }

        public AllUpcomingTransactions(FaqNodeBase faqNodeBase) {
            this.f86163a = faqNodeBase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AllUpcomingTransactions) && Intrinsics.f(this.f86163a, ((AllUpcomingTransactions) obj2).f86163a);
        }

        public final int hashCode() {
            FaqNodeBase faqNodeBase = this.f86163a;
            if (faqNodeBase == null) {
                return 0;
            }
            return faqNodeBase.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86163a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$CardTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTroubleshooter extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardTroubleshooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86166c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTroubleshooter(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTroubleshooter[i];
            }
        }

        public CardTroubleshooter(String cardId, String str, boolean z) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f86164a = cardId;
            this.f86165b = str;
            this.f86166c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardTroubleshooter)) {
                return false;
            }
            CardTroubleshooter cardTroubleshooter = (CardTroubleshooter) obj2;
            return Intrinsics.f(this.f86164a, cardTroubleshooter.f86164a) && Intrinsics.f(this.f86165b, cardTroubleshooter.f86165b) && this.f86166c == cardTroubleshooter.f86166c;
        }

        public final int hashCode() {
            int iHashCode = this.f86164a.hashCode() * 31;
            String str = this.f86165b;
            return Boolean.hashCode(this.f86166c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86164a);
            dest.writeString(this.f86165b);
            dest.writeInt(this.f86166c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$CardsTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardsTroubleshooter extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardsTroubleshooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86167a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardsTroubleshooter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardsTroubleshooter[i];
            }
        }

        public CardsTroubleshooter(String str) {
            this.f86167a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardsTroubleshooter) && Intrinsics.f(this.f86167a, ((CardsTroubleshooter) obj2).f86167a);
        }

        public final int hashCode() {
            String str = this.f86167a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86167a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$EditFaqFeedback;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditFaqFeedback extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditFaqFeedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Feedback f86168a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditFaqFeedback((Feedback) parcel.readParcelable(EditFaqFeedback.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditFaqFeedback[i];
            }
        }

        public EditFaqFeedback(Feedback feedback) {
            Intrinsics.checkNotNullParameter(feedback, "feedback");
            this.f86168a = feedback;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditFaqFeedback) && Intrinsics.f(this.f86168a, ((EditFaqFeedback) obj2).f86168a);
        }

        public final int hashCode() {
            return this.f86168a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86168a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "<init>", "()V", "ByKey", "ByNode", "TransactionTroubleshooter", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle$ByKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle$ByNode;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle$TransactionTroubleshooter;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class FaqArticle extends FaqFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle$ByKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByKey extends FaqArticle {

            @NotNull
            public static final Parcelable.Creator<ByKey> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86169a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86170b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByKey(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByKey[i];
                }
            }

            public ByKey(String faqKey, String str) {
                Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                this.f86169a = faqKey;
                this.f86170b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ByKey)) {
                    return false;
                }
                ByKey byKey = (ByKey) obj2;
                return Intrinsics.f(this.f86169a, byKey.f86169a) && Intrinsics.f(this.f86170b, byKey.f86170b);
            }

            public final int hashCode() {
                int iHashCode = this.f86169a.hashCode() * 31;
                String str = this.f86170b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86169a);
                dest.writeString(this.f86170b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle$ByNode;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByNode extends FaqArticle {

            @NotNull
            public static final Parcelable.Creator<ByNode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FaqNodeBase f86171a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByNode((FaqNodeBase) parcel.readParcelable(ByNode.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByNode[i];
                }
            }

            public ByNode(FaqNodeBase node) {
                Intrinsics.checkNotNullParameter(node, "node");
                this.f86171a = node;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ByNode) && Intrinsics.f(this.f86171a, ((ByNode) obj2).f86171a);
            }

            public final int hashCode() {
                return this.f86171a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86171a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle$TransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqArticle;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransactionTroubleshooter extends FaqArticle {

            @NotNull
            public static final Parcelable.Creator<TransactionTroubleshooter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86173b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TransactionTroubleshooter(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TransactionTroubleshooter[i];
                }
            }

            public TransactionTroubleshooter(String faqEntryKey, String faqEntryTitle) {
                Intrinsics.checkNotNullParameter(faqEntryKey, "faqEntryKey");
                Intrinsics.checkNotNullParameter(faqEntryTitle, "faqEntryTitle");
                this.f86172a = faqEntryKey;
                this.f86173b = faqEntryTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TransactionTroubleshooter)) {
                    return false;
                }
                TransactionTroubleshooter transactionTroubleshooter = (TransactionTroubleshooter) obj2;
                return Intrinsics.f(this.f86172a, transactionTroubleshooter.f86172a) && Intrinsics.f(this.f86173b, transactionTroubleshooter.f86173b);
            }

            public final int hashCode() {
                return this.f86173b.hashCode() + (this.f86172a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86172a);
                dest.writeString(this.f86173b);
            }
        }

        private FaqArticle() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "<init>", "()V", "ByKey", "ByNode", "ByDisplayableItems", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList$ByDisplayableItems;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList$ByKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList$ByNode;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class FaqList extends FaqFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList$ByDisplayableItems;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByDisplayableItems extends FaqList {

            @NotNull
            public static final Parcelable.Creator<ByDisplayableItems> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f86174a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f86175b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f86176c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Clause clause = (Clause) j6.a.f(parcel, "parcel", ByDisplayableItems.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(ByDisplayableItems.class, parcel, arrayList, iE, 1);
                    }
                    return new ByDisplayableItems(clause, parcel.readString(), arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByDisplayableItems[i];
                }
            }

            public ByDisplayableItems(Clause title, String analyticsContextId, List items) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(analyticsContextId, "analyticsContextId");
                this.f86174a = title;
                this.f86175b = items;
                this.f86176c = analyticsContextId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ByDisplayableItems)) {
                    return false;
                }
                ByDisplayableItems byDisplayableItems = (ByDisplayableItems) obj2;
                return Intrinsics.f(this.f86174a, byDisplayableItems.f86174a) && Intrinsics.f(this.f86175b, byDisplayableItems.f86175b) && Intrinsics.f(this.f86176c, byDisplayableItems.f86176c);
            }

            public final int hashCode() {
                return this.f86176c.hashCode() + p.a.d(this.f86174a.hashCode() * 31, 31, this.f86175b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86174a, i);
                Iterator itV = p.a.v(this.f86175b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                dest.writeString(this.f86176c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList$ByKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByKey extends FaqList {

            @NotNull
            public static final Parcelable.Creator<ByKey> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86177a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f86178b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByKey(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByKey[i];
                }
            }

            public ByKey(String faqKey, List list) {
                Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                this.f86177a = faqKey;
                this.f86178b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ByKey)) {
                    return false;
                }
                ByKey byKey = (ByKey) obj2;
                return Intrinsics.f(this.f86177a, byKey.f86177a) && Intrinsics.f(this.f86178b, byKey.f86178b);
            }

            public final int hashCode() {
                int iHashCode = this.f86177a.hashCode() * 31;
                List list = this.f86178b;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86177a);
                dest.writeStringList(this.f86178b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList$ByNode;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FaqList;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByNode extends FaqList {

            @NotNull
            public static final Parcelable.Creator<ByNode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FaqNodeBase f86179a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f86180b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByNode((FaqNodeBase) parcel.readParcelable(ByNode.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByNode[i];
                }
            }

            public ByNode(FaqNodeBase node, boolean z) {
                Intrinsics.checkNotNullParameter(node, "node");
                this.f86179a = node;
                this.f86180b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ByNode)) {
                    return false;
                }
                ByNode byNode = (ByNode) obj2;
                return Intrinsics.f(this.f86179a, byNode.f86179a) && this.f86180b == byNode.f86180b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f86180b) + (this.f86179a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86179a, i);
                dest.writeInt(this.f86180b ? 1 : 0);
            }
        }

        private FaqList() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$FormChooser;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormChooser extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FormChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f86182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f86183c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(FormChooser.class, parcel, arrayList2, iE2, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i2);
                    while (iE != i2) {
                        iE = j6.a.e(FormChooser.class, parcel, arrayList3, iE, 1);
                    }
                    arrayList = arrayList3;
                }
                return new FormChooser(string, arrayList2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FormChooser[i];
            }
        }

        public FormChooser(String str, List formActions, List list) {
            Intrinsics.checkNotNullParameter(formActions, "formActions");
            this.f86181a = str;
            this.f86182b = formActions;
            this.f86183c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FormChooser)) {
                return false;
            }
            FormChooser formChooser = (FormChooser) obj2;
            return Intrinsics.f(this.f86181a, formChooser.f86181a) && Intrinsics.f(this.f86182b, formChooser.f86182b) && Intrinsics.f(this.f86183c, formChooser.f86183c);
        }

        public final int hashCode() {
            String str = this.f86181a;
            int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f86182b);
            List list = this.f86183c;
            return iD + (list != null ? list.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86181a);
            Iterator itV = p.a.v(this.f86182b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            List list = this.f86183c;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "<init>", "()V", "CreateNewTicket", "UseExistingTicket", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall$CreateNewTicket;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall$UseExistingTicket;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class InboundCall extends FaqFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall$CreateNewTicket;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreateNewTicket extends InboundCall {

            @NotNull
            public static final Parcelable.Creator<CreateNewTicket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86184a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreateNewTicket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreateNewTicket[i];
                }
            }

            public CreateNewTicket(String category) {
                Intrinsics.checkNotNullParameter(category, "category");
                this.f86184a = category;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CreateNewTicket) && Intrinsics.f(this.f86184a, ((CreateNewTicket) obj2).f86184a);
            }

            public final int hashCode() {
                return this.f86184a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86184a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall$UseExistingTicket;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$InboundCall;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UseExistingTicket extends InboundCall {

            @NotNull
            public static final Parcelable.Creator<UseExistingTicket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UUID f86185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86186b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UseExistingTicket((UUID) parcel.readSerializable(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UseExistingTicket[i];
                }
            }

            public UseExistingTicket(UUID ticketId, String str) {
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                this.f86185a = ticketId;
                this.f86186b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UseExistingTicket)) {
                    return false;
                }
                UseExistingTicket useExistingTicket = (UseExistingTicket) obj2;
                return Intrinsics.f(this.f86185a, useExistingTicket.f86185a) && Intrinsics.f(this.f86186b, useExistingTicket.f86186b);
            }

            public final int hashCode() {
                int iHashCode = this.f86185a.hashCode() * 31;
                String str = this.f86186b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f86185a);
                dest.writeString(this.f86186b);
            }
        }

        private InboundCall() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$LoadExplicit;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class LoadExplicit extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LoadExplicit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f86188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NewTicketContext f86189c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoadExplicit(parcel.readString(), parcel.createStringArrayList(), (NewTicketContext) parcel.readParcelable(LoadExplicit.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadExplicit[i];
            }
        }

        public LoadExplicit(String key, List fallbackKeys, NewTicketContext newTicketContext, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(fallbackKeys, "fallbackKeys");
            this.f86187a = key;
            this.f86188b = fallbackKeys;
            this.f86189c = newTicketContext;
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
            if (!(obj2 instanceof LoadExplicit)) {
                return false;
            }
            LoadExplicit loadExplicit = (LoadExplicit) obj2;
            return Intrinsics.f(this.f86187a, loadExplicit.f86187a) && Intrinsics.f(this.f86188b, loadExplicit.f86188b) && Intrinsics.f(this.f86189c, loadExplicit.f86189c) && this.d == loadExplicit.d;
        }

        public final int hashCode() {
            int iD = p.a.d(this.f86187a.hashCode() * 31, 31, this.f86188b);
            NewTicketContext newTicketContext = this.f86189c;
            return Boolean.hashCode(this.d) + ((iD + (newTicketContext == null ? 0 : newTicketContext.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86187a);
            dest.writeStringList(this.f86188b);
            dest.writeParcelable(this.f86189c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$SeeAllCards;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAllCards extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SeeAllCards> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86191a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SeeAllCards(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllCards[i];
            }
        }

        public SeeAllCards(String str) {
            this.f86191a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SeeAllCards) && Intrinsics.f(this.f86191a, ((SeeAllCards) obj2).f86191a);
        }

        public final int hashCode() {
            String str = this.f86191a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86191a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$SomethingElse;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SomethingElse extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SomethingElse> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86192a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SomethingElse(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SomethingElse[i];
            }
        }

        public SomethingElse(String str) {
            this.f86192a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SomethingElse) && Intrinsics.f(this.f86192a, ((SomethingElse) obj2).f86192a);
        }

        public final int hashCode() {
            String str = this.f86192a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86192a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$TransactionTroubleshooterActions;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionTroubleshooterActions extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionTroubleshooterActions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FaqNodeBase f86195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86196c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionTroubleshooterActions(parcel.readString(), (FaqNodeBase) parcel.readParcelable(TransactionTroubleshooterActions.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionTroubleshooterActions[i];
            }
        }

        public TransactionTroubleshooterActions(String transactionId, FaqNodeBase faqNodeBase, String filterKey, String title) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(filterKey, "filterKey");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86194a = transactionId;
            this.f86195b = faqNodeBase;
            this.f86196c = filterKey;
            this.d = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionTroubleshooterActions)) {
                return false;
            }
            TransactionTroubleshooterActions transactionTroubleshooterActions = (TransactionTroubleshooterActions) obj2;
            return Intrinsics.f(this.f86194a, transactionTroubleshooterActions.f86194a) && Intrinsics.f(this.f86195b, transactionTroubleshooterActions.f86195b) && Intrinsics.f(this.f86196c, transactionTroubleshooterActions.f86196c) && Intrinsics.f(this.d, transactionTroubleshooterActions.d);
        }

        public final int hashCode() {
            int iHashCode = this.f86194a.hashCode() * 31;
            FaqNodeBase faqNodeBase = this.f86195b;
            return this.d.hashCode() + p.a.c((iHashCode + (faqNodeBase == null ? 0 : faqNodeBase.hashCode())) * 31, 31, this.f86196c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86194a);
            dest.writeParcelable(this.f86195b, i);
            dest.writeString(this.f86196c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$TransactionsTroubleshooterByFaqKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionsTroubleshooterByFaqKey extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionsTroubleshooterByFaqKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j7d.a f86198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransactionTroubleshooterFilter f86199c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionsTroubleshooterByFaqKey(parcel.readString(), j7d.a.valueOf(parcel.readString()), (TransactionTroubleshooterFilter) parcel.readParcelable(TransactionsTroubleshooterByFaqKey.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsTroubleshooterByFaqKey[i];
            }
        }

        public TransactionsTroubleshooterByFaqKey(String str, j7d.a transactionListType, TransactionTroubleshooterFilter filter) {
            Intrinsics.checkNotNullParameter(transactionListType, "transactionListType");
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f86197a = str;
            this.f86198b = transactionListType;
            this.f86199c = filter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionsTroubleshooterByFaqKey)) {
                return false;
            }
            TransactionsTroubleshooterByFaqKey transactionsTroubleshooterByFaqKey = (TransactionsTroubleshooterByFaqKey) obj2;
            return Intrinsics.f(this.f86197a, transactionsTroubleshooterByFaqKey.f86197a) && this.f86198b == transactionsTroubleshooterByFaqKey.f86198b && Intrinsics.f(this.f86199c, transactionsTroubleshooterByFaqKey.f86199c);
        }

        public final int hashCode() {
            String str = this.f86197a;
            return this.f86199c.hashCode() + ((this.f86198b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86197a);
            dest.writeString(this.f86198b.name());
            dest.writeParcelable(this.f86199c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$UpcomingTransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingTransactionTroubleshooter extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpcomingTransactionTroubleshooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FaqNodeBase f86201b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpcomingTransactionTroubleshooter(parcel.readString(), (FaqNodeBase) parcel.readParcelable(UpcomingTransactionTroubleshooter.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpcomingTransactionTroubleshooter[i];
            }
        }

        public UpcomingTransactionTroubleshooter(String transactionId, FaqNodeBase faqNodeBase) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f86200a = transactionId;
            this.f86201b = faqNodeBase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpcomingTransactionTroubleshooter)) {
                return false;
            }
            UpcomingTransactionTroubleshooter upcomingTransactionTroubleshooter = (UpcomingTransactionTroubleshooter) obj2;
            return Intrinsics.f(this.f86200a, upcomingTransactionTroubleshooter.f86200a) && Intrinsics.f(this.f86201b, upcomingTransactionTroubleshooter.f86201b);
        }

        public final int hashCode() {
            int iHashCode = this.f86200a.hashCode() * 31;
            FaqNodeBase faqNodeBase = this.f86201b;
            return iHashCode + (faqNodeBase == null ? 0 : faqNodeBase.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86200a);
            dest.writeParcelable(this.f86201b, i);
        }
    }

    private FaqFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$Search;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Search extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86190a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Search(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        public Search(String str) {
            this.f86190a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Search) && Intrinsics.f(this.f86190a, ((Search) obj2).f86190a);
        }

        public final int hashCode() {
            String str = this.f86190a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86190a);
        }

        public Search() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step$TopLevelFaq;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopLevelFaq extends FaqFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopLevelFaq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f86193a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new TopLevelFaq(null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopLevelFaq[i];
            }
        }

        public TopLevelFaq(List list) {
            this.f86193a = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TopLevelFaq) && Intrinsics.f(this.f86193a, ((TopLevelFaq) obj2).f86193a);
        }

        public final int hashCode() {
            List list = this.f86193a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        public TopLevelFaq() {
            this(null);
        }
    }
}
