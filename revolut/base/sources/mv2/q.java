package mv2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card.verification.impl.R$string;
import ip0.ab;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3i.b f209109a;

    public q(n3i.b externalCardsMapper) {
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        this.f209109a = externalCardsMapper;
    }

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
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f209093a;
        ab abVar = ab.DIGITS_4;
        int i = R$attr.uikit_dp24;
        t61.g gVar = domainState.f209094b;
        List listC = u.c(new z3("CODE_LIST_ID", str, abVar, null, false, null, false, gVar == null, i, 0, 0, 0, 3704));
        h hVar = null;
        if (gVar != null) {
            int i2 = R$string.cnp_card_verification_transaction_code_title;
            n3i.b bVar = this.f209109a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, u.c(bVar.b("··", gVar)), null, 12);
            TextClause textClause = new TextClause(bVar.d(gVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cnp_card_verification_transaction_code_caption, u.c(bVar.d(gVar)), null, 12);
            t61.j jVar2 = gVar.f268142j;
            hVar = new h(textLocalisedClause, textClause, textLocalisedClause2, nz8.d.L(bVar.c(jVar2 != null ? jVar2.f268160c : null)), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_TRANSACTION_CODE_INFO", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124)));
        }
        return new i(listC, hVar);
    }
}
