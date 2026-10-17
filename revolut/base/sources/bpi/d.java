package bpi;

import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements od0.e {
    @Override // od0.e
    public final void clear() {
        ImmutableSet clearables = ImmutableSet.of((od0.e) ((gl0.a) gl0.d.Companion.c()).d.get());
        Intrinsics.checkNotNullParameter(clearables, "clearables");
        Iterator<E> it8 = clearables.iterator();
        while (it8.hasNext()) {
            ((od0.e) it8.next()).clear();
        }
    }
}
