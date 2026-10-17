package sf9;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rnb.u;
import vkm.j2;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f262369b;

    public /* synthetic */ b(g gVar, int i) {
        this.f262368a = i;
        this.f262369b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object value;
        j jVar;
        HashMap map;
        int i = this.f262368a;
        g gVar = this.f262369b;
        switch (i) {
            case 0:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    g gVar2 = this.f262369b;
                    gVar2.T2(new f(gVar2, null, 0), new u(1, gVar2, g.class, "handleConfirmationError", "handleConfirmationError(Ljava/lang/Throwable;)Z", 0, 24));
                }
                return Unit.f186387a;
            case 1:
                jg9.f fVar = (jg9.f) obj2;
                if (fVar instanceof jg9.d) {
                    sg9.a aVar = ((jg9.d) fVar).f173940a;
                    String str = aVar.f262631a;
                    String str2 = aVar.f262632b.f61286a;
                    if (Intrinsics.f(str, "INPUT_METHOD")) {
                        j2 j2Var = gVar.f262381t;
                        Map map2 = ((j) j2Var.getValue()).e;
                        List<BillFormField> listA = ff9.a.a(str2, ((j) j2Var.getValue()).d);
                        int iB = q0.b(w.t(listA, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (BillFormField billFormField : listA) {
                            String str3 = billFormField.f61274a;
                            String str4 = billFormField.i;
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap.put(str3, str4);
                        }
                        do {
                            value = j2Var.getValue();
                            jVar = (j) value;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : map2.entrySet()) {
                                if (linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            map = new HashMap(linkedHashMap2);
                            map.put("INPUT_METHOD", str2);
                            Unit unit = Unit.f186387a;
                        } while (!j2Var.h(value, j.a(jVar, null, null, map, 31)));
                    } else {
                        gVar.p3(aVar.f262631a, str2);
                    }
                } else if (fVar instanceof jg9.c) {
                    jg9.c cVar = (jg9.c) fVar;
                    gVar.p3(cVar.f173938a, cVar.f173939b);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown search form output: ", fVar != null ? fVar.a() : null));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            default:
                dm1.h result = (dm1.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dm1.f) {
                    gVar.o3(((dm1.f) result).f115819a);
                } else {
                    if (!(result instanceof dm1.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.T2(new sbb.w(gVar, ((dm1.g) result).f115820a, null, 8), new yi5.b(27));
                }
                return Unit.f186387a;
        }
    }
}
