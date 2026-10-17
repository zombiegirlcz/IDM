package xe0;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke0.a f304515b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String fileName, ke0.a mapper, we0.c migrator, qm.e encryptionProvider, ye0.b storageSizeChecker) {
        super(context, fileName, migrator, encryptionProvider, storageSizeChecker);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrator, "migrator");
        Intrinsics.checkNotNullParameter(encryptionProvider, "encryptionProvider");
        Intrinsics.checkNotNullParameter(storageSizeChecker, "storageSizeChecker");
        this.f304515b = mapper;
    }

    @Override // ue0.c
    public final void G(Object value, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        byte[] bArr = (byte[]) this.f304515b.c(value, type);
        ij.e eVarEdit = a().edit();
        Lock lock = eVarEdit.i;
        lock.lock();
        try {
            eVarEdit.f161658a.put(key, new yj.b(bArr, eVarEdit.f));
            lock.unlock();
            eVarEdit.commit();
        } catch (Throwable th10) {
            lock.unlock();
            throw th10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ue0.c
    public final Object T2(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        ?? r3 = (byte[]) a().i.k(null, key);
        if (r3 != 0) {
            return this.f304515b.b(r3, type);
        }
        return null;
    }
}
