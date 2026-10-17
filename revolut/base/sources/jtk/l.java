package jtk;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgm.i f178538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4h.b f178539b;

    public l(kgm.i eventBannerMapper, m4h.d instrumentWarningStateMatcher, m4h.b instrumentWarningStateMapper) {
        Intrinsics.checkNotNullParameter(eventBannerMapper, "eventBannerMapper");
        Intrinsics.checkNotNullParameter(instrumentWarningStateMatcher, "instrumentWarningStateMatcher");
        Intrinsics.checkNotNullParameter(instrumentWarningStateMapper, "instrumentWarningStateMapper");
        this.f178538a = eventBannerMapper;
        this.f178539b = instrumentWarningStateMapper;
    }

    public static ComplexImage.Regular b() {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_16_exclamation_mark_sign;
        int i2 = R$attr.uikit_colorRed;
        return new ComplexImage.Regular(LayeredImage.Companion.a(companion, i, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f), 8.0f, Float.valueOf(24.0f), 32));
    }

    public final List a(i iVar) {
        List list;
        return (iVar == null || (list = (List) iii.c.f(t1.w(iVar.f178534a, iVar.f178535b, iVar.f178536c, iVar.d, iVar.f), new jt2.d(3), new jme.f(24), new joa.j(this, iVar, 5))) == null) ? f0.f322471a : list;
    }
}
