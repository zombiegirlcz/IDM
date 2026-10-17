package com.revolut.feature.payments.splitbill.models.splitbilllink;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState;", "Landroid/os/Parcelable;", "Shareable", "Expired", "Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState$Expired;", "Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState$Shareable;", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillQrState extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState$Expired;", "Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expired implements SplitBillQrState {

        @NotNull
        public static final Parcelable.Creator<Expired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitBillLink f79949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a3 f79950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f79951c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SplitBillLink splitBillLinkCreateFromParcel = SplitBillLink.CREATOR.createFromParcel(parcel);
                a3 a3Var = (a3) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Expired(splitBillLinkCreateFromParcel, a3Var, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expired[i];
            }
        }

        public Expired(SplitBillLink splitBillLink, a3 transaction, List relatedTransactions) {
            Intrinsics.checkNotNullParameter(splitBillLink, "splitBillLink");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
            this.f79949a = splitBillLink;
            this.f79950b = transaction;
            this.f79951c = relatedTransactions;
        }

        @Override // com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState
        /* JADX INFO: renamed from: F1, reason: from getter */
        public final List getF79954c() {
            return this.f79951c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Expired)) {
                return false;
            }
            Expired expired = (Expired) obj2;
            return Intrinsics.f(this.f79949a, expired.f79949a) && Intrinsics.f(this.f79950b, expired.f79950b) && Intrinsics.f(this.f79951c, expired.f79951c);
        }

        @Override // com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState
        /* JADX INFO: renamed from: getTransaction, reason: from getter */
        public final a3 getF79953b() {
            return this.f79950b;
        }

        public final int hashCode() {
            return this.f79951c.hashCode() + y.f(this.f79950b, this.f79949a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79949a.writeToParcel(dest, i);
            dest.writeSerializable(this.f79950b);
            Iterator itV = p.a.v(this.f79951c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState$Shareable;", "Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillQrState;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Shareable implements SplitBillQrState {

        @NotNull
        public static final Parcelable.Creator<Shareable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitBillLink f79952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a3 f79953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f79954c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SplitBillLink splitBillLinkCreateFromParcel = SplitBillLink.CREATOR.createFromParcel(parcel);
                a3 a3Var = (a3) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Shareable(splitBillLinkCreateFromParcel, a3Var, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Shareable[i];
            }
        }

        public Shareable(SplitBillLink splitBillLink, a3 transaction, List relatedTransactions) {
            Intrinsics.checkNotNullParameter(splitBillLink, "splitBillLink");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
            this.f79952a = splitBillLink;
            this.f79953b = transaction;
            this.f79954c = relatedTransactions;
        }

        @Override // com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState
        /* JADX INFO: renamed from: F1, reason: from getter */
        public final List getF79954c() {
            return this.f79954c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Shareable)) {
                return false;
            }
            Shareable shareable = (Shareable) obj2;
            return Intrinsics.f(this.f79952a, shareable.f79952a) && Intrinsics.f(this.f79953b, shareable.f79953b) && Intrinsics.f(this.f79954c, shareable.f79954c);
        }

        @Override // com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState
        /* JADX INFO: renamed from: getTransaction, reason: from getter */
        public final a3 getF79953b() {
            return this.f79953b;
        }

        public final int hashCode() {
            return this.f79954c.hashCode() + y.f(this.f79953b, this.f79952a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79952a.writeToParcel(dest, i);
            dest.writeSerializable(this.f79953b);
            Iterator itV = p.a.v(this.f79954c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    List getF79954c();

    /* JADX INFO: renamed from: getTransaction */
    a3 getF79953b();
}
