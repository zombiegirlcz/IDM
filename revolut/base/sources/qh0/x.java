package qh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246422c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(v.f246419a.getDescriptor(), i, 7);
            throw null;
        }
        this.f246420a = str;
        this.f246421b = str2;
        this.f246422c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f246420a, xVar.f246420a) && Intrinsics.f(this.f246421b, xVar.f246421b) && Intrinsics.f(this.f246422c, xVar.f246422c);
    }

    public final int hashCode() {
        return this.f246422c.hashCode() + p.a.c(this.f246420a.hashCode() * 31, 31, this.f246421b);
    }

    public x(String id10, String displayName, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f246420a = id10;
        this.f246421b = displayName;
        this.f246422c = name;
    }
}
