package yz7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import java.util.List;
import koi.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C1769a Companion = new C1769a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f318042a;

    /* JADX INFO: renamed from: yz7.a$a, reason: collision with other inner class name */
    public static final class C1769a {
        private C1769a() {
        }
    }

    public static RowDelegate.Model a(String str, PolicyDocument policyDocument) {
        return new RowDelegate.Model(str, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, Float.valueOf(40.0f), null, 32), null, null, policyDocument.getF76273a(), null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, null, null, null, null, policyDocument, null, 0, 0, 0, 0, 1056958444);
    }
}
