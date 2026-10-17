package hs7;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155006a;

    public /* synthetic */ e(int i, String str) {
        if (1 == (i & 1)) {
            this.f155006a = str;
        } else {
            j1.f(c.f155005a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f155006a, ((e) obj2).f155006a);
    }

    public final int hashCode() {
        return this.f155006a.hashCode();
    }

    public e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f155006a = text;
    }
}
