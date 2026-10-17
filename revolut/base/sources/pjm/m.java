package pjm;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class m implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f236903a = new m();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj2) {
        int i = LazyJavaStaticClassScope.o;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj2).getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        nkm.h hVarZ = y.z(d0.Q(supertypes), f.f);
        Intrinsics.checkNotNullParameter(hVarZ, "<this>");
        return new ge0.b(hVarZ, 2);
    }
}
