package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f321413c = {null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321415b;

    public /* synthetic */ s0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(q0.f321408a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321414a = str;
        this.f321415b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f321414a, s0Var.f321414a) && Intrinsics.f(this.f321415b, s0Var.f321415b);
    }

    public final int hashCode() {
        return this.f321415b.hashCode() + (this.f321414a.hashCode() * 31);
    }

    public s0(String title, ArrayList content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f321414a = title;
        this.f321415b = content;
    }
}
