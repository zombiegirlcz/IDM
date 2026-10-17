package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/domain/model/NewTicketContext;", "Landroid/os/Parcelable;", "Transaction", "AssistantEscalation", "PrivateBankingEscalation", "Lcom/revolut/chat/domain/model/NewTicketContext$AssistantEscalation;", "Lcom/revolut/chat/domain/model/NewTicketContext$PrivateBankingEscalation;", "Lcom/revolut/chat/domain/model/NewTicketContext$Transaction;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NewTicketContext extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/NewTicketContext$AssistantEscalation;", "Lcom/revolut/chat/domain/model/NewTicketContext;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssistantEscalation implements NewTicketContext {

        @NotNull
        public static final Parcelable.Creator<AssistantEscalation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51061b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssistantEscalation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssistantEscalation[i];
            }
        }

        public AssistantEscalation(String fromTicketId, String fromMessageId) {
            Intrinsics.checkNotNullParameter(fromTicketId, "fromTicketId");
            Intrinsics.checkNotNullParameter(fromMessageId, "fromMessageId");
            this.f51060a = fromTicketId;
            this.f51061b = fromMessageId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AssistantEscalation)) {
                return false;
            }
            AssistantEscalation assistantEscalation = (AssistantEscalation) obj2;
            return Intrinsics.f(this.f51060a, assistantEscalation.f51060a) && Intrinsics.f(this.f51061b, assistantEscalation.f51061b);
        }

        public final int hashCode() {
            return this.f51061b.hashCode() + (this.f51060a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51060a);
            dest.writeString(this.f51061b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/NewTicketContext$PrivateBankingEscalation;", "Lcom/revolut/chat/domain/model/NewTicketContext;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrivateBankingEscalation implements NewTicketContext {

        @NotNull
        public static final Parcelable.Creator<PrivateBankingEscalation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51064c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateBankingEscalation(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankingEscalation[i];
            }
        }

        public PrivateBankingEscalation(String fromFeedId, String fromMessageId, String fromEntryPoint) {
            Intrinsics.checkNotNullParameter(fromFeedId, "fromFeedId");
            Intrinsics.checkNotNullParameter(fromMessageId, "fromMessageId");
            Intrinsics.checkNotNullParameter(fromEntryPoint, "fromEntryPoint");
            this.f51062a = fromFeedId;
            this.f51063b = fromMessageId;
            this.f51064c = fromEntryPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrivateBankingEscalation)) {
                return false;
            }
            PrivateBankingEscalation privateBankingEscalation = (PrivateBankingEscalation) obj2;
            return Intrinsics.f(this.f51062a, privateBankingEscalation.f51062a) && Intrinsics.f(this.f51063b, privateBankingEscalation.f51063b) && Intrinsics.f(this.f51064c, privateBankingEscalation.f51064c);
        }

        public final int hashCode() {
            return this.f51064c.hashCode() + p.a.c(this.f51062a.hashCode() * 31, 31, this.f51063b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51062a);
            dest.writeString(this.f51063b);
            dest.writeString(this.f51064c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/NewTicketContext$Transaction;", "Lcom/revolut/chat/domain/model/NewTicketContext;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transaction implements NewTicketContext {

        @NotNull
        public static final Parcelable.Creator<Transaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51065a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transaction(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transaction[i];
            }
        }

        public Transaction(String transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f51065a = transactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transaction) && Intrinsics.f(this.f51065a, ((Transaction) obj2).f51065a);
        }

        public final int hashCode() {
            return this.f51065a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51065a);
        }
    }
}
