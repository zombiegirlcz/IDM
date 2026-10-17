package xjm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements StdlibClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f306585a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public final ClassDescriptor findEnumEntriesClass(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
