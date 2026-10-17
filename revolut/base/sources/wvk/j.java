package wvk;

import cli.y;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wuh.q;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends oki.h implements dli.b {
    public final awk.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f300550p;

    public j(i mapper, awk.g keyStatsItemExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(keyStatsItemExtension, "keyStatsItemExtension");
        this.o = keyStatsItemExtension;
        this.f300550p = mra.d.b(this, new d(null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, (j2) ((awk.l) this.o).f10810n.f22677a, null, null, new q(this, (Continuation) null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public final void I2() {
        ?? r06;
        awk.h hVar = ((d) ((j2) this.f300550p.f22677a).getValue()).f300543a;
        if (hVar == null || (r06 = hVar.f10802a) == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : r06.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        if (setKeySet != null) {
            C2(new e(setKeySet));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300550p;
    }
}
