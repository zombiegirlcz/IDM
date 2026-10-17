package mh4;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f205392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f205394c;
    public final Data d;
    public final mv3.a e;
    public final mv3.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mv3.k f205395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f205396h;

    public k(ax4.b constructorState, boolean z, boolean z3, Data creditToRefinanceContent, mv3.a aVar, mv3.e eVar, mv3.k kVar, j jVar) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(creditToRefinanceContent, "creditToRefinanceContent");
        this.f205392a = constructorState;
        this.f205393b = z;
        this.f205394c = z3;
        this.d = creditToRefinanceContent;
        this.e = aVar;
        this.f = eVar;
        this.f205395g = kVar;
        this.f205396h = jVar;
    }

    public static k a(k kVar, ax4.b bVar, Data data, mv3.a aVar, mv3.e eVar, mv3.k kVar2, j jVar, int i) {
        if ((i & 1) != 0) {
            bVar = kVar.f205392a;
        }
        ax4.b constructorState = bVar;
        boolean z = kVar.f205393b;
        boolean z3 = (i & 4) != 0 ? kVar.f205394c : true;
        if ((i & 8) != 0) {
            data = kVar.d;
        }
        Data creditToRefinanceContent = data;
        if ((i & 16) != 0) {
            aVar = kVar.e;
        }
        mv3.a aVar2 = aVar;
        mv3.e eVar2 = (i & 32) != 0 ? kVar.f : eVar;
        mv3.k kVar3 = (i & 64) != 0 ? kVar.f205395g : kVar2;
        j jVar2 = (i & 128) != 0 ? kVar.f205396h : jVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(creditToRefinanceContent, "creditToRefinanceContent");
        return new k(constructorState, z, z3, creditToRefinanceContent, aVar2, eVar2, kVar3, jVar2);
    }

    public final ArrayList c() {
        Iterable iterable;
        mv3.k kVar = this.f205395g;
        if (kVar == null || (iterable = kVar.f209134a) == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (((mv3.f) obj2).f209122c) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((mv3.f) it8.next()).f209120a);
        }
        return arrayList2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f205392a, kVar.f205392a) && this.f205393b == kVar.f205393b && this.f205394c == kVar.f205394c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f205395g, kVar.f205395g) && Intrinsics.f(this.f205396h, kVar.f205396h);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, j6.a.c(j6.a.c(this.f205392a.hashCode() * 31, 31, this.f205393b), 31, this.f205394c), 31);
        mv3.a aVar = this.e;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        mv3.e eVar = this.f;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        mv3.k kVar = this.f205395g;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        j jVar = this.f205396h;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }
}
