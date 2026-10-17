package z97;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import sf8.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        m instance = (m) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.f262362c);
    }
}
