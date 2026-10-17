package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class v3 {

    @NotNull
    public static final u3 Companion = new u3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295048b;

    public /* synthetic */ v3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(t3.f295020a.getDescriptor(), i, 3);
            throw null;
        }
        this.f295047a = str;
        this.f295048b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f295047a, v3Var.f295047a) && Intrinsics.f(this.f295048b, v3Var.f295048b);
    }

    public final int hashCode() {
        return this.f295048b.hashCode() + (this.f295047a.hashCode() * 31);
    }

    public v3(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f295047a = text;
        this.f295048b = url2;
    }
}
