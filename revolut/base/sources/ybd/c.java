package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312222b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f312216a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312221a = str;
        this.f312222b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f312221a, cVar.f312221a) && Intrinsics.f(this.f312222b, cVar.f312222b);
    }

    public final int hashCode() {
        int iHashCode = this.f312221a.hashCode() * 31;
        String str = this.f312222b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public c(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f312221a = type;
        this.f312222b = str;
    }
}
