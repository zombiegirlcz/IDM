package b2l;

import a2l.f;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        f instance = (f) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.f898b);
        targetCollection.add(instance.f899c);
        Iterable iterable = instance.f902j;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        a0.x(iterable, targetCollection);
    }
}
