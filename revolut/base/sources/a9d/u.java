package a9d;

import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends jki.g implements n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardsTroubleshooterSelectionScreenContract$InputData f2421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k18.c f2422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ie.a f2423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p9d.n f2424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f2425t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jki.p stateMapper, CardsTroubleshooterSelectionScreenContract$InputData inputData, k18.c faqProvider, ie.a sharedCardsTroubleshooterInteractor, p9d.n troubleshooterActionHelper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(sharedCardsTroubleshooterInteractor, "sharedCardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(troubleshooterActionHelper, "troubleshooterActionHelper");
        this.f2421p = inputData;
        this.f2422q = faqProvider;
        this.f2423r = sharedCardsTroubleshooterInteractor;
        this.f2424s = troubleshooterActionHelper;
        this.f2425t = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f86317b);
    }

    @Override // yji.l
    public final void T1(long j2) {
        v0f.p pVar = new v0f.p(new wa3.d(this.f2423r.d(true, false), 0), 11);
        String str = this.f2421p.f86316a;
        yji.l.b1(this, vkm.q.q(new t38.e(pVar, 24, str == null ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(this.f2422q.z(str, true), new a82.l(25)), new a0e.o(this, null, 2))), null, null, 7);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f2425t;
    }

    public final void y2(Object obj2, String itemId) throws Throwable {
        Object objA;
        String str;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "CARDS_SEE_ALL_ITEM_ID")) {
            v2(new l(this.f2421p.f86316a));
            return;
        }
        if (this.f2423r.f(itemId)) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            v2(new g((String) obj2));
            return;
        }
        Continuation continuation = null;
        if (itemId.equals("CARDS_ACTION_ITEM_ID")) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.troubleshooter.TroubleshooterAction");
                objA = (hj0.b) obj2;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof yhm.n) {
                objA = null;
            }
            hj0.b bVar = (hj0.b) objA;
            if (bVar != null && (str = bVar.d) != null && d0.J(str, "category.cards", false)) {
                v2(i.f2410a);
                return;
            }
        }
        if (itemId.equals("CARDS_ACTION_ITEM_ID")) {
            z2(obj2);
            return;
        }
        if (itemId.equals("SEARCH_ITEM_ID")) {
            SharedFaqDestination.StartPoint.Search search = new SharedFaqDestination.StartPoint.Search(f7d.i.CATEGORY_CARDS.a());
            TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
            C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) search, (SharedFaqDestination.PassthroughData) null, false, 10));
        } else if (obj2 instanceof FaqNodeBase) {
            n2(new a0l.k((FaqNodeBase) obj2, this, continuation, 21), new whi.b(6));
        }
    }

    public final void z2(Object obj2) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.troubleshooter.TroubleshooterAction");
            objA = (hj0.b) obj2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        Continuation continuation = null;
        if (objA instanceof yhm.n) {
            objA = null;
        }
        hj0.b bVar = (hj0.b) objA;
        if (bVar == null) {
            return;
        }
        n2(new a1a.a(this, bVar, continuation, 25), new whi.b(6));
    }
}
