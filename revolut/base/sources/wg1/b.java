package wg1;

import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import ufm.i;
import vf0.q;
import x9h.d;
import xf0.j;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg1.a f297217a;

    public b(xg1.a tapAndPayRepository) {
        Intrinsics.checkNotNullParameter(tapAndPayRepository, "tapAndPayRepository");
        this.f297217a = tapAndPayRepository;
    }

    public final i a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        xg1.a aVar = this.f297217a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        i iVarA = aVar.a();
        Task<String> stableHardwareId = aVar.f305480a.f195399a.getStableHardwareId();
        Intrinsics.checkNotNullExpressionValue(stableHardwareId, "getStableHardwareId(...)");
        i iVar = new i(w.H0(iVarA, e.t(stableHardwareId)), new d(26, new j(aVar, cardId, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final i b() {
        i iVarA = this.f297217a.a();
        a aVar = a.f;
        i iVar = new i(iVarA, new q(23), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
