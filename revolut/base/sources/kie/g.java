package kie;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.tab.accounts.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import k7c.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xjg.l;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vge.d f184228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l61.a f184229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mre.c f184230n;
    public final ekg.g o;

    public g(vge.d productAccountIteractor, l61.a userCompanyInteractor, mre.c termsNavigationFactory, ekg.g uiPersonalisationInteractor) {
        Intrinsics.checkNotNullParameter(productAccountIteractor, "productAccountIteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.f184228l = productAccountIteractor;
        this.f184229m = userCompanyInteractor;
        this.f184230n = termsNavigationFactory;
        this.o = uiPersonalisationInteractor;
    }

    public static final TextDelegate.Model Z2(g gVar, String str) {
        return new TextDelegate.Model("FSCS_FOOTER_ITEM_ID", new TextLocalisedClause(R$string.home_footer_legal_disclaimer_description, u.c(new TextLocalisedClause(R$string.home_footer_legal_disclaimer_learn_more, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "FSCS_FOOTER_CLICK_ID", false), 10)), null, 12), false, new ak0(null, new CdnImage(str, "mobile/fscs", null, new ImageTransformations(null, null, null, null, null, 48, 65, 31), null, null, Constants.TAG_E4_CUSTOMER_DATA), 1), null, null, 0, 0, 0, 0, 2036);
    }

    public static final String b3(g gVar, l lVar) {
        int i = b.f184221a[lVar.f306520a.f94562b.ordinal()];
        if (i == 1) {
            return "logo_dark";
        }
        if (i == 2) {
            return "logo_light";
        }
        if (i == 3) {
            return lVar.f306521b ? "logo_dark" : "logo_light";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pfe.i
    public final boolean F(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "FSCS_FOOTER_CLICK_ID")) {
            return false;
        }
        T2(new l0(this, null, 15), new yi5.b(27));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r5.getF89728b().f89730b, com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.RevPoints.INSTANCE) == false) goto L11;
     */
    @Override // pfe.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow t(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r5) {
        /*
            r4 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.revolut.feature.tab.accounts.models.ProductId r0 = r5.getF89727a()
            int[] r1 = kie.b.f184222b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto L32;
                case 4: goto L32;
                case 5: goto L32;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L29;
                case 9: goto L29;
                case 10: goto L29;
                case 11: goto L29;
                case 12: goto L29;
                case 13: goto L29;
                case 14: goto L1a;
                default: goto L14;
            }
        L14:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L1a:
            com.revolut.feature.tab.accounts.models.ProductAccountId r0 = r5.getF89728b()
            com.revolut.feature.tab.accounts.models.ProductAccountId$Payload r0 = r0.f89730b
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$RevPoints r1 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.RevPoints.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L29
            goto L32
        L29:
            zhm.f0 r5 = zhm.f0.f322471a
            go.g r0 = new go.g
            r1 = 2
            r0.<init>(r5, r1)
            return r0
        L32:
            l61.a r0 = r4.f184229m
            ang.b r0 = (ang.b) r0
            hng.g r0 = r0.f7765a
            efm.r r0 = hng.g.b(r0)
            kd8.f r1 = new kd8.f
            r2 = 22
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            efm.r r0 = m70.a.g(r0, r3, r1, r2)
            vkm.d r0 = rd0.e.b(r0)
            kotlinx.coroutines.flow.Flow r0 = vkm.q.q(r0)
            kie.c r1 = new kie.c
            r1.<init>(r3, r4, r5)
            wkm.l r5 = vkm.q.Q(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kie.g.t(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value):kotlinx.coroutines.flow.Flow");
    }
}
