package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import sim.c;

/* JADX INFO: loaded from: classes13.dex */
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererOptionsImpl f187557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj2, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj2);
        this.f187557b = descriptorRendererOptionsImpl;
    }

    @Override // sim.c
    public final void b(KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f187557b.isLocked()) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
