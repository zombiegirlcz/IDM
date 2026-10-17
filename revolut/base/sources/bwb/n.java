package bwb;

import com.revolut.data.model.Data;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.staking.api.model.StakingProduct;
import cuc.r;
import cuc.z;
import dfj.s3;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f19297w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19298x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f19298x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                n nVar = new n((p) this.f19298x, (Continuation) obj4, 0);
                nVar.v = (c) obj2;
                nVar.f19297w = (VoucherProductGroupDetails) obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n((bwd.c) this.f19298x, (Continuation) obj4, 1);
                nVar2.v = (String) obj2;
                nVar2.f19297w = (vtd.d) obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n((c30.h) this.f19298x, (Continuation) obj4, 2);
                nVar3.v = (UUID) obj2;
                nVar3.f19297w = (c30.a) obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n((c49.d) this.f19298x, (Continuation) obj4, 3);
                nVar4.v = (String) obj2;
                nVar4.f19297w = (LocationDomain) obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n((c6h.e) this.f19298x, (Continuation) obj4, 4);
                nVar5.v = (c6h.c) obj2;
                nVar5.f19297w = (i6h.d) obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n((c9f.b) this.f19298x, (Continuation) obj4, 5);
                nVar6.v = (c9f.g) obj2;
                nVar6.f19297w = (List) obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 6:
                n nVar7 = new n((c9f.f) this.f19298x, (Continuation) obj4, 6);
                nVar7.v = (c9f.g) obj2;
                nVar7.f19297w = (List) obj3;
                return nVar7.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar8 = new n((ca8.a) this.f19298x, (Continuation) obj4, 7);
                nVar8.v = (String) obj2;
                nVar8.f19297w = (List) obj3;
                return nVar8.invokeSuspend(Unit.f186387a);
            case 8:
                n nVar9 = new n((cgd.c) this.f19298x, (Continuation) obj4, 8);
                nVar9.v = (String) obj2;
                nVar9.f19297w = (Data) obj3;
                return nVar9.invokeSuspend(Unit.f186387a);
            case 9:
                n nVar10 = new n((cge.h) this.f19298x, (Continuation) obj4, 9);
                nVar10.v = (List) obj2;
                nVar10.f19297w = (List) obj3;
                return nVar10.invokeSuspend(Unit.f186387a);
            case 10:
                n nVar11 = new n((cge.k) this.f19298x, (Continuation) obj4, 10);
                nVar11.v = (List) obj2;
                nVar11.f19297w = (List) obj3;
                return nVar11.invokeSuspend(Unit.f186387a);
            case 11:
                n nVar12 = new n((ch3.f) this.f19298x, (Continuation) obj4, 11);
                nVar12.v = (ch3.c) obj2;
                nVar12.f19297w = (xg3.c) obj3;
                return nVar12.invokeSuspend(Unit.f186387a);
            case 12:
                n nVar13 = new n((ch3.f) this.f19298x, (Continuation) obj4, 12);
                nVar13.v = (ch3.d) obj2;
                nVar13.f19297w = (yg3.c) obj3;
                return nVar13.invokeSuspend(Unit.f186387a);
            case 13:
                n nVar14 = new n((ck1.c) this.f19298x, (Continuation) obj4, 13);
                nVar14.v = (yj1.e) obj2;
                nVar14.f19297w = (od0.i) obj3;
                return nVar14.invokeSuspend(Unit.f186387a);
            case 14:
                n nVar15 = new n((cta.c) this.f19298x, (Continuation) obj4, 14);
                nVar15.v = (String) obj2;
                nVar15.f19297w = (com.revolut.feature.raffle.impl.data.models.b) obj3;
                return nVar15.invokeSuspend(Unit.f186387a);
            case 15:
                n nVar16 = new n((r) this.f19298x, (Continuation) obj4, 15);
                nVar16.v = (cuc.m) obj2;
                nVar16.f19297w = (SecurityDelayInfo) obj3;
                return nVar16.invokeSuspend(Unit.f186387a);
            case 16:
                n nVar17 = new n((z) this.f19298x, (Continuation) obj4, 16);
                nVar17.v = (qtc.k) obj2;
                nVar17.f19297w = (WealthProtectionFeatureDetails) obj3;
                return nVar17.invokeSuspend(Unit.f186387a);
            case 17:
                n nVar18 = new n((cuh.b) this.f19298x, (Continuation) obj4, 17);
                nVar18.v = (String) obj2;
                nVar18.f19297w = (String) obj3;
                return nVar18.invokeSuspend(Unit.f186387a);
            case 18:
                n nVar19 = new n((cve.c) this.f19298x, (Continuation) obj4, 18);
                nVar19.v = (String) obj2;
                nVar19.f19297w = (yte.e) obj3;
                return nVar19.invokeSuspend(Unit.f186387a);
            case 19:
                n nVar20 = new n((d6l.h) this.f19298x, (Continuation) obj4, 19);
                nVar20.v = (d6l.d) obj2;
                nVar20.f19297w = (List) obj3;
                return nVar20.invokeSuspend(Unit.f186387a);
            case 20:
                n nVar21 = new n((dd5.f) this.f19298x, (Continuation) obj4, 20);
                nVar21.v = (StakingProduct) obj2;
                nVar21.f19297w = (wi0.b) obj3;
                return nVar21.invokeSuspend(Unit.f186387a);
            case 21:
                n nVar22 = new n((s3) this.f19298x, (Continuation) obj4, 21);
                nVar22.v = (Data) obj2;
                nVar22.f19297w = (Data) obj3;
                return nVar22.invokeSuspend(Unit.f186387a);
            case 22:
                n nVar23 = new n((di7.e) this.f19298x, (Continuation) obj4, 22);
                nVar23.v = (di7.a) obj2;
                nVar23.f19297w = (List) obj3;
                return nVar23.invokeSuspend(Unit.f186387a);
            case 23:
                n nVar24 = new n((dlf.k) this.f19298x, (Continuation) obj4, 23);
                nVar24.v = (t3) obj2;
                nVar24.f19297w = (a3) obj3;
                return nVar24.invokeSuspend(Unit.f186387a);
            case 24:
                n nVar25 = new n((dp4.e) this.f19298x, (Continuation) obj4, 24);
                nVar25.v = (cp4.b) obj2;
                nVar25.f19297w = (el4.a) obj3;
                return nVar25.invokeSuspend(Unit.f186387a);
            case 25:
                n nVar26 = new n((dp4.e) this.f19298x, (Continuation) obj4, 25);
                nVar26.v = (cp4.c) obj2;
                nVar26.f19297w = (List) obj3;
                return nVar26.invokeSuspend(Unit.f186387a);
            case 26:
                n nVar27 = new n((dp4.e) this.f19298x, (Continuation) obj4, 26);
                nVar27.v = (cp4.e) obj2;
                nVar27.f19297w = (el4.f) obj3;
                return nVar27.invokeSuspend(Unit.f186387a);
            case 27:
                n nVar28 = new n((dp4.e) this.f19298x, (Continuation) obj4, 27);
                nVar28.v = (cp4.d) obj2;
                nVar28.f19297w = (el4.i) obj3;
                return nVar28.invokeSuspend(Unit.f186387a);
            case 28:
                n nVar29 = new n((dp4.j) this.f19298x, (Continuation) obj4, 28);
                nVar29.v = (cp4.g) obj2;
                nVar29.f19297w = (gl4.c) obj3;
                return nVar29.invokeSuspend(Unit.f186387a);
            default:
                n nVar30 = new n((dp4.j) this.f19298x, (Continuation) obj4, 29);
                nVar30.v = (cp4.h) obj2;
                nVar30.f19297w = (List) obj3;
                return nVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bwb.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
