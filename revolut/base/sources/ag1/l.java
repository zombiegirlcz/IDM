package ag1;

import c7i.r;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Clause f4767b;

    public /* synthetic */ l(Clause clause, int i) {
        this.f4766a = i;
        this.f4767b = clause;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4766a) {
            case 0:
                return a.a((a) obj2, this.f4767b, null, 2);
            case 1:
                return buf.c.a((buf.c) obj2, null, null, null, null, this.f4767b, null, false, LDSFile.EF_DG15_TAG);
            case 2:
                return r.a((r) obj2, null, 0L, 0L, null, null, null, null, null, this.f4767b, 255);
            case 3:
                return ef5.b.a((ef5.b) obj2, null, null, null, null, null, this.f4767b, null, 95);
            case 4:
                return gf5.a.a((gf5.a) obj2, null, this.f4767b, null, 5);
            case 5:
                return gna.e.a((gna.e) obj2, null, this.f4767b, 1);
            case 6:
                return lnk.e.a((lnk.e) obj2, null, false, new Data(this.f4767b, null, false, 6, null), 15);
            case 7:
                return n1j.m.e((n1j.m) obj2, null, null, null, this.f4767b, null, null, null, null, null, 503);
            case 8:
                return n23.g.a((n23.g) obj2, null, this.f4767b, 1);
            case 9:
                return DeFiAccountsExtensionState.a((DeFiAccountsExtensionState) obj2, null, null, null, null, null, this.f4767b, 31);
            default:
                return z66.b.a((z66.b) obj2, this.f4767b, null, null, null, null, false, null, null, 254);
        }
    }
}
