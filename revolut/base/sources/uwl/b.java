package uwl;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        s instance = (s) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.f234885h.f234859a);
    }
}
