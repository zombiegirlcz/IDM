package bh9;

import cli.y;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f15282b;

    public /* synthetic */ q(t tVar, int i) {
        this.f15281a = i;
        this.f15282b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f15281a;
        t tVar = this.f15282b;
        switch (i) {
            case 0:
                y yVar = tVar.f15289w;
                jg9.f fVar = (jg9.f) obj2;
                if (fVar instanceof jg9.d) {
                    sg9.a aVar = ((jg9.d) fVar).f173940a;
                    String str = aVar.f262631a;
                    BillFormField.Choice choice = aVar.f262632b;
                    String str2 = choice.f61286a;
                    if (Intrinsics.f(str, "INPUT_METHOD")) {
                        List<BillFormField> listA = ff9.a.a(str2, ((a) ((j2) yVar.f22677a).getValue()).e);
                        int iB = q0.b(w.t(listA, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                        for (BillFormField billFormField : listA) {
                            linkedHashMap.put(billFormField.f61274a, tVar.I2(billFormField));
                        }
                        tVar.H2(yVar, new awk.j(r0.p(linkedHashMap, q0.c(new Pair("INPUT_METHOD", new h(str2, null)))), 3));
                    } else {
                        Map map = ((a) ((j2) yVar.f22677a).getValue()).f;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (!Intrinsics.f(((h) entry.getValue()).f15278b, str)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMapP = r0.p(linkedHashMap2, q0.c(new Pair(str, new h(str2, null))));
                        List<BillFormField> list = choice.d;
                        int iB2 = q0.b(w.t(list, 10));
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                        for (BillFormField billFormField2 : list) {
                            String str3 = billFormField2.f61274a;
                            String str4 = billFormField2.i;
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap3.put(str3, new h(str4, str));
                        }
                        tVar.H2(yVar, new awk.j(r0.p(linkedHashMapP, linkedHashMap3), 2));
                    }
                } else if (fVar instanceof jg9.c) {
                    jg9.c cVar = (jg9.c) fVar;
                    tVar.H2(yVar, new b4d.c(tVar, 13, cVar.f173938a, cVar.f173939b));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown search form output: ", fVar != null ? fVar.a() : null));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            case 1:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, dii.e.f115068a)) {
                    tVar.J2();
                } else if (Intrinsics.f(outputData, dii.f.f115069a)) {
                    tVar.C2(c.f15271a);
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
            default:
                dii.g outputData2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof dii.e) {
                    tVar.J2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
