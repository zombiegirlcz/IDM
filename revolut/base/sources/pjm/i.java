package pjm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Name f236894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaClass f236895b;

    public i(Name name, JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f236894a = name;
        this.f236895b = javaClass;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof i) {
            return Intrinsics.f(this.f236894a, ((i) obj2).f236894a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f236894a.hashCode();
    }
}
