package ijm;

import kotlin.jvm.internal.z;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d extends z {
    public static final d f = new d(KmProperty.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.z, wim.h
    public final void f(Object obj2, Object obj3) {
        ((KmProperty) obj2).setFlags$kotlin_metadata(((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.internal.z, wim.p
    public final Object get(Object obj2) {
        return Integer.valueOf(((KmProperty) obj2).getFlags$kotlin_metadata());
    }
}
