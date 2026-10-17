package yqi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    default d a(f[] validators, Object obj2) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        ArrayList arrayList = new ArrayList();
        for (f fVar : validators) {
            a0.x(fVar.validate(obj2).f316033b, arrayList);
        }
        return new d(obj2, arrayList);
    }
}
