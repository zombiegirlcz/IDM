package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313605c;

    public /* synthetic */ f(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(d.f313601a.getDescriptor(), i, 7);
            throw null;
        }
        this.f313603a = str;
        this.f313604b = str2;
        this.f313605c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f313603a, fVar.f313603a) && Intrinsics.f(this.f313604b, fVar.f313604b) && Intrinsics.f(this.f313605c, fVar.f313605c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f313603a.hashCode() * 31, 31, this.f313604b);
        String str = this.f313605c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public f(String text, String url2, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f313603a = text;
        this.f313604b = url2;
        this.f313605c = str;
    }
}
