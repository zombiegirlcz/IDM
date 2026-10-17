package qlm;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class s extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        x0 x0Var = new x0();
        x0Var.f247725a = new SoftReference(null);
        return x0Var;
    }
}
