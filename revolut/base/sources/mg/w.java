package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class w extends kg.l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f205128b = new u(new w(kg.j0.LAZILY_PARSED_NUMBER), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.j0 f205129a;

    public w(kg.j0 j0Var) {
        this.f205129a = j0Var;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        qg.b bVarA = aVar.A();
        int i = v.f205127a[bVarA.ordinal()];
        if (i == 1) {
            aVar.w();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f205129a.a(aVar);
        }
        throw new JsonSyntaxException("Expecting number, got: " + bVarA + "; at path " + aVar.getPath());
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.r((Number) obj2);
    }
}
