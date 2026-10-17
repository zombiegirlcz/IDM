package kg;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class w extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedTreeMap f183891a = new LinkedTreeMap(false);

    public final boolean equals(Object obj2) {
        if (obj2 != this) {
            return (obj2 instanceof w) && ((w) obj2).f183891a.equals(this.f183891a);
        }
        return true;
    }

    public final void g(String str, u uVar) {
        if (uVar == null) {
            uVar = v.f183890a;
        }
        this.f183891a.put(str, uVar);
    }

    public final void h(String str, String str2) {
        g(str, str2 == null ? v.f183890a : new x(str2));
    }

    public final int hashCode() {
        return this.f183891a.hashCode();
    }

    public final u i(String str) {
        return (u) this.f183891a.get(str);
    }
}
