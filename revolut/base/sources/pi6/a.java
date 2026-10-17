package pi6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236435a;

    public a(String str) {
        this.f236435a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f236435a, ((a) obj2).f236435a);
    }

    public final int hashCode() {
        String str = this.f236435a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
