package ja3;

import android.content.Context;
import avc.o;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import efm.k;
import efm.r;
import h93.f0;
import ha3.x;
import j7b.l;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfm.s;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements l93.a {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l93.f f172429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha3.f f172430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.f f172431c;
    public final c90.c d;
    public final Context e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f172432g;

    public j(Context context, c90.c uiResources, ha3.f cardsConfigInteractor, l93.f revolutCardsInteractor, yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f172429a = revolutCardsInteractor;
        this.f172430b = cardsConfigInteractor;
        this.f172431c = imageDisplayer;
        this.d = uiResources;
        this.e = context;
        final int i = 0;
        this.f = w.y0(new Function0(this) { // from class: ja3.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f172428b;

            {
                this.f172428b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                switch (i) {
                    case 0:
                        iK = kli.a.k(this.f172428b.e, 250.0f);
                        break;
                    default:
                        iK = kli.a.k(this.f172428b.e, 163.0f);
                        break;
                }
                return Integer.valueOf(iK);
            }
        });
        final int i2 = 1;
        this.f172432g = w.y0(new Function0(this) { // from class: ja3.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f172428b;

            {
                this.f172428b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                switch (i2) {
                    case 0:
                        iK = kli.a.k(this.f172428b.e, 250.0f);
                        break;
                    default:
                        iK = kli.a.k(this.f172428b.e, 163.0f);
                        break;
                }
                return Integer.valueOf(iK);
            }
        });
    }

    public final pfm.a a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        final int i = 0;
        r rVarF = o70.a.f(pd.b.r(((x) this.f172429a).v(cardId), new Function1(this) { // from class: ja3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f172426b;

            {
                this.f172426b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        f0 card = (f0) obj2;
                        Intrinsics.checkNotNullParameter(card, "card");
                        return nim.a.w(this.f172426b.f172430b.a(card.f150114h.f13639a), new o(card, 6));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        f0 f0Var = (f0) pair.f186385a;
                        CardDetailsConfigBackground cardDetailsConfigBackground = ((CardDetailsDesignConfig) pair.f186386b).f104701b;
                        o5l.a aVar = o5l.b.Companion;
                        String str = f0Var.f150114h.f13640b;
                        aVar.getClass();
                        o5l.b bVarA = o5l.a.a(str);
                        j jVar = this.f172426b;
                        int iB = jVar.d.b();
                        String strF = edl.a.f(cardDetailsConfigBackground, bVarA, iB != 160 ? iB != 240 ? iB != 320 ? iB != 480 ? iB != 640 ? o5l.g.XHDPI : o5l.g.XXXHDPI : o5l.g.XXHDPI : o5l.g.XHDPI : o5l.g.HDPI : o5l.g.MDPI);
                        r rVarCreate = r.create(new abf.c(jVar, strF != null ? new UrlImage(strF, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, 27));
                        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
                        return rVarCreate;
                }
            }
        }));
        final int i2 = 1;
        k kVarFirstElement = pd.b.r(rVarF, new Function1(this) { // from class: ja3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f172426b;

            {
                this.f172426b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        f0 card = (f0) obj2;
                        Intrinsics.checkNotNullParameter(card, "card");
                        return nim.a.w(this.f172426b.f172430b.a(card.f150114h.f13639a), new o(card, 6));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        f0 f0Var = (f0) pair.f186385a;
                        CardDetailsConfigBackground cardDetailsConfigBackground = ((CardDetailsDesignConfig) pair.f186386b).f104701b;
                        o5l.a aVar = o5l.b.Companion;
                        String str = f0Var.f150114h.f13640b;
                        aVar.getClass();
                        o5l.b bVarA = o5l.a.a(str);
                        j jVar = this.f172426b;
                        int iB = jVar.d.b();
                        String strF = edl.a.f(cardDetailsConfigBackground, bVarA, iB != 160 ? iB != 240 ? iB != 320 ? iB != 480 ? iB != 640 ? o5l.g.XHDPI : o5l.g.XXXHDPI : o5l.g.XXHDPI : o5l.g.XHDPI : o5l.g.HDPI : o5l.g.MDPI);
                        r rVarCreate = r.create(new abf.c(jVar, strF != null ? new UrlImage(strF, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, 27));
                        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
                        return rVarCreate;
                }
            }
        }).firstElement();
        kVarFirstElement.getClass();
        s sVar = new s(kVarFirstElement);
        Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
        return ue0.e.A(sVar, new l(12));
    }
}
