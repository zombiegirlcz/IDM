package gnl;

import akl.z;
import au.c0;
import bjl.p0;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends jki.g implements m {

    @NotNull
    public static final o Companion = new o();
    public final p0 A;
    public final iy8.b B;
    public final phm.a C;
    public final ArrayList D;
    public final h E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mp.p f145049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f145050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f145051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fkg.a f145052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jol.b f145053t;
    public final rqk.b u;
    public final eql.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gql.a f145054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final IdentifierInputScreenContract$InputData f145055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z80.b f145056y;
    public final col.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(jki.p r17, mp.p r18, akl.z r19, gnl.a r20, fkg.a r21, jol.b r22, rqk.b r23, eql.i r24, gql.a r25, com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData r26, z80.b r27, col.c r28, bjl.p0 r29, iy8.b r30, phm.a r31) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gnl.s.<init>(jki.p, mp.p, akl.z, gnl.a, fkg.a, jol.b, rqk.b, eql.i, gql.a, com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData, z80.b, col.c, bjl.p0, iy8.b, phm.a):void");
    }

    @Override // yji.l
    public final void I1() {
        if (this.f145055x.f106564b instanceof IdentifierInputScreenContract$Mode.GetIdentifier) {
            return;
        }
        boolean zA = this.f145054w.a();
        Continuation continuation = null;
        yji.l.a1(this, this.f145050q.e.c(Unit.f186387a, false), null, null, new c0(5, continuation, this, zA), 3);
        if (zA) {
            yji.l.a1(this, ((cki.a) this.v).c3(), null, null, new gii.b(this, continuation, 13), 3);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (!((h) t2()).f145031c && this.f145055x.f106564b.getF106569a()) {
            X1(((jol.c) this.f145053t).e("IdentifierInputScreen_GENERIC_ERROR_ID"));
            x2(new gn.a(5));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.E;
    }

    public final wi0.b y2() {
        ArrayList arrayList = this.D;
        return arrayList.size() == 1 ? (wi0.b) d0.b0(arrayList) : (wi0.b) v13.d.b(arrayList, this.f145051r.a());
    }

    public final int z2(wi0.b bVar) {
        fj0.a aVar = fj0.b.Companion;
        String strJ = this.f145056y.j(bVar);
        aVar.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        yhm.o.b(serializableB);
        return ((fj0.b) serializableB).f135518a;
    }
}
