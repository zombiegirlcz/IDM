package vv8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import ip0.qe0;
import ip0.we0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ProgressStyle a(j jVar) {
        if (Intrinsics.f(jVar, g.f292480a)) {
            return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, 0, R$attr.uikit_colorStatusSuccess);
        }
        if (jVar instanceof i) {
            return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, ((i) jVar).f292483b, R$attr.uikit_colorAccentNeutral);
        }
        if (Intrinsics.f(jVar, h.f292481a)) {
            return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, 100, R$attr.uikit_colorStatusSuccess);
        }
        if (jVar instanceof f) {
            return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, 100, R$attr.uikit_colorStatusWarning);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static RowDelegate.Model b(s sVar, String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ResourceImage resourceImage, ProgressStyle progressStyle) {
        return new RowDelegate.Model(str, resourceImage, null, progressStyle, textLocalisedClause, textLocalisedClause2, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1056964452);
    }

    public static TextLocalisedClause d(j jVar) {
        if (jVar instanceof f) {
            return new TextLocalisedClause(R$string.components_status_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(jVar, g.f292480a)) {
            return new TextLocalisedClause(R$string.components_status_pending, null, null, 14);
        }
        if (Intrinsics.f(jVar, h.f292481a)) {
            return new TextLocalisedClause(R$string.components_status_uploaded, null, null, 14);
        }
        if (jVar instanceof i) {
            return new TextLocalisedClause(R$string.components_status_uploading, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClauseD = d(domainState.f292472b);
        j jVar2 = domainState.f292473c;
        TextLocalisedClause textLocalisedClauseD2 = d(jVar2);
        j jVar3 = domainState.f292472b;
        boolean z = ((jVar3 instanceof i) || (jVar2 instanceof i)) ? false : true;
        List listC = zhm.u.c(new we0("IMAGE_ITEM", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D197", null, UrlImageDrawable.Shimmering.INSTANCE, null, 26))));
        List listK = zhm.v.k(b(this, "DOCUMENTS_UPLOAD_STATE_ITEM", new TextLocalisedClause(R$string.components_document_title, null, null, 14), textLocalisedClauseD, new ResourceImage(R$drawable.uikit_icn_24_person, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), a(jVar3)), b(this, "SELFIE_UPLOAD_STATE_ITEM", new TextLocalisedClause(R$string.components_selfie_title, null, null, 14), textLocalisedClauseD2, new ResourceImage(R$drawable.uikit_icn_24_camera, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), a(jVar2)));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listK, listC);
        TextLocalisedClause textLocalisedClause = jVar3 instanceof g ? new TextLocalisedClause(R$string.components_button_scan_document, null, null, 14) : jVar3 instanceof f ? new TextLocalisedClause(R$string.components_button_make_retry_document_upload, null, null, 14) : jVar2 instanceof g ? new TextLocalisedClause(R$string.components_button_scan_biometrics, null, null, 14) : jVar2 instanceof f ? new TextLocalisedClause(R$string.components_button_make_retry_biometrics_upload, null, null, 14) : new TextLocalisedClause(R$string.components_button_continue, null, null, 14);
        h hVar = h.f292481a;
        return new e(textLocalisedClause, ((Intrinsics.f(jVar3, hVar) && Intrinsics.f(jVar2, hVar)) || (jVar3 instanceof f) || (jVar2 instanceof f)) ? null : new TextLocalisedClause(R$string.components_footer_text, zhm.u.c(new TextLocalisedClause(R$string.components_footer_privacy_statement, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_LINK_ID", false), 10)), null, 12), arrayListE0, z);
    }
}
