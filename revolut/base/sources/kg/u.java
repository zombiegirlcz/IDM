package kg;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public byte a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final r b() {
        if (this instanceof r) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final w c() {
        if (this instanceof w) {
            return (w) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final x d() {
        if (this instanceof x) {
            return (x) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            qg.c cVar = new qg.c(stringWriter);
            cVar.p(e0.LENIENT);
            m70.a.w(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
