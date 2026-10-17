package kg;

import com.google.gson.JsonIOException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public final Object a(u uVar) {
        try {
            return c(new mg.q(uVar));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final k0 b() {
        return !(this instanceof k0) ? new k0(this) : (k0) this;
    }

    public abstract Object c(qg.a aVar);

    public abstract void d(qg.c cVar, Object obj2);
}
