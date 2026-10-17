package com.revolut.feature.trading_orders.api.invest.placement;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import dfl.r;
import java.math.BigDecimal;
import java.util.UUID;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import sel.a;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/InvestOrderContract$InputData", "Landroid/os/Parcelable;", "Companion", "InputDataImpl", "a", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrderContract$InputData extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f91701a;

    /* JADX INFO: renamed from: com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f91701a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f91702b = a.WEEKLY;

        private Companion() {
        }

        public static InvestOrderContract$InputData a(n instrument, UUID tradingAccountId, g side, Amount amount, r initialInvestValueType) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(initialInvestValueType, "initialInvestValueType");
            r0 r0Var = r0.LIMIT;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return new InputDataImpl(instrument, tradingAccountId, r0Var, side, ZERO, false, null, amount, initialInvestValueType, 96);
        }

        public static InvestOrderContract$InputData b(n instrument, UUID tradingAccountId, g side, BigDecimal initialValue, r rVar) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            return new InputDataImpl(instrument, tradingAccountId, r0.MARKET, side, initialValue, true, null, null, rVar, 192);
        }

        public static /* synthetic */ InvestOrderContract$InputData c(Companion companion, n nVar, UUID uuid, g gVar) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            companion.getClass();
            return b(nVar, uuid, gVar, ZERO, null);
        }

        public static InvestOrderContract$InputData d(n instrument, UUID tradingAccountId, BigDecimal initialValue, boolean z, a defaultPeriod) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(defaultPeriod, "defaultPeriod");
            return new InputDataImpl(instrument, tradingAccountId, r0.RECURRING, g.BUY, initialValue, z, defaultPeriod, null, null, 384);
        }

        public static /* synthetic */ InvestOrderContract$InputData e(Companion companion, n nVar, UUID uuid, BigDecimal ZERO, int i) {
            if ((i & 4) != 0) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            companion.getClass();
            return d(nVar, uuid, ZERO, true, f91702b);
        }
    }

    /* JADX INFO: renamed from: C */
    BigDecimal getE();

    /* JADX INFO: renamed from: G8 */
    UUID getF91697b();

    /* JADX INFO: renamed from: J4 */
    boolean getF();

    /* JADX INFO: renamed from: Q5 */
    r getI();

    /* JADX INFO: renamed from: e9 */
    a getF91699g();

    /* JADX INFO: renamed from: h6 */
    g getD();

    /* JADX INFO: renamed from: n */
    n getF91696a();

    /* JADX INFO: renamed from: p3 */
    Amount getF91700h();

    /* JADX INFO: renamed from: t */
    r0 getF91698c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/InvestOrderContract$InputData$InputDataImpl;", "Lcom/revolut/feature/trading_orders/api/invest/placement/InvestOrderContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputDataImpl implements InvestOrderContract$InputData {

        @NotNull
        public static final Parcelable.Creator<InputDataImpl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f91696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f91697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r0 f91698c;
        public final g d;
        public final BigDecimal e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final sel.a f91699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Amount f91700h;
        public final r i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputDataImpl((n) parcel.readSerializable(), (UUID) parcel.readSerializable(), r0.valueOf(parcel.readString()), g.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, sel.a.valueOf(parcel.readString()), (Amount) parcel.readParcelable(InputDataImpl.class.getClassLoader()), parcel.readInt() == 0 ? null : r.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputDataImpl[i];
            }
        }

        public InputDataImpl(n instrument, UUID tradingAccountId, r0 orderType, g tradeSide, BigDecimal initialValue, boolean z, sel.a defaultPeriod, Amount amount, r rVar) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(defaultPeriod, "defaultPeriod");
            this.f91696a = instrument;
            this.f91697b = tradingAccountId;
            this.f91698c = orderType;
            this.d = tradeSide;
            this.e = initialValue;
            this.f = z;
            this.f91699g = defaultPeriod;
            this.f91700h = amount;
            this.i = rVar;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: C, reason: from getter */
        public final BigDecimal getE() {
            return this.e;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: G8, reason: from getter */
        public final UUID getF91697b() {
            return this.f91697b;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: J4, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: Q5, reason: from getter */
        public final r getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: e9, reason: from getter */
        public final sel.a getF91699g() {
            return this.f91699g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputDataImpl)) {
                return false;
            }
            InputDataImpl inputDataImpl = (InputDataImpl) obj2;
            return Intrinsics.f(this.f91696a, inputDataImpl.f91696a) && Intrinsics.f(this.f91697b, inputDataImpl.f91697b) && this.f91698c == inputDataImpl.f91698c && this.d == inputDataImpl.d && Intrinsics.f(this.e, inputDataImpl.e) && this.f == inputDataImpl.f && this.f91699g == inputDataImpl.f91699g && Intrinsics.f(this.f91700h, inputDataImpl.f91700h) && this.i == inputDataImpl.i;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: h6, reason: from getter */
        public final g getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f91699g.hashCode() + j6.a.c(t61.a.d(this.e, y.b(this.d, d.f(this.f91698c, t61.a.f(this.f91697b, this.f91696a.hashCode() * 31, 31), 31), 31), 31), 31, this.f)) * 31;
            Amount amount = this.f91700h;
            int iHashCode2 = (iHashCode + (amount == null ? 0 : amount.hashCode())) * 31;
            r rVar = this.i;
            return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: n, reason: from getter */
        public final n getF91696a() {
            return this.f91696a;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: p3, reason: from getter */
        public final Amount getF91700h() {
            return this.f91700h;
        }

        @Override // com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData
        /* JADX INFO: renamed from: t, reason: from getter */
        public final r0 getF91698c() {
            return this.f91698c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91696a);
            dest.writeSerializable(this.f91697b);
            dest.writeString(this.f91698c.name());
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeString(this.f91699g.name());
            dest.writeParcelable(this.f91700h, i);
            r rVar = this.i;
            if (rVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(rVar.name());
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public InputDataImpl(nel.n r13, java.util.UUID r14, k4l.r0 r15, bfl.g r16, java.math.BigDecimal r17, boolean r18, sel.a r19, com.revolut.shared.feature.market_data.models.domain.models.Amount r20, dfl.r r21, int r22) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 32
                if (r1 == 0) goto L9
                r1 = 1
                r8 = r1
                goto Lb
            L9:
                r8 = r18
            Lb:
                r1 = r0 & 64
                if (r1 == 0) goto L18
                com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a r1 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.INSTANCE
                r1.getClass()
                sel.a r1 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.Companion.f91702b
                r9 = r1
                goto L1a
            L18:
                r9 = r19
            L1a:
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 0
                if (r1 == 0) goto L21
                r10 = r2
                goto L23
            L21:
                r10 = r20
            L23:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L31
                r11 = r2
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r2 = r12
                goto L3b
            L31:
                r11 = r21
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
            L3b:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.InputDataImpl.<init>(nel.n, java.util.UUID, k4l.r0, bfl.g, java.math.BigDecimal, boolean, sel.a, com.revolut.shared.feature.market_data.models.domain.models.Amount, dfl.r, int):void");
        }
    }
}
