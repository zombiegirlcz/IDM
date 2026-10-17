package he0;

import com.google.gson.reflect.TypeToken;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.l0;
import kg.m0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f151510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f151512c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e;
    public final boolean f;

    public m(String str, Class cls, boolean z, boolean z3) {
        this.f151510a = cls;
        this.f151511b = str;
        this.e = z;
        this.f = z3;
    }

    public static m b(Class cls, String str) {
        return new m(str, cls, false, false);
    }

    @Override // kg.m0
    public final l0 a(kg.o oVar, TypeToken typeToken) {
        if (!this.f151510a.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : this.f151512c.entrySet()) {
            l0 l0VarI = oVar.i(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put((String) entry.getKey(), l0VarI);
            linkedHashMap2.put((Class) entry.getValue(), l0VarI);
        }
        l lVar = new l(this, (String) this.d.get(typeToken.getRawType()), linkedHashMap, linkedHashMap2);
        return this.e ? lVar : lVar.b();
    }

    public final void c(Class cls, String str) {
        if (str == null) {
            throw null;
        }
        LinkedHashMap linkedHashMap = this.d;
        if (!linkedHashMap.containsKey(cls)) {
            LinkedHashMap linkedHashMap2 = this.f151512c;
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, cls);
                linkedHashMap.put(cls, str);
                return;
            }
        }
        throw new IllegalArgumentException("types and labels must be unique");
    }
}
