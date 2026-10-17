package qd5;

import android.os.Looper;
import e4m.e;
import ede.f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jdi.v;
import kotlin.jvm.internal.Intrinsics;
import nhi.i;
import s6e.d;
import sg8.j;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f244867b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f244866a = i;
        this.f244867b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f244866a;
        int i2 = 12;
        int i3 = 13;
        Object obj2 = this.f244867b;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                return new ayb.b(cVar.f244868a, cVar.f244869b, cVar.f244870c, cVar.d, 5);
            case 1:
                qfc.a aVar = (qfc.a) obj2;
                return new dm5.a(aVar.f245286a, aVar.f245287b, aVar.f245288c, aVar.d, aVar.e, 14);
            case 2:
                qj1.a aVar2 = (qj1.a) obj2;
                return new dm5.a(aVar2.f246759a, aVar2.f246760b, aVar2.f246761c, aVar2.d, aVar2.e, 15);
            case 3:
                qkd.a aVar3 = (qkd.a) obj2;
                return new f(aVar3.f246980a, aVar3.f246981b, aVar3.f246982c, aVar3.d, aVar3.e, aVar3.f, aVar3.f246983g, aVar3.f246984h, aVar3.i, aVar3.f246985j, aVar3.k, 2);
            case 4:
                qwh.a aVar4 = (qwh.a) obj2;
                return new fh7.c(aVar4.f249946a, aVar4.f249947b, aVar4.f249948c, aVar4.d, 10);
            case 5:
                qy8.e eVar = (qy8.e) obj2;
                return new ayb.b(eVar.f250261a, eVar.f250263c, eVar.d, eVar.f250262b);
            case 6:
                qz4.c cVar2 = (qz4.c) obj2;
                return new dwh.a(cVar2.f250359a, cVar2.f250360b, cVar2.f250361c, cVar2.d, cVar2.e, cVar2.f, cVar2.f250362g, cVar2.f250363h, cVar2.i, cVar2.f250364j, 3);
            case 7:
                r29.e eVar2 = (r29.e) obj2;
                return new ayb.b(eVar2.f251083a, eVar2.f251084b, eVar2.f251085c, eVar2.d, 6);
            case 8:
                r2l.a aVar5 = (r2l.a) obj2;
                return new c06.a(aVar5.f251135a, aVar5.f251136b, 11);
            case 9:
                r53.a aVar6 = (r53.a) obj2;
                return new c06.a(aVar6.f251526a, aVar6.f251527b, i2);
            case 10:
                return new d(((r6e.b) obj2).f251695a.c());
            case 11:
                r7l.a aVar7 = (r7l.a) obj2;
                return new bwj.b(aVar7.f252275a, aVar7.f252276b, aVar7.f252277c, 9);
            case 12:
                re8.a aVar8 = (re8.a) obj2;
                return new c6e.b(aVar8.f253541a, aVar8.f253542b, aVar8.f253543c, aVar8.d, aVar8.e, aVar8.f, aVar8.f253544g, aVar8.f253545h, aVar8.i, aVar8.f253546j, aVar8.k, 2);
            case 13:
                ri0.b bVar = (ri0.b) obj2;
                return new cxj.c(bVar.f254532a, bVar.f254533b, 8);
            case 14:
                rke.a aVar9 = (rke.a) obj2;
                return new c06.a(aVar9.f254834a, aVar9.f254835b, i3);
            case 15:
                rke.b bVar2 = (rke.b) obj2;
                return j.c(bVar2.f254837a, bVar2.f254839b, bVar2.f254840c, bVar2.d, bVar2.e, bVar2.f, bVar2.f254841g, bVar2.f254842h, bVar2.i, bVar2.f254843j, bVar2.k, bVar2.f254844l, bVar2.f254845m, bVar2.f254846n, bVar2.o, bVar2.f254847p, bVar2.f254848q, bVar2.f254849r, bVar2.f254850s, bVar2.f254851t, bVar2.u, bVar2.v, bVar2.f254852w, bVar2.f254853x, bVar2.f254854y, bVar2.z, bVar2.A, bVar2.B, bVar2.C, bVar2.D, bVar2.E, bVar2.F, bVar2.G, bVar2.H, bVar2.I, bVar2.J, bVar2.K, bVar2.L, bVar2.M, bVar2.N, bVar2.O, bVar2.P, bVar2.Q, bVar2.R, bVar2.S, bVar2.T, bVar2.U, bVar2.V, bVar2.W, bVar2.X, bVar2.Y, bVar2.Z);
            case 16:
                rr8.a aVar10 = (rr8.a) obj2;
                return new bfc.c(aVar10.f256735a, aVar10.f256736b, aVar10.f256737c, aVar10.d, aVar10.e, aVar10.f, aVar10.f256738g, aVar10.f256739h, aVar10.i, 9);
            case 17:
                rse.a aVar11 = (rse.a) obj2;
                return new es8.b(aVar11.f257071a, aVar11.f257072b, aVar11.f257073c, aVar11.d, aVar11.e, aVar11.f, 4);
            case 18:
                rxa.b bVar3 = (rxa.b) obj2;
                return new f(bVar3.f258103a, bVar3.f258104b, bVar3.f258105c, bVar3.d, bVar3.e, bVar3.f, bVar3.f258106g, bVar3.f258107h, bVar3.i, bVar3.f258108j, bVar3.k, 3);
            case 19:
                s0b.b bVar4 = (s0b.b) obj2;
                return new h5c.b(bVar4.f258923a, bVar4.f258924b, bVar4.f258925c, bVar4.d, bVar4.e, bVar4.f, 8);
            case 20:
                s99.d dVar = (s99.d) obj2;
                return new v(dVar.f261137a, dVar.f261138b, dVar.f261139c, dVar.d, dVar.e, dVar.f, dVar.f261140g, dVar.f261141h, 2);
            case 21:
                sa3.a aVar12 = (sa3.a) obj2;
                return new euh.j(aVar12.f261287a, aVar12.f261288b, aVar12.f261289c, aVar12.d, aVar12.e, aVar12.f, aVar12.f261290g, 6);
            case 22:
                yhi.a featureGatewaysWrapper = ((shi.a) obj2).f263485a;
                shi.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(featureGatewaysWrapper, "featureGatewaysWrapper");
                nhi.j.Companion.getClass();
                nhi.b bVarA = i.a();
                if (!Looper.getMainLooper().isCurrentThread()) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("featuresRegistry.registerFeatures on ", Thread.currentThread().getName()));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BUGS-391372", null, illegalStateException, h0Var);
                }
                List features = featureGatewaysWrapper.a();
                Intrinsics.checkNotNullParameter(features, "features");
                bVarA.f215497a.addAll(features);
                return bVarA;
            case 23:
                si3.a aVar13 = (si3.a) obj2;
                return new bwj.b(aVar13.f263509a, aVar13.f263510b, aVar13.f263511c, i2);
            case 24:
                sn3.a aVar14 = (sn3.a) obj2;
                return new bwj.b(aVar14.f264480a, aVar14.f264481b, aVar14.f264482c, i3);
            case 25:
                return new awj.b(((sq.a) obj2).f264971a, 18);
            case 26:
                sql.a aVar15 = (sql.a) obj2;
                return new bq.a(aVar15.f265097a, aVar15.f265098b, aVar15.f265099c, aVar15.d);
            case 27:
                srh.f fVar = (srh.f) obj2;
                return new db5.a(fVar.f265227a, fVar.f265228b, fVar.f265229c);
            case 28:
                ss6.b bVar5 = (ss6.b) obj2;
                return new nu9.e(bVar5.f265313a, bVar5.f265314b, bVar5.f265315c, bVar5.d, bVar5.e, bVar5.f, bVar5.f265316g, bVar5.f265317h, bVar5.i, bVar5.f265318j, bVar5.k, bVar5.f265319l, bVar5.f265320m, 3);
            default:
                return new awj.b(((t2c.a) obj2).f267538a, 19);
        }
    }
}
