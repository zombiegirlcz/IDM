package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8828c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f8820a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8826a = str;
        this.f8827b = str2;
        this.f8828c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8826a, cVar.f8826a) && Intrinsics.f(this.f8827b, cVar.f8827b) && Intrinsics.f(this.f8828c, cVar.f8828c);
    }

    public final int hashCode() {
        int iHashCode = this.f8826a.hashCode() * 31;
        String str = this.f8827b;
        return this.f8828c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public c(String text, String str, String action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f8826a = text;
        this.f8827b = str;
        this.f8828c = action;
    }
}
