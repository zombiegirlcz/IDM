package z2f;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f319067a;

    public f(InvestTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f319067a = filter;
    }

    @Override // z2f.g
    public final InvestTransactionsFilter a() {
        return this.f319067a;
    }

    @Override // z2f.g
    public final Instant b() {
        return null;
    }

    @Override // z2f.g
    public final int c() {
        return 5;
    }

    @Override // z2f.g
    public final Instant d() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f319067a, ((f) obj2).f319067a);
    }

    public final int hashCode() {
        return this.f319067a.hashCode();
    }
}
