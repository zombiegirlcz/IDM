package ba2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import kotlin.jvm.functions.Function1;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e extends n {
    public static /* synthetic */ void b3(e eVar, f fVar, ResolveAlias resolveAlias, Function1 function1, int i) {
        if ((i & 1) != 0) {
            fVar = f.DEFAULT;
        }
        if ((i & 4) != 0) {
            function1 = new b96.a(7);
        }
        eVar.Z2(fVar, resolveAlias, function1);
    }

    public abstract void Z2(f fVar, ResolveAlias resolveAlias, Function1 function1);
}
