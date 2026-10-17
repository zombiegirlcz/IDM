package v3e;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.stories.models.ButtonStyle;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.retail_shot.mediator.ShotDialogAction;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f285906b;

    public /* synthetic */ n(d0 d0Var, int i) {
        this.f285905a = i;
        this.f285906b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285905a) {
            case 0:
                d dVar = this.f285906b.f285880h;
                BaseStoriesModel model = (BaseStoriesModel) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object f51698j = model.getF55862c();
                StoryPage storyPage = f51698j instanceof StoryPage ? (StoryPage) f51698j : null;
                if (storyPage == null) {
                    return Unit.f186387a;
                }
                ArrayList arrayListF1 = zhm.d0.f1((Collection) dVar.Z().get());
                if (arrayListF1.contains(storyPage)) {
                    return Unit.f186387a;
                }
                arrayListF1.add(storyPage);
                dVar.Z().set(arrayListF1);
                return Unit.f186387a;
            case 1:
                Object f51698j2 = ((BaseStoriesModel) obj2).getF55862c();
                StoryPage storyPage2 = f51698j2 instanceof StoryPage ? (StoryPage) f51698j2 : null;
                d0 d0Var = this.f285906b;
                if (storyPage2 != null) {
                    StoriesModel story = d0Var.O(storyPage2);
                    b bVar = d0Var.k;
                    d0Var.Q(storyPage2);
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(story, "story");
                }
                pfm.t tVarL = new pfm.n(new s2i.i(d0Var, 12), 1).l(new rzc.b(d0Var, (NaviCommand) d0Var.f285880h.t0().get(), 28));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                return tVarL;
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f285906b.f285887r.c0(new ShotDialogAction.Show(new ShotDialogDisplayer$Configuration("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.clipboard_banner_please_watch_till_the_end, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
            case 3:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                d0 d0Var2 = this.f285906b;
                d0Var2.f285881j.c(d0Var2.P());
                return Unit.f186387a;
            case 4:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                this.f285906b.f285881j.c(new FinishCommand(0, null, null, 6));
                return Unit.f186387a;
            case 5:
                final d0 d0Var3 = this.f285906b;
                b bVar2 = d0Var3.k;
                qv0.p model2 = (qv0.p) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object f51698j3 = model2.getF55862c();
                final StoryPage storyPage3 = f51698j3 instanceof StoryPage ? (StoryPage) f51698j3 : null;
                pfm.m mVar = pfm.m.f235744a;
                if (storyPage3 != null) {
                    StoriesModel story2 = d0Var3.O(storyPage3);
                    d0Var3.Q(storyPage3);
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(story2, "story");
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                }
                efm.b bVarI2 = storyPage3 == null ? mVar : bVar2.I2(storyPage3, d0Var3.O(storyPage3));
                final int i = 1;
                pfm.h hVar = new pfm.h(new Callable() { // from class: v3e.r
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ButtonStyle f;
                        ButtonStyle e;
                        switch (i) {
                            case 0:
                                StoryPage storyPage4 = storyPage3;
                                return d0Var3.N((storyPage4 == null || (f = storyPage4.getF()) == null) ? null : f.f88756b);
                            default:
                                StoryPage storyPage5 = storyPage3;
                                return d0Var3.N((storyPage5 == null || (e = storyPage5.getE()) == null) ? null : e.f88756b);
                        }
                    }
                }, 1);
                Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
                pfm.a aVarE = bVarI2.e(hVar).e(mVar);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 6:
                qv0.p model3 = (qv0.p) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                Object f51698j4 = model3.getF55862c();
                StoryPage storyPage4 = f51698j4 instanceof StoryPage ? (StoryPage) f51698j4 : null;
                if (storyPage4 == null) {
                    return pfm.m.f235744a;
                }
                d0 d0Var4 = this.f285906b;
                return d0Var4.k.C1(storyPage4, d0Var4.O(storyPage4));
            case 7:
                final d0 d0Var5 = this.f285906b;
                b bVar3 = d0Var5.k;
                qv0.p model4 = (qv0.p) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                Object f51698j5 = model4.getF55862c();
                final StoryPage storyPage5 = f51698j5 instanceof StoryPage ? (StoryPage) f51698j5 : null;
                pfm.m mVar2 = pfm.m.f235744a;
                if (storyPage5 != null) {
                    StoriesModel story3 = d0Var5.O(storyPage5);
                    d0Var5.Q(storyPage5);
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(story3, "story");
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                }
                efm.b bVarM2 = storyPage5 == null ? mVar2 : bVar3.m2(storyPage5, d0Var5.O(storyPage5));
                final int i2 = 0;
                pfm.h hVar2 = new pfm.h(new Callable() { // from class: v3e.r
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ButtonStyle f;
                        ButtonStyle e;
                        switch (i2) {
                            case 0:
                                StoryPage storyPage42 = storyPage5;
                                return d0Var5.N((storyPage42 == null || (f = storyPage42.getF()) == null) ? null : f.f88756b);
                            default:
                                StoryPage storyPage52 = storyPage5;
                                return d0Var5.N((storyPage52 == null || (e = storyPage52.getE()) == null) ? null : e.f88756b);
                        }
                    }
                }, 1);
                Intrinsics.checkNotNullExpressionValue(hVar2, "defer(...)");
                pfm.a aVarE2 = bVarM2.e(hVar2).e(mVar2);
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 8:
                qv0.p model5 = (qv0.p) obj2;
                Intrinsics.checkNotNullParameter(model5, "model");
                return new pfm.h(new rzc.b(model5, this.f285906b, 29), 2);
            default:
                BaseStoriesModel model6 = (BaseStoriesModel) obj2;
                Intrinsics.checkNotNullParameter(model6, "model");
                Object f51698j6 = model6.getF55862c();
                StoryPage storyPage6 = f51698j6 instanceof StoryPage ? (StoryPage) f51698j6 : null;
                if (storyPage6 == null) {
                    return Unit.f186387a;
                }
                d0 d0Var6 = this.f285906b;
                StoriesModel story4 = d0Var6.O(storyPage6);
                ArrayList arrayList = story4.f88786c;
                LinkedHashSet linkedHashSet = d0Var6.f285889t;
                b bVar4 = d0Var6.k;
                LinkedHashSet linkedHashSet2 = d0Var6.u;
                if (!linkedHashSet2.contains(story4)) {
                    linkedHashSet2.add(story4);
                    bVar4.getClass();
                    Intrinsics.checkNotNullParameter(story4, "story");
                }
                if (arrayList.indexOf(storyPage6) == arrayList.size() - 1 && !linkedHashSet.contains(story4)) {
                    linkedHashSet.add(story4);
                    bVar4.getClass();
                    Intrinsics.checkNotNullParameter(story4, "story");
                }
                return Unit.f186387a;
        }
    }
}
