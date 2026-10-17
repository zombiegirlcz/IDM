package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import h93.f0;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderCardResult;", "Lcom/revolut/feature/checkout/models/PreorderResult;", "<init>", "()V", "Preordered", "CardIssued", "Error", "Lcom/revolut/feature/checkout/models/PreorderCardResult$CardIssued;", "Lcom/revolut/feature/checkout/models/PreorderCardResult$Error;", "Lcom/revolut/feature/checkout/models/PreorderCardResult$Preordered;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreorderCardResult implements PreorderResult {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderCardResult$CardIssued;", "Lcom/revolut/feature/checkout/models/PreorderCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardIssued extends PreorderCardResult {

        @NotNull
        public static final Parcelable.Creator<CardIssued> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f65854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65855b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardIssued((f0) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardIssued[i];
            }
        }

        public CardIssued(f0 card, String str) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.f65854a = card;
            this.f65855b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardIssued)) {
                return false;
            }
            CardIssued cardIssued = (CardIssued) obj2;
            return Intrinsics.f(this.f65854a, cardIssued.f65854a) && Intrinsics.f(this.f65855b, cardIssued.f65855b);
        }

        public final int hashCode() {
            int iHashCode = this.f65854a.hashCode() * 31;
            String str = this.f65855b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65854a);
            dest.writeString(this.f65855b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderCardResult$Error;", "Lcom/revolut/feature/checkout/models/PreorderCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends PreorderCardResult {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f65856a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f65856a = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f65856a, ((Error) obj2).f65856a);
        }

        public final int hashCode() {
            return this.f65856a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65856a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderCardResult$Preordered;", "Lcom/revolut/feature/checkout/models/PreorderCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Preordered extends PreorderCardResult {

        @NotNull
        public static final Parcelable.Creator<Preordered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f65858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Instant f65859c;
        public final PreorderPreconditions d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Preordered(parcel.readString(), (f0) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : PreorderPreconditions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preordered[i];
            }
        }

        public Preordered(String preorderId, f0 card, Instant instant, PreorderPreconditions preorderPreconditions) {
            Intrinsics.checkNotNullParameter(preorderId, "preorderId");
            Intrinsics.checkNotNullParameter(card, "card");
            this.f65857a = preorderId;
            this.f65858b = card;
            this.f65859c = instant;
            this.d = preorderPreconditions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Preordered)) {
                return false;
            }
            Preordered preordered = (Preordered) obj2;
            return Intrinsics.f(this.f65857a, preordered.f65857a) && Intrinsics.f(this.f65858b, preordered.f65858b) && Intrinsics.f(this.f65859c, preordered.f65859c) && Intrinsics.f(this.d, preordered.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f65858b.hashCode() + (this.f65857a.hashCode() * 31)) * 31;
            Instant instant = this.f65859c;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            PreorderPreconditions preorderPreconditions = this.d;
            return iHashCode2 + (preorderPreconditions != null ? preorderPreconditions.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65857a);
            dest.writeSerializable(this.f65858b);
            dest.writeSerializable(this.f65859c);
            PreorderPreconditions preorderPreconditions = this.d;
            if (preorderPreconditions == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                preorderPreconditions.writeToParcel(dest, i);
            }
        }
    }

    private PreorderCardResult() {
    }
}
