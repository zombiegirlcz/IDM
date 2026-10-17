package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s2 extends p2 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146829b;

    public /* synthetic */ s2(int i, String str) {
        if (1 == (i & 1)) {
            this.f146829b = str;
        } else {
            qlm.j1.f(q2.f146812a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s2) && Intrinsics.f(this.f146829b, ((s2) obj2).f146829b);
    }

    public final int hashCode() {
        return this.f146829b.hashCode();
    }

    public s2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146829b = url2;
    }
}
