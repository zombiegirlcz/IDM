package com.revolut.data.common.models.money;

import android.text.TextUtils;
import dj0.d;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import xi0.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/revolut/data/common/models/money/MoneySerializable;", "Ljava/io/Serializable;", "", "amount", "", "currency", "<init>", "(JLjava/lang/String;)V", "Ldj0/d;", "money", "(Ldj0/d;)V", "min", "", "isLessThan", "(Lcom/revolut/data/common/models/money/MoneySerializable;)Z", "max", "isGreaterThan", "isBetween", "(Lcom/revolut/data/common/models/money/MoneySerializable;Lcom/revolut/data/common/models/money/MoneySerializable;)Z", "isGreaterOrEqualThan", "isLessOrEqualThan", "toDomain", "()Ldj0/d;", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/revolut/data/common/models/money/MoneySerializable;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "J", "getAmount", "Ljava/lang/String;", "getCurrency", "Ljava/math/BigDecimal;", "getAmountDecimal", "()Ljava/math/BigDecimal;", "amountDecimal", "getAbs", "()Lcom/revolut/data/common/models/money/MoneySerializable;", "abs", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneySerializable implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @b("amount")
    private final long amount;

    @b("currency")
    @NotNull
    private final String currency;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/data/common/models/money/MoneySerializable$Companion;", "", "<init>", "()V", "Lcom/revolut/data/common/models/money/MoneySerializable;", "EMPTY", "()Lcom/revolut/data/common/models/money/MoneySerializable;", "amount", "amount1", "sumUnsigned", "(Lcom/revolut/data/common/models/money/MoneySerializable;Lcom/revolut/data/common/models/money/MoneySerializable;)Lcom/revolut/data/common/models/money/MoneySerializable;", "sum", "Ldj0/d;", "money", "newInstance", "(Ldj0/d;)Lcom/revolut/data/common/models/money/MoneySerializable;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MoneySerializable EMPTY() {
            xi0.b.Companion.getClass();
            return new MoneySerializable(0L, xi0.b.f306273h.f306286a);
        }

        @NotNull
        public final MoneySerializable newInstance(@NotNull d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            return new MoneySerializable(money.f115082a, money.f115083b.f306286a);
        }

        @NotNull
        public final MoneySerializable sum(MoneySerializable amount, MoneySerializable amount1) {
            if (amount == null || amount1 == null || TextUtils.isEmpty(amount.getCurrency()) || TextUtils.isEmpty(amount1.getCurrency())) {
                return amount == null ? amount1 == null ? EMPTY() : amount1 : amount;
            }
            return new MoneySerializable(amount1.getAmount() + amount.getAmount(), amount.getCurrency());
        }

        @NotNull
        public final MoneySerializable sumUnsigned(MoneySerializable amount, MoneySerializable amount1) {
            if (amount == null || amount1 == null || TextUtils.isEmpty(amount.getCurrency()) || TextUtils.isEmpty(amount1.getCurrency())) {
                return amount == null ? amount1 == null ? EMPTY() : amount1 : amount;
            }
            return new MoneySerializable(Math.abs(amount1.getAmount()) + Math.abs(amount.getAmount()), amount.getCurrency());
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoneySerializable(@NotNull d money) {
        this(money.f115082a, money.f115083b.f306286a);
        Intrinsics.checkNotNullParameter(money, "money");
    }

    @NotNull
    public static final MoneySerializable EMPTY() {
        return INSTANCE.EMPTY();
    }

    public static /* synthetic */ MoneySerializable copy$default(MoneySerializable moneySerializable, long j2, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = moneySerializable.amount;
        }
        if ((i & 2) != 0) {
            str = moneySerializable.currency;
        }
        return moneySerializable.copy(j2, str);
    }

    private final BigDecimal getAmountDecimal() {
        a aVar = xi0.b.Companion;
        String str = this.currency;
        aVar.getClass();
        int iP = cp5.d.p(a.a(str));
        BigDecimal bigDecimalDivide = new BigDecimal(this.amount).divide(BigDecimal.valueOf(Math.pow(10.0d, iP)), iP, 4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @NotNull
    public static final MoneySerializable newInstance(@NotNull d dVar) {
        return INSTANCE.newInstance(dVar);
    }

    @NotNull
    public static final MoneySerializable sum(MoneySerializable moneySerializable, MoneySerializable moneySerializable2) {
        return INSTANCE.sum(moneySerializable, moneySerializable2);
    }

    @NotNull
    public static final MoneySerializable sumUnsigned(MoneySerializable moneySerializable, MoneySerializable moneySerializable2) {
        return INSTANCE.sumUnsigned(moneySerializable, moneySerializable2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final MoneySerializable copy(long amount, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new MoneySerializable(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoneySerializable)) {
            return false;
        }
        MoneySerializable moneySerializable = (MoneySerializable) other;
        return this.amount == moneySerializable.amount && Intrinsics.f(this.currency, moneySerializable.currency);
    }

    @NotNull
    public final MoneySerializable getAbs() {
        return new MoneySerializable(Math.abs(this.amount), this.currency);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    public final boolean isBetween(@NotNull MoneySerializable min, @NotNull MoneySerializable max) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        return isGreaterOrEqualThan(min) && isLessOrEqualThan(max);
    }

    public final boolean isGreaterOrEqualThan(@NotNull MoneySerializable max) {
        Intrinsics.checkNotNullParameter(max, "max");
        return this.amount >= max.amount;
    }

    public final boolean isGreaterThan(@NotNull MoneySerializable max) {
        Intrinsics.checkNotNullParameter(max, "max");
        return getAmountDecimal().compareTo(max.getAmountDecimal()) > 0;
    }

    public final boolean isLessOrEqualThan(@NotNull MoneySerializable min) {
        Intrinsics.checkNotNullParameter(min, "min");
        return this.amount <= min.amount;
    }

    public final boolean isLessThan(@NotNull MoneySerializable min) {
        Intrinsics.checkNotNullParameter(min, "min");
        return this.amount < min.amount;
    }

    @NotNull
    public final d toDomain() {
        a aVar = xi0.b.Companion;
        String str = this.currency;
        aVar.getClass();
        return new d(this.amount, a.a(str));
    }

    public MoneySerializable(long j2, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = j2;
        this.currency = currency;
    }
}
