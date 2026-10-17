package cjm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24724a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ModuleDescriptor module = (ModuleDescriptor) obj2;
        JvmBuiltInClassDescriptorFactory.Companion companion = JvmBuiltInClassDescriptorFactory.Companion;
        Intrinsics.checkNotNullParameter(module, "module");
        List<PackageFragmentDescriptor> fragments = module.getPackage(JvmBuiltInClassDescriptorFactory.e).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : fragments) {
            if (obj3 instanceof BuiltInsPackageFragment) {
                arrayList.add(obj3);
            }
        }
        return (BuiltInsPackageFragment) d0.b0(arrayList);
    }
}
