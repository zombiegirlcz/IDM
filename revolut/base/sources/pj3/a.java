package pj3;

import aw0.v1;
import aw0.x8;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CmsStoriesScreen f236627b;

    public /* synthetic */ a(CmsStoriesScreen cmsStoriesScreen, int i) {
        this.f236626a = i;
        this.f236627b = cmsStoriesScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        fj3.f fVar;
        int i = this.f236626a;
        boolean z = false;
        CmsStoriesScreen cmsStoriesScreen = this.f236627b;
        switch (i) {
            case 0:
                CmsStoriesScreen.Companion aVar = CmsStoriesScreen.INSTANCE;
                v1 v1Var = ((x8) obj2).f10609a;
                Intrinsics.checkNotNullParameter(v1Var, "<this>");
                int i2 = fj3.g.f135525a[v1Var.ordinal()];
                if (i2 == 1) {
                    fVar = fj3.f.LIGHT;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = fj3.f.DARK;
                }
                cmsStoriesScreen.j3(fVar);
                return Unit.f186387a;
            case 1:
                ty0.a clickData = (ty0.a) obj2;
                CmsStoriesScreen.Companion aVar2 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                r rVar = (r) cmsStoriesScreen.R2();
                rVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                rVar.C1(new ExternalDestination.Browser(clickData.f275445a, null));
                return Unit.f186387a;
            case 2:
                Unit it8 = (Unit) obj2;
                CmsStoriesScreen.Companion aVar3 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                r rVar2 = (r) cmsStoriesScreen.R2();
                hj3.a aVar4 = (hj3.a) ((f) ((j2) rVar2.v.f22677a).getValue()).f236634a.getContent();
                if (aVar4 == null) {
                    rVar2.B2();
                } else {
                    hj3.e eVar = aVar4.f152652c;
                    boolean z3 = eVar == hj3.e.NONE;
                    if (aVar4.f152651b == hj3.f.FIN_CRIME && eVar == hj3.e.ALL_SCREENS) {
                        z = true;
                    }
                    if (z3 || z) {
                        rVar2.J2(aVar4.d);
                    }
                }
                return Unit.f186387a;
            case 3:
                Throwable error = (Throwable) obj2;
                CmsStoriesScreen.Companion aVar5 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(error, "error");
                ((r) cmsStoriesScreen.R2()).getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                Exception exc2 = new Exception("Playback error", error);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CmsStoriesScreenModel", null, exc2, h0Var);
                return Unit.f186387a;
            case 4:
                Unit it9 = (Unit) obj2;
                CmsStoriesScreen.Companion aVar6 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                r rVar3 = (r) cmsStoriesScreen.R2();
                a2 a2Var = rVar3.f236654t;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                rVar3.f236654t = null;
                rVar3.u = null;
                rVar3.H2(rVar3.v, new pij.d(20));
                rVar3.f236653s.a();
                return Unit.f186387a;
            case 5:
                Unit it10 = (Unit) obj2;
                CmsStoriesScreen.Companion aVar7 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((r) cmsStoriesScreen.R2()).B2();
                return Unit.f186387a;
            case 6:
                ((Integer) obj2).intValue();
                CmsStoriesScreen.Companion aVar8 = CmsStoriesScreen.INSTANCE;
                cmsStoriesScreen.R2().getClass();
                return Unit.f186387a;
            case 7:
                Unit it11 = (Unit) obj2;
                CmsStoriesScreen.Companion aVar9 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it11, "it");
                r rVar4 = (r) cmsStoriesScreen.R2();
                if (rVar4.o.e) {
                    rVar4.C2(fj3.a.f135522a);
                } else {
                    rVar4.J2(rVar4.I2(0));
                }
                return Unit.f186387a;
            default:
                Unit it12 = (Unit) obj2;
                CmsStoriesScreen.Companion aVar10 = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it12, "it");
                r rVar5 = (r) cmsStoriesScreen.R2();
                if (rVar5.o.e) {
                    rVar5.C2(fj3.b.f135523a);
                } else {
                    rVar5.J2(rVar5.I2(1));
                }
                return Unit.f186387a;
        }
    }
}
