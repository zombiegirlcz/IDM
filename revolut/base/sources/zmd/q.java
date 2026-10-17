package zmd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f323477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9e.a f323478b;

    public q(a9e.a recurringPaymentItemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentItemMapper, "recurringPaymentItemMapper");
        this.f323477a = dateProvider;
        this.f323478b = recurringPaymentItemMapper;
    }

    public static RowDelegate.Model a(String str, int i, c cVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new RowDelegate.Model(str, null, textLocalisedClause, null, 0, null, null, null, 0, new tf(yy0.i.a(resourceImage)), true, null, false, null, null, null, null, null, null, cVar, null, 0, 0, 0, 0, 532673530);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f323461a, new zmb.c(2), new zk1.p(23), new y(this, 18));
    }
}
