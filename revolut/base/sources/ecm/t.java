package ecm;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f124875a;

    static {
        u l2Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            l2Var = (u) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(u.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            l2Var = new l2();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        f124875a = l2Var;
        Throwable th10 = (Throwable) atomicReference.get();
        if (th10 != null) {
            v.f124880a.log(Level.FINE, "Storage override doesn't exist. Using default", th10);
        }
    }
}
