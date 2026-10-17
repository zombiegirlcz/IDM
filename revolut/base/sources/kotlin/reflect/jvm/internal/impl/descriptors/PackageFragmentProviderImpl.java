package kotlin.reflect.jvm.internal.impl.descriptors;

import djm.c;
import djm.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f186536a;

    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f186536a = packageFragments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj2 : this.f186536a) {
            if (Intrinsics.f(((PackageFragmentDescriptor) obj2).getFqName(), fqName)) {
                packageFragments.add(obj2);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    @d
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f186536a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (Intrinsics.f(((PackageFragmentDescriptor) obj2).getFqName(), fqName)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return y.J(y.n(y.x(d0.Q(this.f186536a), c.f115407c), new g(fqName, 0)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f186536a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((PackageFragmentDescriptor) it8.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }
}
