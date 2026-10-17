package vf0;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextInclusionStrategy;
import com.revolut.domain.models.openbanking.TopupUrlData;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreen;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker.ChallengeEditFrequencyPickerScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q implements kfm.c, kfm.h, kfm.i, kfm.o, vp0.j, kfm.p, TextInclusionStrategy, efm.x, od0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288466a;

    public /* synthetic */ q() {
        this.f288466a = 22;
        wf0.v vVar = wf0.v.f;
    }

    @Override // kfm.h
    public Object a(Object _a, Object _b, Object _c) {
        switch (this.f288466a) {
            case 1:
                Intrinsics.checkNotNullParameter(_a, "_a");
                Intrinsics.checkNotNullParameter(_b, "_b");
                Intrinsics.checkNotNullParameter(_c, "_c");
                break;
            default:
                Intrinsics.checkNotNullParameter(_a, "__a");
                Intrinsics.checkNotNullParameter(_b, "__b");
                Intrinsics.checkNotNullParameter(_c, "__c");
                break;
        }
        return new yhm.r(_a, _b, _c);
    }

    @Override // od0.f
    public void accept(Object obj2) {
    }

    @Override // efm.x
    public efm.w apply(efm.r it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8;
    }

    @Override // vp0.j
    public void b(boolean z) {
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        switch (this.f288466a) {
            case 12:
                return rect.overlaps(rect2);
            case 13:
                return TextInclusionStrategy.Companion.ContainsAll$lambda$0(rect, rect2);
            default:
                return TextInclusionStrategy.Companion.ContainsCenter$lambda$0(rect, rect2);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        vz4.i iVar = vz4.i.f;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) iVar.invoke(p0)).booleanValue();
    }

    public /* synthetic */ q(int i) {
        this.f288466a = i;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f288466a) {
            case 5:
                vg6.o oVar = vg6.o.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) oVar.invoke(p0);
            case 6:
                return ((PricingPlanSubscription) p0).f81129a;
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 24:
            case 25:
            default:
                x0i.c cVar = x0i.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar.invoke(p0);
            case 8:
                vp8.c cVar2 = vp8.c.f;
                int i = ChallengeEditFrequencyPickerScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vp8.f) cVar2.invoke(p0);
            case 9:
                vsk.a aVar = vsk.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vsk.g) aVar.invoke(p0);
            case 15:
                w21.m mVar = w21.m.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TopupUrlData) mVar.invoke(p0);
            case 16:
                w21.i iVar = w21.i.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TopupUrlData) iVar.invoke(p0);
            case 17:
                w21.h hVar = w21.h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) hVar.invoke(p0);
            case 18:
                w21.j jVar = w21.j.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) jVar.invoke(p0);
            case 19:
                w9j.c cVar3 = w9j.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) cVar3.invoke(p0);
            case 20:
                wb3.c cVar4 = wb3.c.f;
                KProperty[] kPropertyArr = CashTopUpEntryScreen.f65628b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar4.invoke(p0);
            case 21:
                wf0.k kVar = wf0.k.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Feedback) kVar.invoke(p0);
            case 22:
                wf0.v vVar = wf0.v.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (aj0.c) vVar.invoke(p0);
            case 23:
                wg1.a aVar2 = wg1.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar2.invoke(p0);
            case 26:
                return (wi0.b) x0f.x.f.invoke(p0);
            case 27:
                x0i.d dVar = x0i.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) dVar.invoke(p0);
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f288466a = i;
    }

    @Override // kfm.c
    public Object apply(Object _a, Object _b) {
        switch (this.f288466a) {
            case 0:
                Intrinsics.checkNotNullParameter(_a, "_a");
                Intrinsics.checkNotNullParameter(_b, "_b");
                break;
            default:
                Intrinsics.checkNotNullParameter(_a, "_a");
                Intrinsics.checkNotNullParameter(_b, "_b");
                break;
        }
        return new Pair(_a, _b);
    }

    @Override // kfm.i
    public Object apply(Object _a, Object _b, Object _c, Object _d) {
        Intrinsics.checkNotNullParameter(_a, "_a");
        Intrinsics.checkNotNullParameter(_b, "_b");
        Intrinsics.checkNotNullParameter(_c, "_c");
        Intrinsics.checkNotNullParameter(_d, "_d");
        return new h(_a, _b, _c, _d);
    }
}
