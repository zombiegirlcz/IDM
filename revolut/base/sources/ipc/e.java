package ipc;

import ael.y;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.retail.trading.core.domain.PocketInfo;
import efl.h;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t1h.j;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f167730a;

    public e(ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f167730a = portfolioInteractor;
    }

    @Override // t1h.j
    public final Object a(TransferSubjectId transferSubjectId, dj0.d dVar, PocketInfo pocketInfo, UUID uuid, h hVar, vah.d dVar2) {
        Object objA = nim.a.a(((y) this.f167730a).i(transferSubjectId.getF95657a(), dVar, uuid, hVar), dVar2);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
