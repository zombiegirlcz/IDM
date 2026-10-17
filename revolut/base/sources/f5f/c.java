package f5f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import nii.z;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements t1h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f132307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f132308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f132309c;

    public c(l tradingConfigInteractor, f wealthAccountHeaderUiMapper, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f132307a = tradingConfigInteractor;
        this.f132308b = wealthAccountHeaderUiMapper;
        this.f132309c = tradingAccountsInteractor;
    }

    @Override // t1h.a
    public final z a() {
        return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // t1h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r24, com.revolut.feature.wealth.models.addmoney.TransferSubjectId r25, efl.h r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5f.c.b(dj0.d, com.revolut.feature.wealth.models.addmoney.TransferSubjectId, efl.h, gim.c):java.lang.Object");
    }
}
