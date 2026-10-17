package gqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import whf.j;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final end.d f145691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f145692b;

    public r(end.d destinationUIMapper, whf.n transactionsListItemMapper) {
        Intrinsics.checkNotNullParameter(destinationUIMapper, "destinationUIMapper");
        Intrinsics.checkNotNullParameter(transactionsListItemMapper, "transactionsListItemMapper");
        this.f145691a = destinationUIMapper;
        this.f145692b = transactionsListItemMapper;
    }

    public final qv0.i a(b destination, whf.p transactionsContent) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        return (qv0.i) d0.d0(((anf.w) this.f145692b).c(whf.p.a(zhm.u.c(destination.f145677c), transactionsContent), new whf.l(0), j.a.f297643a));
    }

    public final RowDelegate.Model b(a destination, boolean z) {
        RowDelegate.Model.c.b bVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        IncomeSorterDestinationInfo incomeSorterDestinationInfo = destination.f145674c;
        end.d dVar = this.f145691a;
        Image imageB = dVar.b(incomeSorterDestinationInfo);
        Clause clauseA = dmd.e.a(dVar, incomeSorterDestinationInfo, dmd.d.ACCOUNT_WITH_CURRENCY, 4);
        String string = incomeSorterDestinationInfo.getId().toString();
        boolean z3 = destination.f145672a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageB, !z3 ? new DangerCircleBadge(dw0.a.Error) : null, null, false, null, false, 60);
        if (z) {
            bVar = new RowDelegate.Model.c.b(otd.f.c(1, !z3 ? new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION) : null, null, destination.f145673b.l()), null, null, false, 126);
        } else {
            bVar = null;
        }
        return new RowDelegate.Model(string, image40, clauseA, null, 0, null, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }
}
