package idb;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import u80.t;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f160464a;

    public d(t impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f160464a = impl;
    }

    @Override // u80.t
    public final CharSequence b(BigDecimal rate, xi0.b currency, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f160464a.b(rate, currency, z, z3, z4);
    }

    @Override // u80.t
    public final BigDecimal c(BigDecimal rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        return this.f160464a.c(rate);
    }

    @Override // u80.t
    public final BigDecimal d(String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        return this.f160464a.d(rate);
    }

    @Override // u80.t
    public final CharSequence e(BigDecimal rate, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f160464a.e(rate, currency, z);
    }

    @Override // u80.t
    public final CharSequence f(BigDecimal rate, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f160464a.f(rate, currency, z);
    }

    @Override // u80.t
    public final xi0.b g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f160464a.g(currency);
    }
}
