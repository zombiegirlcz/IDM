package lmd;

import he3.m;
import he3.n;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.hc;
import tof.q6;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f196959b;

    public /* synthetic */ f(g gVar, int i) {
        this.f196958a = i;
        this.f196959b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f196958a;
        g gVar = this.f196959b;
        switch (i) {
            case 0:
                lzi.h cycle = (lzi.h) obj2;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                if (cycle instanceof lzi.g) {
                    return new n(((lzi.g) cycle).f200979a.getDayOfWeek());
                }
                if ((cycle instanceof lzi.c) || (cycle instanceof lzi.e)) {
                    return new m(((gqj.c) gVar.f196963g).d(null, cycle).f200981b.f99210a.getDayOfMonth());
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                fo3.c it8 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return gVar.f196964h.a(new hc(it8.f136801a, null));
            case 2:
                List scopes = (List) obj2;
                Intrinsics.checkNotNullParameter(scopes, "scopes");
                eqj.g gVar2 = gVar.f196964h;
                q6[] q6VarArr = (q6[]) scopes.toArray(new q6[0]);
                return gVar2.a((q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length));
            default:
                List scopes2 = (List) obj2;
                Intrinsics.checkNotNullParameter(scopes2, "scopes");
                eqj.g gVar3 = gVar.f196964h;
                q6[] q6VarArr2 = (q6[]) scopes2.toArray(new q6[0]);
                return gVar3.a((q6[]) Arrays.copyOf(q6VarArr2, q6VarArr2.length));
        }
    }
}
