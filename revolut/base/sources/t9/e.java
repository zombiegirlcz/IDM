package t9;

import java.lang.reflect.Member;
import java.util.Collections;
import java.util.List;
import k9.t;
import p9.r;

/* JADX INFO: loaded from: classes16.dex */
public final class e {
    public static final c[] i = new c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f268923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f268924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f268925c = Collections.EMPTY_LIST;
    public c[] d;
    public prl.e e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p9.f f268926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public av0.b f268927h;

    public e(r rVar) {
        this.f268923a = rVar;
    }

    public final d a() {
        c[] cVarArr;
        if (this.f268926g != null) {
            if (k9.l.CAN_OVERRIDE_ACCESS_MODIFIERS.c(this.f268924b.f203598a)) {
                p9.f fVar = this.f268926g;
                boolean zC = k9.l.OVERRIDE_PUBLIC_ACCESS_MODIFIERS.c(this.f268924b.f203598a);
                Member memberP = fVar.p();
                if (memberP != null) {
                    x9.f.d(memberP, zC);
                }
            }
        }
        prl.e eVar = this.e;
        if (eVar != null) {
            t tVar = this.f268924b;
            p9.f fVar2 = (p9.f) eVar.f239326c;
            boolean zC2 = k9.l.OVERRIDE_PUBLIC_ACCESS_MODIFIERS.c(tVar.f203598a);
            Member memberP2 = fVar2.p();
            if (memberP2 != null) {
                x9.f.d(memberP2, zC2);
            }
        }
        List list = this.f268925c;
        if (list == null || list.isEmpty()) {
            if (this.e == null && this.f268927h == null) {
                return null;
            }
            cVarArr = i;
        } else {
            List list2 = this.f268925c;
            cVarArr = (c[]) list2.toArray(new c[list2.size()]);
            if (k9.l.CAN_OVERRIDE_ACCESS_MODIFIERS.c(this.f268924b.f203598a)) {
                for (c cVar : cVarArr) {
                    t tVar2 = this.f268924b;
                    p9.f fVar3 = cVar.f268915g;
                    boolean zC3 = k9.l.OVERRIDE_PUBLIC_ACCESS_MODIFIERS.c(tVar2.f203598a);
                    Member memberP3 = fVar3.p();
                    if (memberP3 != null) {
                        x9.f.d(memberP3, zC3);
                    }
                }
            }
        }
        c[] cVarArr2 = this.d;
        if (cVarArr2 == null || cVarArr2.length == this.f268925c.size()) {
            return new d(this.f268923a.f234239a, this, cVarArr, this.d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f268925c.size()), Integer.valueOf(this.d.length)));
    }
}
