package s2g;

import c1g.c0;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import skm.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends jki.g implements o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesOptionsV2ScreenContract$InputData f259330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f259331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c1g.y f259332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f259333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u2g.c f259334t;
    public final u2g.a u;
    public final hyf.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h1g.h f259335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f259336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.f f259337y;
    public final j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(jki.p r5, com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData r6, c1g.c0 r7, c1g.y r8, j60.a r9, u2g.c r10, u2g.a r11, hyf.a r12, h1g.h r13) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2g.w.<init>(jki.p, com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData, c1g.c0, c1g.y, j60.a, u2g.c, u2g.a, hyf.a, h1g.h):void");
    }

    @Override // yji.l
    public final void I1() {
        y2();
        l2(new u(this, null, 0), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }

    public final void y2() {
        a2 a2Var = this.f259336x;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f259336x = l2(new rbh.k(this, continuation, 25), new yi5.b(26));
    }

    public final void z2() {
        Y1(new TravelExperiencesDatesSelectionScreen(new TravelExperiencesDatesSelectionScreenContract$InputData(((j) t2()).f259313c.f240824b, o3g.e.RANGE, this.f259330p.f93094c)), ModalDestination.Style.POPUP.f98311a, new q(this, 1));
    }
}
