package mg;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + com.google.gson.internal.j.f("java-lang-class-unsupported"));
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj2).getName() + ". Forgot to register a type adapter?\nSee " + com.google.gson.internal.j.f("java-lang-class-unsupported"));
    }
}
