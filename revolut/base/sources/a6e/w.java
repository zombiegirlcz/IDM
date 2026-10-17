package a6e;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements pfe.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1667a;

    public w(ImmutableMap subAccountsTransactionsFilterProviderMap) {
        Intrinsics.checkNotNullParameter(subAccountsTransactionsFilterProviderMap, "subAccountsTransactionsFilterProviderMap");
        this.f1667a = subAccountsTransactionsFilterProviderMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:35:0x00cd). Please report as a decompilation issue!!! */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6e.w.a(java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cb -> B:35:0x00ce). Please report as a decompilation issue!!! */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6e.w.b(java.util.Set, gim.c):java.lang.Object");
    }

    @Override // pfe.f
    public final boolean c(ProductAccountId account) {
        Intrinsics.checkNotNullParameter(account, "account");
        ProductAccountId.Payload payload = account.f89730b;
        ExtendedSubaccountType extendedSubaccountType = payload instanceof ExtendedSubaccountType ? (ExtendedSubaccountType) payload : null;
        if (extendedSubaccountType == null) {
            return false;
        }
        pfe.f fVar = (pfe.f) this.f1667a.get(extendedSubaccountType.f88915a);
        return Intrinsics.f(fVar != null ? Boolean.valueOf(fVar.c(account)) : null, Boolean.TRUE);
    }
}
