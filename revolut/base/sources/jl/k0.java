package jl;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KSerializer[] f175548c = {null, new qlm.e(d0.f175528a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f175549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f175550b;

    public k0(int i, j0 j0Var, List list) {
        this.f175549a = (i & 1) == 0 ? null : j0Var;
        if ((i & 2) == 0) {
            this.f175550b = zhm.f0.f322471a;
        } else {
            this.f175550b = list;
        }
    }
}
