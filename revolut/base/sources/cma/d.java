package cma;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.confirmation.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements vla.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f25186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dci.b f25187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f25188c;
    public final ResourceImage d;
    public final TextLocalisedClause e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f25189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ResourceImage f25190h;
    public final TextLocalisedClause i;

    public d(n8b.a countryInteractor, dci.b purposeNameProvider, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(purposeNameProvider, "purposeNameProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f25186a = countryInteractor;
        this.f25187b = purposeNameProvider;
        this.f25188c = uiKitResources;
        this.d = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        this.e = new TextLocalisedClause(R.string.common_action_edit, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        this.f = new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        this.f25189g = new TextLocalisedClause(R.string.common_action_add, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        this.f25190h = new ResourceImage(R$drawable.uikit_icn_16_sand_watch, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        this.i = new TextLocalisedClause(R$string.profile_account_status_in_review, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }
}
