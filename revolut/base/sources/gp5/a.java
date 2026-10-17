package gp5;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements mo5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f145253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f145254b;

    public a(b destinationTagClauseProvider, c memoClauseProvider) {
        Intrinsics.checkNotNullParameter(destinationTagClauseProvider, "destinationTagClauseProvider");
        Intrinsics.checkNotNullParameter(memoClauseProvider, "memoClauseProvider");
        this.f145253a = destinationTagClauseProvider;
        this.f145254b = memoClauseProvider;
    }

    @Override // mo5.a
    public final int a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).a(currency);
    }

    @Override // mo5.a
    public final int b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).b(currency);
    }

    @Override // mo5.a
    public final int c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).c(currency);
    }

    @Override // mo5.a
    public final Clause d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).d(currency);
    }

    @Override // mo5.a
    public final int e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).e(currency);
    }

    @Override // mo5.a
    public final int f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).f(currency);
    }

    @Override // mo5.a
    public final Clause g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).g(currency);
    }

    @Override // mo5.a
    public final int h(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return i(currency).h(currency);
    }

    public final mo5.a i(xi0.b bVar) {
        xi0.b.Companion.getClass();
        return Intrinsics.f(bVar, xi0.b.G) ? this.f145253a : this.f145254b;
    }
}
