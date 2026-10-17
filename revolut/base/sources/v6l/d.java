package v6l;

import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.revolut.shared.cards.model.card_config.domain.CardThumbnail;
import com.revolut.shared.cards.model.card_config.domain.VideoBackground;
import com.revolut.shared.feature.cards.domain.impl.data.network.config.CardConfigService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardConfigService f286444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f286445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f286446c;
    public final c90.a d;
    public final w4l.f e;

    public d(CardConfigService cardConfigService, n5l.a mapper, ne0.j memoryCache, ue0.c storage, c90.a colorProvider) {
        Intrinsics.checkNotNullParameter(cardConfigService, "cardConfigService");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        this.f286444a = cardConfigService;
        this.f286445b = memoryCache;
        this.f286446c = storage;
        this.d = colorProvider;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: v6l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f286422b;

            {
                this.f286422b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f286422b;
                        efm.d0<q5l.b> cardsConfig = dVar.f286444a.getCardsConfig("TRANSPARENT_DISPOSABLE_CARD");
                        v4a.i iVar = new v4a.i(27, new a(dVar, 0));
                        cardsConfig.getClass();
                        ufm.i iVar2 = new ufm.i(cardsConfig, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        p5l.c config = (p5l.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f286422b.f286445b.f("cards_config", config);
                        break;
                    default:
                        p5l.c domain = (p5l.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "config");
                        ue0.c cVar = this.f286422b.f286446c;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        List<CardDetailsDesignConfig> listA = domain.a();
                        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                        for (CardDetailsDesignConfig cardDetailsDesignConfig : listA) {
                            String str = cardDetailsDesignConfig.f104700a;
                            CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b;
                            r5l.a aVar = new r5l.a(cardDetailsConfigBackground.f104697a, cardDetailsConfigBackground.f104698b, cardDetailsConfigBackground.f104699c, cardDetailsConfigBackground.d);
                            CardDetailsConfigBackground cardDetailsConfigBackground2 = cardDetailsDesignConfig.f104702c;
                            r5l.a aVar2 = new r5l.a(cardDetailsConfigBackground2.f104697a, cardDetailsConfigBackground2.f104698b, cardDetailsConfigBackground2.f104699c, cardDetailsConfigBackground2.d);
                            CardThumbnail cardThumbnail = cardDetailsDesignConfig.f104706l;
                            r5l.j jVar = null;
                            r5l.d dVar2 = new r5l.d(aVar, aVar2, cardThumbnail != null ? new r5l.e(cardThumbnail.f104707a, cardThumbnail.f104708b, cardThumbnail.f104709c, cardThumbnail.d) : null);
                            r5l.b bVar = new r5l.b(cardDetailsDesignConfig.d, cardDetailsDesignConfig.e, cardDetailsDesignConfig.f, cardDetailsDesignConfig.f104703g, cardDetailsDesignConfig.f104704h, cardDetailsDesignConfig.i, cardDetailsDesignConfig.f104705j);
                            VideoBackground videoBackground = cardDetailsDesignConfig.k;
                            if (videoBackground != null) {
                                jVar = new r5l.j(new r5l.i(videoBackground.f104710a, videoBackground.f104711b));
                            }
                            arrayList.add(new r5l.c(str, dVar2, bVar, jVar));
                        }
                        cVar.G(new r5l.f(new r5l.g(new r5l.h(arrayList))), "cards_config", wim.z.d(kotlin.jvm.internal.o0.b(r5l.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        a aVar = new a(this, 1);
        Function2 function22 = new Function2(this) { // from class: v6l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f286422b;

            {
                this.f286422b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f286422b;
                        efm.d0<q5l.b> cardsConfig = dVar.f286444a.getCardsConfig("TRANSPARENT_DISPOSABLE_CARD");
                        v4a.i iVar = new v4a.i(27, new a(dVar, 0));
                        cardsConfig.getClass();
                        ufm.i iVar2 = new ufm.i(cardsConfig, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        p5l.c config = (p5l.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f286422b.f286445b.f("cards_config", config);
                        break;
                    default:
                        p5l.c domain = (p5l.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "config");
                        ue0.c cVar = this.f286422b.f286446c;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        List<CardDetailsDesignConfig> listA = domain.a();
                        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                        for (CardDetailsDesignConfig cardDetailsDesignConfig : listA) {
                            String str = cardDetailsDesignConfig.f104700a;
                            CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b;
                            r5l.a aVar2 = new r5l.a(cardDetailsConfigBackground.f104697a, cardDetailsConfigBackground.f104698b, cardDetailsConfigBackground.f104699c, cardDetailsConfigBackground.d);
                            CardDetailsConfigBackground cardDetailsConfigBackground2 = cardDetailsDesignConfig.f104702c;
                            r5l.a aVar22 = new r5l.a(cardDetailsConfigBackground2.f104697a, cardDetailsConfigBackground2.f104698b, cardDetailsConfigBackground2.f104699c, cardDetailsConfigBackground2.d);
                            CardThumbnail cardThumbnail = cardDetailsDesignConfig.f104706l;
                            r5l.j jVar = null;
                            r5l.d dVar2 = new r5l.d(aVar2, aVar22, cardThumbnail != null ? new r5l.e(cardThumbnail.f104707a, cardThumbnail.f104708b, cardThumbnail.f104709c, cardThumbnail.d) : null);
                            r5l.b bVar = new r5l.b(cardDetailsDesignConfig.d, cardDetailsDesignConfig.e, cardDetailsDesignConfig.f, cardDetailsDesignConfig.f104703g, cardDetailsDesignConfig.f104704h, cardDetailsDesignConfig.i, cardDetailsDesignConfig.f104705j);
                            VideoBackground videoBackground = cardDetailsDesignConfig.k;
                            if (videoBackground != null) {
                                jVar = new r5l.j(new r5l.i(videoBackground.f104710a, videoBackground.f104711b));
                            }
                            arrayList.add(new r5l.c(str, dVar2, bVar, jVar));
                        }
                        cVar.G(new r5l.f(new r5l.g(new r5l.h(arrayList))), "cards_config", wim.z.d(kotlin.jvm.internal.o0.b(r5l.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, aVar, function22, new a(this, 2), new Function2(this) { // from class: v6l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f286422b;

            {
                this.f286422b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f286422b;
                        efm.d0<q5l.b> cardsConfig = dVar.f286444a.getCardsConfig("TRANSPARENT_DISPOSABLE_CARD");
                        v4a.i iVar = new v4a.i(27, new a(dVar, 0));
                        cardsConfig.getClass();
                        ufm.i iVar2 = new ufm.i(cardsConfig, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        p5l.c config = (p5l.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f286422b.f286445b.f("cards_config", config);
                        break;
                    default:
                        p5l.c domain = (p5l.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "config");
                        ue0.c cVar = this.f286422b.f286446c;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        List<CardDetailsDesignConfig> listA = domain.a();
                        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                        for (CardDetailsDesignConfig cardDetailsDesignConfig : listA) {
                            String str = cardDetailsDesignConfig.f104700a;
                            CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b;
                            r5l.a aVar2 = new r5l.a(cardDetailsConfigBackground.f104697a, cardDetailsConfigBackground.f104698b, cardDetailsConfigBackground.f104699c, cardDetailsConfigBackground.d);
                            CardDetailsConfigBackground cardDetailsConfigBackground2 = cardDetailsDesignConfig.f104702c;
                            r5l.a aVar22 = new r5l.a(cardDetailsConfigBackground2.f104697a, cardDetailsConfigBackground2.f104698b, cardDetailsConfigBackground2.f104699c, cardDetailsConfigBackground2.d);
                            CardThumbnail cardThumbnail = cardDetailsDesignConfig.f104706l;
                            r5l.j jVar = null;
                            r5l.d dVar2 = new r5l.d(aVar2, aVar22, cardThumbnail != null ? new r5l.e(cardThumbnail.f104707a, cardThumbnail.f104708b, cardThumbnail.f104709c, cardThumbnail.d) : null);
                            r5l.b bVar = new r5l.b(cardDetailsDesignConfig.d, cardDetailsDesignConfig.e, cardDetailsDesignConfig.f, cardDetailsDesignConfig.f104703g, cardDetailsDesignConfig.f104704h, cardDetailsDesignConfig.i, cardDetailsDesignConfig.f104705j);
                            VideoBackground videoBackground = cardDetailsDesignConfig.k;
                            if (videoBackground != null) {
                                jVar = new r5l.j(new r5l.i(videoBackground.f104710a, videoBackground.f104711b));
                            }
                            arrayList.add(new r5l.c(str, dVar2, bVar, jVar));
                        }
                        cVar.G(new r5l.f(new r5l.g(new r5l.h(arrayList))), "cards_config", wim.z.d(kotlin.jvm.internal.o0.b(r5l.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
