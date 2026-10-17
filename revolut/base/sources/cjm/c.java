package cjm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleDescriptor f24725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24726b;

    public c(ModuleDescriptor moduleDescriptor, boolean z) {
        this.f24725a = moduleDescriptor;
        this.f24726b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KProperty[] kPropertyArr = JvmBuiltIns.f186504h;
        return new JvmBuiltIns.Settings(this.f24725a, this.f24726b);
    }
}
