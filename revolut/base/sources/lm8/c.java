package lm8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196905a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f196905a = str;
        } else {
            j1.f(a.f196904a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f196905a, ((c) obj2).f196905a);
    }

    public final int hashCode() {
        return this.f196905a.hashCode();
    }

    public c(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f196905a = state;
    }
}
