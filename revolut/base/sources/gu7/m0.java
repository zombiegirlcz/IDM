package gu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f146792c;
    public final e0 d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new d(7)), yhm.j.c(kVar, new d(8)), null};
    }

    public /* synthetic */ m0(int i, String str, List list, u uVar, e0 e0Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(t.f146833a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146790a = str;
        this.f146791b = list;
        this.f146792c = uVar;
        this.d = e0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f146790a, m0Var.f146790a) && Intrinsics.f(this.f146791b, m0Var.f146791b) && Intrinsics.f(this.f146792c, m0Var.f146792c) && Intrinsics.f(this.d, m0Var.d);
    }

    public final int hashCode() {
        String str = this.f146790a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f146791b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        u uVar = this.f146792c;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        e0 e0Var = this.d;
        return iHashCode3 + (e0Var != null ? e0Var.hashCode() : 0);
    }

    public m0(String str, ArrayList arrayList, u uVar, e0 e0Var) {
        this.f146790a = str;
        this.f146791b = arrayList;
        this.f146792c = uVar;
        this.d = e0Var;
    }
}
