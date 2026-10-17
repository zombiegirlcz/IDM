package ya2;

import cli.n;
import cli.y;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements dli.b {
    public final ab2.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ba2.e f311916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f311917q;

    public m(f inputData, ab2.b aliasInputValidator, ba2.e payIdTransferExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasInputValidator, "aliasInputValidator");
        Intrinsics.checkNotNullParameter(payIdTransferExtension, "payIdTransferExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasInputValidator;
        this.f311916p = payIdTransferExtension;
        String str = inputData.f311910a;
        this.f311917q = mra.d.b(this, new e(str == null ? "" : str, 6), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f311917q;
        H2(yVar, new y8a.h(this.o.a(((e) ((j2) yVar.f22677a).getValue()).f311907a), 6));
    }

    public final void I2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            B2();
            return;
        }
        boolean z = event instanceof g;
        y yVar = this.f311917q;
        if (z) {
            ResolveAlias resolveAlias = ((e) ((j2) yVar.f22677a).getValue()).f311908b;
            if (resolveAlias == null) {
                return;
            }
            ba2.e.b3(this.f311916p, null, resolveAlias, new y8a.h(this, 7), 1);
            return;
        }
        if (!(event instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        H2(yVar, new y8a.h(event, 5));
        H2(yVar, new y8a.h(this.o.a(((e) ((j2) yVar.f22677a).getValue()).f311907a), 6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f311917q;
    }
}
