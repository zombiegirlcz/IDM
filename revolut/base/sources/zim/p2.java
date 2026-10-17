package zim;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f322682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f322683b;

    public p2(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f322682a = new WeakReference(classLoader);
        this.f322683b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof p2) && this.f322682a.get() == ((p2) obj2).f322682a.get();
    }

    public final int hashCode() {
        return this.f322683b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f322682a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
