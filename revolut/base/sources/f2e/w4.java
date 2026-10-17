package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class w4 {

    @NotNull
    public static final v4 Companion = new v4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131744c;

    public /* synthetic */ w4(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(u4.f131726a.getDescriptor(), i, 7);
            throw null;
        }
        this.f131742a = str;
        this.f131743b = str2;
        this.f131744c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj2;
        return Intrinsics.f(this.f131742a, w4Var.f131742a) && Intrinsics.f(this.f131743b, w4Var.f131743b) && Intrinsics.f(this.f131744c, w4Var.f131744c);
    }

    public final int hashCode() {
        return this.f131744c.hashCode() + p.a.c(this.f131742a.hashCode() * 31, 31, this.f131743b);
    }

    public w4(String formatting, String value, String fallback) {
        Intrinsics.checkNotNullParameter(formatting, "formatting");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        this.f131742a = formatting;
        this.f131743b = value;
        this.f131744c = fallback;
    }
}
