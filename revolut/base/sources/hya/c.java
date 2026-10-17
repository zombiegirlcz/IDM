package hya;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156771b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f156769a.getDescriptor(), i, 3);
            throw null;
        }
        this.f156770a = str;
        this.f156771b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f156770a, cVar.f156770a) && Intrinsics.f(this.f156771b, cVar.f156771b);
    }

    public final int hashCode() {
        return this.f156771b.hashCode() + (this.f156770a.hashCode() * 31);
    }

    public c(String title, String action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f156770a = title;
        this.f156771b = action;
    }
}
