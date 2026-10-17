package l97;

import a41.j1;
import android.os.SystemClock;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements r {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o97.n f193062r = new o97.n(zhm.f0.f322471a, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f193064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GlobalSearchContext f193065c;
    public final i97.d d;
    public final l80.h e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o97.a0 f193066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f193067h;
    public final LinkedHashSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f193068j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f193069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile b0[] f193070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Data f193071n;
    public volatile long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f193072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f193073q;

    public i0(String query, List sources, GlobalSearchContext context, i97.d remoteSearchRepository, l80.h timeProvider, q sessionType, o97.a0 settings) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteSearchRepository, "remoteSearchRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f193063a = query;
        this.f193064b = sources;
        this.f193065c = context;
        this.d = remoteSearchRepository;
        this.e = timeProvider;
        this.f = sessionType;
        this.f193066g = settings;
        this.f193067h = new a();
        this.i = new LinkedHashSet();
        q qVar = q.SUGGESTIONS;
        this.f193068j = sessionType == qVar;
        this.k = sessionType == qVar;
        int size = sources.size();
        b0[] b0VarArr = new b0[size];
        for (int i = 0; i < size; i++) {
            b0VarArr[i] = new b0((z87.f) this.f193064b.get(i));
        }
        this.f193070m = b0VarArr;
        this.o = -1L;
        this.f193073q = -1L;
    }

    public static final List a(i0 i0Var) {
        List list;
        List list2;
        List list3;
        if (i0Var.k) {
            b0[] b0VarArr = i0Var.f193070m;
            int length = b0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Data data = b0VarArr[i].d;
                if (data == null || data.getLoading()) {
                    i2++;
                }
                i++;
            }
            if (i2 == 0) {
                ArrayList arrayListE = e(b0VarArr);
                return arrayListE.isEmpty() ? a.a(i0Var.f193063a) : arrayListE;
            }
            b0 b0Var = b0VarArr[0];
            Data data2 = b0Var.d;
            boolean zB = b0Var.f193046a.b();
            int i3 = c0.f193051a[i0Var.f.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i0Var.f193068j) {
                        ArrayList arrayListE2 = e(b0VarArr);
                        if (data2 != null) {
                            if (zB && data2.getLoading()) {
                                data = data2;
                            }
                            if (data != null && (list3 = (List) data.getContent()) != null) {
                                arrayListE2.addAll(0, list3);
                            }
                        }
                        return arrayListE2.isEmpty() ? a.a(i0Var.f193063a) : arrayListE2;
                    }
                } else if (i0Var.f193068j || ((zB && data2 != null && !data2.getLoading()) || i0Var.f193069l)) {
                    if (!i0Var.f193068j) {
                        ArrayList arrayList = new ArrayList();
                        if (data2 != null) {
                            data = zB && data2.getLoading() ? data2 : null;
                            if (data != null && (list = (List) data.getContent()) != null) {
                                arrayList.addAll(0, list);
                            }
                        }
                        zhm.a0.x(d(), arrayList);
                        return arrayList;
                    }
                    ArrayList arrayListE3 = e(b0VarArr);
                    boolean zIsEmpty = arrayListE3.isEmpty();
                    if (data2 != null) {
                        if (zB && data2.getLoading()) {
                            data = data2;
                        }
                        if (data != null && (list2 = (List) data.getContent()) != null) {
                            arrayListE3.addAll(0, list2);
                        }
                    }
                    if (zIsEmpty) {
                        if (data2 == null || data2.getLoading()) {
                            i2--;
                        }
                        if (i2 > 0) {
                            zhm.a0.x(d(), arrayListE3);
                        }
                    }
                    return arrayListE3;
                }
            }
        }
        return null;
    }

    public static final void b(i0 i0Var, z zVar, long j2) {
        if (zVar instanceof v) {
            for (b0 b0Var : i0Var.f193070m) {
                if (b0Var.d == null) {
                    b0Var.d = new Data(null, null, false, 2, null);
                }
            }
            return;
        }
        if (zVar instanceof u) {
            i0Var.f193069l = true;
            return;
        }
        if (zVar instanceof w) {
            i0Var.f193068j = true;
            return;
        }
        i0Var.getClass();
        if (zVar instanceof y) {
            y yVar = (y) zVar;
            b0 b0Var2 = yVar.f193104a;
            Data data = yVar.f193105b;
            Data data2 = b0Var2.d;
            List list = data2 != null ? (List) data2.getContent() : null;
            Data data3 = (Data) iii.c.f(data, new l5a.u(22), new l2c.v(26), new kcg.j(i0Var, 28));
            if (list == null || !data3.getLoading()) {
                b0Var2.d = data3;
                if (b0Var2.f193047b >= 0 || data3.getLoading()) {
                    return;
                }
                b0Var2.f193047b = SystemClock.elapsedRealtime() - j2;
                return;
            }
            return;
        }
        if (!(zVar instanceof x)) {
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashSet linkedHashSet = ((x) zVar).f193103a;
        i0Var.k = true;
        if (linkedHashSet != null) {
            b0[] b0VarArr = i0Var.f193070m;
            ArrayList arrayList = new ArrayList();
            for (b0 b0Var3 : b0VarArr) {
                if (linkedHashSet.contains(b0Var3.f193046a.h())) {
                    arrayList.add(b0Var3);
                }
            }
            List listP0 = zhm.d0.P0(arrayList, new k2j.d(linkedHashSet, 4));
            ArrayList<b0> arrayList2 = new ArrayList();
            for (b0 b0Var4 : b0VarArr) {
                if (!listP0.contains(b0Var4)) {
                    arrayList2.add(b0Var4);
                }
            }
            for (b0 b0Var5 : arrayList2) {
                a2 a2Var = b0Var5.f193048c;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                b0Var5.f193048c = null;
            }
            i0Var.f193070m = (b0[]) listP0.toArray(new b0[0]);
        }
    }

    public static final efm.r c(i0 i0Var, AtomicReference atomicReference) {
        o97.m mVarA;
        if (i0Var.f193063a.length() == 0) {
            efm.r rVarJust = efm.r.just(new Data(f193062r, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        LinkedHashSet types = new LinkedHashSet();
        for (z87.f fVar : i0Var.f193064b) {
            if (fVar instanceof z87.e) {
                mVarA = ((z87.e) fVar).a();
            } else if (fVar instanceof z87.c) {
                mVarA = ((z87.c) fVar).a();
            } else {
                if (!(fVar instanceof z87.d) && !(fVar instanceof ky9.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mVarA = null;
            }
            if (mVarA != null) {
                types.add(mVarA);
            }
        }
        if (types.isEmpty()) {
            efm.r rVarJust2 = efm.r.just(new Data(f193062r, null, false, 6, null));
            Intrinsics.h(rVarJust2);
            return rVarJust2;
        }
        i97.d dVar = i0Var.d;
        String query = i0Var.f193063a;
        GlobalSearchContext context = i0Var.f193065c;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarC = rd0.e.c(new v1(new j1(query, types, context, dVar, (Continuation) null)), p0.f264003c);
        if (i0Var.f193071n == null) {
            n0 n0Var = new n0();
            n0Var.f186428a = -1L;
            rVarC = rVarC.doOnNext(new l5i.b(15, new s(i0Var, n0Var))).mergeWith(efm.r.empty().doOnSubscribe(new l5i.b(14, new s(n0Var, i0Var))));
            Intrinsics.checkNotNullExpressionValue(rVarC, "mergeWith(...)");
        }
        agm.a aVarReplay = rVarC.replay(1);
        l5i.b bVar = new l5i.b(16, new t(atomicReference, 0));
        aVarReplay.getClass();
        return new tfm.m(aVarReplay, bVar);
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            String strN = a0.d.n("header_", i);
            int i2 = R$attr.uikit_dp12;
            gu guVar = new gu(strN, i2, i2, 24);
            yp0.b.r(guVar, 0, R$attr.uikit_dp0, 0, 0, 13);
            arrayList.add(guVar);
            ArrayList arrayList2 = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList2.add(nb0.b(pb0.Companion, "cell_" + i + i3, false, 0, false, 30));
            }
            yp0.b.k(arrayList2, R$attr.uikit_dp0, 0, 0, 0, 30);
            zhm.a0.x(arrayList2, arrayList);
        }
        return arrayList;
    }

    public static ArrayList e(b0[] b0VarArr) {
        List list;
        List list2;
        ArrayList arrayList = new ArrayList(b0VarArr.length);
        for (b0 b0Var : b0VarArr) {
            Data data = b0Var.d;
            if (data != null) {
                if (data.getLoading() || (list2 = (List) data.getContent()) == null || !(!list2.isEmpty())) {
                    data = null;
                }
                if (data != null && (list = (List) data.getContent()) != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }
}
