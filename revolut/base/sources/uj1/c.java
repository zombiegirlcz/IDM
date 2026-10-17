package uj1;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280470c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f280467a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280468a = str;
        this.f280469b = str2;
        this.f280470c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f280468a, cVar.f280468a) && Intrinsics.f(this.f280469b, cVar.f280469b) && Intrinsics.f(this.f280470c, cVar.f280470c);
    }

    public final int hashCode() {
        return this.f280470c.hashCode() + p.a.c(this.f280468a.hashCode() * 31, 31, this.f280469b);
    }

    public c(String id10, String type, String context) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f280468a = id10;
        this.f280469b = type;
        this.f280470c = context;
    }
}
