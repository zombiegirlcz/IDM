package qlm;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SoftReference f247725a;

    public final synchronized Object a(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj2 = this.f247725a.get();
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = factory.invoke();
        this.f247725a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
