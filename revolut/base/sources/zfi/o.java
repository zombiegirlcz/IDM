package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f321987c;

    public o(String reference, String label, p config) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f321985a = reference;
        this.f321986b = label;
        this.f321987c = config;
    }

    @Override // zfi.b
    public final m a() {
        return this.f321987c;
    }

    @Override // zfi.b
    public final String b() {
        return this.f321986b;
    }

    @Override // zfi.b
    public final String c() {
        return this.f321985a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f321985a, oVar.f321985a) && Intrinsics.f(this.f321986b, oVar.f321986b) && Intrinsics.f(this.f321987c, oVar.f321987c);
    }

    public final int hashCode() {
        return this.f321987c.hashCode() + p.a.c(this.f321985a.hashCode() * 31, 31, this.f321986b);
    }
}
