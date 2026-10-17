package nka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216787a;

    public /* synthetic */ n(int i, String str) {
        if (1 == (i & 1)) {
            this.f216787a = str;
        } else {
            j1.f(l.f216786a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f216787a, ((n) obj2).f216787a);
    }

    public final int hashCode() {
        return this.f216787a.hashCode();
    }

    public n(String asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f216787a = asset;
    }
}
