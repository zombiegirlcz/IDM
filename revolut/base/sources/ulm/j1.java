package ulm;

import ch.qos.logback.core.CoreConstants;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes13.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f281095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f281097c;
    public final RequestBody d;
    public final uc0.b e;
    public n f;

    public j1(i1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        x0 x0Var = builder.f281089a;
        if (x0Var == null) {
            throw new IllegalStateException("url == null");
        }
        this.f281095a = x0Var;
        this.f281096b = builder.f281090b;
        s0 s0Var = builder.f281091c;
        s0Var.getClass();
        this.f281097c = ue8.c.e(s0Var);
        this.d = builder.d;
        this.e = builder.e;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f281097c.a(name);
    }

    public final i1 b() {
        Intrinsics.checkNotNullParameter(this, "request");
        i1 i1Var = new i1();
        i1Var.f281089a = this.f281095a;
        i1Var.f281090b = this.f281096b;
        i1Var.d = this.d;
        i1Var.e = this.e;
        u0 u0Var = this.f281097c;
        u0Var.getClass();
        i1Var.f281091c = ue8.c.m(u0Var);
        return i1Var;
    }

    public final Object c(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KClass type2 = nim.a.r(type);
        Intrinsics.checkNotNullParameter(type2, "type");
        return nim.a.o(type2).cast(this.e.h(type2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append("Request{method=");
        sb6.append(this.f281096b);
        sb6.append(", url=");
        sb6.append(this.f281095a);
        u0 u0Var = this.f281097c;
        if (u0Var.size() != 0) {
            sb6.append(", headers=[");
            int i = 0;
            for (Object obj2 : u0Var) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                Pair pair = (Pair) obj2;
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                if (i > 0) {
                    sb6.append(", ");
                }
                sb6.append(str);
                sb6.append(CoreConstants.COLON_CHAR);
                if (vlm.h.v(str)) {
                    str2 = "██";
                }
                sb6.append(str2);
                i = i2;
            }
            sb6.append(']');
        }
        vlm.a aVar = vlm.a.f290502a;
        uc0.b bVar = this.e;
        if (!Intrinsics.f(bVar, aVar)) {
            sb6.append(", tags=");
            sb6.append(bVar);
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }
}
