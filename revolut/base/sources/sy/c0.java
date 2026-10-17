package sy;

import aw0.o9;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy.a f266536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy.a f266537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f266538c;

    public c0(qy.a cameraResultMapper, vy.a inputData, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(cameraResultMapper, "cameraResultMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f266536a = cameraResultMapper;
        this.f266537b = inputData;
        this.f266538c = languageProvider;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final p a(e eVar, Clause clause) {
        gv.d dVar;
        IconNavBarMenuItem iconNavBarMenuItemA;
        int i;
        boolean z = eVar instanceof c;
        gv.a aVar = gv.a.f147001a;
        if (z) {
            dVar = ((c) eVar).d;
        } else {
            if (!(eVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = aVar;
        }
        if (Intrinsics.f(dVar, aVar)) {
            iconNavBarMenuItemA = null;
        } else {
            IconNavBarMenuItem.Companion companion = IconNavBarMenuItem.INSTANCE;
            if (dVar instanceof gv.a) {
                i = R$drawable.uikit_icn_24_lightning;
            } else if (dVar instanceof gv.c) {
                i = R$drawable.uikit_icn_24_lightning_off;
            } else {
                if (!(dVar instanceof gv.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_lightning;
            }
            iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(companion, "SCREEN_FLASH_MENU_ITEM_ID", new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        }
        LabelNavBarMenuItem labelNavBarMenuItem = clause != null ? new LabelNavBarMenuItem("LANGUAGE_SELECTOR_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), clause, null, null, 472) : null;
        vy.a aVar2 = this.f266537b;
        ry.a aVar3 = aVar2.d;
        ry.a aVar4 = aVar2.d;
        NavBarMenuItem[] elements = {iconNavBarMenuItemA, labelNavBarMenuItem, (aVar3.f258194c != null || aVar3.f) ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "FAQ_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (!z) {
            if (eVar instanceof d) {
                return new o(aVar4.f258192a, listL);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!((c) eVar).f266535c) {
            return clause != null ? new m(listL) : new o(aVar4.f258192a, listL);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.selfie_active_liveness_title_recording, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_status_active, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i2 = R$attr.uikit_colorRed;
        return new n(new TagViewData(resourceImage, textLocalisedClause, new Color.Solid(i2), i2, null, 1000), listL);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState instanceof c;
        Clause textClause = null;
        if (z) {
            vy.a aVar = this.f266537b;
            if (aVar.d.f258195g) {
                c cVar = (c) domainState;
                if (!cVar.f266535c && (aVar.f293107a instanceof CameraKitFlowContract$FlowType.ActiveLiveness)) {
                    if (cVar.f) {
                        textClause = new TextLocalisedClause(R$string.selfie_active_liveness_language_selector_hand_signs, null, null, 14);
                    } else {
                        Locale localeA = cVar.e;
                        qd0.b bVar = this.f266538c;
                        if (localeA == null) {
                            localeA = ((s80.b) bVar).a();
                        }
                        String displayLanguage = localeA.getDisplayLanguage(((s80.b) bVar).a());
                        Intrinsics.checkNotNullExpressionValue(displayLanguage, "getDisplayLanguage(...)");
                        textClause = new TextClause(displayLanguage, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                }
            }
        }
        if (!z) {
            if (!(domainState instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            p pVarA = a(domainState, textClause);
            d dVar = (d) domainState;
            return new t(pVarA, dVar.f266539a, dVar.f266540b);
        }
        c cVar2 = (c) domainState;
        xv.l lVar = cVar2.f266534b;
        if (!cVar2.f266533a || lVar == null) {
            return new r(a(domainState, textClause));
        }
        qy.b bVar2 = (qy.b) this.f266536a;
        return new q(bVar2.a(lVar), bVar2.b(lVar), a(domainState, textClause));
    }
}
