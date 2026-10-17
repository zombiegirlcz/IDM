package hwi;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$ConverterHistory;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUserCapabilities;
import java.util.List;
import java.util.Map;
import java.util.Set;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import mx0.q9;
import mx0.s9;
import svi.u1;
import tof.t3;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f156195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f156195w, (Continuation) obj4, 0);
                bVar.v = (List) obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b((g) this.f156195w, (Continuation) obj4, 1);
                bVar2.v = (List) obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                b bVar3 = new b((v) this.f156195w, (Continuation) obj4, 2);
                bVar3.v = (svi.o0) obj3;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 3:
                b bVar4 = new b((v) this.f156195w, (Continuation) obj4, 3);
                bVar4.v = (svi.i0) obj3;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar5 = new b((h0) this.f156195w, (Continuation) obj4, 4);
                bVar5.v = (List) obj3;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar6 = new b((m0) this.f156195w, (Continuation) obj4, 5);
                bVar6.v = (String) obj3;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar7 = new b((x0) this.f156195w, (Continuation) obj4, 6);
                bVar7.v = (AirportLoungesUserCapabilities) obj3;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar8 = new b((f1) this.f156195w, (Continuation) obj4, 7);
                bVar8.v = (u1) obj3;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar9 = new b(3, 8, (Continuation) obj4);
                bVar9.v = (Data) obj2;
                bVar9.f156195w = (m1c.u0) obj3;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar10 = new b(3, 9, (Continuation) obj4);
                bVar10.v = (vf0.h) obj2;
                bVar10.f156195w = (BenchmarkInfo) obj3;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar11 = new b((img.d) this.f156195w, (Continuation) obj4, 10);
                bVar11.v = (fmg.p) obj3;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar12 = new b((ivg.b) this.f156195w, (Continuation) obj4, 11);
                bVar12.v = (List) obj3;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar13 = new b((jb5.a) this.f156195w, (Continuation) obj4, 12);
                bVar13.v = (List) obj3;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar14 = new b(3, 13, (Continuation) obj4);
                bVar14.v = (List) obj2;
                bVar14.f156195w = (Map) obj3;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar15 = new b(3, 14, (Continuation) obj4);
                bVar15.f156195w = (SharedConverterScreenContract$ConverterHistory) obj2;
                bVar15.v = (List) obj3;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar16 = new b((jqj.h) this.f156195w, (Continuation) obj4, 15);
                bVar16.v = (lzi.h) obj3;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar17 = new b((k0d.b) this.f156195w, (Continuation) obj4, 16);
                bVar17.v = (j0d.h) obj3;
                return bVar17.invokeSuspend(Unit.f186387a);
            case 17:
                b bVar18 = new b(3, 17, (Continuation) obj4);
                bVar18.v = (hha.d) obj2;
                bVar18.f156195w = (k23.a) obj3;
                return bVar18.invokeSuspend(Unit.f186387a);
            case 18:
                b bVar19 = new b(3, 18, (Continuation) obj4);
                bVar19.v = (vf0.h) obj2;
                bVar19.f156195w = (Set) obj3;
                return bVar19.invokeSuspend(Unit.f186387a);
            case 19:
                b bVar20 = new b((k7c.y0) this.f156195w, (Continuation) obj4, 19);
                bVar20.v = (nec.c) obj3;
                return bVar20.invokeSuspend(Unit.f186387a);
            case 20:
                b bVar21 = new b(3, 20, (Continuation) obj4);
                bVar21.v = (h7i.n) obj2;
                bVar21.f156195w = (h7i.p) obj3;
                return bVar21.invokeSuspend(Unit.f186387a);
            case 21:
                b bVar22 = new b((kc5.b) this.f156195w, (Continuation) obj4, 21);
                bVar22.v = (ec5.b) obj3;
                return bVar22.invokeSuspend(Unit.f186387a);
            case 22:
                b bVar23 = new b((kgb.g) this.f156195w, (Continuation) obj4, 22);
                bVar23.v = (mgb.c) obj3;
                return bVar23.invokeSuspend(Unit.f186387a);
            case 23:
                b bVar24 = new b((kgb.g) this.f156195w, (Continuation) obj4, 23);
                bVar24.v = (mgb.n) obj3;
                return bVar24.invokeSuspend(Unit.f186387a);
            case 24:
                b bVar25 = new b((kgb.g) this.f156195w, (Continuation) obj4, 24);
                bVar25.v = (tgb.c) obj3;
                return bVar25.invokeSuspend(Unit.f186387a);
            case 25:
                b bVar26 = new b((kgb.g) this.f156195w, (Continuation) obj4, 25);
                bVar26.v = (tgb.o) obj3;
                return bVar26.invokeSuspend(Unit.f186387a);
            case 26:
                b bVar27 = new b(3, 26, (Continuation) obj4);
                bVar27.v = (s9) obj2;
                bVar27.f156195w = (q9) obj3;
                return bVar27.invokeSuspend(Unit.f186387a);
            case 27:
                b bVar28 = new b(3, 27, (Continuation) obj4);
                bVar28.v = (t3) obj2;
                bVar28.f156195w = (j1) obj3;
                return bVar28.invokeSuspend(Unit.f186387a);
            case 28:
                b bVar29 = new b(3, 28, (Continuation) obj4);
                bVar29.v = (kr2.h) obj2;
                bVar29.f156195w = (j1) obj3;
                return bVar29.invokeSuspend(Unit.f186387a);
            default:
                b bVar30 = new b((kya.b) this.f156195w, (Continuation) obj4, 29);
                bVar30.v = (List) obj3;
                return bVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 3574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hwi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f156195w = obj2;
    }
}
