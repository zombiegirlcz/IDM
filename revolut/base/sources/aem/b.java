package aem;

import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b implements bem.a, i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3691b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3692c = new b(1);
    public static final b d = new b(2);
    public static final b e = new b(3);
    public static final b f = new b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f3693g = new b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3694a;

    public /* synthetic */ b(int i) {
        this.f3694a = i;
    }

    @Override // aem.i0
    public Object a(Function1 block) {
        switch (this.f3694a) {
            case 6:
                Intrinsics.checkNotNullParameter(block, "block");
                return new i(block);
            default:
                Intrinsics.checkNotNullParameter(block, "block");
                block.invoke(new b(7));
                return new y0();
        }
    }

    @Override // aem.i0
    public void b(Object obj2, vdm.b scope) {
        switch (this.f3694a) {
            case 6:
                i plugin = (i) obj2;
                Intrinsics.checkNotNullParameter(plugin, "plugin");
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.d.f(fem.g.f, new e(plugin, (Continuation) null));
                break;
            default:
                y0 plugin2 = (y0) obj2;
                Intrinsics.checkNotNullParameter(plugin2, "plugin");
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.d.f(fem.g.f134667j, new c0(plugin2, scope, null, 2));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bem.a
    public void c(vdm.b client, gim.i iVar) throws InvalidPhaseException {
        a1m.e eVar;
        jem.b bVar;
        switch (this.f3694a) {
            case 0:
                Function2 handler = (Function2) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler, "handler");
                client.f288081g.f(hem.b.f151726h, new a(handler, null, 0));
                return;
            case 1:
                Function3 handler2 = (Function3) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler2, "handler");
                jem.b phase = new jem.b("ObservableContent");
                fem.g gVar = client.d;
                jem.b reference = fem.g.i;
                ArrayList arrayList = gVar.f262230a;
                Intrinsics.checkNotNullParameter(reference, "reference");
                Intrinsics.checkNotNullParameter(phase, "phase");
                if (!gVar.e(phase)) {
                    int iC = gVar.c(reference);
                    if (iC == -1) {
                        throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
                    }
                    int i = iC + 1;
                    int iJ = zhm.v.j(arrayList);
                    if (i <= iJ) {
                        while (true) {
                            Object obj2 = arrayList.get(i);
                            sem.d dVar = obj2 instanceof sem.d ? (sem.d) obj2 : null;
                            if (dVar != null && (eVar = dVar.f262228b) != null) {
                                sem.h hVar = eVar instanceof sem.h ? (sem.h) eVar : null;
                                if (hVar != null && (bVar = hVar.f262235b) != null && bVar.equals(reference)) {
                                    iC = i;
                                }
                                if (i != iJ) {
                                    i++;
                                }
                            }
                        }
                    }
                    arrayList.add(iC + 1, new sem.d(phase, new sem.h(reference)));
                }
                client.d.f(phase, new c(handler2, null, 0));
                return;
            case 2:
                Function3 handler3 = (Function3) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler3, "handler");
                jem.b phase2 = new jem.b("BeforeReceive");
                hem.f fVar = client.e;
                jem.b relativeTo = hem.f.f;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(relativeTo, "reference");
                Intrinsics.checkNotNullParameter(phase2, "phase");
                if (!fVar.e(phase2)) {
                    int iC2 = fVar.c(relativeTo);
                    if (iC2 == -1) {
                        throw new InvalidPhaseException("Phase " + relativeTo + " was not registered for this pipeline");
                    }
                    ArrayList arrayList2 = fVar.f262230a;
                    Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
                    arrayList2.add(iC2, new sem.d(phase2, new sem.i()));
                }
                client.e.f(phase2, new f1(handler3, null, 0));
                return;
            case 3:
                Function3 handler4 = (Function3) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler4, "handler");
                client.d.f(fem.g.i, new c(handler4, null, 1));
                return;
            case 4:
                Function3 handler5 = (Function3) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler5, "handler");
                client.d.f(fem.g.f, new f1(handler5, null, 1));
                return;
            default:
                Function3 handler6 = (Function3) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler6, "handler");
                client.d.f(fem.g.f, new f1(handler6, null, 2));
                return;
        }
    }

    @Override // aem.i0
    public oem.a getKey() {
        switch (this.f3694a) {
            case 6:
                return i.f3732c;
            default:
                return y0.f3799c;
        }
    }
}
