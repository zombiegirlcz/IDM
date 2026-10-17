package xsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends jki.g implements f {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ish.a f308516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ish.b f308517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WidgetCarouselScreenContract$InputData f308518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f308519s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i mapper, ish.a widgetCatalogueInteractor, ish.b widgetContentInteractor, WidgetCarouselScreenContract$InputData inputData) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(widgetCatalogueInteractor, "widgetCatalogueInteractor");
        Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f308516p = widgetCatalogueInteractor;
        this.f308517q = widgetContentInteractor;
        this.f308518r = inputData;
        this.f308519s = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(xsh.r r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof xsh.m
            if (r0 == 0) goto L13
            r0 = r6
            xsh.m r0 = (xsh.m) r0
            int r1 = r0.f308509w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308509w = r1
            goto L18
        L13:
            xsh.m r0 = new xsh.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308509w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L45
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            java.util.LinkedHashMap r4 = r4.f308519s     // Catch: java.lang.Exception -> L45
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L45
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L45
            r0.f308509w = r3     // Catch: java.lang.Exception -> L45
            java.lang.Object r4 = skm.e0.m(r4, r0)     // Catch: java.lang.Exception -> L45
            if (r4 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xsh.r.y2(xsh.r, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r1.collect(r3, r5) != r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(xsh.r r18, java.lang.String r19, gim.c r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsh.r.z2(xsh.r, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        String str;
        String str2;
        Object hVar;
        String str3 = "widgetType";
        ish.a aVar = this.f308516p;
        WidgetCarouselScreenContract$InputData widgetCarouselScreenContract$InputData = this.f308518r;
        List<String> list = widgetCarouselScreenContract$InputData.f96386c;
        String sourceId = widgetCarouselScreenContract$InputData.f96385b;
        ArrayList arrayList = new ArrayList();
        for (String str4 : list) {
            try {
                BaseDraggableWidgetDelegate.Model modelA = ((ish.h) this.f308517q).a(widgetCarouselScreenContract$InputData.f96384a, str4, str4, null);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(str4, str3);
                Clause clauseB = aVar.b(sourceId).b(str4);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(str4, str3);
                try {
                    str = str3;
                    str2 = null;
                    try {
                        hVar = new h(str4, modelA, clauseB, aVar.b(sourceId).d(str4), null, null);
                    } catch (Exception e) {
                        e = e;
                        IllegalStateException illegalStateException = new IllegalStateException(e);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, str2, str2, illegalStateException, h0Var);
                        hVar = str2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = str3;
                    str2 = null;
                }
            } catch (Exception e4) {
                e = e4;
                str = str3;
                str2 = null;
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
            str3 = str;
        }
        List listP0 = d0.P0(arrayList, new n());
        Iterator it8 = listP0.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((h) it8.next()).f308500a, widgetCarouselScreenContract$InputData.d)) {
                break;
            } else {
                i++;
            }
        }
        x2(new j(listP0, kotlin.ranges.f.g(i, 0, v.j(listP0)), 0));
    }

    @Override // yji.l
    public final void P1() {
        this.f308519s.clear();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Iterator it8 = ((d) t2()).f308493a.iterator();
        while (it8.hasNext()) {
            n2(new xge.f(this, ((h) it8.next()).f308500a, null, 18), new whi.b(6));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return new d(f0.f322471a, -1);
    }
}
