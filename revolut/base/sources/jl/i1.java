package jl;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class i1 {

    @NotNull
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KSerializer[] f175542c = {null, new qlm.h0(v1.f247718a, f1.f175534a, 1)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f175544b;

    public /* synthetic */ i1(Map map, String str, int i) {
        if (3 != (i & 3)) {
            qlm.j1.f(d1.f175529a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175543a = str;
        this.f175544b = map;
    }
}
