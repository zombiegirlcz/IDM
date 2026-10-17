package o04;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.v;
import kg.w;
import kg.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements t {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // kg.t
    public final Object deserialize(u uVar, Type type, s sVar) {
        nx4.n nVar;
        if (uVar == null || (uVar instanceof v) || sVar == null) {
            return null;
        }
        if (uVar instanceof x) {
            String strF = uVar.f();
            Intrinsics.checkNotNullExpressionValue(strF, "getAsString(...)");
            return new b(strF);
        }
        if ((uVar instanceof w) && uVar.c().f183891a.containsKey("type") && (nVar = (nx4.n) ((a31.a) sVar).d(uVar, nx4.n.class)) != null) {
            return new o04.a(nVar);
        }
        return null;
    }
}
