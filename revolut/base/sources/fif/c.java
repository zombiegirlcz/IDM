package fif;

import atg.v;
import com.revolut.core.model.account.AccountId;
import efm.r;
import fg8.e0;
import fg8.i0;
import fg8.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tif.q;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f135392b;

    public /* synthetic */ c(m mVar, int i) {
        this.f135391a = i;
        this.f135392b = mVar;
    }

    private final Object a(Object obj2) {
        Unit it8 = (Unit) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        this.f135392b.f135419p.b();
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        Boolean enabled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        if (!enabled.booleanValue()) {
            return w.h(f0.f322471a);
        }
        phm.a aVar = (phm.a) j6.a.i(((mp.k) this.f135392b.f.f206998b).f207702a, lal.k.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return m70.a.e(((pal.a) ((fal.b) ((lal.k) aVar2.b()).f193459j.get())).a(false), new i0(15), new i0(16)).onErrorReturnItem(f0.f322471a);
        }
        throw new IllegalStateException(a0.d.q("Api ", lal.k.class, " is not found"));
    }

    private final Object c(Object obj2) {
        bla.c state = (bla.c) obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        return state.a() ? ue0.e.E(m70.a.e(this.f135392b.f135417m.c(w4l.h.f294642c), new i0(17), new i0(18)), f0.f322471a) : w.h(f0.f322471a);
    }

    private final Object d(Object obj2) {
        Boolean enabled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        if (!enabled.booleanValue()) {
            return w.h(f0.f322471a);
        }
        m mVar = this.f135392b;
        qsg.b bVar = mVar.d;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        w4l.h hVar = w4l.h.f294642c;
        r rVarE = m70.a.e(pd.b.r(((v) bVar).i(personal, hVar), new c(mVar, 4)), new i0(19), new i0(20));
        f0 f0Var = f0.f322471a;
        return w.l(ue0.e.E(rVarE, f0Var), ue0.e.E(m70.a.e(pd.b.r(nim.a.w(((v) mVar.f135412c.f9057b).m(fo3.d.PERSONAL_JOINT, hVar), new arf.h(11)), new c(mVar, 5)), new i0(21), new i0(22)), f0Var)).map(new e0(14, new fg8.g(21)));
    }

    private final Object e(Object obj2) {
        fo3.c personalWallet = (fo3.c) obj2;
        Intrinsics.checkNotNullParameter(personalWallet, "personalWallet");
        g31.h hVar = this.f135392b.e;
        String id10 = personalWallet.f136801a;
        Intrinsics.checkNotNullParameter(id10, "id");
        return hVar.c(id10, false);
    }

    private final Object g(Object obj2) {
        od0.i walletIdOptional = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(walletIdOptional, "walletIdOptional");
        String id10 = (String) walletIdOptional.f224257a;
        if (id10 != null) {
            g31.h hVar = this.f135392b.e;
            Intrinsics.checkNotNullParameter(id10, "id");
            r rVarC = hVar.c(id10, false);
            if (rVarC != null) {
                return rVarC;
            }
        }
        return zi0.c.j(f0.f322471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[PHI: r5
      0x0068: PHI (r5v12 java.lang.Object) = (r5v3 java.lang.Object), (r5v5 java.lang.Object), (r5v7 java.lang.Object) binds: [B:14:0x0066, B:19:0x0074, B:24:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fif.c.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2) {
        a params = (a) obj2;
        Intrinsics.checkNotNullParameter(params, "params");
        m mVar = this.f135392b;
        j01.b bVar = new j01.b(((q) mVar.f135410a).e().toFlowable(efm.a.LATEST).f(new e0(18, new y(mVar, params, 10)), 1, 1), 7);
        Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
        return mVar.a(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0cb2  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0db8  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0b2a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:853:0x0b57 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r146v0 */
    /* JADX WARN: Type inference failed for: r146v1, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r146v2 */
    /* JADX WARN: Type inference failed for: r147v0 */
    /* JADX WARN: Type inference failed for: r147v1, types: [tof.v5] */
    /* JADX WARN: Type inference failed for: r147v2 */
    /* JADX WARN: Type inference failed for: r148v0 */
    /* JADX WARN: Type inference failed for: r148v1, types: [tof.s1] */
    /* JADX WARN: Type inference failed for: r148v2 */
    /* JADX WARN: Type inference failed for: r149v0 */
    /* JADX WARN: Type inference failed for: r149v1, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r149v2 */
    /* JADX WARN: Type inference failed for: r151v0 */
    /* JADX WARN: Type inference failed for: r151v1, types: [tof.m1] */
    /* JADX WARN: Type inference failed for: r151v2 */
    /* JADX WARN: Type inference failed for: r154v0, types: [tof.a1] */
    /* JADX WARN: Type inference failed for: r157v0 */
    /* JADX WARN: Type inference failed for: r157v1, types: [tof.v1] */
    /* JADX WARN: Type inference failed for: r157v2 */
    /* JADX WARN: Type inference failed for: r158v0 */
    /* JADX WARN: Type inference failed for: r158v1, types: [tof.q2] */
    /* JADX WARN: Type inference failed for: r158v2 */
    /* JADX WARN: Type inference failed for: r1v21, types: [tof.v1[]] */
    /* JADX WARN: Type inference failed for: r1v22, types: [tof.q2[]] */
    /* JADX WARN: Type inference failed for: r1v23, types: [tof.a1[]] */
    /* JADX WARN: Type inference failed for: r1v29, types: [tof.v5[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [tof.a1] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r78v0 */
    /* JADX WARN: Type inference failed for: r78v1, types: [tof.t5] */
    /* JADX WARN: Type inference failed for: r78v2 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r166) {
        /*
            Method dump skipped, instruction units count: 3730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fif.c.invoke(java.lang.Object):java.lang.Object");
    }
}
