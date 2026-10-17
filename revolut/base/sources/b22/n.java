package b22;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import ip0.q7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f11857a;
        aim.e eVarB = u.b();
        if (list.size() < 5) {
            eVarB.add(new RowDelegate.Model("ADD_DOCUMENT_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_cell_title, null, null, 14), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        }
        List<File> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (File file : list2) {
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            arrayList.add(new RowDelegate.Model(path, new RowDelegate.Model.MainImage.Image40(new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), 10), null, null, false, null, false, 62), new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentControlNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, null, false, null, null, null, null, null, null, file, null, 0, 0, 0, 0, 532673528));
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        CellDetailsListDelegate.Model model = new CellDetailsListDelegate.Model("INFO_LIST_ITEM_ID", null, v.k(new q7(new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_info_text_1, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_16_bullet_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new q7(new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_info_text_2, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_16_bullet_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), null, null, null, 2042);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new i(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, !domainState.f11857a.isEmpty(), null, null, null, 988), null, null, 55), d0.F0(model, eVarA));
    }
}
