package n8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h1 implements cli.n {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f213431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f213432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f213433c;
    public final l80.e d;
    public final ldd.b e;
    public final s8i.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f213434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i1 f213435h;

    public h1(MoveMoneyInputData inputData, w80.b amountFormatter, e0 topupItemsMapper, u80.o moneyPrefixFormatter, l80.e dateProvider, ldd.b focusRequesterDelegate, s8i.b moveMoneyTopupTransferExpensesHintMapper, c buttonTextMapper, i1 toolbarStateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(topupItemsMapper, "topupItemsMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(moveMoneyTopupTransferExpensesHintMapper, "moveMoneyTopupTransferExpensesHintMapper");
        Intrinsics.checkNotNullParameter(buttonTextMapper, "buttonTextMapper");
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        this.f213431a = inputData;
        this.f213432b = amountFormatter;
        this.f213433c = topupItemsMapper;
        this.d = dateProvider;
        this.e = focusRequesterDelegate;
        this.f = moveMoneyTopupTransferExpensesHintMapper;
        this.f213434g = buttonTextMapper;
        this.f213435h = toolbarStateMapper;
    }

    public static bw0.m a(yqi.b bVar) {
        if (bVar != null) {
            return new bw0.m(bVar.a(), bw0.l.ERROR, ((bVar instanceof j6i.d) || (bVar instanceof j6i.e) || (bVar instanceof j6i.l)) ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, true, new q6i.q(bVar));
        }
        return null;
    }

    public final l0 b(o oVar) {
        int i;
        if (!oVar.a() || this.f213431a.f104835c.contains(MoveMoneyInputData.ExtraConfiguration.HideOptionsButton.f104837a)) {
            return k0.f213442a;
        }
        int i2 = g1.f213427b[oVar.b().ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_calendar;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_calendar_recurring;
        }
        return new j0(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), oVar.c());
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n0) iii.c.f(domainState.f213461a, new n45.b(this, domainState, 22), new kp0.m(this, domainState, 13), new m88.c(this, domainState, 24));
    }
}
