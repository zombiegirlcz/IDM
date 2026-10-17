package mq4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollateralMoveMoneyScreenContract$InputData f207868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oq4.f f207869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oq4.b f207870c;

    public o(CollateralMoveMoneyScreenContract$InputData inputData, oq4.f amountMapper, oq4.b actionFooterMapper, oq4.h headerMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountMapper, "amountMapper");
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f207868a = inputData;
        this.f207869b = amountMapper;
        this.f207870c = actionFooterMapper;
    }

    public final ResourceImage a() {
        int i = n.f207867a[this.f207868a.f69168c.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2 || i == 3) {
            return new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f207858b, new mk5.s(this, domainState, 24), new kp0.m(this, domainState, 11), new m88.c(this, domainState, 11));
    }
}
