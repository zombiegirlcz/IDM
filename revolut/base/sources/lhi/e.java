package lhi;

import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements hpa.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f195267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f195268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final skd.i f195269c;
    public final gte.a d;
    public final om4.d0 e;
    public final lfm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f195270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f195271h;

    public e(q06.d deeplinkParser, l93.f revolutCardsInteractor, skd.i slotManagerInteractor, gte.a featureToggleInteractor, om4.d0 mainSlotContextProvider, lfm.c appDisposable, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mainSlotContextProvider, "mainSlotContextProvider");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f195267a = deeplinkParser;
        this.f195268b = revolutCardsInteractor;
        this.f195269c = slotManagerInteractor;
        this.d = featureToggleInteractor;
        this.e = mainSlotContextProvider;
        this.f = appDisposable;
        this.f195270g = appCoroutineScope;
        this.f195271h = te0.w.y0(new kob.a(this, 28));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strE = ipa.k.e(message);
        if (strE == null) {
            return false;
        }
        jf0.c cVarD = ((s06.c) this.f195267a).d(strE);
        String strA = cVarD != null ? cVarD.a() : null;
        Map mapD = cVarD != null ? cVarD.d() : null;
        String str = mapD != null ? (String) mapD.get("updateCards") : null;
        if (!((Boolean) this.f195271h.getValue()).booleanValue() || !Intrinsics.f(strA, "transactions") || !Boolean.parseBoolean(str)) {
            return false;
        }
        pfm.a aVar = new pfm.a(((ha3.x) this.f195268b).E(), new kgm.c(new lak.l(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new b(0, d.f195265a), c.f195263a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f, hVarW);
        skm.e0.C(this.f195270g, null, null, new kze.h(this, null, 12), 3);
        return true;
    }
}
