package zeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f321652c;

    public /* synthetic */ c(int i, String str, List list, Map map) {
        if (3 != (i & 3)) {
            j1.f(a.f321649a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321650a = str;
        this.f321651b = list;
        if ((i & 4) == 0) {
            this.f321652c = r0.g();
        } else {
            this.f321652c = map;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321650a, cVar.f321650a) && Intrinsics.f(this.f321651b, cVar.f321651b) && Intrinsics.f(this.f321652c, cVar.f321652c);
    }

    public final int hashCode() {
        String str = this.f321650a;
        return this.f321652c.hashCode() + p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f321651b);
    }

    public c(String str, ArrayList scopes, Map termsMapping) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(termsMapping, "termsMapping");
        this.f321650a = str;
        this.f321651b = scopes;
        this.f321652c = termsMapping;
    }
}
