package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153140c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153142b;

    public /* synthetic */ i1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(g1.f153113a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153141a = str;
        this.f153142b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f153141a, i1Var.f153141a) && Intrinsics.f(this.f153142b, i1Var.f153142b);
    }

    public final int hashCode() {
        return this.f153142b.hashCode() + (this.f153141a.hashCode() * 31);
    }

    public i1(String state, ArrayList details) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f153141a = state;
        this.f153142b = details;
    }
}
