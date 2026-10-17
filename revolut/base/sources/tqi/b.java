package tqi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f273599b;

    public b(String fileName, byte[] file) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f273598a = fileName;
        this.f273599b = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!b.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.retail.common.ui.navigation.share.FileToShare");
        return Intrinsics.f(this.f273598a, ((b) obj2).f273598a);
    }

    public final int hashCode() {
        return this.f273598a.hashCode();
    }
}
