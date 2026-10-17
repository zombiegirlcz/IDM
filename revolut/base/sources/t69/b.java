package t69;

import a79.n;
import boh.f;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f268269a = new b();

    private b() {
    }

    @Override // kg.t
    public final Object deserialize(u uVar, Type type, s context) {
        String strI;
        Intrinsics.checkNotNullParameter(context, "context");
        if (uVar == null || (strI = f.i("type", uVar)) == null) {
            throw new NullPointerException("type is required");
        }
        return new n(strI, uVar);
    }
}
