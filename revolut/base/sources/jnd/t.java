package jnd;

import bn2.x;
import com.revolut.data.model.Data;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends yji.d {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jzi.a f176726c;
    public final CoroutineScope d;
    public final LocalDate e;
    public final ConcurrentHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ukm.q f176727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f176728h;

    public t(jzi.a budgetInteractor, l80.e dateProvider, CoroutineScope pageScope) {
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pageScope, "pageScope");
        this.f176726c = budgetInteractor;
        this.d = pageScope;
        this.e = ((l80.f) dateProvider).e().plusDays(1L);
        this.f = new ConcurrentHashMap();
        this.f176727g = vc.s.a(Integer.MAX_VALUE, null, null, 6);
        this.f176728h = e0.C(pageScope, null, null, new jec.p(this, null, 17), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if (r11 != r2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c8 -> B:43:0x00ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(jnd.t r11, jnd.n r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jnd.t.Q(jnd.t, jnd.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(jnd.t r10, kotlinx.coroutines.flow.MutableStateFlow r11, int r12, com.revolut.data.model.Data r13) {
        /*
        L0:
            java.lang.Object r10 = r11.getValue()
            r0 = r10
            jnd.m r0 = (jnd.m) r0
            java.util.Map r1 = r0.f176717b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Object r1 = r1.get(r2)
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            boolean r2 = r13.getLoading()
            r3 = 0
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r13.getContent()
            if (r2 != 0) goto L3a
            if (r1 == 0) goto L29
            java.lang.Object r2 = r1.getContent()
            lzi.n r2 = (lzi.n) r2
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r2 == 0) goto L3a
            java.lang.Object r5 = r1.getContent()
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r13
            com.revolut.data.model.Data r13 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
            goto L3c
        L3a:
            r4 = r13
            r13 = r4
        L3c:
            java.time.LocalDate r1 = r0.f176716a
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r13.getContent()
            lzi.n r1 = (lzi.n) r1
            if (r1 == 0) goto L4c
            java.time.LocalDate r3 = r1.f200991b
            goto L4c
        L4b:
            r3 = r1
        L4c:
            java.util.Map r0 = r0.f176717b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r13)
            java.util.Map r13 = zhm.r0.q(r0, r2)
            java.lang.String r0 = "pages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            jnd.m r0 = new jnd.m
            r0.<init>(r3, r13)
            boolean r10 = r11.h(r10, r0)
            if (r10 == 0) goto L6c
            return
        L6c:
            r13 = r4
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: jnd.t.R(jnd.t, kotlinx.coroutines.flow.MutableStateFlow, int, com.revolut.data.model.Data):void");
    }

    public static int T(LocalDate localDate, LocalDate localDate2) {
        int iBetween = (int) (ChronoUnit.MONTHS.between(localDate2, localDate) / 12);
        if (iBetween < 0) {
            iBetween = 0;
        }
        while (localDate2.compareTo((ChronoLocalDate) U(iBetween, localDate)) < 0) {
            iBetween++;
        }
        while (iBetween > 0 && localDate2.compareTo((ChronoLocalDate) localDate.minusMonths(((long) iBetween) * 12)) >= 0) {
            iBetween--;
        }
        return iBetween;
    }

    public static LocalDate U(int i, LocalDate localDate) {
        LocalDate localDateMinusMonths = localDate.minusMonths((((long) i) + 1) * 12);
        Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "minusMonths(...)");
        return localDateMinusMonths;
    }

    public final Object S(String str, MutableStateFlow mutableStateFlow, int i, s sVar) {
        int i2 = i;
        LocalDate anchor = this.e;
        Intrinsics.checkNotNullExpressionValue(anchor, "anchor");
        LocalDate localDateU = U(i2, anchor);
        LocalDate localDateMinusMonths = anchor.minusMonths(((long) i2) * 12);
        LocalDate localDate = ((m) mutableStateFlow.getValue()).f176716a;
        if (localDate == null) {
            localDate = localDateU;
        }
        LocalDate localDate2 = (LocalDate) cim.c.k(localDateU, localDate);
        if (localDate2.compareTo((ChronoLocalDate) localDateMinusMonths) >= 0) {
            return Unit.f186387a;
        }
        Data data = (Data) ((m) mutableStateFlow.getValue()).f176717b.get(new Integer(i2));
        if (data != null && (data.getLoading() || (data.getContent() != null && data.getError() == null))) {
            return Unit.f186387a;
        }
        Data data2 = new Data(data != null ? (lzi.n) data.getContent() : null, null, true, 2, null);
        while (true) {
            Object value = mutableStateFlow.getValue();
            m mVar = (m) value;
            Map pages = r0.q(mVar.f176717b, new Pair(new Integer(i2), data2));
            LocalDate localDate3 = mVar.f176716a;
            Intrinsics.checkNotNullParameter(pages, "pages");
            if (mutableStateFlow.h(value, new m(localDate3, pages))) {
                break;
            }
            i2 = i;
        }
        skm.r rVarB = e0.b();
        e0.C(this.d, null, null, new x(rVarB, this, str, localDate2, localDateMinusMonths, i2, mutableStateFlow, null), 3);
        Object objY = rVarB.y(sVar);
        return objY == fim.a.COROUTINE_SUSPENDED ? objY : Unit.f186387a;
    }

    @Override // yji.d
    public final void onDestroy() {
        this.f176727g.close(null);
        e0.k(this.d, null);
        this.f.clear();
    }
}
