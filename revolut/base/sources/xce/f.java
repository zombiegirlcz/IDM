package xce;

import akl.x;
import bde.o;
import bde.q;
import bde.t;
import com.revolut.feature.support.impl.data.network.service.SupportService;
import com.youTransactor.uCube.rpc.Constants;
import cpi.g;
import d71.k;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.n;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import x8i.h;
import yhm.j;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SupportService f304119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f304120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f304121c;
    public final n d;
    public final w4l.f e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f304122g;

    public f(SupportService supportService, g troubleshootingDtoMapper, ue0.c storage, n memoryCache) {
        Intrinsics.checkNotNullParameter(supportService, "supportService");
        Intrinsics.checkNotNullParameter(troubleshootingDtoMapper, "troubleshootingDtoMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f304119a = supportService;
        this.f304120b = troubleshootingDtoMapper;
        this.f304121c = storage;
        this.d = memoryCache;
        final int i = 5;
        Function2 function2 = new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 0;
        new w4l.f(function2, new Function1(this) { // from class: xce.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304115b;

            {
                this.f304115b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k) this.f304115b.d.get("SUPPORT_BANNERS_CACHE_KEY");
                    case 1:
                        cde.b params = (cde.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f304115b.d.get("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params);
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (k7d.d) this.f304115b.d.get("troubleshootingSuggestions");
                    default:
                        List params2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) ((n) this.f304115b.f.getValue()).get(params2);
                }
            }
        }, new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 1;
        final int i5 = 1;
        final int i6 = 2;
        this.e = new w4l.f(new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: xce.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304115b;

            {
                this.f304115b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k) this.f304115b.d.get("SUPPORT_BANNERS_CACHE_KEY");
                    case 1:
                        cde.b params = (cde.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f304115b.d.get("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params);
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (k7d.d) this.f304115b.d.get("troubleshootingSuggestions");
                    default:
                        List params2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) ((n) this.f304115b.f.getValue()).get(params2);
                }
            }
        }, new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        Continuation continuation = null;
        final int i21 = 2;
        final int i22 = 3;
        new x4l.c(new akl.v(this, continuation, 4), new Function1(this) { // from class: xce.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304115b;

            {
                this.f304115b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k) this.f304115b.d.get("SUPPORT_BANNERS_CACHE_KEY");
                    case 1:
                        cde.b params = (cde.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f304115b.d.get("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params);
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (k7d.d) this.f304115b.d.get("troubleshootingSuggestions");
                    default:
                        List params2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) ((n) this.f304115b.f.getValue()).get(params2);
                }
            }
        }, new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        }, new akl.w(this, continuation, 10), new x(this, continuation, 6));
        this.f = j.b(new ru0.d(29));
        final int i32 = 4;
        Function2 function22 = new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        };
        final int i33 = 3;
        Function1 function1 = new Function1(this) { // from class: xce.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304115b;

            {
                this.f304115b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k) this.f304115b.d.get("SUPPORT_BANNERS_CACHE_KEY");
                    case 1:
                        cde.b params = (cde.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f304115b.d.get("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params);
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (k7d.d) this.f304115b.d.get("troubleshootingSuggestions");
                    default:
                        List params2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) ((n) this.f304115b.f.getValue()).get(params2);
                }
            }
        };
        final int i43 = 6;
        this.f304122g = new w4l.f(function22, function1, new Function2(this) { // from class: xce.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f304117b;

            {
                this.f304117b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        k banners = (k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        this.f304117b.d.f("SUPPORT_BANNERS_CACHE_KEY", banners);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        cde.b params = (cde.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f304117b;
                        d0<List<q>> troubleshootingForTransaction = fVar.f304119a.getTroubleshootingForTransaction(params.a(), v.k("CONTENT", "DEEP_LINK"), null);
                        x9h.d dVar = new x9h.d(21, new a(fVar, 2));
                        troubleshootingForTransaction.getClass();
                        i iVar = new i(troubleshootingForTransaction, dVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 2:
                        cde.b params2 = (cde.b) obj2;
                        List troubleshootings = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(troubleshootings, "troubleshootings");
                        this.f304117b.d.f("TRANSACTION_TROUBLESHOOTING_CACHE_KEY_" + params2, troubleshootings);
                        return Unit.f186387a;
                    case 3:
                        k7d.d suggestions = (k7d.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f304117b.d.f("troubleshootingSuggestions", suggestions);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List params3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        f fVar2 = this.f304117b;
                        SupportService supportService2 = fVar2.f304119a;
                        List list = params3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        if (it8.hasNext()) {
                            a0.d.B(it8.next());
                            throw null;
                        }
                        d0<List<q>> troubleshootingFeed = supportService2.getTroubleshootingFeed(new t(arrayList));
                        x9h.d dVar2 = new x9h.d(19, new a(fVar2, 1));
                        troubleshootingFeed.getClass();
                        i iVar2 = new i(troubleshootingFeed, dVar2, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return te0.w.i0(iVar2);
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<List<o>> banner = this.f304117b.f304119a.getBanner();
                        x9h.d dVar3 = new x9h.d(20, new h(27));
                        banner.getClass();
                        i iVar3 = new i(banner, dVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List params4 = (List) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        ((n) this.f304117b.f.getValue()).f(params4, feedResponses);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
