package jjm;

import kotlin.jvm.internal.z;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b extends z {
    public static final b f = new b(KmConstructor.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.z, wim.h
    public final void f(Object obj2, Object obj3) {
        ((KmConstructor) obj2).setFlags$kotlin_metadata(((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.internal.z, wim.p
    public final Object get(Object obj2) {
        return Integer.valueOf(((KmConstructor) obj2).getFlags$kotlin_metadata());
    }
}
