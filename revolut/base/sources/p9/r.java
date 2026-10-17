package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class[] f234238j = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f234239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f234240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9.h f234241c;
    public final k9.p d;
    public final a e;
    public Class[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f234242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f234243h;
    public final b0 i;

    public r(JavaType javaType) {
        this.f234239a = javaType;
    }

    public static r d(m9.h hVar, JavaType javaType, a aVar) {
        List list = Collections.EMPTY_LIST;
        return new r(hVar, javaType, aVar);
    }

    public final List a() {
        if (this.f234243h == null) {
            c0 c0Var = this.f234240b;
            if (!c0Var.f234198h) {
                c0Var.e();
            }
            this.f234243h = new ArrayList(c0Var.i.values());
        }
        return this.f234243h;
    }

    public final d9.p b() {
        d9.p pVarI;
        a aVar = this.e;
        k9.p pVar = this.d;
        if (pVar == null || (pVarI = pVar.i(aVar)) == null) {
            pVarI = null;
        }
        d9.p pVarH = this.f234241c.h(aVar.f234183c);
        return pVarH != null ? pVarI == null ? pVarH : pVarI.d(pVarH) : pVarI;
    }

    public final f c() {
        c0 c0Var = this.f234240b;
        if (c0Var != null) {
            if (!c0Var.f234198h) {
                c0Var.e();
            }
            LinkedList linkedList = c0Var.f234203p;
            if (linkedList != null) {
                if (linkedList.size() <= 1) {
                    return (f) c0Var.f234203p.get(0);
                }
                c0Var.f("Multiple 'as-value' properties defined (%s vs %s)", c0Var.f234203p.get(0), c0Var.f234203p.get(1));
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(m9.h hVar, JavaType javaType, a aVar) {
        this(javaType);
        List list = Collections.EMPTY_LIST;
        this.f234240b = null;
        this.f234241c = hVar;
        if (hVar == null) {
            this.d = null;
        } else {
            this.d = hVar.e();
        }
        this.e = aVar;
        this.f234243h = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(c0 c0Var) {
        JavaType javaType = c0Var.f234196c;
        a aVar = c0Var.d;
        this(javaType);
        this.f234240b = c0Var;
        k9.t tVar = c0Var.f234194a;
        this.f234241c = tVar;
        this.d = tVar.e();
        this.e = aVar;
        k9.p pVar = c0Var.f;
        b0 b0VarS = pVar.s(aVar);
        this.i = b0VarS != null ? pVar.t(aVar, b0VarS) : b0VarS;
    }
}
