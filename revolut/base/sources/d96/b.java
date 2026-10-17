package d96;

import kotlin.jvm.internal.Intrinsics;
import yqi.c;
import yqi.d;
import yqi.f;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {
    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d validate(String validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        int length = validationData.length();
        if (3 > length || length >= 257) {
            return new d(validationData, u.c(a.f112343a));
        }
        d.Companion.getClass();
        return c.a(validationData);
    }
}
