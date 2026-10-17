package jz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new jxi.a(23)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f179661c;

    public /* synthetic */ s0(int i, String str, List list, p0 p0Var) {
        if (3 != (i & 3)) {
            j1.f(q0.f179654a.getDescriptor(), i, 3);
            throw null;
        }
        this.f179659a = str;
        this.f179660b = list;
        if ((i & 4) == 0) {
            this.f179661c = null;
        } else {
            this.f179661c = p0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f179659a, s0Var.f179659a) && Intrinsics.f(this.f179660b, s0Var.f179660b) && Intrinsics.f(this.f179661c, s0Var.f179661c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f179659a.hashCode() * 31, 31, this.f179660b);
        p0 p0Var = this.f179661c;
        return iD + (p0Var == null ? 0 : p0Var.hashCode());
    }

    public s0(String id10, ArrayList questions, p0 p0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.f179659a = id10;
        this.f179660b = questions;
        this.f179661c = p0Var;
    }
}
