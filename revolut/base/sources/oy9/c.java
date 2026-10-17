package oy9;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import x5k.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        s instance = (s) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        String str = instance.e;
        if (str != null) {
            targetCollection.add(str);
        }
    }
}
