package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18704c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f18691a.getDescriptor(), i, 7);
            throw null;
        }
        this.f18702a = str;
        this.f18703b = str2;
        this.f18704c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18702a, cVar.f18702a) && Intrinsics.f(this.f18703b, cVar.f18703b) && Intrinsics.f(this.f18704c, cVar.f18704c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f18702a.hashCode() * 31, 31, this.f18703b);
        String str = this.f18704c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public c(String title, String subtitle, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f18702a = title;
        this.f18703b = subtitle;
        this.f18704c = str;
    }
}
