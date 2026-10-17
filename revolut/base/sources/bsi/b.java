package bsi;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import aw0.o9;
import aw0.y9;
import bx0.c0;
import cn0.g;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.storiesdelegates.CircleProgressStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.ImageStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MultibarStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.SimpleStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel;
import com.revolut.core.ui_kit.views.KeypadView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesActivity;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesMapper$RemoteStoryParcel;
import com.revolut.feature.remote_stories.impl.ui.StoriesEventsMetadata;
import com.revolut.feature.stories.StoriesActivity;
import com.revolut.feature.stories.models.ButtonStyle;
import com.revolut.feature.stories.models.ColourScheme;
import com.revolut.feature.stories.models.Item;
import com.revolut.feature.stories.models.MultiBarItem;
import com.revolut.feature.stories.models.MultiBarTooltip;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryLink;
import com.revolut.feature.stories.models.StoryPage;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dv9.l;
import efm.d0;
import efm.r;
import gv9.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import ju0.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kv9.h;
import mv9.k;
import qfm.g0;
import qfm.j1;
import qz9.o;
import qza.z;
import rd0.e;
import rfm.f0;
import sri.m;
import te0.w;
import ufm.i;
import v6l.b0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18204c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f18202a = i;
        this.f18203b = obj2;
        this.f18204c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object params) {
        d0<List<h>> messages;
        r rVarX;
        ArrayList arrayList;
        Object next;
        Iterator it8;
        int i;
        v3e.h hVar;
        Iterator it9;
        Object metadataStoriesModel;
        StickerStoriesModel.StickerPosition stickerPosition;
        Object stickerStoriesModel;
        Object imageStoriesModel;
        int i2 = 4;
        int i3 = 14;
        int i5 = 24;
        int i6 = 10;
        int i21 = 3;
        int i22 = 0;
        z = false;
        boolean z = false;
        int i32 = 1;
        int i33 = 2;
        switch (this.f18202a) {
            case 0:
                d dVar = (d) this.f18203b;
                rri.a aVar = (rri.a) this.f18204c;
                NaviCommand naviCommand = (NaviCommand) params;
                ((g) dVar.f18208h).i();
                m mVar = dVar.f18206c;
                Intrinsics.h(naviCommand);
                mVar.c(dVar.a(naviCommand, aVar));
                return Unit.f186387a;
            case 1:
                return new IllegalArgumentException("Unknown value " + this.f18203b + " for enum mapping " + ((Map) this.f18204c));
            case 2:
                k kVar = (k) this.f18203b;
                dv9.m mVar2 = (dv9.m) this.f18204c;
                Intrinsics.checkNotNullParameter((Long) params, "it");
                jv9.b bVar = kVar.f209187a;
                if (bVar.e) {
                    rVarX = e.c(bVar.d.i(mVar2, bVar.a(mVar2), !(bVar.a(mVar2) > 0)), kotlin.coroutines.g.f186406a);
                } else {
                    SocialPaymentsService socialPaymentsService = bVar.f178790a;
                    long jA = bVar.a(mVar2);
                    Long lValueOf = jA > 0 ? Long.valueOf(jA) : null;
                    Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() + 1) : null;
                    if (mVar2 instanceof dv9.k) {
                        messages = socialPaymentsService.getGroupMessages(((dv9.k) mVar2).f118076a, lValueOf2, null, false);
                    } else {
                        if (!(mVar2 instanceof l) && mVar2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        messages = socialPaymentsService.getMessages(lValueOf2, null, false);
                    }
                    f fVar = new f(i2, new jt2.d(13));
                    messages.getClass();
                    i iVar = new i(messages, fVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    rVarX = iVar.x();
                }
                int i43 = 2;
                efm.b bVarConcatMapCompletable = rVarX.concatMapSingle(new msb.e(i3, new mv9.c(kVar, 0))).concatMapCompletable(new msb.e(i5, new mv9.e(kVar, mVar2, i43)));
                j jVar = (j) kVar.f209188b;
                jVar.getClass();
                pfm.h hVar2 = new pfm.h(new a08.d(jVar, 25), i43);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE = bVarConcatMapCompletable.e(hVar2);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                f0 f0VarF = aVarE.f(d0.m(Unit.f186387a));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return w.i0(f0VarF).v();
            case 3:
                return KeypadView.f0((KeypadView) this.f18203b, (Context) this.f18204c, (Configuration) params);
            case 4:
                qe0.f fVar2 = (qe0.f) this.f18203b;
                Function1 function1 = (Function1) this.f18204c;
                Long second = (Long) params;
                Intrinsics.checkNotNullParameter(second, "second");
                long jLongValue = second.longValue();
                synchronized (fVar2) {
                    try {
                        ArrayList arrayList2 = fVar2.d;
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            qe0.c cVar = (qe0.c) obj2;
                            Long lB = cVar.b();
                            long jA2 = jLongValue - cVar.a();
                            Long lValueOf3 = lB != null ? Long.valueOf(jLongValue - lB.longValue()) : null;
                            if ((lB == null && cVar.e()) || ((lB == null && jA2 >= cVar.d()) || (lValueOf3 != null && lValueOf3.longValue() >= cVar.d()))) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it10 = arrayList.iterator();
                        while (it10.hasNext()) {
                            ((qe0.c) it10.next()).f(second);
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                if (arrayList.isEmpty()) {
                    int i59 = efm.i.f125385a;
                    return g0.f245413b;
                }
                Function1 function12 = fVar2.f245025c;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it11 = arrayList.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(((qe0.c) it11.next()).c());
                }
                Object objInvoke = function12.invoke(arrayList3);
                d0 d0Var = (d0) function1.invoke(objInvoke);
                qc7.d dVar2 = new qc7.d(29, new qce.a(arrayList, objInvoke, i2));
                d0Var.getClass();
                efm.i iVarV = new i(d0Var, dVar2, 1).v();
                int i66 = efm.i.f125385a;
                return new j1(iVarV, new mfm.d(g0.f245413b), 1);
            case 5:
                com.revolut.feature.remote_stories.impl.ui.a aVar2 = (com.revolut.feature.remote_stories.impl.ui.a) this.f18203b;
                RemoteStoriesContract$Config.Key key = (RemoteStoriesContract$Config.Key) this.f18204c;
                mza.i params2 = (mza.i) params;
                Intrinsics.checkNotNullParameter(params2, "params");
                return nim.a.w(aVar2.f81982a.a(params2), new o(aVar2, i21, params2, key));
            case 6:
                StoryPage storyPage = (StoryPage) this.f18203b;
                com.revolut.feature.remote_stories.impl.ui.b bVar2 = (com.revolut.feature.remote_stories.impl.ui.b) this.f18204c;
                Pair pair = (Pair) params;
                pfm.m mVar3 = pfm.m.f235744a;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                RemoteStoriesContract$Config remoteStoriesContract$Config = (RemoteStoriesContract$Config) pair.f186385a;
                List list = (List) pair.f186386b;
                if (remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Key) {
                    List list2 = list;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it12 = list2.iterator();
                    while (it12.hasNext()) {
                        arrayList4.add(((StoriesModel) it12.next()).f88786c);
                    }
                    ArrayList arrayListU = zhm.w.u(arrayList4);
                    RemoteStoriesContract$Config.Key key2 = (RemoteStoriesContract$Config.Key) remoteStoriesContract$Config;
                    sza.a aVar3 = key2.e;
                    if ((aVar3 != sza.a.ON_FIRST_PAGE_SHOWN || !Intrinsics.f(zhm.d0.b0(arrayListU), storyPage)) && (aVar3 != sza.a.ON_LAST_PAGE_SHOWN || !Intrinsics.f(zhm.d0.m0(arrayListU), storyPage))) {
                        Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                        return mVar3;
                    }
                    pfm.h hVar3 = new pfm.h(new phc.d(bVar2, key2, 23), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                    return hVar3;
                }
                if (remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Id) {
                    List list3 = list;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it13 = list3.iterator();
                    while (it13.hasNext()) {
                        arrayList5.add(((StoriesModel) it13.next()).f88786c);
                    }
                    ArrayList arrayListU2 = zhm.w.u(arrayList5);
                    RemoteStoriesContract$Config.Id id10 = (RemoteStoriesContract$Config.Id) remoteStoriesContract$Config;
                    if ((id10.getD() != sza.a.ON_FIRST_PAGE_SHOWN || !Intrinsics.f(zhm.d0.b0(arrayListU2), storyPage)) && (id10.getD() != sza.a.ON_LAST_PAGE_SHOWN || !Intrinsics.f(zhm.d0.m0(arrayListU2), storyPage))) {
                        Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                        return mVar3;
                    }
                    pfm.h hVar4 = new pfm.h(new phc.d(bVar2, id10.getF81961a(), i5), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                    return hVar4;
                }
                if (!(remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Deeplink)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it14 = list.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next = it14.next();
                        if (Intrinsics.f(zhm.d0.d0(((StoriesModel) next).f88786c), storyPage)) {
                        }
                    } else {
                        next = null;
                    }
                }
                StoriesModel storiesModel = (StoriesModel) next;
                if (storiesModel == null) {
                    return mVar3;
                }
                Parcelable parcelable = storiesModel.e;
                Intrinsics.i(parcelable, "null cannot be cast to non-null type com.revolut.feature.remote_stories.impl.ui.RemoteStoriesMapper.RemoteStoryParcel");
                String id11 = ((RemoteStoriesMapper$RemoteStoryParcel) parcelable).f81977a;
                pfm.h hVar5 = new pfm.h(new phc.d(bVar2, id11, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                kza.a aVar4 = bVar2.f;
                Intrinsics.i(parcelable, "null cannot be cast to non-null type com.revolut.feature.remote_stories.impl.ui.RemoteStoriesMapper.RemoteStoryParcel");
                StoriesEventsMetadata storiesEventsMetadata = ((RemoteStoriesMapper$RemoteStoryParcel) parcelable).f81978b;
                String str = storiesEventsMetadata != null ? storiesEventsMetadata.f81979a : null;
                Intrinsics.i(parcelable, "null cannot be cast to non-null type com.revolut.feature.remote_stories.impl.ui.RemoteStoriesMapper.RemoteStoryParcel");
                StoriesEventsMetadata storiesEventsMetadata2 = ((RemoteStoriesMapper$RemoteStoryParcel) parcelable).f81978b;
                String str2 = storiesEventsMetadata2 != null ? storiesEventsMetadata2.d : null;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                pza.g gVar = (pza.g) aVar4.f191079a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                pfm.r rVarG0 = w.g0(gVar.f240923a.markStoryAsOpened(id11, new oza.b((str == null && str2 == null) ? null : new oza.e(id11, str, str2))));
                Set setA = aVar4.f191081c.a();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(setA, 10));
                Iterator it15 = setA.iterator();
                while (it15.hasNext()) {
                    arrayList6.add(((f51.c) it15.next()).a());
                }
                pfm.a aVarE2 = rVarG0.e(efm.b.r(arrayList6));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return efm.b.r(v.k(hVar5, aVarE2));
            case 7:
                qza.i iVar2 = (qza.i) this.f18203b;
                z zVar = (z) this.f18204c;
                qza.h state = (qza.h) params;
                Intrinsics.checkNotNullParameter(state, "state");
                int i74 = qza.w.f250483a[state.ordinal()];
                if (i74 == 1) {
                    m70.a.c(t0.f186434a);
                    StoriesDelegateModel.Loading model = new StoriesDelegateModel.Loading(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    RemoteStoriesActivity remoteStoriesActivity = (RemoteStoriesActivity) iVar2;
                    remoteStoriesActivity.getClass();
                    Intrinsics.checkNotNullParameter(model, "model");
                    remoteStoriesActivity.b1();
                    Window window = remoteStoriesActivity.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                    j01.f.a(window);
                    y9 y9Var = y9.LIGHT;
                    Window window2 = remoteStoriesActivity.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                    y9Var.a(window2);
                    remoteStoriesActivity.Z0().setItems(u.c(model));
                } else if (i74 == 2) {
                    m70.a.c(t0.f186434a);
                    StoriesDelegateModel.Error model2 = new StoriesDelegateModel.Error(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.common_error_title, null, null, 14), new TextLocalisedClause(R$string.common_action_retry, null, null, 14));
                    RemoteStoriesActivity remoteStoriesActivity2 = (RemoteStoriesActivity) iVar2;
                    remoteStoriesActivity2.getClass();
                    Intrinsics.checkNotNullParameter(model2, "model");
                    remoteStoriesActivity2.b1();
                    Window window3 = remoteStoriesActivity2.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window3, "getWindow(...)");
                    j01.f.a(window3);
                    y9 y9Var2 = y9.LIGHT;
                    Window window4 = remoteStoriesActivity2.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window4, "getWindow(...)");
                    y9Var2.a(window4);
                    remoteStoriesActivity2.Z0().setItems(u.c(model2));
                } else {
                    if (i74 != 3) {
                        return Unit.f186387a;
                    }
                    zVar.o = true;
                }
                return Unit.f186387a;
            case 8:
                com.revolut.retail.core.navigation.b bVar3 = (com.revolut.retail.core.navigation.b) this.f18203b;
                FeatureConfig featureConfig = (FeatureConfig) this.f18204c;
                uri.a it16 = (uri.a) params;
                Intrinsics.checkNotNullParameter(it16, "it");
                Context context = (Context) bVar3.f98676j.get();
                if (context != null) {
                    it16.c(bVar3, context, featureConfig);
                }
                return Unit.f186387a;
            case 9:
                te0.e eVar = (te0.e) this.f18203b;
                Bundle bundle = (Bundle) this.f18204c;
                Intrinsics.h(params);
                eVar.e(bundle, params);
                return Unit.f186387a;
            case 10:
                v3e.d0 d0Var2 = (v3e.d0) this.f18203b;
                v3e.h hVar6 = (v3e.h) this.f18204c;
                List metaModels = (List) params;
                Intrinsics.h(metaModels);
                d0Var2.f285888s = metaModels;
                v3e.k kVar2 = d0Var2.f285882l;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(metaModels, "metaModels");
                List list4 = metaModels;
                ArrayList storiesItemModels = new ArrayList(zhm.w.t(list4, 10));
                Iterator it17 = list4.iterator();
                while (it17.hasNext()) {
                    StoriesModel storiesModel2 = (StoriesModel) it17.next();
                    Clause clause = storiesModel2.f88784a;
                    ArrayList arrayList7 = storiesModel2.f88786c;
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i6));
                    Iterator it18 = arrayList7.iterator();
                    while (it18.hasNext()) {
                        StoryPage storyPage2 = (StoryPage) it18.next();
                        if (storyPage2 instanceof StoryPage.Simple) {
                            StoryPage.Simple simple = (StoryPage.Simple) storyPage2;
                            String str3 = simple.f88805a;
                            i = i22;
                            ButtonStyle buttonStyle = simple.f;
                            ButtonStyle buttonStyle2 = simple.e;
                            Clause clause2 = simple.i;
                            Clause clause3 = simple.f88806b;
                            Clause clause4 = simple.f88807c;
                            it8 = it17;
                            StoryLink storyLink = simple.f88808g;
                            String str4 = storyLink != null ? storyLink.f88794a : null;
                            c0 c0VarC = v3e.k.c(simple.d);
                            Image image = buttonStyle2 != null ? buttonStyle2.d : null;
                            Clause clause5 = buttonStyle2 != null ? buttonStyle2.f88755a : null;
                            imageStoriesModel = new SimpleStoriesModel(str3, clause3, clause4, c0VarC, v3e.k.b(kVar2, buttonStyle2 != null ? buttonStyle2.f88757c : null), image, clause5, buttonStyle2 != null ? buttonStyle2.f : null, buttonStyle2 != null ? buttonStyle2.e : i, v3e.k.a(buttonStyle != null ? buttonStyle.f88757c : null, LargeActionButton.ButtonStyle.f58727c), buttonStyle != null ? buttonStyle.d : null, buttonStyle != null ? buttonStyle.f88755a : null, buttonStyle != null ? buttonStyle.f : null, simple, v3e.k.e(simple.f88809h), clause2, str4, v3e.k.d(simple.f88810j));
                        } else {
                            it8 = it17;
                            i = i22;
                            if (storyPage2 instanceof StoryPage.WithImage) {
                                StoryPage.WithImage withImage = (StoryPage.WithImage) storyPage2;
                                String str5 = withImage.f88818a;
                                ButtonStyle buttonStyle3 = withImage.f;
                                ButtonStyle buttonStyle4 = withImage.e;
                                Clause clause6 = withImage.f88823j;
                                Clause clause7 = withImage.f88819b;
                                Clause clause8 = withImage.f88820c;
                                StoryLink storyLink2 = withImage.d;
                                String str6 = storyLink2 != null ? storyLink2.f88794a : null;
                                imageStoriesModel = new ImageStoriesModel(str5, withImage, clause6, clause7, clause8, v3e.k.c(withImage.i), v3e.k.b(kVar2, buttonStyle4 != null ? buttonStyle4.f88757c : null), buttonStyle4 != null ? buttonStyle4.d : null, buttonStyle4 != null ? buttonStyle4.f88755a : null, buttonStyle4 != null ? buttonStyle4.f : null, v3e.k.a(buttonStyle3 != null ? buttonStyle3.f88757c : null, LargeActionButton.ButtonStyle.f58727c), buttonStyle3 != null ? buttonStyle3.d : null, buttonStyle3 != null ? buttonStyle3.f88755a : null, buttonStyle3 != null ? buttonStyle3.f : null, v3e.k.e(withImage.f88821g), withImage.f88822h, str6, v3e.k.d(withImage.k));
                            } else {
                                if (storyPage2 instanceof StoryPage.WithMultiBarChart) {
                                    StoryPage.WithMultiBarChart withMultiBarChart = (StoryPage.WithMultiBarChart) storyPage2;
                                    MultiBarTooltip multiBarTooltip = withMultiBarChart.i;
                                    ButtonStyle buttonStyle5 = withMultiBarChart.f;
                                    ButtonStyle buttonStyle6 = withMultiBarChart.e;
                                    ColourScheme colourScheme = withMultiBarChart.f88830l;
                                    bx0.d0 d0Var3 = multiBarTooltip != null ? new bx0.d0(multiBarTooltip.getF88772a(), multiBarTooltip.getF88774c(), multiBarTooltip.getF88773b()) : null;
                                    ArrayList arrayList9 = withMultiBarChart.f88828h;
                                    ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                                    Iterator it19 = arrayList9.iterator();
                                    while (it19.hasNext()) {
                                        MultiBarItem multiBarItem = (MultiBarItem) it19.next();
                                        arrayList10.add(new bx0.a(multiBarItem.getF88769a(), colourScheme.f88763j, multiBarItem.getF88770b(), multiBarItem.getF88771c()));
                                        it19 = it19;
                                        it18 = it18;
                                        hVar6 = hVar6;
                                    }
                                    hVar = hVar6;
                                    it9 = it18;
                                    String str7 = withMultiBarChart.f88824a;
                                    Clause clause9 = withMultiBarChart.k;
                                    Clause clause10 = withMultiBarChart.f88825b;
                                    Clause clause11 = withMultiBarChart.f88826c;
                                    StoryLink storyLink3 = withMultiBarChart.d;
                                    String str8 = storyLink3 != null ? storyLink3.f88794a : null;
                                    stickerStoriesModel = new MultibarStoriesModel(str7, withMultiBarChart, v3e.k.c(withMultiBarChart.f88829j), clause9, clause10, clause11, v3e.k.b(kVar2, buttonStyle6 != null ? buttonStyle6.f88757c : null), buttonStyle6 != null ? buttonStyle6.d : null, buttonStyle6 != null ? buttonStyle6.f88755a : null, buttonStyle6 != null ? buttonStyle6.f : null, v3e.k.a(buttonStyle5 != null ? buttonStyle5.f88757c : null, LargeActionButton.ButtonStyle.f58727c), buttonStyle5 != null ? buttonStyle5.d : null, buttonStyle5 != null ? buttonStyle5.f88755a : null, buttonStyle5 != null ? buttonStyle5.f : null, v3e.k.e(withMultiBarChart.f88827g), arrayList10, d0Var3, str8, v3e.k.d(colourScheme));
                                } else {
                                    hVar = hVar6;
                                    it9 = it18;
                                    if (storyPage2 instanceof StoryPage.WithCircleProgress) {
                                        StoryPage.WithCircleProgress withCircleProgress = (StoryPage.WithCircleProgress) storyPage2;
                                        String str9 = withCircleProgress.f88811a;
                                        ButtonStyle buttonStyle7 = withCircleProgress.f;
                                        ButtonStyle buttonStyle8 = withCircleProgress.e;
                                        Clause clause12 = withCircleProgress.k;
                                        Clause clause13 = withCircleProgress.f88812b;
                                        Clause clause14 = withCircleProgress.f88813c;
                                        StoryLink storyLink4 = withCircleProgress.d;
                                        String str10 = storyLink4 != null ? storyLink4.f88794a : null;
                                        stickerStoriesModel = new CircleProgressStoriesModel(str9, withCircleProgress, v3e.k.c(withCircleProgress.f88816j), clause12, clause13, clause14, v3e.k.b(kVar2, buttonStyle8 != null ? buttonStyle8.f88757c : null), buttonStyle8 != null ? buttonStyle8.d : null, buttonStyle8 != null ? buttonStyle8.f88755a : null, buttonStyle8 != null ? buttonStyle8.f : null, v3e.k.a(buttonStyle7 != null ? buttonStyle7.f88757c : null, LargeActionButton.ButtonStyle.f58727c), buttonStyle7 != null ? buttonStyle7.d : null, buttonStyle7 != null ? buttonStyle7.f88755a : null, buttonStyle7 != null ? buttonStyle7.f : null, v3e.k.e(withCircleProgress.f88814g), withCircleProgress.f88815h, withCircleProgress.i, str10, v3e.k.d(withCircleProgress.f88817l));
                                    } else if (storyPage2 instanceof StoryPage.WithVideo) {
                                        StoryPage.WithVideo withVideo = (StoryPage.WithVideo) storyPage2;
                                        String str11 = withVideo.f88840a;
                                        ButtonStyle buttonStyle9 = withVideo.f;
                                        ButtonStyle buttonStyle10 = withVideo.e;
                                        Clause clause15 = withVideo.f88845j;
                                        Clause clause16 = withVideo.f88841b;
                                        Clause clause17 = withVideo.f88842c;
                                        StoryLink storyLink5 = withVideo.d;
                                        String str12 = storyLink5 != null ? storyLink5.f88794a : null;
                                        stickerStoriesModel = new ImageStoriesModel(str11, withVideo, clause15, clause16, clause17, v3e.k.c(withVideo.i), v3e.k.b(kVar2, buttonStyle10 != null ? buttonStyle10.f88757c : null), buttonStyle10 != null ? buttonStyle10.d : null, buttonStyle10 != null ? buttonStyle10.f88755a : null, buttonStyle10 != null ? buttonStyle10.f : null, v3e.k.a(buttonStyle9 != null ? buttonStyle9.f88757c : null, LargeActionButton.ButtonStyle.f58727c), buttonStyle9 != null ? buttonStyle9.d : null, buttonStyle9 != null ? buttonStyle9.f88755a : null, buttonStyle9 != null ? buttonStyle9.f : null, v3e.k.e(withVideo.f88843g), withVideo.f88844h, str12, v3e.k.d(withVideo.k));
                                    } else if (storyPage2 instanceof StoryPage.WithSticker) {
                                        StoryPage.WithSticker withSticker = (StoryPage.WithSticker) storyPage2;
                                        String f88840a = withSticker.getF88840a();
                                        Clause f88838m = withSticker.getF88838m();
                                        Clause f88832b = withSticker.getF88832b();
                                        Clause f88833c = withSticker.getF88833c();
                                        StoryLink d = withSticker.getD();
                                        String str13 = d != null ? d.f88794a : null;
                                        c0 c0VarC2 = v3e.k.c(withSticker.getF88835h());
                                        ButtonStyle e = withSticker.getE();
                                        Image image2 = e != null ? e.d : null;
                                        ButtonStyle e2 = withSticker.getE();
                                        Clause clause18 = e2 != null ? e2.f88755a : null;
                                        ButtonStyle e4 = withSticker.getE();
                                        LargeActionButton.ButtonStyle buttonStyleB = v3e.k.b(kVar2, e4 != null ? e4.f88757c : null);
                                        ButtonStyle e5 = withSticker.getE();
                                        boolean z3 = e5 != null ? e5.e : i;
                                        ButtonStyle e6 = withSticker.getE();
                                        Parcelable parcelable2 = e6 != null ? e6.f : null;
                                        ButtonStyle f = withSticker.getF();
                                        Image image3 = f != null ? f.d : null;
                                        ButtonStyle f4 = withSticker.getF();
                                        Clause clause19 = f4 != null ? f4.f88755a : null;
                                        ButtonStyle f5 = withSticker.getF();
                                        LargeActionButton.ButtonStyle buttonStyleA = v3e.k.a(f5 != null ? f5.f88757c : null, LargeActionButton.ButtonStyle.f58727c);
                                        ButtonStyle f6 = withSticker.getF();
                                        Parcelable parcelable3 = f6 != null ? f6.f : null;
                                        bx0.e eVarE = v3e.k.e(withSticker.getF88834g());
                                        StickerView.Content i92 = withSticker.getI();
                                        int i96 = v3e.j.f285899a[withSticker.getF88836j().ordinal()];
                                        if (i96 == 1) {
                                            stickerPosition = StickerStoriesModel.StickerPosition.TOP;
                                        } else {
                                            if (i96 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            stickerPosition = StickerStoriesModel.StickerPosition.CENTER;
                                        }
                                        stickerStoriesModel = new StickerStoriesModel(f88840a, withSticker, c0VarC2, f88832b, f88833c, buttonStyleB, image2, clause18, parcelable2, z3, buttonStyleA, image3, clause19, parcelable3, eVarE, f88838m, str13, i92, stickerPosition, withSticker.getK(), v3e.k.d(withSticker.getK()));
                                    } else {
                                        if (!(storyPage2 instanceof StoryPage.Metadata)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        StoryPage.Metadata metadata = (StoryPage.Metadata) storyPage2;
                                        String f88840a2 = metadata.getF88840a();
                                        Clause f88803m = metadata.getF88803m();
                                        Clause f88797b = metadata.getF88797b();
                                        Clause f88798c = metadata.getF88798c();
                                        Image d5 = metadata.getD();
                                        List<Item> items = metadata.getItems();
                                        ArrayList arrayList11 = new ArrayList(zhm.w.t(items, 10));
                                        for (Item item : items) {
                                            arrayList11.add(new bx0.m(item.getF88767b(), item.getF88768c(), item.getF88766a()));
                                        }
                                        metadataStoriesModel = new MetadataStoriesModel(f88840a2, f88797b, f88798c, d5, arrayList11, new bx0.k(metadata.getF()), v3e.k.c(metadata.getF88800h()), f88803m, v3e.k.d(metadata.getK()), metadata);
                                        arrayList8.add(metadataStoriesModel);
                                        it17 = it8;
                                        it18 = it9;
                                        hVar6 = hVar;
                                        i22 = i;
                                    }
                                }
                                metadataStoriesModel = stickerStoriesModel;
                                arrayList8.add(metadataStoriesModel);
                                it17 = it8;
                                it18 = it9;
                                hVar6 = hVar;
                                i22 = i;
                            }
                        }
                        hVar = hVar6;
                        it9 = it18;
                        metadataStoriesModel = imageStoriesModel;
                        arrayList8.add(metadataStoriesModel);
                        it17 = it8;
                        it18 = it9;
                        hVar6 = hVar;
                        i22 = i;
                    }
                    storiesItemModels.add(new StoriesDelegateModel.Content(clause, storiesModel2.d, arrayList8, storiesModel2.f88788h, storiesModel2.f));
                    it17 = it17;
                    hVar6 = hVar6;
                    i6 = 10;
                }
                Intrinsics.checkNotNullParameter(storiesItemModels, "storiesItemModels");
                ((StoriesActivity) hVar6).b1().setItems(storiesItemModels);
                return Unit.f186387a;
            case 11:
                v25.g gVar2 = (v25.g) this.f18203b;
                b0 b0Var = (b0) this.f18204c;
                Pair pair2 = (Pair) params;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                ui0.d dVar3 = (ui0.d) pair2.f186385a;
                a0.d.B(pair2.f186386b);
                String strB = dVar3.b();
                try {
                    b0Var.invoke(strB);
                    Unit unit = Unit.f186387a;
                } catch (Exception e22) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e22, h0Var);
                }
                try {
                    throw null;
                } catch (Exception e33) {
                    try {
                        gVar2.invoke(strB, e33);
                        if (Boolean.FALSE.booleanValue()) {
                            z = true;
                        }
                    } catch (Exception e35) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e35, h0Var2);
                    }
                    return new Pair(Boolean.valueOf(z), strB);
                }
            case 12:
                ufm.g gVar3 = (ufm.g) this.f18203b;
                b0 b0Var2 = (b0) this.f18204c;
                Pair pair3 = (Pair) params;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                String version = (String) pair3.f186386b;
                v70.b bVar4 = (v70.b) gVar3.f279885b;
                Intrinsics.checkNotNullParameter("CoreAndroidApi", "name");
                Intrinsics.checkNotNullParameter(version, "version");
                bVar4.f286524b.edit().putString("FEATURE$CoreAndroidApi", version).commit();
                try {
                    b0Var2.invoke(version);
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (Exception e41) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e41, h0Var3);
                }
                return version;
            case 13:
                Function2 function2 = (Function2) this.f18203b;
                w4l.f fVar3 = (w4l.f) this.f18204c;
                Intrinsics.checkNotNullParameter(params, "params");
                d0 d0Var4 = (d0) function2.invoke(fVar3, params);
                w4l.c cVar2 = new w4l.c(new w4l.a(fVar3, params, i32), i33);
                d0Var4.getClass();
                ufm.f fVar4 = new ufm.f(new ufm.f(d0Var4, cVar2, i21), new w4l.c(new w4l.a(fVar3, params, i33), i21), i22);
                Intrinsics.checkNotNullExpressionValue(fVar4, "doAfterSuccess(...)");
                return fVar4;
            default:
                wlm.o oVar = (wlm.o) this.f18203b;
                wlm.h hVar7 = (wlm.h) this.f18204c;
                Intrinsics.checkNotNullParameter((IOException) params, "it");
                synchronized (oVar) {
                    hVar7.c();
                }
                return Unit.f186387a;
        }
    }
}
