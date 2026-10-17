package kha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184083a;

    public d(String str) {
        this.f184083a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f184083a, ((d) obj2).f184083a);
    }

    public final int hashCode() {
        String str = this.f184083a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
