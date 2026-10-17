package he0;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.l0;
import kg.u;
import kg.w;
import kg.x;
import mg.s;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f151507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f151508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f151509c;
    public final /* synthetic */ m d;

    public l(m mVar, String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f151507a = str;
        this.f151508b = linkedHashMap;
        this.f151509c = linkedHashMap2;
        this.d = mVar;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        u uVarQ = m70.a.q(aVar);
        m mVar = this.d;
        Class cls = mVar.f151510a;
        String str = mVar.f151511b;
        u uVarI = mVar.f ? uVarQ.c().i(str) : (u) uVarQ.c().f183891a.remove(str);
        String strF = uVarI != null ? uVarI.f() : this.f151507a;
        LinkedHashMap linkedHashMap = this.f151508b;
        if (strF != null && linkedHashMap.containsKey(strF)) {
            return ((l0) linkedHashMap.get(strF)).a(uVarQ);
        }
        if (linkedHashMap.containsKey("FALLBACK_SUBTYPE_LABEL")) {
            return ((l0) linkedHashMap.get("FALLBACK_SUBTYPE_LABEL")).a(uVarQ);
        }
        if (strF == null) {
            throw new JsonParseException("cannot deserialize " + cls + " because it does not define a field named " + str + " and no fallback specified");
        }
        if (mVar.e) {
            return null;
        }
        throw new JsonParseException("cannot deserialize " + cls + " subtype named " + strF + "; did you forget to register a subtype or fallback?");
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        m mVar = this.d;
        String str = mVar.f151511b;
        if (obj2 == null) {
            cVar.m();
            return;
        }
        Class<?> cls = obj2.getClass();
        String str2 = (String) mVar.d.get(cls);
        l0 l0Var = (l0) this.f151509c.get(cls);
        if (l0Var == null) {
            throw new JsonParseException(j6.a.o(cls, new StringBuilder("cannot serialize "), "; did you forget to register a subtype?"));
        }
        try {
            s sVar = new s();
            l0Var.d(sVar, obj2);
            w wVarC = sVar.y().c();
            LinkedTreeMap linkedTreeMap = wVarC.f183891a;
            if (mVar.f) {
                m70.a.w(wVarC, cVar);
                return;
            }
            w wVar = new w();
            if (linkedTreeMap.containsKey(str)) {
                throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + str);
            }
            wVar.g(str, new x(str2));
            for (Map.Entry entry : linkedTreeMap.entrySet()) {
                wVar.g((String) entry.getKey(), (u) entry.getValue());
            }
            m70.a.w(wVar, cVar);
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
