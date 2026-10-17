package n3i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import ez0.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import t61.j;
import t70.g;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f212136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f212137b;

    public b(g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f212136a = localization;
        this.f212137b = w.y0(new n08.b(27));
    }

    public final String a(j jVar, String lastFour, String divider) {
        m5l.b bVar;
        String strB;
        String strC;
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(divider, "divider");
        String strConcat = (jVar == null || (bVar = jVar.f268161g) == null || (strB = bVar.b()) == null || (strC = jli.g.c(strB)) == null) ? null : strC.concat(" ");
        if (strConcat == null) {
            strConcat = "";
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(strConcat, divider, lastFour);
    }

    public final String b(String divider, t61.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(divider, "divider");
        return a(card.f268142j, card.d, divider);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Image c(String str) {
        ?? r110 = this.f212137b;
        return (str == null || str.length() == 0) ? (LayeredImage) r110.getValue() : new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder((LayeredImage) r110.getValue()), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) r110.getValue(), false, false, new ImageTransformations(null, new RoundedRectTransformation(2.0f), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 515578);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(t61.g r8) {
        /*
            r7 = this;
            java.lang.String r0 = "card"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            t61.j r8 = r8.f268142j
            java.lang.String r0 = ""
            if (r8 == 0) goto L15
            java.lang.String r1 = r8.f268159b
            if (r1 == 0) goto L15
            java.lang.String r1 = kotlin.text.a0.o(r1)
            if (r1 != 0) goto L1b
        L15:
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r1)
            r1 = r0
        L1b:
            t70.g r2 = r7.f212136a
            int r3 = com.revolut.feature_external_cards_imp.impl.R$string.external_cards_credit
            java.lang.String r2 = r2.getString(r3)
            if (r8 == 0) goto L46
            java.lang.String r3 = r8.f
            if (r3 == 0) goto L46
            qd0.a r4 = qd0.b.Companion
            r4.getClass()
            java.util.Locale r4 = qd0.a.f244819b
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            if (r3 == 0) goto L46
            java.lang.String r4 = "credit"
            r5 = 0
            boolean r3 = kotlin.text.d0.J(r3, r4, r5)
            r4 = 1
            if (r3 != r4) goto L46
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 != 0) goto L4f
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r2)
            r2 = r0
        L4f:
            if (r8 == 0) goto L64
            m5l.b r8 = r8.f268161g
            if (r8 == 0) goto L64
            java.lang.String r8 = r8.b()
            if (r8 == 0) goto L64
            java.lang.String r8 = kotlin.text.a0.o(r8)
            if (r8 != 0) goto L62
            goto L64
        L62:
            r0 = r8
            goto L69
        L64:
            kotlin.jvm.internal.t0 r8 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r8)
        L69:
            java.lang.String[] r8 = new java.lang.String[]{r1, r2, r0}
            java.util.List r8 = zhm.v.k(r8)
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 0
            r6 = 62
            java.lang.String r1 = " "
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r8 = zhm.d0.k0(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n3i.b.d(t61.g):java.lang.String");
    }
}
