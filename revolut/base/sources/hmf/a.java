package hmf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements b0 {

    @NotNull
    public static final C0880a Companion = new C0880a();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f153714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f153715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f153716c;

    /* JADX INFO: renamed from: hmf.a$a, reason: collision with other inner class name */
    public static final class C0880a {
        private C0880a() {
        }
    }

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(500, pkm.e.MILLISECONDS);
    }

    public a() {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f153714a = f0Var;
        this.f153715b = f0Var;
        this.f153716c = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:21:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(hmf.a r7, java.lang.String r8, java.lang.Object r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof hmf.d
            if (r0 == 0) goto L13
            r0 = r10
            hmf.d r0 = (hmf.d) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            hmf.d r0 = new hmf.d
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r7 = r0.f153731y
            java.util.Iterator r8 = r0.f153730x
            java.lang.Object r9 = r0.f153729w
            java.lang.String r2 = r0.v
            hmf.a r5 = r0.u
            yhm.o.b(r10)
            r6 = r2
            r2 = r7
            r7 = r5
            r5 = r0
            r0 = r9
            r9 = r6
            goto L73
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            yhm.o.b(r10)
            java.lang.Object r10 = r7.f153715b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r8.next()
            r5 = r2
            elf.s0 r5 = (elf.s0) r5
            r0.u = r7
            r0.v = r9
            r0.f153729w = r10
            r0.f153730x = r8
            r0.f153731y = r2
            r0.B = r4
            java.lang.Object r5 = r5.c(r10, r9, r0)
            if (r5 != r1) goto L6f
            return r1
        L6f:
            r6 = r0
            r0 = r10
            r10 = r5
            r5 = r6
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            r10 = r0
            goto L81
        L7d:
            r10 = r0
            r0 = r5
            goto L4f
        L80:
            r2 = r3
        L81:
            elf.s0 r2 = (elf.s0) r2
            if (r2 != 0) goto Lb8
            java.util.Set r8 = r7.j()
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.Object r7 = r7.f153715b
            int r7 = r7.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "None of "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " handlers can handle action click, listId: "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = ", parcel: "
            r1.append(r7)
            r1.append(r10)
            java.lang.String r7 = r1.toString()
            java.lang.String r9 = "TransactionDetailsBaseScreenBuilder"
            rd0.d.a(r0, r9, r7, r3, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
        Lb8:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hmf.a.k(hmf.a, java.lang.String, java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:21:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object l(hmf.a r7, java.lang.String r8, java.lang.Object r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof hmf.e
            if (r0 == 0) goto L13
            r0 = r10
            hmf.e r0 = (hmf.e) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            hmf.e r0 = new hmf.e
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r7 = r0.f153734y
            java.util.Iterator r8 = r0.f153733x
            java.lang.Object r9 = r0.f153732w
            java.lang.String r2 = r0.v
            hmf.a r5 = r0.u
            yhm.o.b(r10)
            r6 = r2
            r2 = r7
            r7 = r5
            r5 = r0
            r0 = r9
            r9 = r6
            goto L73
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            yhm.o.b(r10)
            java.lang.Object r10 = r7.f153716c
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r8.next()
            r5 = r2
            elf.s0 r5 = (elf.s0) r5
            r0.u = r7
            r0.v = r9
            r0.f153732w = r10
            r0.f153733x = r8
            r0.f153734y = r2
            r0.B = r4
            java.lang.Object r5 = r5.c(r10, r9, r0)
            if (r5 != r1) goto L6f
            return r1
        L6f:
            r6 = r0
            r0 = r10
            r10 = r5
            r5 = r6
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            r10 = r0
            goto L81
        L7d:
            r10 = r0
            r0 = r5
            goto L4f
        L80:
            r2 = r3
        L81:
            elf.s0 r2 = (elf.s0) r2
            if (r2 != 0) goto Lb8
            java.util.Set r8 = r7.j()
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.Object r7 = r7.f153716c
            int r7 = r7.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "None of "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " handlers can handle item click, listId: "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = ", parcel: "
            r1.append(r7)
            r1.append(r10)
            java.lang.String r7 = r1.toString()
            java.lang.String r9 = "TransactionDetailsBaseScreenBuilder"
            rd0.d.a(r0, r9, r7, r3, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
        Lb8:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hmf.a.l(hmf.a, java.lang.String, java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:21:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m(hmf.a r7, java.lang.String r8, java.lang.Object r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof hmf.f
            if (r0 == 0) goto L13
            r0 = r10
            hmf.f r0 = (hmf.f) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            hmf.f r0 = new hmf.f
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r7 = r0.f153738y
            java.util.Iterator r8 = r0.f153737x
            java.lang.Object r9 = r0.f153736w
            java.lang.String r2 = r0.v
            hmf.a r5 = r0.u
            yhm.o.b(r10)
            r6 = r2
            r2 = r7
            r7 = r5
            r5 = r0
            r0 = r9
            r9 = r6
            goto L73
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            yhm.o.b(r10)
            java.lang.Object r10 = r7.f153714a
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r8.next()
            r5 = r2
            elf.s0 r5 = (elf.s0) r5
            r0.u = r7
            r0.v = r9
            r0.f153736w = r10
            r0.f153737x = r8
            r0.f153738y = r2
            r0.B = r4
            java.lang.Object r5 = r5.c(r10, r9, r0)
            if (r5 != r1) goto L6f
            return r1
        L6f:
            r6 = r0
            r0 = r10
            r10 = r5
            r5 = r6
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            r10 = r0
            goto L81
        L7d:
            r10 = r0
            r0 = r5
            goto L4f
        L80:
            r2 = r3
        L81:
            elf.s0 r2 = (elf.s0) r2
            if (r2 != 0) goto Lb8
            java.util.Set r8 = r7.j()
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.Object r7 = r7.f153714a
            int r7 = r7.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "None of "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " handlers can handle menu item click, listId: "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = ", parcel: "
            r1.append(r7)
            r1.append(r10)
            java.lang.String r7 = r1.toString()
            java.lang.String r9 = "TransactionDetailsBaseScreenBuilder"
            rd0.d.a(r0, r9, r7, r3, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
        Lb8:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hmf.a.m(hmf.a, java.lang.String, java.lang.Object, gim.c):java.lang.Object");
    }

    public final ag1.k f(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        List<cmf.f> list = actions;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(((cmf.f) it8.next()).f25228b, arrayList);
        }
        this.f153715b = arrayList;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (cmf.f fVar : list) {
            arrayList2.add(vkm.q.q(zi0.c.M(new vkm.y(fVar.f25227a, new b(fVar, this, null)), zhm.f0.f322471a, d, "Actions flow ".concat(fVar.f25229c))));
        }
        Flow[] flowArr = (Flow[]) arrayList2.toArray(new Flow[0]);
        return new ag1.k((Flow[]) Arrays.copyOf(flowArr, flowArr.length), 25);
    }

    public final ag1.k g(List options) {
        Intrinsics.checkNotNullParameter(options, "options");
        List<cmf.k> list = options;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(((cmf.k) it8.next()).f25242b, arrayList);
        }
        this.f153714a = arrayList;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (cmf.k kVar : list) {
            arrayList2.add(vkm.q.q(zi0.c.M(new vkm.y(kVar.f25241a, new eh9.j(kVar, this, (Continuation) null, 18)), zhm.f0.f322471a, d, "Menu items flow ".concat(kVar.f25243c))));
        }
        Flow[] flowArr = (Flow[]) arrayList2.toArray(new Flow[0]);
        return new ag1.k((Flow[]) Arrays.copyOf(flowArr, flowArr.length), 26);
    }

    public final Flow h(List blocks) {
        Continuation continuation;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        List list = blocks;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(((cmf.p) it8.next()).f25247c, arrayList);
        }
        this.f153716c = arrayList;
        ArrayList flows = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (true) {
            continuation = null;
            if (!it9.hasNext()) {
                break;
            }
            cmf.p pVar = (cmf.p) it9.next();
            Flow flow = pVar.f25245a;
            Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
            flows.add(vkm.q.q(new vkm.y(vkm.q.C(flow, oji.e.f225788b), new eh9.j(pVar, this, continuation, 19))));
        }
        ArrayList names = new ArrayList(zhm.w.t(list, 10));
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            names.add(((cmf.p) it10.next()).d);
        }
        Intrinsics.checkNotNullParameter(flows, "flows");
        v1 v1Var = new v1(new dmf.c(flows, continuation, 0));
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        Intrinsics.checkNotNullParameter(names, "names");
        return vkm.q.q(new exe.j(new g0c.e(v1Var, new AtomicBoolean(false), names, 21), 16));
    }

    public abstract klf.h0 i();

    public final Set j() {
        Pair[] elements = {new Pair("txn_group_id", i().f185494j), new Pair("screen_builder", String.valueOf(i().f185495l))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
