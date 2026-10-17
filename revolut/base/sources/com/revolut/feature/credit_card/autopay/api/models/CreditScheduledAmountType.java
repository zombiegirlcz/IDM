package com.revolut.feature.credit_card.autopay.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "<init>", "()V", "Statement", "Minimum", "Fixed", "Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType$Fixed;", "Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType$Minimum;", "Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType$Statement;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditScheduledAmountType implements Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType$Fixed;", "Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fixed extends CreditScheduledAmountType {

        @NotNull
        public static final Parcelable.Creator<Fixed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f70684a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fixed((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fixed[i];
            }
        }

        public Fixed(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f70684a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Fixed) && Intrinsics.f(this.f70684a, ((Fixed) obj2).f70684a);
        }

        public final int hashCode() {
            return this.f70684a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70684a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType$Minimum;", "Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType;", "<init>", "()V", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Minimum extends CreditScheduledAmountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Minimum f70685a = new Minimum();

        @NotNull
        public static final Parcelable.Creator<Minimum> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Minimum.f70685a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Minimum[i];
            }
        }

        private Minimum() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType$Statement;", "Lcom/revolut/feature/credit_card/autopay/api/models/CreditScheduledAmountType;", "<init>", "()V", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Statement extends CreditScheduledAmountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Statement f70686a = new Statement();

        @NotNull
        public static final Parcelable.Creator<Statement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Statement.f70686a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Statement[i];
            }
        }

        private Statement() {
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

    private CreditScheduledAmountType() {
    }
}
