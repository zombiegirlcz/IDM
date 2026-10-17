package b6a;

import b79.m;
import b8l.f;
import bwb.p;
import c30.h;
import c9f.g;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import cuc.z;
import gim.i;
import hd.r;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import qtc.k;
import s69.j;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f12550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12551x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f12551x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                d dVar = new d((e) this.f12551x, (Continuation) obj4, 0);
                dVar.f12550w = (y5a.a) obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                d dVar2 = new d((com.revolut.feature_move_money.impl.amount.c) this.f12551x, (Continuation) obj4, 1);
                dVar2.f12550w = (FlowCollector) obj2;
                return dVar2.invokeSuspend(Unit.f186387a);
            case 2:
                d dVar3 = new d((m) this.f12551x, (Continuation) obj4, 2);
                dVar3.f12550w = (j) obj3;
                return dVar3.invokeSuspend(Unit.f186387a);
            case 3:
                d dVar4 = new d((f) this.f12551x, (Continuation) obj4, 3);
                dVar4.f12550w = (OrderQuoteParams) obj3;
                return dVar4.invokeSuspend(Unit.f186387a);
            case 4:
                return new d((b97.f) this.f12551x, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            case 5:
                return new d((b97.f) this.f12551x, (Continuation) obj4, 5).invokeSuspend(Unit.f186387a);
            case 6:
                return new d((bb.b) this.f12551x, (Continuation) obj4, 6).invokeSuspend(Unit.f186387a);
            case 7:
                d dVar5 = new d((r) this.f12551x, (Continuation) obj4, 7);
                dVar5.f12550w = (bc5.a) obj3;
                return dVar5.invokeSuspend(Unit.f186387a);
            case 8:
                d dVar6 = new d((r) this.f12551x, (Continuation) obj4, 8);
                dVar6.f12550w = (bc5.b) obj3;
                return dVar6.invokeSuspend(Unit.f186387a);
            case 9:
                d dVar7 = new d((r) this.f12551x, (Continuation) obj4, 9);
                dVar7.f12550w = (bc5.c) obj3;
                return dVar7.invokeSuspend(Unit.f186387a);
            case 10:
                d dVar8 = new d((p) this.f12551x, (Continuation) obj4, 10);
                dVar8.f12550w = (bwb.d) obj3;
                return dVar8.invokeSuspend(Unit.f186387a);
            case 11:
                d dVar9 = new d((p) this.f12551x, (Continuation) obj4, 11);
                dVar9.f12550w = (bwb.a) obj3;
                return dVar9.invokeSuspend(Unit.f186387a);
            case 12:
                d dVar10 = new d((p) this.f12551x, (Continuation) obj4, 12);
                dVar10.f12550w = (bwb.b) obj3;
                return dVar10.invokeSuspend(Unit.f186387a);
            case 13:
                d dVar11 = new d((p) this.f12551x, (Continuation) obj4, 13);
                dVar11.f12550w = (bwb.c) obj3;
                return dVar11.invokeSuspend(Unit.f186387a);
            case 14:
                d dVar12 = new d((bwd.c) this.f12551x, (Continuation) obj4, 14);
                dVar12.f12550w = (String) obj3;
                return dVar12.invokeSuspend(Unit.f186387a);
            case 15:
                d dVar13 = new d((c25.c) this.f12551x, (Continuation) obj4, 15);
                dVar13.f12550w = (FlowCollector) obj2;
                return dVar13.invokeSuspend(Unit.f186387a);
            case 16:
                d dVar14 = new d((h) this.f12551x, (Continuation) obj4, 16);
                dVar14.f12550w = (UUID) obj3;
                return dVar14.invokeSuspend(Unit.f186387a);
            case 17:
                d dVar15 = new d((c6h.e) this.f12551x, (Continuation) obj4, 17);
                dVar15.f12550w = (c6h.c) obj3;
                return dVar15.invokeSuspend(Unit.f186387a);
            case 18:
                d dVar16 = new d((c9f.b) this.f12551x, (Continuation) obj4, 18);
                dVar16.f12550w = (g) obj3;
                return dVar16.invokeSuspend(Unit.f186387a);
            case 19:
                d dVar17 = new d((c9f.f) this.f12551x, (Continuation) obj4, 19);
                dVar17.f12550w = (g) obj3;
                return dVar17.invokeSuspend(Unit.f186387a);
            case 20:
                d dVar18 = new d((ca8.a) this.f12551x, (Continuation) obj4, 20);
                dVar18.f12550w = (String) obj3;
                return dVar18.invokeSuspend(Unit.f186387a);
            case 21:
                d dVar19 = new d((cf6.e) this.f12551x, (Continuation) obj4, 21);
                dVar19.f12550w = (se6.g) obj3;
                return dVar19.invokeSuspend(Unit.f186387a);
            case 22:
                d dVar20 = new d((ch3.f) this.f12551x, (Continuation) obj4, 22);
                dVar20.f12550w = (ch3.c) obj3;
                return dVar20.invokeSuspend(Unit.f186387a);
            case 23:
                d dVar21 = new d((ch3.f) this.f12551x, (Continuation) obj4, 23);
                dVar21.f12550w = (ch3.d) obj3;
                return dVar21.invokeSuspend(Unit.f186387a);
            case 24:
                d dVar22 = new d((cj1.c) this.f12551x, (Continuation) obj4, 24);
                dVar22.f12550w = (cj1.a) obj3;
                return dVar22.invokeSuspend(Unit.f186387a);
            case 25:
                d dVar23 = new d((cj1.c) this.f12551x, (Continuation) obj4, 25);
                dVar23.f12550w = (cj1.b) obj3;
                return dVar23.invokeSuspend(Unit.f186387a);
            case 26:
                d dVar24 = new d((ck1.c) this.f12551x, (Continuation) obj4, 26);
                dVar24.f12550w = (yj1.e) obj3;
                return dVar24.invokeSuspend(Unit.f186387a);
            case 27:
                d dVar25 = new d((cta.c) this.f12551x, (Continuation) obj4, 27);
                dVar25.f12550w = (String) obj3;
                return dVar25.invokeSuspend(Unit.f186387a);
            case 28:
                return new d((cuc.d) this.f12551x, (Continuation) obj4, 28).invokeSuspend(Unit.f186387a);
            default:
                d dVar26 = new d((z) this.f12551x, (Continuation) obj4, 29);
                dVar26.f12550w = (k) obj3;
                return dVar26.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x045b, code lost:
    
        if (r0 == r4) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0470, code lost:
    
        if (r0 == r4) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:537:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v25, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v36, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 3072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6a.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
