package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236973a;

    public /* synthetic */ k0(int i, String str) {
        if (1 == (i & 1)) {
            this.f236973a = str;
        } else {
            j1.f(i0.f236970a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f236973a, ((k0) obj2).f236973a);
    }

    public final int hashCode() {
        return this.f236973a.hashCode();
    }

    public k0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f236973a = text;
    }
}
