package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236960a;

    public /* synthetic */ d0(int i, String str) {
        if (1 == (i & 1)) {
            this.f236960a = str;
        } else {
            j1.f(b0.f236957a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f236960a, ((d0) obj2).f236960a);
    }

    public final int hashCode() {
        return this.f236960a.hashCode();
    }

    public d0(String theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f236960a = theme;
    }
}
