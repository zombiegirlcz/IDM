package b1b;

import cli.n;
import cli.y;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartsIndicatorScreenProvider$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import te0.w;
import vkm.j2;
import vkm.q;
import vkm.q0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements dli.b {
    public final ChartsIndicatorScreenProvider$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f11773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f11774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f11775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f11776s;

    public k(ChartsIndicatorScreenProvider$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        final int i = 0;
        this.f11773p = w.y0(new Function0(this) { // from class: b1b.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f11769b;

            {
                this.f11769b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return q.c(((f) ((j2) this.f11769b.f11776s.f22677a).getValue()).d);
                    default:
                        EnumEntries enumEntriesB = d1b.c.b();
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it8 = enumEntriesB.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            k kVar = this.f11769b;
                            if (!zHasNext) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    if (!((d1b.c) obj2).getVolumeBased() || kVar.o.f82070b) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                return arrayList2;
                            }
                            Object next = it8.next();
                            if (!((List) kVar.f11774q.getValue()).contains((d1b.c) next)) {
                                arrayList.add(next);
                            }
                        }
                        break;
                }
            }
        });
        Lazy lazyB = yhm.j.b(new aw1.a(19));
        this.f11774q = lazyB;
        final int i2 = 1;
        Lazy lazyB2 = yhm.j.b(new Function0(this) { // from class: b1b.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f11769b;

            {
                this.f11769b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return q.c(((f) ((j2) this.f11769b.f11776s.f22677a).getValue()).d);
                    default:
                        EnumEntries enumEntriesB = d1b.c.b();
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it8 = enumEntriesB.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            k kVar = this.f11769b;
                            if (!zHasNext) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    if (!((d1b.c) obj2).getVolumeBased() || kVar.o.f82070b) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                return arrayList2;
                            }
                            Object next = it8.next();
                            if (!((List) kVar.f11774q.getValue()).contains((d1b.c) next)) {
                                arrayList.add(next);
                            }
                        }
                        break;
                }
            }
        });
        this.f11775r = lazyB2;
        this.f11776s = mra.d.b(this, new f(inputData.f82069a, (List) lazyB.getValue(), d0.P0((List) lazyB2.getValue(), new j(this, 1)), ""), stateMapper, new a(), false, 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, new q0((MutableStateFlow) this.f11773p.getValue(), new i(this, continuation, 0), 1), null, null, new i(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f11776s;
    }
}
