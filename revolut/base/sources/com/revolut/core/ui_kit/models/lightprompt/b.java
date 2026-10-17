package com.revolut.core.ui_kit.models.lightprompt;

import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f58107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f58108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LightPromptDelegate.Model f58109c;

    public b(TextClause textClause, LightPromptDelegate.Model lightPromptModel) {
        ResourceImage swipeIndicatorImage = new ResourceImage(R$drawable.uikit_icn_24_navigation_swipe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Intrinsics.checkNotNullParameter(swipeIndicatorImage, "swipeIndicatorImage");
        Intrinsics.checkNotNullParameter(lightPromptModel, "lightPromptModel");
        this.f58107a = textClause;
        this.f58108b = swipeIndicatorImage;
        this.f58109c = lightPromptModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f58107a, bVar.f58107a) && Intrinsics.f(this.f58108b, bVar.f58108b) && Intrinsics.f(this.f58109c, bVar.f58109c);
    }

    public final int hashCode() {
        Clause clause = this.f58107a;
        return this.f58109c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f58108b, (clause == null ? 0 : clause.hashCode()) * 31, 31);
    }
}
