package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanResult;", "Lcom/revolut/feature/checkout/models/PreorderResult;", "<init>", "()V", "Preordered", "Subscribed", "Error", "Lcom/revolut/feature/checkout/models/PreorderPlanResult$Error;", "Lcom/revolut/feature/checkout/models/PreorderPlanResult$Preordered;", "Lcom/revolut/feature/checkout/models/PreorderPlanResult$Subscribed;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreorderPlanResult implements PreorderResult {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanResult$Error;", "Lcom/revolut/feature/checkout/models/PreorderPlanResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends PreorderPlanResult {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f65873a;

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
            this.f65873a = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f65873a, ((Error) obj2).f65873a);
        }

        public final int hashCode() {
            return this.f65873a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65873a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanResult$Preordered;", "Lcom/revolut/feature/checkout/models/PreorderPlanResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Preordered extends PreorderPlanResult {

        @NotNull
        public static final Parcelable.Creator<Preordered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Instant f65876c;
        public final PreorderPreconditions d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Preordered(parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : PreorderPreconditions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preordered[i];
            }
        }

        public Preordered(String preorderId, String planId, Instant instant, PreorderPreconditions preorderPreconditions) {
            Intrinsics.checkNotNullParameter(preorderId, "preorderId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f65874a = preorderId;
            this.f65875b = planId;
            this.f65876c = instant;
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
            return Intrinsics.f(this.f65874a, preordered.f65874a) && Intrinsics.f(this.f65875b, preordered.f65875b) && Intrinsics.f(this.f65876c, preordered.f65876c) && Intrinsics.f(this.d, preordered.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f65874a.hashCode() * 31, 31, this.f65875b);
            Instant instant = this.f65876c;
            int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
            PreorderPreconditions preorderPreconditions = this.d;
            return iHashCode + (preorderPreconditions != null ? preorderPreconditions.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65874a);
            dest.writeString(this.f65875b);
            dest.writeSerializable(this.f65876c);
            PreorderPreconditions preorderPreconditions = this.d;
            if (preorderPreconditions == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                preorderPreconditions.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanResult$Subscribed;", "Lcom/revolut/feature/checkout/models/PreorderPlanResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscribed extends PreorderPlanResult {

        @NotNull
        public static final Parcelable.Creator<Subscribed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65877a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subscribed(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscribed[i];
            }
        }

        public Subscribed(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f65877a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Subscribed) && Intrinsics.f(this.f65877a, ((Subscribed) obj2).f65877a);
        }

        public final int hashCode() {
            return this.f65877a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65877a);
        }
    }

    private PreorderPlanResult() {
    }
}
