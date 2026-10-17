package com.revolut.feature.robo.api.ui.providers.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ilc.c;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "Landroid/os/Parcelable;", "<init>", "()V", "OneOffContribution", "RecurringDeposit", "Withdrawal", "Fee", "Dividend", "Refund", "ilc/c", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Dividend;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Fee;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$OneOffContribution;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$RecurringDeposit;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Refund;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Withdrawal;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RoboTransaction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Dividend;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dividend extends RoboTransaction {

        @NotNull
        public static final Parcelable.Creator<Dividend> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f85063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85065c;
        public final String d;
        public final d e;
        public final d f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dividend(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readLong(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dividend[i];
            }
        }

        public Dividend(c state, d value, long j2, String str, d dVar, d dVar2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f85063a = state;
            this.f85064b = value;
            this.f85065c = j2;
            this.d = str;
            this.e = dVar;
            this.f = dVar2;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF85080c() {
            return this.f85065c;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF85078a() {
            return this.f85063a;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getF85079b() {
            return this.f85064b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dividend)) {
                return false;
            }
            Dividend dividend = (Dividend) obj2;
            return this.f85063a == dividend.f85063a && Intrinsics.f(this.f85064b, dividend.f85064b) && this.f85065c == dividend.f85065c && Intrinsics.f(this.d, dividend.d) && Intrinsics.f(this.e, dividend.e) && Intrinsics.f(this.f, dividend.f);
        }

        public final int hashCode() {
            int iC = a0.d.c(v7.c(this.f85063a.hashCode() * 31, 31, this.f85064b), 31, this.f85065c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.e;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            d dVar2 = this.f;
            return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85063a.name());
            dest.writeSerializable(this.f85064b);
            dest.writeLong(this.f85065c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Fee;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fee extends RoboTransaction {

        @NotNull
        public static final Parcelable.Creator<Fee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f85066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85068c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fee(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fee[i];
            }
        }

        public Fee(c state, d value, long j2, String str) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f85066a = state;
            this.f85067b = value;
            this.f85068c = j2;
            this.d = str;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF85080c() {
            return this.f85068c;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF85078a() {
            return this.f85066a;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getF85079b() {
            return this.f85067b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Fee)) {
                return false;
            }
            Fee fee2 = (Fee) obj2;
            return this.f85066a == fee2.f85066a && Intrinsics.f(this.f85067b, fee2.f85067b) && this.f85068c == fee2.f85068c && Intrinsics.f(this.d, fee2.d);
        }

        public final int hashCode() {
            int iC = a0.d.c(v7.c(this.f85066a.hashCode() * 31, 31, this.f85067b), 31, this.f85068c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85066a.name());
            dest.writeSerializable(this.f85067b);
            dest.writeLong(this.f85068c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$OneOffContribution;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneOffContribution extends RoboTransaction {

        @NotNull
        public static final Parcelable.Creator<OneOffContribution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f85069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85071c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                c cVarValueOf = c.valueOf(parcel.readString());
                d dVar = (d) parcel.readSerializable();
                long j2 = parcel.readLong();
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new OneOffContribution(cVarValueOf, dVar, j2, string, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneOffContribution[i];
            }
        }

        public OneOffContribution(c state, d value, long j2, String str, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f85069a = state;
            this.f85070b = value;
            this.f85071c = j2;
            this.d = str;
            this.e = z;
            this.f = z3;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF85080c() {
            return this.f85071c;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF85078a() {
            return this.f85069a;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getF85079b() {
            return this.f85070b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneOffContribution)) {
                return false;
            }
            OneOffContribution oneOffContribution = (OneOffContribution) obj2;
            return this.f85069a == oneOffContribution.f85069a && Intrinsics.f(this.f85070b, oneOffContribution.f85070b) && this.f85071c == oneOffContribution.f85071c && Intrinsics.f(this.d, oneOffContribution.d) && this.e == oneOffContribution.e && this.f == oneOffContribution.f;
        }

        public final int hashCode() {
            int iC = a0.d.c(v7.c(this.f85069a.hashCode() * 31, 31, this.f85070b), 31, this.f85071c);
            String str = this.d;
            return Boolean.hashCode(this.f) + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85069a.name());
            dest.writeSerializable(this.f85070b);
            dest.writeLong(this.f85071c);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$RecurringDeposit;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringDeposit extends RoboTransaction {

        @NotNull
        public static final Parcelable.Creator<RecurringDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f85072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85074c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringDeposit(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringDeposit[i];
            }
        }

        public RecurringDeposit(c state, d value, long j2, String str, String recurringOrderId) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(recurringOrderId, "recurringOrderId");
            this.f85072a = state;
            this.f85073b = value;
            this.f85074c = j2;
            this.d = str;
            this.e = recurringOrderId;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF85080c() {
            return this.f85074c;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF85078a() {
            return this.f85072a;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getF85079b() {
            return this.f85073b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringDeposit)) {
                return false;
            }
            RecurringDeposit recurringDeposit = (RecurringDeposit) obj2;
            return this.f85072a == recurringDeposit.f85072a && Intrinsics.f(this.f85073b, recurringDeposit.f85073b) && this.f85074c == recurringDeposit.f85074c && Intrinsics.f(this.d, recurringDeposit.d) && Intrinsics.f(this.e, recurringDeposit.e);
        }

        public final int hashCode() {
            int iC = a0.d.c(v7.c(this.f85072a.hashCode() * 31, 31, this.f85073b), 31, this.f85074c);
            String str = this.d;
            return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85072a.name());
            dest.writeSerializable(this.f85073b);
            dest.writeLong(this.f85074c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Refund;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund extends RoboTransaction {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f85075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85077c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund(c state, d value, long j2, String str) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f85075a = state;
            this.f85076b = value;
            this.f85077c = j2;
            this.d = str;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF85080c() {
            return this.f85077c;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF85078a() {
            return this.f85075a;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getF85079b() {
            return this.f85076b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj2;
            return this.f85075a == refund.f85075a && Intrinsics.f(this.f85076b, refund.f85076b) && this.f85077c == refund.f85077c && Intrinsics.f(this.d, refund.d);
        }

        public final int hashCode() {
            int iC = a0.d.c(v7.c(this.f85075a.hashCode() * 31, 31, this.f85076b), 31, this.f85077c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85075a.name());
            dest.writeSerializable(this.f85076b);
            dest.writeLong(this.f85077c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction$Withdrawal;", "Lcom/revolut/feature/robo/api/ui/providers/models/RoboTransaction;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdrawal extends RoboTransaction {

        @NotNull
        public static final Parcelable.Creator<Withdrawal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f85078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85080c;
        public final String d;
        public final Boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                c cVarValueOf = c.valueOf(parcel.readString());
                d dVar = (d) parcel.readSerializable();
                long j2 = parcel.readLong();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Withdrawal(cVarValueOf, dVar, j2, string, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdrawal[i];
            }
        }

        public Withdrawal(c state, d value, long j2, String str, Boolean bool) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f85078a = state;
            this.f85079b = value;
            this.f85080c = j2;
            this.d = str;
            this.e = bool;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF85080c() {
            return this.f85080c;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF85078a() {
            return this.f85078a;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.robo.api.ui.providers.models.RoboTransaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getF85079b() {
            return this.f85079b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Withdrawal)) {
                return false;
            }
            Withdrawal withdrawal = (Withdrawal) obj2;
            return this.f85078a == withdrawal.f85078a && Intrinsics.f(this.f85079b, withdrawal.f85079b) && this.f85080c == withdrawal.f85080c && Intrinsics.f(this.d, withdrawal.d) && Intrinsics.f(this.e, withdrawal.e);
        }

        public final int hashCode() {
            int iC = a0.d.c(v7.c(this.f85078a.hashCode() * 31, 31, this.f85079b), 31, this.f85080c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.e;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85078a.name());
            dest.writeSerializable(this.f85079b);
            dest.writeLong(this.f85080c);
            dest.writeString(this.d);
            Boolean bool = this.e;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    private RoboTransaction() {
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF85080c();

    /* JADX INFO: renamed from: b */
    public abstract c getF85078a();

    /* JADX INFO: renamed from: c */
    public abstract String getD();

    /* JADX INFO: renamed from: d */
    public abstract d getF85079b();
}
