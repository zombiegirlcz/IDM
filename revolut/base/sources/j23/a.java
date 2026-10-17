package j23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.y;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a implements p {

    @NotNull
    public static final C0965a Companion = new C0965a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f170655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f170656b;

    /* JADX INFO: renamed from: j23.a$a, reason: collision with other inner class name */
    public static final class C0965a {
        private C0965a() {
        }
    }

    public a() {
        f0 f0Var = f0.f322471a;
        this.f170655a = f0Var;
        this.f170656b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:21:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(j23.a r8, java.lang.String r9, java.lang.Object r10, gim.c r11) {
        /*
            j23.g r0 = j23.g.f170666a
            boolean r1 = r11 instanceof j23.c
            if (r1 == 0) goto L15
            r1 = r11
            j23.c r1 = (j23.c) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            j23.c r1 = new j23.c
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.z
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.B
            r4 = 1
            if (r3 == 0) goto L42
            if (r3 != r4) goto L3a
            java.util.Iterator r8 = r1.f170661y
            j23.i r9 = r1.f170660x
            java.lang.Object r10 = r1.f170659w
            java.lang.String r3 = r1.v
            j23.a r5 = r1.u
            yhm.o.b(r11)
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            r7 = r3
            r3 = r10
            r10 = r7
            goto L75
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            yhm.o.b(r11)
            java.lang.Object r11 = r8.f170655a
            java.util.Iterator r11 = r11.iterator()
            r3 = r1
            r1 = r10
            r10 = r9
            r9 = r8
            r8 = r11
            r11 = r0
        L51:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r8.next()
            j23.m r5 = (j23.m) r5
            r3.u = r9
            r3.v = r10
            r3.f170659w = r1
            r3.f170660x = r11
            r3.f170661y = r8
            r3.B = r4
            java.lang.Object r5 = r5.c(r1, r10, r3)
            if (r5 != r2) goto L70
            return r2
        L70:
            r7 = r1
            r1 = r11
            r11 = r5
            r5 = r3
            r3 = r7
        L75:
            j23.i r11 = (j23.i) r11
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r11, r0)
            if (r6 != 0) goto L7f
            r1 = r3
            goto L83
        L7f:
            r11 = r1
            r1 = r3
            r3 = r5
            goto L51
        L83:
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r11, r0)
            if (r8 == 0) goto Lb9
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.Object r9 = r9.f170655a
            int r9 = r9.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "None of "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = " handlers can handle item click, listId: "
            r2.append(r9)
            r2.append(r10)
            java.lang.String r9 = ", parcel: "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            r10 = 0
            java.lang.String r1 = "OrderNewCardBaseScreenBuilder"
            rd0.d.a(r0, r1, r9, r10, r8)
        Lb9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.a.d(j23.a, java.lang.String, java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:21:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(j23.a r7, ty0.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof j23.d
            if (r0 == 0) goto L13
            r0 = r9
            j23.d r0 = (j23.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            j23.d r0 = new j23.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f170664y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r7 = r0.f170663x
            java.util.Iterator r8 = r0.f170662w
            ty0.a r2 = r0.v
            j23.a r5 = r0.u
            yhm.o.b(r9)
            r6 = r2
            r2 = r7
            r7 = r5
            r5 = r0
            r0 = r6
            goto L6d
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f170656b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r9 = r8
            r8 = r6
        L4b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r8.next()
            r5 = r2
            j23.e r5 = (j23.e) r5
            r0.u = r7
            r0.v = r9
            r0.f170662w = r8
            r0.f170663x = r2
            r0.A = r4
            java.lang.Object r5 = r5.r0(r9, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            r6 = r0
            r0 = r9
            r9 = r5
            r5 = r6
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L77
            r9 = r0
            goto L7b
        L77:
            r9 = r0
            r0 = r5
            goto L4b
        L7a:
            r2 = r3
        L7b:
            j23.e r2 = (j23.e) r2
            if (r2 != 0) goto L9c
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.Object r7 = r7.f170656b
            int r7 = r7.size()
            java.lang.String r9 = r9.f275445a
            java.lang.String r1 = "None of "
            java.lang.String r2 = " handlers can handle clause click, id: "
            java.lang.String r7 = j6.a.m(r7, r1, r2, r9)
            java.lang.String r9 = "OrderNewCardBaseScreenBuilder"
            rd0.d.a(r0, r9, r7, r3, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L9c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.a.e(j23.a, ty0.a, gim.c):java.lang.Object");
    }

    public final Flow c(List blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        List<o> list = blocks;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((o) it8.next()).f170672b, arrayList);
        }
        this.f170655a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            a0.x(((o) it9.next()).f170673c, arrayList2);
        }
        this.f170656b = arrayList2;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (o oVar : list) {
            arrayList3.add(vkm.q.q(new y(oVar.f170671a, new iw6.l(oVar, (Continuation) null, 2))));
        }
        return vkm.q.q(new b((Flow[]) d0.d1(arrayList3).toArray(new Flow[0]), 0));
    }
}
