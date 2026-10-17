package v97;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        p97.a instance = (p97.a) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(((t97.d) instance.f234280a).b());
    }
}
