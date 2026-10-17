package com.revolut.domain.models.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import v61.o;
import v61.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails;", "Landroid/os/Parcelable;", "Active", "NonActive", "Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails$Active;", "Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails$NonActive;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferLinkDetails implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferLinkState f60353a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails$Active;", "Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active extends TransferLinkDetails {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60355c;
        public final String d;
        public final DateTime e;
        public final DateTime f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TransferLinkDirection f60356g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f60357h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f60358j;
        public final d k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f60359l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f60360m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final o f60361n;
        public final p o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final p f60362p;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), TransferLinkDirection.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (o) parcel.readSerializable(), (p) parcel.readSerializable(), (p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Active(String id10, String url2, String code, DateTime expireDate, DateTime createdDate, TransferLinkDirection direction, boolean z, String str, String str2, d money, String str3, String str4, o oVar, p pVar, p pVar2) {
            super(TransferLinkState.ACTIVE);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(expireDate, "expireDate");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(money, "money");
            this.f60354b = id10;
            this.f60355c = url2;
            this.d = code;
            this.e = expireDate;
            this.f = createdDate;
            this.f60356g = direction;
            this.f60357h = z;
            this.i = str;
            this.f60358j = str2;
            this.k = money;
            this.f60359l = str3;
            this.f60360m = str4;
            this.f60361n = oVar;
            this.o = pVar;
            this.f60362p = pVar2;
        }

        public final p J() {
            int i = c.f60368a[this.f60356g.ordinal()];
            if (i == 1) {
                return this.f60362p;
            }
            if (i == 2) {
                return this.o;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getI() {
            return this.i;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DateTime getF() {
            return this.f;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TransferLinkDirection getF60365g() {
            return this.f60356g;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: c, reason: from getter */
        public final DateTime getE() {
            return this.e;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF60367j() {
            return this.f60358j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Active)) {
                return false;
            }
            Active active = (Active) obj2;
            return Intrinsics.f(this.f60354b, active.f60354b) && Intrinsics.f(this.f60355c, active.f60355c) && Intrinsics.f(this.d, active.d) && Intrinsics.f(this.e, active.e) && Intrinsics.f(this.f, active.f) && this.f60356g == active.f60356g && this.f60357h == active.f60357h && Intrinsics.f(this.i, active.i) && Intrinsics.f(this.f60358j, active.f60358j) && Intrinsics.f(this.k, active.k) && Intrinsics.f(this.f60359l, active.f60359l) && Intrinsics.f(this.f60360m, active.f60360m) && Intrinsics.f(this.f60361n, active.f60361n) && Intrinsics.f(this.o, active.o) && Intrinsics.f(this.f60362p, active.f60362p);
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: getCode, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60363b() {
            return this.f60354b;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: getUrl, reason: from getter */
        public final String getF60364c() {
            return this.f60355c;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f60356g.hashCode() + m72.b.f(this.f, m72.b.f(this.e, p.a.c(p.a.c(this.f60354b.hashCode() * 31, 31, this.f60355c), 31, this.d), 31), 31)) * 31, 31, this.f60357h);
            String str = this.i;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60358j;
            int iC2 = v7.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k);
            String str3 = this.f60359l;
            int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f60360m;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            o oVar = this.f60361n;
            int iHashCode4 = (iHashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            p pVar = this.o;
            int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
            p pVar2 = this.f60362p;
            return iHashCode5 + (pVar2 != null ? pVar2.hashCode() : 0);
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getF60366h() {
            return this.f60357h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60354b);
            dest.writeString(this.f60355c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
            dest.writeString(this.f60356g.name());
            dest.writeInt(this.f60357h ? 1 : 0);
            dest.writeString(this.i);
            dest.writeString(this.f60358j);
            dest.writeSerializable(this.k);
            dest.writeString(this.f60359l);
            dest.writeString(this.f60360m);
            dest.writeSerializable(this.f60361n);
            dest.writeSerializable(this.o);
            dest.writeSerializable(this.f60362p);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final o getF60361n() {
            return this.f60361n;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails$NonActive;", "Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonActive extends TransferLinkDetails {

        @NotNull
        public static final Parcelable.Creator<NonActive> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60364c;
        public final String d;
        public final DateTime e;
        public final DateTime f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TransferLinkDirection f60365g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f60366h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f60367j;
        public final TransferLinkState k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonActive(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), TransferLinkDirection.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), TransferLinkState.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonActive[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonActive(String id10, String url2, String code, DateTime expireDate, DateTime createdDate, TransferLinkDirection direction, boolean z, String str, String str2, TransferLinkState state) {
            super(state);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(expireDate, "expireDate");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f60363b = id10;
            this.f60364c = url2;
            this.d = code;
            this.e = expireDate;
            this.f = createdDate;
            this.f60365g = direction;
            this.f60366h = z;
            this.i = str;
            this.f60367j = str2;
            this.k = state;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getI() {
            return this.i;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DateTime getF() {
            return this.f;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TransferLinkDirection getF60365g() {
            return this.f60365g;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: c, reason: from getter */
        public final DateTime getE() {
            return this.e;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF60367j() {
            return this.f60367j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TransferLinkState getF60353a() {
            return this.k;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NonActive)) {
                return false;
            }
            NonActive nonActive = (NonActive) obj2;
            return Intrinsics.f(this.f60363b, nonActive.f60363b) && Intrinsics.f(this.f60364c, nonActive.f60364c) && Intrinsics.f(this.d, nonActive.d) && Intrinsics.f(this.e, nonActive.e) && Intrinsics.f(this.f, nonActive.f) && this.f60365g == nonActive.f60365g && this.f60366h == nonActive.f60366h && Intrinsics.f(this.i, nonActive.i) && Intrinsics.f(this.f60367j, nonActive.f60367j) && this.k == nonActive.k;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: getCode, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60363b() {
            return this.f60363b;
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: getUrl, reason: from getter */
        public final String getF60364c() {
            return this.f60364c;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f60365g.hashCode() + m72.b.f(this.f, m72.b.f(this.e, p.a.c(p.a.c(this.f60363b.hashCode() * 31, 31, this.f60364c), 31, this.d), 31), 31)) * 31, 31, this.f60366h);
            String str = this.i;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60367j;
            return this.k.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.domain.models.moneyrequest.TransferLinkDetails
        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getF60366h() {
            return this.f60366h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60363b);
            dest.writeString(this.f60364c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
            dest.writeString(this.f60365g.name());
            dest.writeInt(this.f60366h ? 1 : 0);
            dest.writeString(this.i);
            dest.writeString(this.f60367j);
            dest.writeString(this.k.name());
        }
    }

    public TransferLinkDetails(TransferLinkState transferLinkState) {
        this.f60353a = transferLinkState;
    }

    /* JADX INFO: renamed from: L0 */
    public abstract String getI();

    /* JADX INFO: renamed from: a */
    public abstract DateTime getF();

    /* JADX INFO: renamed from: b */
    public abstract TransferLinkDirection getF60365g();

    /* JADX INFO: renamed from: c */
    public abstract DateTime getE();

    /* JADX INFO: renamed from: d */
    public abstract String getF60367j();

    /* JADX INFO: renamed from: e, reason: from getter */
    public TransferLinkState getF60353a() {
        return this.f60353a;
    }

    /* JADX INFO: renamed from: getCode */
    public abstract String getD();

    /* JADX INFO: renamed from: getId */
    public abstract String getF60363b();

    /* JADX INFO: renamed from: getUrl */
    public abstract String getF60364c();

    /* JADX INFO: renamed from: j */
    public abstract boolean getF60366h();
}
