package cjm;

import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f24733a = new g();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj2) {
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.i;
        return ((CallableMemberDescriptor) obj2).getOriginal().getOverriddenDescriptors();
    }
}
