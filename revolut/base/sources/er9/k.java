package er9;

import efm.h0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f128578b;

    public /* synthetic */ k(int i, Function1 function1) {
        this.f128577a = i;
        this.f128578b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) throws IOException {
        switch (this.f128577a) {
            case 4:
                ((h) this.f128578b).invoke(obj2);
                break;
            case 10:
                ((h) this.f128578b).invoke(obj2);
                break;
            case 13:
                ((b22.j) this.f128578b).invoke(obj2);
                break;
            case 14:
                ((eq4.c) this.f128578b).invoke(obj2);
                break;
            case 15:
                ((i) this.f128578b).invoke(obj2);
                break;
            case 19:
                ((n) this.f128578b).invoke(obj2);
                break;
            case 21:
                ((i) this.f128578b).invoke(obj2);
                break;
            case 23:
                ((n) this.f128578b).invoke(obj2);
                break;
            default:
                ((y) this.f128578b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f128577a) {
            case 0:
                h hVar = (h) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar.invoke(p0);
            case 1:
                i iVar = (i) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar.invoke(p0);
            case 2:
                i iVar2 = (i) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar2.invoke(p0);
            case 3:
                m mVar = (m) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) mVar.invoke(p0);
            case 4:
            case 10:
            case 13:
            case 14:
            case 15:
            case 19:
            case 21:
            case 23:
            case 26:
            case 27:
            default:
                esj.y yVar = (esj.y) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) yVar.invoke(p0);
            case 5:
                e2j.i iVar3 = (e2j.i) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar3.invoke(p0);
            case 6:
                a82.r rVar = (a82.r) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) rVar.invoke(p0);
            case 7:
                m mVar2 = (m) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) mVar2.invoke(p0);
            case 8:
                i iVar4 = (i) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar4.invoke(p0);
            case 9:
                h hVar2 = (h) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar2.invoke(p0);
            case 11:
                h hVar3 = (h) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar3.invoke(p0);
            case 12:
                h hVar4 = (h) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar4.invoke(p0);
            case 16:
                i iVar5 = (i) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar5.invoke(p0);
            case 17:
                i iVar6 = (i) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar6.invoke(p0);
            case 18:
                n nVar = (n) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) nVar.invoke(p0);
            case 20:
                n nVar2 = (n) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) nVar2.invoke(p0);
            case 22:
                n nVar3 = (n) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) nVar3.invoke(p0);
            case 24:
                eqd.h hVar5 = (eqd.h) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar5.invoke(p0);
            case 25:
                eqd.h hVar6 = (eqd.h) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar6.invoke(p0);
            case 28:
                esj.y yVar2 = (esj.y) this.f128578b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (esj.o) yVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        eq4.g gVar = (eq4.g) this.f128578b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) gVar.invoke(p0)).booleanValue();
    }
}
