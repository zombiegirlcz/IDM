package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import cli.n;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import n68.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements n {

    @NotNull
    public static final y Companion = new y();

    public static CellDetailsActionDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, bj0.b bVar) {
        return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clause, false, false, null, bVar, 0, 0, 32224);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r25) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.screen.request.d.c(cli.j):cli.o");
    }
}
