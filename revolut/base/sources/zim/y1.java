package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes14.dex */
public final class y1 implements wim.c, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f322727a;

    public y1(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f322727a = fqName;
    }

    @Override // zim.f0
    public final ClassifierDescriptor getDescriptor() {
        throw new IllegalStateException(("Cannot load descriptor of a type alias: " + this.f322727a).toString());
    }
}
