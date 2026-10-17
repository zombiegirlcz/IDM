package zmg;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import do3.h;
import do3.n;
import do3.p;
import do3.s;
import do3.u;
import do3.v;
import efm.k;
import efm.r;
import hng.q;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import mfm.f;
import nkm.y;
import od0.i;
import org.joda.time.LocalDate;
import rfm.j;
import skm.p0;
import te0.w;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gng.a f323510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hng.b f323511b;

    public d(gng.a userRepository, hng.b selectedRegisteredIdentityIdRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdRepository, "selectedRegisteredIdentityIdRepository");
        this.f323510a = userRepository;
        this.f323511b = selectedRegisteredIdentityIdRepository;
    }

    public static n a(n nVar, i iVar) {
        List list;
        if (!Intrinsics.f(nVar.f116408a, iVar.f224257a)) {
            do3.e eVar = null;
            Object obj2 = null;
            eVar = null;
            if (((String) iVar.f224257a) != null && (list = nVar.v) != null) {
                nkm.i iVar2 = new nkm.i(y.s(d0.Q(list), new zmb.c(3)));
                while (true) {
                    if (!iVar2.hasNext()) {
                        break;
                    }
                    Object next = iVar2.next();
                    if (Intrinsics.f(((do3.e) next).f116395a, iVar.c())) {
                        obj2 = next;
                        break;
                    }
                }
                eVar = (do3.e) obj2;
            }
            if (eVar != null) {
                String id10 = eVar.f116395a;
                Address address = eVar.e;
                v vVar = eVar.f116398g;
                s state = eVar.d;
                p pVar = eVar.f;
                String str = eVar.f116399h;
                h salariedUser = eVar.i;
                u uVar = eVar.f116400j;
                String str2 = eVar.k;
                String str3 = nVar.f116409b;
                String str4 = nVar.f116410c;
                String str5 = nVar.d;
                String str6 = nVar.e;
                String str7 = nVar.f;
                String str8 = nVar.f116411g;
                boolean z = nVar.f116412h;
                String phone = nVar.i;
                LocalDate localDate = nVar.f116413j;
                String str9 = nVar.f116414l;
                Integer num = nVar.o;
                Boolean bool = nVar.f116417p;
                Long l2 = nVar.f116418q;
                Boolean bool2 = nVar.f116421t;
                do3.b appMode = nVar.u;
                List list2 = nVar.v;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(appMode, "appMode");
                Intrinsics.checkNotNullParameter(salariedUser, "salariedUser");
                return new n(id10, str3, str4, str5, str6, str7, str8, z, phone, localDate, address, str9, state, vVar, num, bool, l2, pVar, str, bool2, appMode, list2, salariedUser, uVar, str2);
            }
        }
        return nVar;
    }

    public static i b(Data data) {
        i iVar;
        if (data != null && (iVar = (i) data.getContent()) != null) {
            return iVar;
        }
        i.Companion.getClass();
        return i.f224256b;
    }

    public final k c() {
        q qVar = (q) this.f323510a;
        qVar.getClass();
        int i = 2;
        int i2 = 1;
        rfm.d dVar = new rfm.d(new af.d(qVar, i), i2);
        Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
        zfd.e eVarW = zi0.c.w(this.f323511b.a());
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        k kVarFirstElement = rd0.e.c(eVarW, oji.e.f225788b).firstElement();
        c cVar = new c(new zk1.p(this, 26), i);
        f.b(kVarFirstElement, "source2 is null");
        j jVar = new j(new efm.n[]{dVar, kVarFirstElement}, f.c(cVar), i2);
        Intrinsics.checkNotNullExpressionValue(jVar, "zip(...)");
        return jVar;
    }

    public final akg.n d(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = (q) this.f323510a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(rd0.e.b(qVar.f154117g.e(Unit.f186387a, loadingStrategy)), this.f323511b.a()), new zmb.c(this, 4));
    }

    public final r e() {
        r map = rd0.e.c(((q) this.f323510a).f154115b.C0("STORAGE_KEY_USER", q.k), g.f186406a).map(new ag.j(new an0.e(23), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarA = this.f323511b.a();
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        r rVarCombineLatest = r.combineLatest(map, rd0.e.c(dVarA, oji.e.f225788b), new c(new zk1.p(this, 25), 1));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public final efm.d0 f() {
        q qVar = (q) this.f323510a;
        ufm.f fVar = new ufm.f(qVar.a(), new hje.e(new hng.j(qVar, 2), 19), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        ufm.n nVarI0 = w.i0(fVar);
        zfd.e eVarW = zi0.c.w(this.f323511b.a());
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        efm.d0 d0VarD = efm.d0.D(nVarI0, rd0.e.c(eVarW, oji.e.f225788b).firstOrError(), new c(new zk1.p(this, 24), 0));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
        return d0VarD;
    }
}
