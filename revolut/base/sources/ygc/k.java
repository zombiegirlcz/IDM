package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313621b;

    public /* synthetic */ k(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(i.f313612a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313620a = str;
        this.f313621b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f313620a, kVar.f313620a) && Intrinsics.f(this.f313621b, kVar.f313621b);
    }

    public final int hashCode() {
        return this.f313621b.hashCode() + (this.f313620a.hashCode() * 31);
    }

    public k(String text, String color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f313620a = text;
        this.f313621b = color;
    }
}
