package dqc;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116931a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f116931a = str;
        } else {
            j1.f(a.f116930a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f116931a, ((c) obj2).f116931a);
    }

    public final int hashCode() {
        return this.f116931a.hashCode();
    }

    public c(String pan) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        this.f116931a = pan;
    }
}
