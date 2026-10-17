package ryj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GlossaryHomeScreenContract$InputData f258421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g09.h f258422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g09.f f258423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f258424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f258425t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jki.p stateMapper, GlossaryHomeScreenContract$InputData inputData, g09.h interactor, g09.f learnDomainInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(learnDomainInteractor, "learnDomainInteractor");
        this.f258421p = inputData;
        this.f258422q = interactor;
        this.f258423r = learnDomainInteractor;
        this.f258424s = vkm.q.b(1, 5, null);
        m70.a.c(t0.f186434a);
        this.f258425t = new h(zhm.u.c(new q(n.f258404a, true, new Data(null, null, true, 3, null))), "");
    }

    @Override // yji.l
    public final void I1() {
        l2(new rm6.c(this, null, 26), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f258425t;
    }

    public final void y2(final m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            this.f258424s.k(Unit.f186387a);
            return;
        }
        if (event instanceof j) {
            final int i = 0;
            x2(new Function1() { // from class: ryj.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    h updateState = (h) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List list = updateState.f258398a;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            int i2 = 0;
                            for (Object obj3 : list) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(q.a((q) obj3, i2 == ((j) event).f258401a));
                                i2 = i3;
                            }
                            return h.a(updateState, arrayList, null, 2);
                        case 1:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List<q> list2 = updateState.f258398a;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (q qVar : list2) {
                                arrayList2.add(q.a(qVar, Intrinsics.f(qVar.f258407a.a(), ((l) event).f258403a)));
                            }
                            return h.a(updateState, arrayList2, null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return h.a(updateState, null, ((k) event).f258402a, 1);
                    }
                }
            });
        } else if (event instanceof l) {
            final int i2 = 1;
            x2(new Function1() { // from class: ryj.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    h updateState = (h) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List list = updateState.f258398a;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            int i22 = 0;
                            for (Object obj3 : list) {
                                int i3 = i22 + 1;
                                if (i22 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(q.a((q) obj3, i22 == ((j) event).f258401a));
                                i22 = i3;
                            }
                            return h.a(updateState, arrayList, null, 2);
                        case 1:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List<q> list2 = updateState.f258398a;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (q qVar : list2) {
                                arrayList2.add(q.a(qVar, Intrinsics.f(qVar.f258407a.a(), ((l) event).f258403a)));
                            }
                            return h.a(updateState, arrayList2, null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return h.a(updateState, null, ((k) event).f258402a, 1);
                    }
                }
            });
        } else {
            if (!(event instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i3 = 2;
            x2(new Function1() { // from class: ryj.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    h updateState = (h) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List list = updateState.f258398a;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            int i22 = 0;
                            for (Object obj3 : list) {
                                int i32 = i22 + 1;
                                if (i22 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(q.a((q) obj3, i22 == ((j) event).f258401a));
                                i22 = i32;
                            }
                            return h.a(updateState, arrayList, null, 2);
                        case 1:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List<q> list2 = updateState.f258398a;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (q qVar : list2) {
                                arrayList2.add(q.a(qVar, Intrinsics.f(qVar.f258407a.a(), ((l) event).f258403a)));
                            }
                            return h.a(updateState, arrayList2, null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return h.a(updateState, null, ((k) event).f258402a, 1);
                    }
                }
            });
        }
    }
}
