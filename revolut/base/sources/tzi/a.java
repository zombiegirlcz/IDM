package tzi;

import isj.c;
import kotlin.jvm.internal.Intrinsics;
import sfm.b;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    static b a(a aVar, String str) {
        c cVar = (c) aVar;
        b bVar = new b(cVar.b(str), new ir9.a(new isj.b(cVar, 0), 18), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }
}
