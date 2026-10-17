package fr7;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreenContract$InputData;
import fjd.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentsPreviewScreenContract$InputData f137406a;

    public l(DocumentsPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f137406a = inputData;
    }

    public final CompositeClause a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_documents_preview_subtitle, null, null, 14);
        int i = R$drawable.uikit_icn_16_info_outline;
        int i2 = R$attr.uikit_colorAccent;
        m70.a.t(t0.f186434a);
        return xl7.n.m(textLocalisedClause, i, i2, new Click(28, (Integer) null, (Object) this.f137406a.f75692a, "DOCUMENT_REQUIREMENTS_BUTTON_ID", false), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f137398a, new w(this, 25), new fgj.g(this, 21), new fnk.o(this, 2));
    }
}
