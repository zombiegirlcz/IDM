package com.revolut.feature.vaults.impl.ui.details.terms_viewer;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreenContract$InputData;
import com.revolut.retail.common.ui.R$string;
import com.youTransactor.uCube.rpc.Constants;
import iii.c;
import java.util.List;
import jme.f;
import jpl.e;
import jqg.h;
import jqg.i;
import jqg.k;
import jqg.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultTermsViewerScreenContract$InputData f94760a;

    public b(VaultTermsViewerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f94760a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f177718a;
        boolean z = domainState.f177719b;
        h hVar = (h) c.f(data, new e(6), new f(this, 15), new jb8.b(18));
        VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData = this.f94760a;
        Clause clause = vaultTermsViewerScreenContract$InputData.f94753b;
        Clause clause2 = null;
        List listC = (vaultTermsViewerScreenContract$InputData.f94754c && (hVar instanceof jqg.e) && z) ? u.c(new IconNavBarMenuItem("MENU_ID_SAVE", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.common_action_save, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : f0.f322471a;
        VaultTermsViewerScreenContract$InputData.BottomButton bottomButton = vaultTermsViewerScreenContract$InputData.d;
        if (bottomButton != null) {
            VaultTermsViewerScreenContract$InputData.BottomButton bottomButton2 = ((hVar instanceof jqg.e) && z) ? bottomButton : null;
            if (bottomButton2 != null) {
                clause2 = bottomButton2.f94755a;
            }
        }
        Clause clause3 = clause2;
        boolean z3 = false;
        if (bottomButton != null && (!bottomButton.f94756b || (z && domainState.f177720c))) {
            z3 = true;
        }
        return new k(hVar, clause, listC, clause3, z3);
    }
}
