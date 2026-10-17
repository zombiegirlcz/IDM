package hzj;

import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.q0;
import rp0.t0;
import rp0.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f157215c = q0.VERTICAL;
    public static final ResourceImage d = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f157216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zyj.a f157217b;

    public m(e limitDetailsProvider, zyj.a limitsPlanAppConfig) {
        Intrinsics.checkNotNullParameter(limitDetailsProvider, "limitDetailsProvider");
        Intrinsics.checkNotNullParameter(limitsPlanAppConfig, "limitsPlanAppConfig");
        this.f157216a = limitDetailsProvider;
        this.f157217b = limitsPlanAppConfig;
    }

    public final u0 a(b bVar, List list) {
        if (l.f157214a[this.f157217b.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String str = bVar.f157198a;
        String str2 = bVar.f157203j;
        mzj.d dVar = new mzj.d(str, list, str2);
        TextLocalisedClause textLocalisedClause = bVar.f157199b;
        Clause clause = bVar.f157200c;
        a aVar = bVar.e;
        Clause clause2 = aVar.f157196b;
        Clause clause3 = aVar.f157197c;
        int i = aVar.f157195a;
        int i2 = bVar.f;
        return new u0(textLocalisedClause, clause, null, new t0(new ProgressStyle(Math.min(i, 100), 100, i2, i2, R$attr.uikit_colorGreyTone10, 12.0f, 12.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS), clause2, clause3), null, d, str2 != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, f157215c, null, null, null, null, null, null, null, null, dVar, null, null, 33029908);
    }
}
