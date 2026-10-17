package qlm;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u extends t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(KSerializer element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // qlm.a
    public final Iterator c(Object obj2) {
        Collection collection = (Collection) obj2;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        Collection collection = (Collection) obj2;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
