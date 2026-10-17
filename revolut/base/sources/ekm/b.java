package ekm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f127191b;

    public /* synthetic */ b(c cVar, int i) {
        this.f127190a = i;
        this.f127191b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f127190a) {
            case 0:
                return this.f127191b.b(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            default:
                c cVar = this.f127191b;
                return cVar.f.refineSupertypes(cVar.i);
        }
    }
}
