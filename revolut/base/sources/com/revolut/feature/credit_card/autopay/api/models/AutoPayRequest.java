package com.revolut.feature.credit_card.autopay.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mb5.u;
import mb5.v;
import nb5.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest;", "Landroid/os/Parcelable;", "<init>", "()V", "Setup", "Update", "Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest$Setup;", "Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest$Update;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AutoPayRequest implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest$Setup;", "Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Setup extends AutoPayRequest {

        @NotNull
        public static final Parcelable.Creator<Setup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditScheduledAmountType f70678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f70679c;
        public final b d;
        public final Integer e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Setup(parcel.readInt(), (CreditScheduledAmountType) parcel.readParcelable(Setup.class.getClassLoader()), u.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Setup[i];
            }
        }

        public Setup(int i, CreditScheduledAmountType amount, u type, b bVar, Integer num) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f70677a = i;
            this.f70678b = amount;
            this.f70679c = type;
            this.d = bVar;
            this.e = num;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreditScheduledAmountType getF70681b() {
            return this.f70678b;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF70680a() {
            return this.f70677a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getF() {
            return this.d;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getF70683g() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: e, reason: from getter */
        public final u getF70682c() {
            return this.f70679c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Setup)) {
                return false;
            }
            Setup setup = (Setup) obj2;
            return this.f70677a == setup.f70677a && Intrinsics.f(this.f70678b, setup.f70678b) && this.f70679c == setup.f70679c && this.d == setup.d && Intrinsics.f(this.e, setup.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f70679c.hashCode() + ((this.f70678b.hashCode() + (Integer.hashCode(this.f70677a) * 31)) * 31)) * 31;
            b bVar = this.d;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Integer num = this.e;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70677a);
            dest.writeParcelable(this.f70678b, i);
            dest.writeString(this.f70679c.name());
            b bVar = this.d;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest$Update;", "Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Update extends AutoPayRequest {

        @NotNull
        public static final Parcelable.Creator<Update> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditScheduledAmountType f70681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f70682c;
        public final v d;
        public final String e;
        public final b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f70683g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Update(parcel.readInt(), (CreditScheduledAmountType) parcel.readParcelable(Update.class.getClassLoader()), u.valueOf(parcel.readString()), v.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Update[i];
            }
        }

        public Update(int i, CreditScheduledAmountType amount, u type, v state, String paymentId, b bVar, Integer num) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f70680a = i;
            this.f70681b = amount;
            this.f70682c = type;
            this.d = state;
            this.e = paymentId;
            this.f = bVar;
            this.f70683g = num;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreditScheduledAmountType getF70681b() {
            return this.f70681b;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF70680a() {
            return this.f70680a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getF() {
            return this.f;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getF70683g() {
            return this.f70683g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest
        /* JADX INFO: renamed from: e, reason: from getter */
        public final u getF70682c() {
            return this.f70682c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Update)) {
                return false;
            }
            Update update = (Update) obj2;
            return this.f70680a == update.f70680a && Intrinsics.f(this.f70681b, update.f70681b) && this.f70682c == update.f70682c && this.d == update.d && Intrinsics.f(this.e, update.e) && this.f == update.f && Intrinsics.f(this.f70683g, update.f70683g);
        }

        public final int hashCode() {
            int iC = p.a.c((this.d.hashCode() + ((this.f70682c.hashCode() + ((this.f70681b.hashCode() + (Integer.hashCode(this.f70680a) * 31)) * 31)) * 31)) * 31, 31, this.e);
            b bVar = this.f;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Integer num = this.f70683g;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70680a);
            dest.writeParcelable(this.f70681b, i);
            dest.writeString(this.f70682c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            b bVar = this.f;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            Integer num = this.f70683g;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    private AutoPayRequest() {
    }

    /* JADX INFO: renamed from: a */
    public abstract CreditScheduledAmountType getF70681b();

    /* JADX INFO: renamed from: b */
    public abstract int getF70680a();

    /* JADX INFO: renamed from: c */
    public abstract b getF();

    /* JADX INFO: renamed from: d */
    public abstract Integer getF70683g();

    /* JADX INFO: renamed from: e */
    public abstract u getF70682c();
}
