package fh6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f135156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MandateLimitConfig f135157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f135158c;
    public final boolean d;

    public h(dj0.d amount, MandateLimitConfig limitConfig, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
        this.f135156a = amount;
        this.f135157b = limitConfig;
        this.f135158c = clause;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f135156a, hVar.f135156a) && Intrinsics.f(this.f135157b, hVar.f135157b) && Intrinsics.f(this.f135158c, hVar.f135158c) && this.d == hVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f135157b.hashCode() + (this.f135156a.hashCode() * 31)) * 31;
        Clause clause = this.f135158c;
        return Boolean.hashCode(this.d) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
