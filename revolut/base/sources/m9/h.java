package m9;

import com.fasterxml.jackson.databind.JavaType;
import d9.p;
import d9.z;
import java.io.Serializable;
import k9.l;
import p9.a0;
import p9.u;

/* JADX INFO: loaded from: classes16.dex */
public abstract class h implements u, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f203598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f203599b;

    static {
        z zVar = z.e;
        p pVar = p.f112313h;
    }

    public h(a aVar, long j2) {
        this.f203599b = aVar;
        this.f203598a = j2;
    }

    public static int c(Class cls) {
        int mask = 0;
        for (Object obj2 : (Enum[]) cls.getEnumConstants()) {
            e eVar = (e) obj2;
            if (eVar.a()) {
                mask |= eVar.getMask();
            }
        }
        return mask;
    }

    public final boolean b() {
        return l.CAN_OVERRIDE_ACCESS_MODIFIERS.c(this.f203598a);
    }

    public final JavaType d(Class cls) {
        return this.f203599b.f203590a.b(null, cls, w9.f.d);
    }

    public final k9.p e() {
        return l.USE_ANNOTATIONS.c(this.f203598a) ? this.f203599b.f203592c : a0.f234190a;
    }

    public abstract f f(Class cls);

    public abstract p h(Class cls);

    public final void i() {
        this.f203599b.getClass();
    }

    public h(i iVar, long j2) {
        this.f203599b = iVar.f203599b;
        this.f203598a = j2;
    }
}
