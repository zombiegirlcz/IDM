package com.revolut.feature.shared.recurring_payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ibd.j;
import ip0.v7;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "<init>", "()V", "DropsBelow", "Exceeds", "Limit", "ibd/j", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$DropsBelow;", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$Exceeds;", "feature_shared_recurring_payments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WalletAutomation implements Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$DropsBelow;", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "", "toString", "()Ljava/lang/String;", "feature_shared_recurring_payments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropsBelow extends WalletAutomation {

        @NotNull
        public static final Parcelable.Creator<DropsBelow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f86443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f86444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86445c;
        public final String d;
        public final Limit e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropsBelow((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropsBelow[i];
            }
        }

        public DropsBelow(d topupAmount, d threshold, String monitoredPocket, String topupFrom, Limit limit) {
            Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(topupFrom, "topupFrom");
            this.f86443a = topupAmount;
            this.f86444b = threshold;
            this.f86445c = monitoredPocket;
            this.d = topupFrom;
            this.e = limit;
        }

        @Override // com.revolut.feature.shared.recurring_payments.models.WalletAutomation
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Limit getD() {
            return this.e;
        }

        @Override // com.revolut.feature.shared.recurring_payments.models.WalletAutomation
        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getF86446a() {
            return this.f86444b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropsBelow)) {
                return false;
            }
            DropsBelow dropsBelow = (DropsBelow) obj2;
            return Intrinsics.f(this.f86443a, dropsBelow.f86443a) && Intrinsics.f(this.f86444b, dropsBelow.f86444b) && Intrinsics.f(this.f86445c, dropsBelow.f86445c) && Intrinsics.f(this.d, dropsBelow.d) && Intrinsics.f(this.e, dropsBelow.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(v7.c(this.f86443a.hashCode() * 31, 31, this.f86444b), 31, this.f86445c), 31, this.d);
            Limit limit = this.e;
            return iC + (limit == null ? 0 : limit.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86443a);
            dest.writeSerializable(this.f86444b);
            dest.writeString(this.f86445c);
            dest.writeString(this.d);
            Limit limit = this.e;
            if (limit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                limit.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$Exceeds;", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "", "toString", "()Ljava/lang/String;", "feature_shared_recurring_payments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exceeds extends WalletAutomation {

        @NotNull
        public static final Parcelable.Creator<Exceeds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f86446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86448c;
        public final Limit d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exceeds((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exceeds[i];
            }
        }

        public Exceeds(d threshold, String monitoredPocket, String receiver, Limit limit) {
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            this.f86446a = threshold;
            this.f86447b = monitoredPocket;
            this.f86448c = receiver;
            this.d = limit;
        }

        @Override // com.revolut.feature.shared.recurring_payments.models.WalletAutomation
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Limit getD() {
            return this.d;
        }

        @Override // com.revolut.feature.shared.recurring_payments.models.WalletAutomation
        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getF86446a() {
            return this.f86446a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Exceeds)) {
                return false;
            }
            Exceeds exceeds = (Exceeds) obj2;
            return Intrinsics.f(this.f86446a, exceeds.f86446a) && Intrinsics.f(this.f86447b, exceeds.f86447b) && Intrinsics.f(this.f86448c, exceeds.f86448c) && Intrinsics.f(this.d, exceeds.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f86446a.hashCode() * 31, 31, this.f86447b), 31, this.f86448c);
            Limit limit = this.d;
            return iC + (limit == null ? 0 : limit.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86446a);
            dest.writeString(this.f86447b);
            dest.writeString(this.f86448c);
            Limit limit = this.d;
            if (limit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                limit.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$Limit;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_shared_recurring_payments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Limit implements Parcelable, Serializable {

        @NotNull
        public static final Parcelable.Creator<Limit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f86449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f86450b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit((d) parcel.readSerializable(), j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Limit[i];
            }
        }

        public Limit(d max, j period) {
            Intrinsics.checkNotNullParameter(max, "max");
            Intrinsics.checkNotNullParameter(period, "period");
            this.f86449a = max;
            this.f86450b = period;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) obj2;
            return Intrinsics.f(this.f86449a, limit.f86449a) && this.f86450b == limit.f86450b;
        }

        public final int hashCode() {
            return this.f86450b.hashCode() + (this.f86449a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86449a);
            dest.writeString(this.f86450b.name());
        }
    }

    private WalletAutomation() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Limit getD();

    /* JADX INFO: renamed from: b */
    public abstract d getF86446a();
}
