package ja3;

import android.content.Context;
import avc.o;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import efm.r;
import h93.f0;
import ha3.x;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l93.f f172420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha3.f f172421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f172422c;
    public final yy0.f d;
    public final c90.c e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f172423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f172424h;

    public f(Context context, c90.c uiResources, ha3.f cardsConfigInteractor, l93.f revolutCardsInteractor, yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f172420a = revolutCardsInteractor;
        this.f172421b = cardsConfigInteractor;
        this.f172422c = context;
        this.d = imageDisplayer;
        this.e = uiResources;
        final int i = 0;
        this.f = w.y0(new Function0(this) { // from class: ja3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f172413b;

            {
                this.f172413b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                switch (i) {
                    case 0:
                        iK = kli.a.k(this.f172413b.f172422c, 250.0f);
                        break;
                    default:
                        iK = kli.a.k(this.f172413b.f172422c, 163.0f);
                        break;
                }
                return Integer.valueOf(iK);
            }
        });
        final int i2 = 1;
        this.f172423g = w.y0(new Function0(this) { // from class: ja3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f172413b;

            {
                this.f172413b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                switch (i2) {
                    case 0:
                        iK = kli.a.k(this.f172413b.f172422c, 250.0f);
                        break;
                    default:
                        iK = kli.a.k(this.f172413b.f172422c, 163.0f);
                        break;
                }
                return Integer.valueOf(iK);
            }
        });
        this.f172424h = w.y0(new b(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int a() {
        return ((Number) this.f172423g.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int b() {
        return ((Number) this.f.getValue()).intValue();
    }

    public final r c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        final int i = 0;
        r rVarF = o70.a.f(pd.b.r(((x) this.f172420a).v(cardId), new Function1(this) { // from class: ja3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f172416b;

            {
                this.f172416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        f0 card = (f0) obj2;
                        Intrinsics.checkNotNullParameter(card, "card");
                        return nim.a.w(this.f172416b.f172421b.a(card.f150114h.f13639a), new o(card, 5));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        f0 f0Var = (f0) pair.f186385a;
                        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) pair.f186386b;
                        CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b;
                        o5l.a aVar = o5l.b.Companion;
                        String str = f0Var.f150114h.f13640b;
                        aVar.getClass();
                        o5l.b bVarA = o5l.a.a(str);
                        f fVar = this.f172416b;
                        int iB = fVar.e.b();
                        String strF = edl.a.f(cardDetailsConfigBackground, bVarA, iB != 160 ? iB != 240 ? iB != 320 ? iB != 480 ? iB != 640 ? o5l.g.XHDPI : o5l.g.XXXHDPI : o5l.g.XXHDPI : o5l.g.XHDPI : o5l.g.HDPI : o5l.g.MDPI);
                        r rVarCreate = r.create(new androidx.credentials.playservices.b(fVar, strF != null ? new UrlImage(strF, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, f0Var, cardDetailsDesignConfig));
                        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
                        return rVarCreate;
                }
            }
        }));
        final int i2 = 1;
        return pd.b.r(rVarF, new Function1(this) { // from class: ja3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f172416b;

            {
                this.f172416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        f0 card = (f0) obj2;
                        Intrinsics.checkNotNullParameter(card, "card");
                        return nim.a.w(this.f172416b.f172421b.a(card.f150114h.f13639a), new o(card, 5));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        f0 f0Var = (f0) pair.f186385a;
                        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) pair.f186386b;
                        CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b;
                        o5l.a aVar = o5l.b.Companion;
                        String str = f0Var.f150114h.f13640b;
                        aVar.getClass();
                        o5l.b bVarA = o5l.a.a(str);
                        f fVar = this.f172416b;
                        int iB = fVar.e.b();
                        String strF = edl.a.f(cardDetailsConfigBackground, bVarA, iB != 160 ? iB != 240 ? iB != 320 ? iB != 480 ? iB != 640 ? o5l.g.XHDPI : o5l.g.XXXHDPI : o5l.g.XXHDPI : o5l.g.XHDPI : o5l.g.HDPI : o5l.g.MDPI);
                        r rVarCreate = r.create(new androidx.credentials.playservices.b(fVar, strF != null ? new UrlImage(strF, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, f0Var, cardDetailsDesignConfig));
                        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
                        return rVarCreate;
                }
            }
        });
    }
}
