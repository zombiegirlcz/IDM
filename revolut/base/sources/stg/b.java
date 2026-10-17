package stg;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265586c;
    public final Instant d;
    public final Instant e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f265587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f265588h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f265589j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f265590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LocalDate f265591m;

    public b(String id10, String state, String portfolioId, Instant createdDate, Instant updatedDate, String source, String tradingLegalEntityId, String str, c currentStep, List pendingSteps, List completedSteps, boolean z, LocalDate estimatedCompletionDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tradingLegalEntityId, "tradingLegalEntityId");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(pendingSteps, "pendingSteps");
        Intrinsics.checkNotNullParameter(completedSteps, "completedSteps");
        Intrinsics.checkNotNullParameter(estimatedCompletionDate, "estimatedCompletionDate");
        this.f265584a = id10;
        this.f265585b = state;
        this.f265586c = portfolioId;
        this.d = createdDate;
        this.e = updatedDate;
        this.f = source;
        this.f265587g = tradingLegalEntityId;
        this.f265588h = str;
        this.i = currentStep;
        this.f265589j = pendingSteps;
        this.k = completedSteps;
        this.f265590l = z;
        this.f265591m = estimatedCompletionDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265584a, bVar.f265584a) && Intrinsics.f(this.f265585b, bVar.f265585b) && Intrinsics.f(this.f265586c, bVar.f265586c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f265587g, bVar.f265587g) && Intrinsics.f(this.f265588h, bVar.f265588h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f265589j, bVar.f265589j) && Intrinsics.f(this.k, bVar.k) && this.f265590l == bVar.f265590l && Intrinsics.f(this.f265591m, bVar.f265591m);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(r6.b.c(r6.b.c(p.a.c(p.a.c(this.f265584a.hashCode() * 31, 31, this.f265585b), 31, this.f265586c), 31, this.d), 31, this.e), 31, this.f), 31, this.f265587g);
        String str = this.f265588h;
        return this.f265591m.hashCode() + j6.a.c(p.a.d(p.a.d((this.i.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f265589j), 31, this.k), 31, this.f265590l);
    }
}
