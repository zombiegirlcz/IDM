package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k3 extends e3 {

    @NotNull
    public static final j3 Companion = new j3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146780b;

    public /* synthetic */ k3(int i, String str) {
        if (1 == (i & 1)) {
            this.f146780b = str;
        } else {
            qlm.j1.f(i3.f146766a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k3) && Intrinsics.f(this.f146780b, ((k3) obj2).f146780b);
    }

    public final int hashCode() {
        return this.f146780b.hashCode();
    }

    public k3(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f146780b = faqKey;
    }
}
