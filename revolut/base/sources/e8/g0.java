package e8;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes16.dex */
public final class g0 implements c8.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.firebase.perf.util.i f123455j = new com.google.firebase.perf.util.i(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8.f f123456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8.g f123457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8.g f123458c;
    public final int d;
    public final int e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f123459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c8.k f123460h;
    public final c8.o i;

    public g0(f8.f fVar, c8.g gVar, c8.g gVar2, int i, int i2, c8.o oVar, Class cls, c8.k kVar) {
        this.f123456a = fVar;
        this.f123457b = gVar;
        this.f123458c = gVar2;
        this.d = i;
        this.e = i2;
        this.i = oVar;
        this.f123459g = cls;
        this.f123460h = kVar;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof g0) {
            g0 g0Var = (g0) obj2;
            if (this.e == g0Var.e && this.d == g0Var.d && y8.l.b(this.i, g0Var.i) && this.f123459g.equals(g0Var.f123459g) && this.f123457b.equals(g0Var.f123457b) && this.f123458c.equals(g0Var.f123458c) && this.f123460h.equals(g0Var.f123460h)) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        int iHashCode = ((((this.f123458c.hashCode() + (this.f123457b.hashCode() * 31)) * 31) + this.d) * 31) + this.e;
        c8.o oVar = this.i;
        if (oVar != null) {
            iHashCode = (iHashCode * 31) + oVar.hashCode();
        }
        return this.f123460h.f22068a.hashCode() + ((this.f123459g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f123457b + ", signature=" + this.f123458c + ", width=" + this.d + ", height=" + this.e + ", decodedResourceClass=" + this.f123459g + ", transformation='" + this.i + "', options=" + this.f123460h + CoreConstants.CURLY_RIGHT;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Object objE;
        f8.f fVar = this.f123456a;
        synchronized (fVar) {
            f8.e eVar = fVar.f132674b;
            f8.h hVarO = (f8.h) ((ArrayDeque) eVar.f22248b).poll();
            if (hVarO == null) {
                hVarO = eVar.o();
            }
            f8.d dVar = (f8.d) hVarO;
            dVar.b(8, byte[].class);
            objE = fVar.e(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objE;
        ByteBuffer.wrap(bArr).putInt(this.d).putInt(this.e).array();
        this.f123458c.updateDiskCacheKey(messageDigest);
        this.f123457b.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        c8.o oVar = this.i;
        if (oVar != null) {
            oVar.updateDiskCacheKey(messageDigest);
        }
        this.f123460h.updateDiskCacheKey(messageDigest);
        com.google.firebase.perf.util.i iVar = f123455j;
        Class cls = this.f123459g;
        byte[] bytes = (byte[]) iVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(c8.g.f);
            iVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f123456a.g(bArr);
    }
}
