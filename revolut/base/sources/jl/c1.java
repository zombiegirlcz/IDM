package jl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175526a;

    public /* synthetic */ c1(int i, String str) {
        if (1 == (i & 1)) {
            this.f175526a = str;
        } else {
            qlm.j1.f(a1.f175522a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
