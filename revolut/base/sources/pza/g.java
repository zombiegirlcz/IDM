package pza;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.remote_stories.impl.network.RemoteStoryService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import no.f2;
import org.jetbrains.annotations.NotNull;
import pth.m;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements a {

    @NotNull
    public static final e Companion = new e();
    public static final Type f = new TypeToken<Map<String, ? extends String>>() { // from class: com.revolut.feature.remote_stories.impl.repository.RemoteStoriesRepositoryImpl$Companion$REMOTE_STORIES_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final NoSuchElementException f240922g = new NoSuchElementException();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteStoryService f240923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f240924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f240925c;
    public final w4l.f d;
    public final w4l.f e;

    public g(RemoteStoryService service, b80.c networkStateRepository, ue0.c storage, l remoteStoryLastUpdatedRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(remoteStoryLastUpdatedRepository, "remoteStoryLastUpdatedRepository");
        this.f240923a = service;
        this.f240924b = storage;
        this.f240925c = remoteStoryLastUpdatedRepository;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: pza.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f240918b;

            {
                this.f240918b = this;
            }

            /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                g gVar = this.f240918b;
                switch (i2) {
                    case 0:
                        mza.c params = (mza.c) obj2;
                        mza.d story = (mza.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(story, "story");
                        ue0.c cVar = gVar.f240924b;
                        String strQ = j6.a.q("remoteStories", mo3.a.l(params));
                        mza.h hVar = lza.b.f200955a;
                        Intrinsics.checkNotNullParameter(story, "<this>");
                        mza.f fVar = story.f210730a;
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        oza.c cVar2 = new oza.c(fVar.f210735a, fVar.f210736b);
                        ArrayList<mza.g> arrayList = story.f210731b;
                        int i3 = 10;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (mza.g gVar2 : arrayList) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            String str = gVar2.f210737a;
                            String str2 = gVar2.f210738b;
                            String str3 = gVar2.f210739c;
                            ArrayList<mza.e> arrayList3 = gVar2.d;
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i3));
                            for (mza.e eVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList4.add(new oza.a(eVar.f210732a, eVar.f210733b, eVar.f210734c));
                            }
                            mza.h hVar2 = gVar2.e;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            String strG = u1.g(hVar2.f210740a, lza.b.f200956b);
                            mza.b bVar = hVar2.f210741b;
                            arrayList2.add(new oza.f(str, str2, str3, arrayList4, new oza.g(strG, bVar != null ? u1.h(bVar, lza.b.f200957c) : null)));
                            i3 = 10;
                        }
                        cVar.G(new oza.d(cVar2, arrayList2), strQ, z.d(o0.b(oza.d.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f240923a.getRemoteStoriesConfig();
                    default:
                        Map config = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        gVar.f240924b.G(config, "REMOTE_STORIES_CONFIG_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 2;
        this.d = new w4l.f(function2, new Function1(this) { // from class: pza.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f240916b;

            {
                this.f240916b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        mza.c params = (mza.c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f240916b;
                        l lVar = gVar.f240925c;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0 d0VarLastOrError = mo3.a.n(lVar.d.f(Unit.f186387a, false)).lastOrError();
                        pv9.b bVar = new pv9.b(new f2(params, 5), 2);
                        d0VarLastOrError.getClass();
                        ufm.i iVar = new ufm.i(d0VarLastOrError, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        od0.i.Companion.getClass();
                        ufm.i iVar2 = new ufm.i(d0.D(ue0.e.F(iVar, od0.i.f224256b), new ufm.c(new ag.d(lVar, params, 3), 2), new pv9.b(new pq0.d(1), 3)), new pz4.a(6, new m(gVar, params, 15)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 1:
                        mza.c params2 = (mza.c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        oza.d dVar = (oza.d) this.f240916b.f240924b.T2("remoteStories" + mo3.a.l(params2), oza.d.class);
                        if (dVar != null) {
                            return lza.b.a(dVar);
                        }
                        return null;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f240916b.f240924b;
                        Type REMOTE_STORIES_TYPE = g.f;
                        Intrinsics.checkNotNullExpressionValue(REMOTE_STORIES_TYPE, "REMOTE_STORIES_TYPE");
                        return (Map) cVar.T2("REMOTE_STORIES_CONFIG_KEY", REMOTE_STORIES_TYPE);
                }
            }
        }, new Function2(this) { // from class: pza.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f240918b;

            {
                this.f240918b = this;
            }

            /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                g gVar = this.f240918b;
                switch (i22) {
                    case 0:
                        mza.c params = (mza.c) obj2;
                        mza.d story = (mza.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(story, "story");
                        ue0.c cVar = gVar.f240924b;
                        String strQ = j6.a.q("remoteStories", mo3.a.l(params));
                        mza.h hVar = lza.b.f200955a;
                        Intrinsics.checkNotNullParameter(story, "<this>");
                        mza.f fVar = story.f210730a;
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        oza.c cVar2 = new oza.c(fVar.f210735a, fVar.f210736b);
                        ArrayList<mza.g> arrayList = story.f210731b;
                        int i3 = 10;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (mza.g gVar2 : arrayList) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            String str = gVar2.f210737a;
                            String str2 = gVar2.f210738b;
                            String str3 = gVar2.f210739c;
                            ArrayList<mza.e> arrayList3 = gVar2.d;
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i3));
                            for (mza.e eVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList4.add(new oza.a(eVar.f210732a, eVar.f210733b, eVar.f210734c));
                            }
                            mza.h hVar2 = gVar2.e;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            String strG = u1.g(hVar2.f210740a, lza.b.f200956b);
                            mza.b bVar = hVar2.f210741b;
                            arrayList2.add(new oza.f(str, str2, str3, arrayList4, new oza.g(strG, bVar != null ? u1.h(bVar, lza.b.f200957c) : null)));
                            i3 = 10;
                        }
                        cVar.G(new oza.d(cVar2, arrayList2), strQ, z.d(o0.b(oza.d.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f240923a.getRemoteStoriesConfig();
                    default:
                        Map config = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        gVar.f240924b.G(config, "REMOTE_STORIES_CONFIG_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: pza.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f240916b;

            {
                this.f240916b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        mza.c params = (mza.c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f240916b;
                        l lVar = gVar.f240925c;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0 d0VarLastOrError = mo3.a.n(lVar.d.f(Unit.f186387a, false)).lastOrError();
                        pv9.b bVar = new pv9.b(new f2(params, 5), 2);
                        d0VarLastOrError.getClass();
                        ufm.i iVar = new ufm.i(d0VarLastOrError, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        od0.i.Companion.getClass();
                        ufm.i iVar2 = new ufm.i(d0.D(ue0.e.F(iVar, od0.i.f224256b), new ufm.c(new ag.d(lVar, params, 3), 2), new pv9.b(new pq0.d(1), 3)), new pz4.a(6, new m(gVar, params, 15)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 1:
                        mza.c params2 = (mza.c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        oza.d dVar = (oza.d) this.f240916b.f240924b.T2("remoteStories" + mo3.a.l(params2), oza.d.class);
                        if (dVar != null) {
                            return lza.b.a(dVar);
                        }
                        return null;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f240916b.f240924b;
                        Type REMOTE_STORIES_TYPE = g.f;
                        Intrinsics.checkNotNullExpressionValue(REMOTE_STORIES_TYPE, "REMOTE_STORIES_TYPE");
                        return (Map) cVar.T2("REMOTE_STORIES_CONFIG_KEY", REMOTE_STORIES_TYPE);
                }
            }
        });
        final int i5 = 1;
        Function1 function1 = new Function1(this) { // from class: pza.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f240916b;

            {
                this.f240916b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        mza.c params = (mza.c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f240916b;
                        l lVar = gVar.f240925c;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0 d0VarLastOrError = mo3.a.n(lVar.d.f(Unit.f186387a, false)).lastOrError();
                        pv9.b bVar = new pv9.b(new f2(params, 5), 2);
                        d0VarLastOrError.getClass();
                        ufm.i iVar = new ufm.i(d0VarLastOrError, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        od0.i.Companion.getClass();
                        ufm.i iVar2 = new ufm.i(d0.D(ue0.e.F(iVar, od0.i.f224256b), new ufm.c(new ag.d(lVar, params, 3), 2), new pv9.b(new pq0.d(1), 3)), new pz4.a(6, new m(gVar, params, 15)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 1:
                        mza.c params2 = (mza.c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        oza.d dVar = (oza.d) this.f240916b.f240924b.T2("remoteStories" + mo3.a.l(params2), oza.d.class);
                        if (dVar != null) {
                            return lza.b.a(dVar);
                        }
                        return null;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f240916b.f240924b;
                        Type REMOTE_STORIES_TYPE = g.f;
                        Intrinsics.checkNotNullExpressionValue(REMOTE_STORIES_TYPE, "REMOTE_STORIES_TYPE");
                        return (Map) cVar.T2("REMOTE_STORIES_CONFIG_KEY", REMOTE_STORIES_TYPE);
                }
            }
        };
        final int i6 = 0;
        this.e = new w4l.f(bVarK0, function1, new Function2(this) { // from class: pza.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f240918b;

            {
                this.f240918b = this;
            }

            /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                g gVar = this.f240918b;
                switch (i22) {
                    case 0:
                        mza.c params = (mza.c) obj2;
                        mza.d story = (mza.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(story, "story");
                        ue0.c cVar = gVar.f240924b;
                        String strQ = j6.a.q("remoteStories", mo3.a.l(params));
                        mza.h hVar = lza.b.f200955a;
                        Intrinsics.checkNotNullParameter(story, "<this>");
                        mza.f fVar = story.f210730a;
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        oza.c cVar2 = new oza.c(fVar.f210735a, fVar.f210736b);
                        ArrayList<mza.g> arrayList = story.f210731b;
                        int i32 = 10;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (mza.g gVar2 : arrayList) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            String str = gVar2.f210737a;
                            String str2 = gVar2.f210738b;
                            String str3 = gVar2.f210739c;
                            ArrayList<mza.e> arrayList3 = gVar2.d;
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i32));
                            for (mza.e eVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList4.add(new oza.a(eVar.f210732a, eVar.f210733b, eVar.f210734c));
                            }
                            mza.h hVar2 = gVar2.e;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            String strG = u1.g(hVar2.f210740a, lza.b.f200956b);
                            mza.b bVar = hVar2.f210741b;
                            arrayList2.add(new oza.f(str, str2, str3, arrayList4, new oza.g(strG, bVar != null ? u1.h(bVar, lza.b.f200957c) : null)));
                            i32 = 10;
                        }
                        cVar.G(new oza.d(cVar2, arrayList2), strQ, z.d(o0.b(oza.d.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f240923a.getRemoteStoriesConfig();
                    default:
                        Map config = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        gVar.f240924b.G(config, "REMOTE_STORIES_CONFIG_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
