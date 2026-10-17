package blf;

import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import elf.v1;
import java.math.BigDecimal;
import java.util.List;
import klf.h0;
import klf.z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f16620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f16621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f16622c;

    public e(h0 commonDataSource, z1 savingsDataSource, v1 savingsInterestBreakdownClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(savingsDataSource, "savingsDataSource");
        Intrinsics.checkNotNullParameter(savingsInterestBreakdownClickHandler, "savingsInterestBreakdownClickHandler");
        this.f16620a = commonDataSource;
        this.f16621b = savingsDataSource;
        this.f16622c = savingsInterestBreakdownClickHandler;
    }

    public static MoneyClause a(BigDecimal bigDecimal, xi0.b bVar) {
        return new MoneyClause(mif.a.P(new ej0.b(bigDecimal, bVar), 4, 2), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(4, 2), false, false, 13), null, null, 12);
    }

    public static ResourceImage b() {
        return new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }
}
