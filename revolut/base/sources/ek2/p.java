package ek2;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126947b;

    public /* synthetic */ p(String str, int i) {
        this.f126946a = i;
        this.f126947b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f126946a;
        String str = this.f126947b;
        switch (i) {
            case 0:
                List plansLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(plansLimits, "plansLimits");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : plansLimits) {
                    if (Intrinsics.f(((mha.h) obj3).a(), str)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 1:
                Map map = (Map) obj2;
                Intrinsics.checkNotNullParameter(map, "map");
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new Pair(str, (JuniorBankingProfile) entry.getValue()));
                }
                return linkedHashMap;
            case 2:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it8 = accounts.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((e16.b) next).f121886a, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                e16.b bVar = (e16.b) next;
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalStateException(h30.l.r("DeFi account not found: ", str));
            case 3:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f187033b;
                function.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f186387a;
            case 4:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function2 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function2, "$this$function");
                function2.parameter(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 5:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function3 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function3, "$this$function");
                function3.parameter(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 6:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function4 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function4, "$this$function");
                function4.returns(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 7:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function5 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function5, "$this$function");
                function5.returns(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 8:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function6 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function6, "$this$function");
                function6.parameter(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 9:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function7 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function7, "$this$function");
                function7.parameter(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 10:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function8 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function8, "$this$function");
                function8.returns(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 11:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function9 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function9, "$this$function");
                function9.returns(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 12:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function10 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function10, "$this$function");
                function10.returns(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 13:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function11 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function11, "$this$function");
                function11.returns(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            case 14:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function12 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function12, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.f187033b;
                function12.parameter(str, javaTypeQualifiers14, javaTypeQualifiers14, javaTypeQualifiers14);
                return Unit.f186387a;
            case 15:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function13 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function13, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.f187033b;
                function13.parameter(str, javaTypeQualifiers16);
                function13.parameter(str, javaTypeQualifiers16);
                function13.returns(str, PredefinedEnhancementInfoKt.f187032a);
                return Unit.f186387a;
            case 16:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function14 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers17 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function14, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers18 = PredefinedEnhancementInfoKt.f187033b;
                function14.parameter(str, javaTypeQualifiers18);
                function14.parameter(str, javaTypeQualifiers18);
                function14.returns(str, PredefinedEnhancementInfoKt.f187032a);
                return Unit.f186387a;
            case 17:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function15 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers19 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function15, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers20 = PredefinedEnhancementInfoKt.f187033b;
                function15.parameter(str, javaTypeQualifiers20);
                function15.parameter(str, javaTypeQualifiers20);
                function15.parameter(str, javaTypeQualifiers20);
                function15.returns(JvmPrimitiveType.BOOLEAN);
                return Unit.f186387a;
            case 18:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function16 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers21 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function16, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers22 = PredefinedEnhancementInfoKt.f187033b;
                function16.parameter(str, javaTypeQualifiers22, javaTypeQualifiers22, javaTypeQualifiers22, javaTypeQualifiers22);
                return Unit.f186387a;
            case 19:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function17 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers23 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function17, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers24 = PredefinedEnhancementInfoKt.f187033b;
                function17.parameter(str, javaTypeQualifiers24);
                function17.parameter(str, javaTypeQualifiers24);
                function17.returns(str, PredefinedEnhancementInfoKt.f187032a);
                return Unit.f186387a;
            case 20:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function18 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers25 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function18, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers26 = PredefinedEnhancementInfoKt.f187033b;
                function18.parameter(str, javaTypeQualifiers26, javaTypeQualifiers26);
                function18.returns(JvmPrimitiveType.BOOLEAN);
                return Unit.f186387a;
            case 21:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function19 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers27 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function19, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers28 = PredefinedEnhancementInfoKt.f187033b;
                function19.parameter(str, javaTypeQualifiers28);
                function19.parameter(str, javaTypeQualifiers28);
                function19.returns(str, PredefinedEnhancementInfoKt.f187032a);
                return Unit.f186387a;
            case 22:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function20 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers29 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function20, "$this$function");
                function20.returns(str, PredefinedEnhancementInfoKt.f187033b, PredefinedEnhancementInfoKt.f187034c);
                return Unit.f186387a;
            case 23:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function21 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers30 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function21, "$this$function");
                function21.returns(str, PredefinedEnhancementInfoKt.f187034c);
                return Unit.f186387a;
            case 24:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function22 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers31 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function22, "$this$function");
                function22.parameter(str, PredefinedEnhancementInfoKt.f187033b, PredefinedEnhancementInfoKt.f187034c);
                return Unit.f186387a;
            case 25:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function23 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers32 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function23, "$this$function");
                function23.returns(str, PredefinedEnhancementInfoKt.f187032a);
                return Unit.f186387a;
            case 26:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function24 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers33 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function24, "$this$function");
                function24.parameter(str, PredefinedEnhancementInfoKt.f187033b);
                function24.returns(JvmPrimitiveType.BOOLEAN);
                return Unit.f186387a;
            case 27:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function25 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers34 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function25, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers35 = PredefinedEnhancementInfoKt.f187033b;
                function25.parameter(str, javaTypeQualifiers35);
                function25.parameter(str, javaTypeQualifiers35);
                function25.returns(JvmPrimitiveType.BOOLEAN);
                return Unit.f186387a;
            case 28:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function26 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers36 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function26, "$this$function");
                function26.parameter(str, PredefinedEnhancementInfoKt.f187033b);
                return Unit.f186387a;
            default:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function27 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers37 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function27, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers38 = PredefinedEnhancementInfoKt.f187033b;
                function27.returns(str, javaTypeQualifiers38, javaTypeQualifiers38);
                return Unit.f186387a;
        }
    }
}
