package f33;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f131907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f131908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f131909c;
    public final Object d;

    public r(qd0.b languageProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f131907a = languageProvider;
        this.f131908b = featureToggleInteractor;
        final int i = 0;
        this.f131909c = w.y0(new Function0(this) { // from class: f33.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f131905b;

            {
                this.f131905b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f131905b.f131908b).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                    default:
                        zC = ((jte.d) this.f131905b.f131908b).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.d = w.y0(new Function0(this) { // from class: f33.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f131905b;

            {
                this.f131905b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f131905b.f131908b).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                    default:
                        zC = ((jte.d) this.f131905b.f131908b).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public static Clause a(dj0.d dVar, wi0.b bVar) {
        if (dVar.f115082a == 0) {
            return new TextLocalisedClause(com.bumptech.glide.d.x(bVar) ? R$string.delivery_method_complimentary : R.string.card_delivery_free, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        }
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b() {
        return ((Boolean) this.f131909c.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03db  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r54) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f33.r.c(cli.j):cli.o");
    }
}
