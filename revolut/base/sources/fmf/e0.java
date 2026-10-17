package fmf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f136387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cmf.g f136388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136389c;
    public final List d;
    public final List e;

    public e0(k71.i transactionDescriptor, cmf.g gVar, List list, List list2, List list3) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        this.f136387a = transactionDescriptor;
        this.f136388b = gVar;
        this.f136389c = list;
        this.d = list2;
        this.e = list3;
    }

    public static e0 a(e0 e0Var, cmf.g gVar, List list, List list2, List list3, int i) {
        cmf.g gVar2 = gVar;
        k71.i transactionDescriptor = e0Var.f136387a;
        if ((i & 2) != 0) {
            gVar2 = e0Var.f136388b;
        }
        if ((i & 4) != 0) {
            list = e0Var.f136389c;
        }
        if ((i & 8) != 0) {
            list2 = e0Var.d;
        }
        if ((i & 16) != 0) {
            list3 = e0Var.e;
        }
        List list4 = list3;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        List list5 = list2;
        return new e0(transactionDescriptor, gVar2, list, list5, list4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f136387a, e0Var.f136387a) && Intrinsics.f(this.f136388b, e0Var.f136388b) && Intrinsics.f(this.f136389c, e0Var.f136389c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f136387a.hashCode() * 31;
        cmf.g gVar = this.f136388b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list = this.f136389c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }
}
