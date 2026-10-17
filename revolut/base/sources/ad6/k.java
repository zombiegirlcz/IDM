package ad6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.entity.provider.models.R$string;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import md6.r;
import mx0.c7;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements h {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static ld6.b c(r product, cd6.b configuration) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        configuration.getClass();
        wi0.b bVar = wi0.b.O;
        wi0.b.Companion.getClass();
        if (bVar.equals(bVar)) {
            return ld6.b.REVOLUT_BANK_COLOMBIA;
        }
        return null;
    }

    @Override // ad6.h
    public final List a(ld6.g gVar, cd6.b configuration) {
        List listC;
        r product = (r) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ld6.b bVarC = c(product, configuration);
        return (bVarC == null || (listC = u.c(new ej("LEGAL_ENTITY_DISCLAIMER_ITEM_ID", new c7(new CompositeClause(v.k(new TextLocalisedClause(R$string.legal_product_plans_offered_by, u.c(bVarC.c()), null, 12), new TextLocalisedClause(R$string.legal_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEGAL_ENTITY_DISCLAIMER_CLICK_ID", false), 10)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, 6)))) == null) ? f0.f322471a : listC;
    }

    @Override // ad6.h
    public final /* bridge */ /* synthetic */ ld6.b b(ld6.g gVar, cd6.b bVar) {
        return c((r) gVar, bVar);
    }
}
