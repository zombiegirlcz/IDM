package mg;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements kg.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeToken f205079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg.z f205081c;
    public final kg.t d;

    public h0(Object obj2, TypeToken typeToken, boolean z) {
        kg.z zVar = obj2 instanceof kg.z ? (kg.z) obj2 : null;
        this.f205081c = zVar;
        kg.t tVar = obj2 instanceof kg.t ? (kg.t) obj2 : null;
        this.d = tVar;
        com.google.gson.internal.j.c((zVar == null && tVar == null) ? false : true);
        this.f205079a = typeToken;
        this.f205080b = z;
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        TypeToken typeToken2 = this.f205079a;
        if (typeToken2 == null) {
            typeToken.getRawType();
            throw null;
        }
        if (!typeToken2.equals(typeToken) && (!this.f205080b || typeToken2.getType() != typeToken.getRawType())) {
            return null;
        }
        return new i0(this.f205081c, this.d, oVar, typeToken, this, true);
    }
}
