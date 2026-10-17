package fjm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyPackageViewDescriptorImpl f135696b;

    public /* synthetic */ i(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, int i) {
        this.f135695a = i;
        this.f135696b = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f135695a;
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f135696b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = LazyPackageViewDescriptorImpl.f186617h;
                return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
            case 1:
                KProperty[] kPropertyArr2 = LazyPackageViewDescriptorImpl.f186617h;
                return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName()));
            default:
                KProperty[] kPropertyArr3 = LazyPackageViewDescriptorImpl.f186617h;
                if (lazyPackageViewDescriptorImpl.isEmpty()) {
                    return MemberScope.Empty.INSTANCE;
                }
                List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
                ArrayList arrayList = new ArrayList(w.t(fragments, 10));
                Iterator<T> it8 = fragments.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((PackageFragmentDescriptor) it8.next()).getMemberScope());
                }
                ArrayList arrayListF0 = d0.F0(new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()), arrayList);
                return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), arrayListF0);
        }
    }
}
