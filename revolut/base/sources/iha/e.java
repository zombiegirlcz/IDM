package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161319a;

    public e(String str) {
        this.f161319a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f161319a, ((e) obj2).f161319a);
    }

    public final int hashCode() {
        String str = this.f161319a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
