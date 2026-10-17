package sem;

import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f262230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f262231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f262232c;
    public jem.b d;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public e(jem.b... phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        new oem.e();
        this.f262230a = v.n(Arrays.copyOf(phases, phases.length));
        this.interceptors$delegate = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, java.lang.Object r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sem.e.a(java.lang.Object, java.lang.Object, gim.c):java.lang.Object");
    }

    public final d b(jem.b bVar) {
        ArrayList arrayList = this.f262230a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 == bVar) {
                d dVar = new d(bVar, j.f262236b);
                arrayList.set(i, dVar);
                return dVar;
            }
            if (obj2 instanceof d) {
                d dVar2 = (d) obj2;
                if (dVar2.f262227a == bVar) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final int c(jem.b bVar) {
        ArrayList arrayList = this.f262230a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 == bVar || ((obj2 instanceof d) && ((d) obj2).f262227a == bVar)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(jem.b bVar) {
        ArrayList arrayList = this.f262230a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 == bVar) {
                return true;
            }
            if ((obj2 instanceof d) && ((d) obj2).f262227a == bVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(jem.b phase, Function3 interceptor) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(interceptor, "block");
        d dVarB = b(phase);
        if (dVarB == null) {
            throw new InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        List list = (List) this.interceptors$delegate;
        if (!this.f262230a.isEmpty() && list != null && !this.f262232c && (list instanceof List) && (!(list instanceof pim.a) || (list instanceof pim.d))) {
            if (Intrinsics.f(this.d, phase)) {
                list.add(interceptor);
            } else if (Intrinsics.f(phase, d0.m0(this.f262230a)) || c(phase) == v.j(this.f262230a)) {
                d dVarB2 = b(phase);
                Intrinsics.h(dVarB2);
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                if (dVarB2.d) {
                    dVarB2.f262229c = d0.f1(dVarB2.f262229c);
                    dVarB2.d = false;
                }
                dVarB2.f262229c.add(interceptor);
                list.add(interceptor);
            }
            this.f262231b++;
            return;
        }
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (dVarB.d) {
            dVarB.f262229c = d0.f1(dVarB.f262229c);
            dVarB.d = false;
        }
        dVarB.f262229c.add(interceptor);
        this.f262231b++;
        this.interceptors$delegate = null;
        this.f262232c = false;
        this.d = null;
    }
}
