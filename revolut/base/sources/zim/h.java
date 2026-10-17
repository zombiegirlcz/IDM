package zim;

import java.lang.reflect.Method;
import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322638a;

    public /* synthetic */ h(int i) {
        this.f322638a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f322638a) {
            case 0:
                return cim.b.b(((Method) obj2).getName(), ((Method) obj3).getName());
            case 1:
                return cim.b.b(((d1) ((wim.m) obj2)).getName(), ((d1) ((wim.m) obj3)).getName());
            default:
                g0 g0Var = l0.Companion;
                Integer numCompare = DescriptorVisibilities.compare((DescriptorVisibility) obj2, (DescriptorVisibility) obj3);
                if (numCompare != null) {
                    return numCompare.intValue();
                }
                return 0;
        }
    }
}
