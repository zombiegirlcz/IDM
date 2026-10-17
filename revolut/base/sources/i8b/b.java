package i8b;

import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import efm.r;
import h8b.c;
import h8b.h;
import h8b.k;
import i52.j;
import iel.e;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import vkm.d;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f159484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f159485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f159486n;
    public final h8b.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f159487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j8b.h f159488q;

    public b(k presentationModel, j60.a bottomExpandableDialog, c eventInfoMapperWrapper, h8b.a corporateEventDetailsNavigator, f80.a uriHelper, j8b.h eventsToWidgetMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(eventInfoMapperWrapper, "eventInfoMapperWrapper");
        Intrinsics.checkNotNullParameter(corporateEventDetailsNavigator, "corporateEventDetailsNavigator");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(eventsToWidgetMapper, "eventsToWidgetMapper");
        this.f159484l = presentationModel;
        this.f159485m = bottomExpandableDialog;
        this.f159486n = eventInfoMapperWrapper;
        this.o = corporateEventDetailsNavigator;
        this.f159487p = uriHelper;
        this.f159488q = eventsToWidgetMapper;
    }

    @Override // h8b.f
    public final efm.b Y(String str) {
        return d3(new FeatureCommand(new CorporateEventsFeatureConfig.CorporateEventsConfig(str, 6)));
    }

    @Override // h8b.f
    public final efm.b Y1(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        return d3(new BrowserCommand(((f80.b) this.f159487p).f(uri2)));
    }

    @Override // h8b.h
    public final efm.b Z2(iel.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f159485m.G(this.f159486n.a(event));
    }

    @Override // h8b.h
    public final pfm.h b3(kp3.b event, boolean z) {
        Intrinsics.checkNotNullParameter(event, "event");
        pfm.h hVar = new pfm.h(new br6.a(this, event, z, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // h8b.h
    public final d c3(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        k kVar = this.f159484l;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        yhl.d dVar = kVar.f149978a;
        f fVar = (f) kVar.f149980c;
        r rVarCompose = yhl.d.c(dVar, ref2, fVar.e(), fVar.e().plusYears(1L), false, a1.j(dVar.a(), e.MARKET_HOLIDAY), null, null, null, 256).compose(kVar.f149979b);
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        r map = nim.a.w(rVarCompose, new h5i.b(25)).switchMap(new j(6, new a(this, ref2, 0))).map(new j(7, new a(this, ref2, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(ue0.e.q(map, h0.f322473a));
    }

    public final efm.b d3(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        pfm.h hVar = new pfm.h(new hc7.a(this, command, 7), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // h8b.f
    public final efm.b f2(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return d3(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(ref2, null, false, null, null, null, 62), false, (Integer) null, 0, 61)));
    }
}
