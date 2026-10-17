package wv1;

import a12.j;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import lx1.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f300263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f300264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferralContactDelegate.Model f300265c;

    public e(j apmAreaMapper, i apmRecipientMapper) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        this.f300263a = apmAreaMapper;
        this.f300264b = apmRecipientMapper;
        this.f300265c = new ReferralContactDelegate.Model("ApmAreaContactsMapper_newContact", new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4095), new TextLocalisedClause(R$string.apm_action_new_contact_alternative, null, null, 14), null, null, null, false, null, null, 524248);
    }
}
