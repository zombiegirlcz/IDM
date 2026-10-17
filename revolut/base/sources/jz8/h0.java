package jz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u09.c0 f179622c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new jxi.a(19)), yhm.j.c(kVar, new jxi.a(20))};
    }

    public /* synthetic */ h0(int i, String str, String str2, u09.c0 c0Var, List list) {
        if (15 != (i & 15)) {
            j1.f(f0.f179615a.getDescriptor(), i, 15);
            throw null;
        }
        this.f179620a = str;
        this.f179621b = str2;
        this.f179622c = c0Var;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f179620a, h0Var.f179620a) && Intrinsics.f(this.f179621b, h0Var.f179621b) && this.f179622c == h0Var.f179622c && Intrinsics.f(this.d, h0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f179622c.hashCode() + p.a.c(this.f179620a.hashCode() * 31, 31, this.f179621b)) * 31);
    }

    public h0(String id10, String text, u09.c0 selection, ArrayList options) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f179620a = id10;
        this.f179621b = text;
        this.f179622c = selection;
        this.d = options;
    }
}
