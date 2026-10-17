package vvd;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292529b;

    public /* synthetic */ c(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(a.f292527a.getDescriptor(), i, 3);
            throw null;
        }
        this.f292528a = str;
        this.f292529b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f292528a, cVar.f292528a) && this.f292529b == cVar.f292529b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f292529b) + (this.f292528a.hashCode() * 31);
    }

    public c(String token, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f292528a = token;
        this.f292529b = z;
    }
}
