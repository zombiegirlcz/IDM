package akm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6126a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj2) {
        int i = DescriptorUtilsKt.f187593a;
        Collection<ValueParameterDescriptor> overriddenDescriptors = ((ValueParameterDescriptor) obj2).getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(w.t(overriddenDescriptors, 10));
        Iterator<T> it8 = overriddenDescriptors.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it8.next()).getOriginal());
        }
        return arrayList;
    }
}
