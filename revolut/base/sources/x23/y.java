package x23;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f302501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f302503c;
    public final Object d;
    public final Object e;

    public y(gte.a featureToggleInteractor, lx2.d densityProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f302501a = featureToggleInteractor;
        this.f302502b = densityProvider.a();
        final int i = 0;
        this.f302503c = te0.w.y0(new Function0(this) { // from class: x23.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f302500b;

            {
                this.f302500b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.NewFontsCardPersonalisation.f65566c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.AiCardCustomisation.f65554c);
                        break;
                    default:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.d = te0.w.y0(new Function0(this) { // from class: x23.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f302500b;

            {
                this.f302500b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.NewFontsCardPersonalisation.f65566c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.AiCardCustomisation.f65554c);
                        break;
                    default:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i3 = 2;
        this.e = te0.w.y0(new Function0(this) { // from class: x23.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f302500b;

            {
                this.f302500b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i3) {
                    case 0:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.NewFontsCardPersonalisation.f65566c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.AiCardCustomisation.f65554c);
                        break;
                    default:
                        zC = ((jte.d) this.f302500b.f302501a).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.TextLocalisedClause a(x23.j r7) {
        /*
            com.revolut.data.model.Data r0 = r7.d
            java.lang.Object r0 = r0.getContent()
            c93.j r0 = (c93.j) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L67
        Lc:
            c93.l r0 = r0.f22288a
            java.util.List r2 = r0.f22292c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto L24
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L24
            goto L40
        L24:
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L40
            java.lang.Object r5 = r2.next()
            c93.m r5 = (c93.m) r5
            dj0.d r5 = r5.f22293a
            dj0.d r6 = dj0.d.e
            boolean r5 = r5.f(r6)
            if (r5 == 0) goto L28
            r2 = r3
            goto L41
        L40:
            r2 = r4
        L41:
            java.util.List r0 = r0.f22292c
            if (r0 == 0) goto L4c
            boolean r0 = cj9.c.b(r0)
            if (r0 != r3) goto L4c
            goto L4d
        L4c:
            r3 = r4
        L4d:
            if (r2 == 0) goto L67
            r0 = 14
            if (r3 == 0) goto L5b
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.cards_core.R$string.card_personalisation_preview_taxes_footer
            r2.<init>(r3, r1, r1, r0)
            goto L62
        L5b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.cards_core.R$string.card_personalisation_preview_regular_taxes_footer
            r2.<init>(r3, r1, r1, r0)
        L62:
            boolean r7 = r7.e
            if (r7 == 0) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x23.y.a(x23.j):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0332  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r41) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x23.y.c(cli.j):cli.o");
    }
}
