package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124512b;

    public /* synthetic */ d1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(b1.f124493a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124511a = str;
        this.f124512b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f124511a, d1Var.f124511a) && Intrinsics.f(this.f124512b, d1Var.f124512b);
    }

    public final int hashCode() {
        return this.f124512b.hashCode() + (this.f124511a.hashCode() * 31);
    }

    public d1(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f124511a = key;
        this.f124512b = value;
    }
}
