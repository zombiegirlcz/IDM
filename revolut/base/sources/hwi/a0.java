package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesService;
import com.youTransactor.uCube.rpc.Constants;
import iwi.f;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import svi.k;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements w {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungePassesService f156188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156190c;
    public final b80.c d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f156191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.h f156192h;

    public a0(AirportLoungePassesService service, ue0.c storage, ne0.j memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f156188a = service;
        this.f156189b = storage;
        this.f156190c = memoryCache;
        this.d = networkStateRepository;
        final int i = 0;
        final int i2 = 9;
        final int i3 = 10;
        this.e = new w4l.f(new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i5 = i;
                a0 a0Var = this.f156272b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i6 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i6, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i21 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i22 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i21, strG2, i22, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 5), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i5 = i2;
                a0 a0Var = this.f156272b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i6 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i6, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i21 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i22 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i21, strG2, i22, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 8), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i5 = i3;
                a0 a0Var = this.f156272b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i6 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i6, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i21 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i22 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i21, strG2, i22, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 11;
        final int i6 = 12;
        final int i21 = 13;
        this.f = new w4l.f(new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i59 = i5;
                a0 a0Var = this.f156272b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i66 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i66, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i22 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i22, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 9), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i59 = i6;
                a0 a0Var = this.f156272b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i66 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i66, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i22 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i22, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 10), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i59 = i21;
                a0 a0Var = this.f156272b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i66 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i66, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i22 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i22, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        Function2 function2 = new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i59 = i22;
                a0 a0Var = this.f156272b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i66 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i66, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        };
        x xVar = new x(this, i22);
        final int i32 = 2;
        Function2 function22 = new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i59 = i32;
                a0 a0Var = this.f156272b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i66 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i66, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        };
        x xVar2 = new x(this, i32);
        final int i33 = 3;
        new w4l.f(function2, xVar, function22, xVar2, new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i59 = i33;
                a0 a0Var = this.f156272b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i66 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i66, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        final int i59 = 5;
        final int i66 = 6;
        new w4l.f(new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i592 = i43;
                a0 a0Var = this.f156272b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i662 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i662, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 3), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i592 = i59;
                a0 a0Var = this.f156272b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i662 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i662, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 4), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i592 = i66;
                a0 a0Var = this.f156272b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i662 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i662, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i74 = 7;
        final int i92 = 8;
        this.f156191g = new w4l.f(new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i592 = i74;
                a0 a0Var = this.f156272b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i662 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i662, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, new x(this, 6), new Function2(this) { // from class: hwi.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f156272b;

            {
                this.f156272b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                iwi.f fVar;
                f.b bVar;
                iwi.f fVar2;
                f.b bVar2;
                int i592 = i92;
                a0 a0Var = this.f156272b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        ufm.i iVar = new ufm.i(te0.w.n0(a0Var.f156188a.getMembership(), a0Var.d), new hw3.d(7, new x(a0Var, 0)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar2 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesLimits(), a0Var.d), new hw3.d(10, new hwf.b(9)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        svi.c0 limits = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits, "limits");
                        a0Var.f156190c.f("KEY_PASSES_LIMITS", limits);
                        return Unit.f186387a;
                    case 3:
                        svi.c0 limits2 = (svi.c0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limits2, "limits");
                        ue0.c cVar = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(limits2, "<this>");
                        cVar.G(new iwi.h(limits2.f265889a), "KEY_PASSES_LIMITS", wim.z.d(kotlin.jvm.internal.o0.b(iwi.h.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar3 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassesPricing(), a0Var.d), new hw3.d(6, new hwf.b(7)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        svi.b0 pricing = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing, "pricing");
                        a0Var.f156190c.f("KEY_PASSES_PRICING", pricing);
                        return Unit.f186387a;
                    case 6:
                        svi.b0 pricing2 = (svi.b0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(pricing2, "pricing");
                        ue0.c cVar2 = a0Var.f156189b;
                        Object obj4 = jwi.d.f179013a;
                        Intrinsics.checkNotNullParameter(pricing2, "<this>");
                        jo3.b bVarA = hx7.a.A(pricing2.f265880a);
                        List list = pricing2.f265881b;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<svi.h0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (svi.h0 h0Var : list2) {
                            arrayList.add(new iwi.i(h0Var.f265916a, u1.g(h0Var.f265917b, jwi.d.f179013a), hx7.a.A(h0Var.f265918c)));
                        }
                        cVar2.G(new iwi.j(arrayList, bVarA), "KEY_PASSES_PRICING", wim.z.d(kotlin.jvm.internal.o0.b(iwi.j.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(te0.w.n0(a0Var.f156188a.getRefundableLoungePasses(), a0Var.d), new hw3.d(11, new hwf.b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        svi.w refunds = (svi.w) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refunds, "refunds");
                        a0Var.f156190c.f("KEY_PASSES_REFUND_INFO", refunds);
                        return Unit.f186387a;
                    case 9:
                        svi.k membership = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership, "membership");
                        a0Var.f156190c.f("KEY_MEMBERSHIP", membership);
                        return Unit.f186387a;
                    case 10:
                        svi.k membership2 = (svi.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(membership2, "membership");
                        ue0.c cVar3 = a0Var.f156189b;
                        ?? r3 = jwi.c.f179012b;
                        ?? r4 = jwi.c.f179011a;
                        Intrinsics.checkNotNullParameter(membership2, "<this>");
                        if (membership2 instanceof k.a) {
                            fVar2 = new iwi.f(null);
                        } else {
                            if (membership2 instanceof svi.j) {
                                svi.j jVar = (svi.j) membership2;
                                String str = jVar.f265924a;
                                int i662 = jVar.f265925b;
                                LocalDateTime localDateTime = jVar.d;
                                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                                String strG = u1.g(jVar.f265926c, r4);
                                svi.p0 p0Var = jVar.f;
                                if (p0Var != null) {
                                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                    bVar2 = new f.b(p0Var.e, p0Var.d, p0Var.f265961a, p0Var.f265962b, p0Var.f265963c.toEpochMilli());
                                } else {
                                    bVar2 = null;
                                }
                                svi.e eVar = jVar.e;
                                fVar = new iwi.f(new f.d(str, "LIMITED", i662, strG, 0, lValueOf, bVar2, eVar != null ? jwi.c.g(eVar) : null, jVar.f265927g, u1.g(jVar.f265928h, r3)));
                            } else {
                                if (!(membership2 instanceof svi.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                svi.l lVar = (svi.l) membership2;
                                String str2 = lVar.f265935a;
                                int i212 = lVar.f265936b;
                                String strG2 = u1.g(lVar.d, r4);
                                int i222 = lVar.f265937c;
                                svi.p0 p0Var2 = lVar.f;
                                if (p0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(p0Var2, "<this>");
                                    bVar = new f.b(p0Var2.e, p0Var2.d, p0Var2.f265961a, p0Var2.f265962b, p0Var2.f265963c.toEpochMilli());
                                } else {
                                    bVar = null;
                                }
                                svi.e eVar2 = lVar.e;
                                fVar = new iwi.f(new f.d(str2, "UNLIMITED", i212, strG2, i222, null, bVar, eVar2 != null ? jwi.c.g(eVar2) : null, lVar.f265938g, u1.g(lVar.f265939h, r3)));
                            }
                            fVar2 = fVar;
                        }
                        cVar3.G(fVar2, "KEY_MEMBERSHIP", wim.z.d(kotlin.jvm.internal.o0.b(iwi.f.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar5 = new ufm.i(te0.w.n0(a0Var.f156188a.getLoungePassQrCode(), a0Var.d), new hw3.d(5, new hwf.b(6)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        svi.t qrCode = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                        a0Var.f156190c.f("KEY_LOUNGE_PASS_QR_CODE", qrCode);
                        return Unit.f186387a;
                    default:
                        svi.t qrCode2 = (svi.t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(qrCode2, "qrCode");
                        ue0.c cVar4 = a0Var.f156189b;
                        Intrinsics.checkNotNullParameter(qrCode2, "<this>");
                        cVar4.G(new iwi.g(qrCode2.f265987a, qrCode2.f265988b.getMillis(), Long.valueOf(qrCode2.f265989c)), "KEY_LOUNGE_PASS_QR_CODE", wim.z.d(kotlin.jvm.internal.o0.b(iwi.g.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.f156192h = new ao.h(20, new x(this, 7));
    }
}
