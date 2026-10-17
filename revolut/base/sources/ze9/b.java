package ze9;

import jli.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import yqi.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements f {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        String validationData = (String) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Regex regex = g.f175847a;
        if (!(validationData != null ? ch.qos.logback.core.util.a.x(".*\\d+.*", validationData) : false)) {
            return new yqi.d(validationData, ye9.f.f312827a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
