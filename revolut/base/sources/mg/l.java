package mg;

import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l implements kg.m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f205090c;
    public static final k d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.q f205091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f205092b = new ConcurrentHashMap();

    static {
        int i = 0;
        f205090c = new k(i);
        d = new k(i);
    }

    public l(r8.q qVar) {
        this.f205091a = qVar;
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        lg.a aVar = (lg.a) typeToken.getRawType().getAnnotation(lg.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f205091a, oVar, typeToken, aVar, true);
    }

    public final kg.l0 b(r8.q qVar, kg.o oVar, TypeToken typeToken, lg.a aVar, boolean z) {
        kg.l0 l0VarA;
        Object objConstruct = qVar.c(TypeToken.get(aVar.value()), true).construct();
        boolean zNullSafe = aVar.nullSafe();
        if (objConstruct instanceof kg.l0) {
            l0VarA = (kg.l0) objConstruct;
        } else if (objConstruct instanceof kg.m0) {
            kg.m0 m0Var = (kg.m0) objConstruct;
            if (z) {
                kg.m0 m0Var2 = (kg.m0) this.f205092b.putIfAbsent(typeToken.getRawType(), m0Var);
                if (m0Var2 != null) {
                    m0Var = m0Var2;
                }
            }
            l0VarA = m0Var.a(oVar, typeToken);
        } else {
            boolean z3 = objConstruct instanceof kg.z;
            if (!z3 && !(objConstruct instanceof kg.t)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            i0 i0Var = new i0(z3 ? (kg.z) objConstruct : null, objConstruct instanceof kg.t ? (kg.t) objConstruct : null, oVar, typeToken, z ? f205090c : d, zNullSafe);
            zNullSafe = false;
            l0VarA = i0Var;
        }
        return (l0VarA == null || !zNullSafe) ? l0VarA : l0VarA.b();
    }
}
