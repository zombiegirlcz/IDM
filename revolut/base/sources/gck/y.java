package gck;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qek.a f142528a;

    public y(ick.a clickableClauseMapper, ick.d planGiftingReceiverIntroButtonsMapper, ick.f planGiftingReceiverIntroDescriptionMapper, qek.a planGiftingErrorMapper) {
        Intrinsics.checkNotNullParameter(clickableClauseMapper, "clickableClauseMapper");
        Intrinsics.checkNotNullParameter(planGiftingReceiverIntroButtonsMapper, "planGiftingReceiverIntroButtonsMapper");
        Intrinsics.checkNotNullParameter(planGiftingReceiverIntroDescriptionMapper, "planGiftingReceiverIntroDescriptionMapper");
        Intrinsics.checkNotNullParameter(planGiftingErrorMapper, "planGiftingErrorMapper");
        this.f142528a = planGiftingErrorMapper;
    }

    public static FullScreenStateDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, String str) {
        return new FullScreenStateDelegate.Model(str, textLocalisedClause, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(i, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2020);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f142501a;
        Data data2 = domainState.f142503c;
        Data data3 = domainState.f142502b;
        return new t(((Boolean) iii.c.f(t1.u(domainState.f142501a, data2, data3), new gaf.l(21), new gcc.c(3), new fq7.k(22))).booleanValue(), (List) iii.c.f(t1.u(data, data2, data3), new gaf.l(this, 20), new g75.i(this, 17), new fq7.k(this, 21)));
    }
}
