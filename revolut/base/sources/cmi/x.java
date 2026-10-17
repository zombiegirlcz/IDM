package cmi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25310c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(v.f25307a.getDescriptor(), i, 7);
            throw null;
        }
        this.f25308a = str;
        this.f25309b = str2;
        this.f25310c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f25308a, xVar.f25308a) && Intrinsics.f(this.f25309b, xVar.f25309b) && Intrinsics.f(this.f25310c, xVar.f25310c);
    }

    public final int hashCode() {
        return this.f25310c.hashCode() + p.a.c(this.f25308a.hashCode() * 31, 31, this.f25309b);
    }

    public x(String rawUrl, String fallbackStrategy, String source) {
        Intrinsics.checkNotNullParameter(rawUrl, "rawUrl");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f25308a = rawUrl;
        this.f25309b = fallbackStrategy;
        this.f25310c = source;
    }
}
