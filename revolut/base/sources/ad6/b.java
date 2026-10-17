package ad6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.entity.provider.models.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import md6.o;
import mx0.b7;
import mx0.e7;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b7 f3272a = new b7(new CdnImage("vigilado", "mobile/co_bank", null, null, null, null, Constants.TAG_OS_VERSION), 14, 148);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b7 f3273b = new b7(new CdnImage("fogafin", "mobile/co_bank", null, null, null, null, Constants.TAG_OS_VERSION), 105, 31);

    public b(bd6.b accountProductHelperMapper) {
        Intrinsics.checkNotNullParameter(accountProductHelperMapper, "accountProductHelperMapper");
    }

    @Override // ad6.h
    public final List a(ld6.g gVar, cd6.b configuration) {
        md6.a product = (md6.a) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        md6.e eVar = product.f204482a;
        o oVar = product.f204483b;
        md6.d dVar = product.f204484c;
        md6.f fVar = product.d;
        ld6.b bVarB = bd6.b.b(eVar, oVar, dVar, fVar, configuration);
        if (bVarB == null) {
            return f0.f322471a;
        }
        boolean z = product.e && bVarB == ld6.b.REVOLUT_BANK_COLOMBIA;
        Clause clauseA = bd6.b.a(product.f204482a, oVar, dVar, fVar, configuration);
        if (clauseA == null) {
            return f0.f322471a;
        }
        return u.c(new ej("LEGAL_ENTITY_DISCLAIMER_ITEM_ID", new e7(new CompositeClause(v.k(clauseA, new TextLocalisedClause(R$string.legal_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEGAL_ENTITY_DISCLAIMER_CLICK_ID", false), 10)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), z ? f3272a : null, product.f ? f3273b : null)));
    }

    @Override // ad6.h
    public final ld6.b b(ld6.g gVar, cd6.b configuration) {
        md6.a product = (md6.a) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return bd6.b.b(product.f204482a, product.f204483b, product.f204484c, product.d, configuration);
    }
}
