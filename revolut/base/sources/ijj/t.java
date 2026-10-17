package ijj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import ieg.y;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCancellationScreenContract$InputData f161825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mjj.d f161826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mjj.e f161827c;
    public final mjj.b d;

    public t(EsimMobilePlanCancellationScreenContract$InputData inputData, mjj.d contentItemsMapper, mjj.e navbarConfigMapper, mjj.b footerMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentItemsMapper, "contentItemsMapper");
        Intrinsics.checkNotNullParameter(navbarConfigMapper, "navbarConfigMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f161825a = inputData;
        this.f161826b = contentItemsMapper;
        this.f161827c = navbarConfigMapper;
        this.d = footerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 1;
        k kVar = (k) iii.c.f(domainState.f161807a, new p(1), new y(29), new Function3(this) { // from class: ijj.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f161823b;

            {
                this.f161823b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[PHI: r7
              0x016f: PHI (r7v41 ??) = (r7v33 ??), (r7v38 ??) binds: [B:51:0x016d, B:58:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r4v20, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v32 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /* JADX WARN: Type inference failed for: r7v38 */
            /* JADX WARN: Type inference failed for: r7v39 */
            /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r7v52 */
            /* JADX WARN: Type inference failed for: r7v53 */
            /* JADX WARN: Type inference failed for: r7v54 */
            /* JADX WARN: Type inference failed for: r7v55 */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ijj.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        List listC = zhm.u.c(new IconNavBarMenuItem("ID_HELP_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.esim_home_help_button, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        Data data = domainState.f161807a;
        final int i2 = 2;
        final int i3 = 0;
        return new l((List) iii.c.f(data, new ii4.b(this, 7), new r(0), new Function3(this) { // from class: ijj.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f161823b;

            {
                this.f161823b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[PHI: r7
              0x016f: PHI (r7v41 ??) = (r7v33 ??), (r7v38 ??) binds: [B:51:0x016d, B:58:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r4v20, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v32 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /* JADX WARN: Type inference failed for: r7v38 */
            /* JADX WARN: Type inference failed for: r7v39 */
            /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r7v52 */
            /* JADX WARN: Type inference failed for: r7v53 */
            /* JADX WARN: Type inference failed for: r7v54 */
            /* JADX WARN: Type inference failed for: r7v55 */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ijj.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }), kVar, listC, (j) iii.c.f(data, new p(0), new y(28), new Function3(this) { // from class: ijj.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f161823b;

            {
                this.f161823b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[PHI: r7
              0x016f: PHI (r7v41 ??) = (r7v33 ??), (r7v38 ??) binds: [B:51:0x016d, B:58:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r4v20, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v32 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /* JADX WARN: Type inference failed for: r7v38 */
            /* JADX WARN: Type inference failed for: r7v39 */
            /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r7v52 */
            /* JADX WARN: Type inference failed for: r7v53 */
            /* JADX WARN: Type inference failed for: r7v54 */
            /* JADX WARN: Type inference failed for: r7v55 */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ijj.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
    }
}
