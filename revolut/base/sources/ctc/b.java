package ctc;

import io3.d;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        d instance = (d) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.d);
    }
}
