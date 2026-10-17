package zfi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f321969c;

    public g(String reference, String label, h config) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f321967a = reference;
        this.f321968b = label;
        this.f321969c = config;
    }

    @Override // zfi.b
    public final m a() {
        return this.f321969c;
    }

    @Override // zfi.b
    public final String b() {
        return this.f321968b;
    }

    @Override // zfi.b
    public final String c() {
        return this.f321967a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f321967a, gVar.f321967a) && Intrinsics.f(this.f321968b, gVar.f321968b) && Intrinsics.f(this.f321969c, gVar.f321969c);
    }

    public final int hashCode() {
        return this.f321969c.hashCode() + p.a.c(this.f321967a.hashCode() * 31, 31, this.f321968b);
    }
}
