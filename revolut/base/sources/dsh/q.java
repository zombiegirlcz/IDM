package dsh;

import f28.h0;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f117340b;

    public /* synthetic */ q(e eVar, int i) {
        this.f117339a = i;
        this.f117340b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e eVarA;
        String str;
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        e eVar6;
        switch (this.f117339a) {
            case 0:
                a selectedOption = (a) obj2;
                Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
                f fVar = new f();
                LinkedHashMap newValues = this.f117340b.f117319a;
                Intrinsics.checkNotNullParameter(newValues, "newValues");
                fVar.f117320a.putAll(newValues);
                fVar.a("itemsCountLimit", selectedOption.f117314a);
                return new e(fVar);
            case 1:
                aii.r outputData = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if ((outputData instanceof h28.f ? (h28.f) outputData : null) != null) {
                    int i = f28.c.f131452b[((h28.f) outputData).f148737a.ordinal()];
                    if (i == 1) {
                        str = "totalValue";
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "performance";
                    }
                    String strA = this.f117340b.a("timeframe");
                    if (strA == null) {
                        strA = (str.equals("performance") ? h0.DAY : h0.MONTH).b();
                    }
                    f fVar2 = new f();
                    fVar2.a("analyticsMethod", str);
                    fVar2.a("timeframe", strA);
                    eVarA = new e(fVar2);
                } else {
                    e.Companion.getClass();
                    eVarA = d.a();
                }
                return new l(eVarA);
            case 2:
                a option = (a) obj2;
                Intrinsics.checkNotNullParameter(option, "option");
                String str2 = option.f117314a;
                f fVar3 = new f();
                String strA2 = this.f117340b.a("analyticsMethod");
                if (strA2 == null) {
                    strA2 = "totalValue";
                }
                fVar3.a("analyticsMethod", strA2);
                fVar3.a("timeframe", str2);
                return new e(fVar3);
            case 3:
                aii.r outputData2 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                String str3 = ((n63.d) outputData2).f212705a;
                if (str3 != null) {
                    f fVar4 = new f();
                    fVar4.a("JUNIOR_CARD_WIDGET_SELECTED_CARD_KEY", str3);
                    eVar = new e(fVar4);
                } else {
                    eVar = this.f117340b;
                }
                return new l(eVar);
            case 4:
                aii.r outputData3 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                boolean z = outputData3 instanceof vj5.b;
                e eVar7 = this.f117340b;
                if (z) {
                    f fVar5 = new f();
                    LinkedHashMap newValues2 = eVar7.f117319a;
                    Intrinsics.checkNotNullParameter(newValues2, "newValues");
                    fVar5.f117320a.putAll(newValues2);
                    vj5.b bVar = (vj5.b) outputData3;
                    fVar5.a("RECEIVE_CRYPTO_WIDGET_CRYPTOCURRENCY", bVar.f289647a);
                    fVar5.a("RECEIVE_CRYPTO_WIDGET_ADDRESS", bVar.f289648b);
                    return new l(new e(fVar5));
                }
                if (!(outputData3 instanceof vj5.c)) {
                    return new l(eVar7);
                }
                f fVar6 = new f();
                LinkedHashMap newValues3 = eVar7.f117319a;
                Intrinsics.checkNotNullParameter(newValues3, "newValues");
                fVar6.f117320a.putAll(newValues3);
                vj5.c cVar = (vj5.c) outputData3;
                fVar6.a("RECEIVE_CRYPTO_WIDGET_CRYPTOCURRENCY", cVar.f289649a);
                fVar6.a("RECEIVE_CRYPTO_WIDGET_ADDRESS", cVar.f289650b);
                fVar6.a("RECEIVE_CRYPTO_WIDGET_BLOCKCHAIN", cVar.f289651c.name());
                return new l(new e(fVar6));
            case 5:
                aii.r outputData4 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                String str4 = ((n63.d) outputData4).f212705a;
                if (str4 != null) {
                    f fVar7 = new f();
                    fVar7.a("cardId", str4);
                    eVar2 = new e(fVar7);
                } else {
                    eVar2 = this.f117340b;
                }
                return new l(eVar2);
            case 6:
                aii.r outputData5 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(outputData5, "outputData");
                n63.d dVar = (n63.d) outputData5;
                String str5 = dVar.f212705a;
                Boolean bool = dVar.f212706b;
                if (str5 != null) {
                    f fVar8 = new f();
                    fVar8.a("cardId", str5);
                    if (bool != null) {
                        fVar8.a("SMALL_WIDGET_IS_DISPOSABLE_KEY", String.valueOf(bool.booleanValue()));
                    }
                    eVar3 = new e(fVar8);
                } else {
                    eVar3 = this.f117340b;
                }
                return new l(eVar3);
            case 7:
                aii.r output = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                b3a.f fVar9 = (b3a.f) output;
                String strJ = fVar9 instanceof b3a.e ? sc7.f.j(((b3a.e) fVar9).f12018a) : null;
                if (strJ != null) {
                    f fVar10 = new f();
                    fVar10.a("id", strJ);
                    eVar4 = new e(fVar10);
                } else {
                    eVar4 = this.f117340b;
                }
                return new l(eVar4);
            case 8:
                aii.r outputData6 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(outputData6, "outputData");
                kr6.c cVar2 = outputData6 instanceof kr6.c ? (kr6.c) outputData6 : null;
                String str6 = cVar2 != null ? cVar2.f188664a : null;
                if (str6 != null) {
                    f fVar11 = new f();
                    fVar11.a("PRO_POCKETS_SMALL_SELECTED_POCKET_ID", str6);
                    eVar5 = new e(fVar11);
                } else {
                    eVar5 = this.f117340b;
                }
                return new l(eVar5);
            default:
                aii.r output2 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof u68.e) {
                    f fVar12 = new f();
                    fVar12.a("childId", ((u68.e) output2).f277505a);
                    fVar12.a("JUNIOR_WIDGET_SELECTION_AVAILABLE", "true");
                    eVar6 = new e(fVar12);
                } else {
                    eVar6 = this.f117340b;
                }
                return new l(eVar6);
        }
    }

    public /* synthetic */ q(sc7.f fVar, e eVar) {
        this.f117339a = 7;
        this.f117340b = eVar;
    }
}
