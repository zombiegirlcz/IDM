package r38;

import com.revolut.core.model.account.AccountId;
import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    static r a(b bVar, AccountId.Joint accountId) {
        l lVar = (l) bVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return lVar.d(new e(accountId, loadingStrategy));
    }

    static r b(b bVar, AccountId.Joint accountId) {
        l lVar = (l) bVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return lVar.k.a(new e(accountId, loadingStrategy));
    }
}
