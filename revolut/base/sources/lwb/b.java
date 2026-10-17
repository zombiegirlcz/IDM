package lwb;

import bwb.e;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$Store;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import eub.i;
import jsl.t0;
import jwb.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import lr9.m;
import lul.d;
import nyb.o;
import o97.l;
import o97.r;
import o97.y;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements vvb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f200436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final svb.a f200437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f200438c;
    public final gte.a d;
    public final r e;

    public b(e giftCardsRepository, a giftCardsGlobalSearchMapper, svb.a revPointsGiftCardsFeatureInteractor, i revPointsOptInInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(giftCardsRepository, "giftCardsRepository");
        Intrinsics.checkNotNullParameter(giftCardsGlobalSearchMapper, "giftCardsGlobalSearchMapper");
        Intrinsics.checkNotNullParameter(revPointsGiftCardsFeatureInteractor, "revPointsGiftCardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f200436a = giftCardsRepository;
        this.f200437b = revPointsGiftCardsFeatureInteractor;
        this.f200438c = revPointsOptInInteractor;
        this.d = featureToggleInteractor;
        this.e = r.GIFT_CARDS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = (c) this.f200437b;
        cVar.getClass();
        efm.r rVarSwitchMap = efm.r.combineLatest(rd0.e.c(new v1(new t0(cVar, (Continuation) null, 7)), g.f186406a), ((o) this.f200438c).f(false), new m(new lnk.o(22), 23)).switchMap(new m(new d(this, searchQuery, 2), 24));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // z87.f
    public final r h() {
        return this.e;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        kwb.a aVar = obj2 instanceof kwb.a ? (kwb.a) obj2 : null;
        if (aVar == null) {
            return o97.e.f223096a;
        }
        boolean z = ((jte.d) this.d).c(StoreApi$Toggles$Store.f88419c) && aVar.f190324c != null;
        RevPointsGiftcardsDestination revPointsGiftcardsDestination = new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(aVar.f190322a, null, aVar.f190324c, null, 10), null);
        FeatureCommand featureCommandF = z ? u0.f(revPointsGiftcardsDestination) : new FeatureCommand(new KompotOverlayFeatureConfig(revPointsGiftcardsDestination, yhi.b.POPUP, (Integer) null, 12));
        if (aVar.f190325g) {
            return z ? new o97.d(revPointsGiftcardsDestination) : new l(featureCommandF);
        }
        return new l(new FeatureCommand(new KompotOverlayFeatureConfig(new RevPointsOptInDestination(new RevPointsOptInNextDestination.Custom(featureCommandF), RevPointsOptInNextDestination.Default.f83526a, new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.GiftCard.f83991a, false, 6)), yhi.b.POPUP, (Integer) null, 12)));
    }
}
