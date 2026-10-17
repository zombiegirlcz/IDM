package nhi;

import aii.u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f215497a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f215498b = new ArrayList();

    public final com.revolut.kompot.navigable.a a(u destination, com.revolut.kompot.bridge.impl.rootflow.a flowModel) {
        com.revolut.kompot.navigable.a aVarG;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        Iterator it8 = this.f215497a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                aVarG = null;
                break;
            }
            aVarG = ((f) it8.next()).g(destination, flowModel);
            if (aVarG != null) {
                break;
            }
        }
        if (aVarG != null) {
            return aVarG;
        }
        throw new IllegalStateException(("Controller for " + destination + " not found").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(aii.x r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nhi.a
            if (r0 == 0) goto L13
            r0 = r7
            nhi.a r0 = (nhi.a) r0
            int r1 = r0.f215496y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215496y = r1
            goto L18
        L13:
            nhi.a r0 = new nhi.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f215494w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215496y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r6 = r0.v
            aii.x r2 = r0.u
            yhm.o.b(r7)
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.util.ArrayList r7 = r5.f215497a
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L3f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r6.next()
            nhi.f r2 = (nhi.f) r2
            r0.u = r7
            r0.v = r6
            r0.f215496y = r3
            java.lang.Object r2 = r2.d(r7, r0)
            if (r2 != r1) goto L58
            return r1
        L58:
            r4 = r2
            r2 = r7
            r7 = r4
        L5b:
            aii.u r7 = (aii.u) r7
            if (r7 == 0) goto L60
            goto L65
        L60:
            r7 = r2
            goto L3f
        L62:
            r6 = 0
            r2 = r7
            r7 = r6
        L65:
            if (r7 == 0) goto L68
            return r7
        L68:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Destination for "
            r7.<init>(r0)
            r7.append(r2)
            java.lang.String r0 = " not found"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nhi.b.b(aii.x, gim.c):java.lang.Object");
    }

    public final u c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it8 = this.f215497a.iterator();
        while (it8.hasNext()) {
            u uVarI = ((f) it8.next()).i(destination);
            if (uVarI != null) {
                return uVarI;
            }
        }
        return null;
    }

    public final aii.g d(aii.e descriptor) {
        aii.g gVarC;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Iterator it8 = this.f215497a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                gVarC = null;
                break;
            }
            gVarC = ((f) it8.next()).c(descriptor);
            if (gVarC != null) {
                break;
            }
        }
        if (gVarC != null) {
            return gVarC;
        }
        throw new IllegalStateException(("Controller for " + descriptor + " not found").toString());
    }
}
