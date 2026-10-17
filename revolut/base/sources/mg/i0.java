package mg;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.z f205082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg.t f205083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg.o f205084c;
    public final TypeToken d;
    public final kg.m0 e;
    public final a31.a f = new a31.a(this, 18);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f205085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile kg.l0 f205086h;

    public i0(kg.z zVar, kg.t tVar, kg.o oVar, TypeToken typeToken, kg.m0 m0Var, boolean z) {
        this.f205082a = zVar;
        this.f205083b = tVar;
        this.f205084c = oVar;
        this.d = typeToken;
        this.e = m0Var;
        this.f205085g = z;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        kg.t tVar = this.f205083b;
        if (tVar == null) {
            kg.l0 l0VarI = this.f205086h;
            if (l0VarI == null) {
                l0VarI = this.f205084c.i(this.e, this.d);
                this.f205086h = l0VarI;
            }
            return l0VarI.c(aVar);
        }
        kg.u uVarQ = m70.a.q(aVar);
        if (this.f205085g) {
            uVarQ.getClass();
            if (uVarQ instanceof kg.v) {
                return null;
            }
        }
        return tVar.deserialize(uVarQ, this.d.getType(), this.f);
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        kg.z zVar = this.f205082a;
        if (zVar == null) {
            kg.l0 l0VarI = this.f205086h;
            if (l0VarI == null) {
                l0VarI = this.f205084c.i(this.e, this.d);
                this.f205086h = l0VarI;
            }
            l0VarI.d(cVar, obj2);
            return;
        }
        if (this.f205085g && obj2 == null) {
            cVar.m();
        } else {
            m70.a.w(zVar.serialize(obj2, this.d.getType(), this.f), cVar);
        }
    }

    @Override // mg.g0
    public final kg.l0 e() {
        if (this.f205082a != null) {
            return this;
        }
        kg.l0 l0Var = this.f205086h;
        if (l0Var != null) {
            return l0Var;
        }
        kg.l0 l0VarI = this.f205084c.i(this.e, this.d);
        this.f205086h = l0VarI;
        return l0VarI;
    }
}
