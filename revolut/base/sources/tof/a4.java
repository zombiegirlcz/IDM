package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272626a;

    public a4(String str) {
        this.f272626a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a4) && Intrinsics.f(this.f272626a, ((a4) obj2).f272626a);
    }

    public final int hashCode() {
        String str = this.f272626a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
