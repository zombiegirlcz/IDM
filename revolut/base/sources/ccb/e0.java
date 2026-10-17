package ccb;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f22983a;

    public e0(u80.o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f22983a = amountFormatter;
    }

    public static Custom b(i iVar) {
        int i = d0.f22980a[iVar.f22994h.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = iVar.f22995j;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((yqi.b) it8.next()) instanceof srf.a) {
                return new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[EDGE_INSN: B:134:0x005c->B:22:0x005c BREAK  A[LOOP:2: B:15:0x0045->B:135:?]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r17v2 */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r32) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ccb.e0.a(jki.i):jki.m");
    }
}
