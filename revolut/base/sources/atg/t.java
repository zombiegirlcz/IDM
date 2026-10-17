package atg;

import com.revolut.data.model.Data;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder;
import nkm.y;
import zhm.q0;
import zhm.w;
import zw7.d0;
import zw7.r0;
import zw7.s0;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9073c;

    public /* synthetic */ t(String str, String str2, int i) {
        this.f9071a = i;
        this.f9072b = str;
        this.f9073c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        boolean zF;
        int i = this.f9071a;
        Object obj3 = null;
        String str = this.f9073c;
        String str2 = this.f9072b;
        switch (i) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Object content = data.getContent();
                if (content != null) {
                    Iterator it8 = ((List) content).iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((fo3.c) ((Pair) next).f186385a).f136801a, str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Pair pair = (Pair) next;
                    if (pair != null) {
                        obj3 = (List) pair.f186386b;
                    }
                }
                return new Data(obj3, (data.getLoading() || obj3 != null) ? data.getError() : new IllegalArgumentException(j6.a.q("No pockets found for junior wallet with id ", str2)), data.getLoading());
            case 1:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                Object content2 = data2.getContent();
                if (content2 != null) {
                    Iterator it9 = ((List) content2).iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (Intrinsics.f(((fo3.c) ((Pair) next2).f186385a).f136801a, str)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    Pair pair2 = (Pair) next2;
                    if (pair2 != null) {
                        obj3 = (fo3.c) pair2.f186385a;
                    }
                }
                return new Data(obj3, (data2.getLoading() || obj3 != null) ? data2.getError() : new IllegalArgumentException(j6.a.q("No wallet found for junior wallet with id ", str2)), data2.getLoading());
            case 2:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                Object content3 = data3.getContent();
                if (content3 != null) {
                    Iterator it10 = ((List) content3).iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            Object next3 = it10.next();
                            if (Intrinsics.f(((psg.a) next3).f239484a, str)) {
                                obj3 = next3;
                            }
                        }
                    }
                    obj3 = (psg.a) obj3;
                }
                return new Data(obj3, (data3.getLoading() || obj3 != null) ? data3.getError() : new IllegalArgumentException(j6.a.q("No wallet profile found for junior wallet with id ", str2)), data3.getLoading());
            case 3:
                Data data4 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data4, "data");
                Object content4 = data4.getContent();
                if (content4 != null) {
                    Iterator it11 = ((List) content4).iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            Object next4 = it11.next();
                            if (Intrinsics.f(((fo3.c) ((Pair) next4).f186385a).f136801a, str)) {
                                obj3 = next4;
                            }
                        }
                    }
                    obj3 = (Pair) obj3;
                }
                return new Data(obj3, (data4.getLoading() || obj3 != null) ? data4.getError() : new IllegalArgumentException(j6.a.q("No wallet found for junior wallet with id ", str2)), data4.getLoading());
            case 4:
                Data data5 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data5, "data");
                Object content5 = data5.getContent();
                if (content5 != null) {
                    Map map = (Map) content5;
                    Intrinsics.checkNotNullParameter(map, "<this>");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ue8.c.D((List) entry.getValue()));
                    }
                    Iterator it12 = w.u(linkedHashMap.values()).iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            Object next5 = it12.next();
                            if (Intrinsics.f(((fo3.c) ((Pair) next5).f186385a).f136805h, str)) {
                                obj3 = next5;
                            }
                        }
                    }
                    obj3 = (Pair) obj3;
                }
                return new Data(obj3, (data5.getLoading() || obj3 != null) ? data5.getError() : new IllegalArgumentException(j6.a.q("No wallet found for ownerId ", str2)), data5.getLoading());
            case 5:
                Data data6 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data6, "data");
                Object content6 = data6.getContent();
                if (content6 != null) {
                    Iterator it13 = ((List) content6).iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            Object next6 = it13.next();
                            if (Intrinsics.f(((d0) next6).f325764a, str)) {
                                obj3 = next6;
                            }
                        }
                    }
                    obj3 = (d0) obj3;
                }
                return new Data(obj3, (data6.getLoading() || obj3 != null) ? data6.getError() : new IllegalArgumentException(j6.a.q("Cannot find a pet with petId = ", str2)), data6.getLoading());
            case 6:
                Data data7 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data7, "data");
                Object content7 = data7.getContent();
                if (content7 != null) {
                    nkm.d0 d0VarX = y.x(zhm.d0.Q((List) content7), new h0() { // from class: fx7.e
                        @Override // kotlin.jvm.internal.h0, wim.p
                        public final Object get(Object obj4) {
                            return ((d0) obj4).o;
                        }
                    });
                    Iterator it14 = d0VarX.f216835a.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            Object objInvoke = d0VarX.f216836b.invoke(it14.next());
                            s0 s0Var = (s0) objInvoke;
                            if (s0Var instanceof s0.a) {
                                zF = false;
                            } else {
                                if (!(s0Var instanceof r0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zF = Intrinsics.f(((r0) s0Var).f325839a, str);
                            }
                            if (zF) {
                                obj3 = objInvoke;
                            }
                        }
                    }
                    obj3 = (s0) obj3;
                }
                return new Data(obj3, (data7.getLoading() || obj3 != null) ? data7.getError() : new IllegalArgumentException(j6.a.q("Cannot find a pet with policy = ", str2)), data7.getLoading());
            case 7:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f187033b;
                function.parameter(str2, javaTypeQualifiers2);
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f187032a;
                function.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                function.returns(str2, javaTypeQualifiers3);
                return Unit.f186387a;
            case 8:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function2 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function2, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.f187033b;
                function2.parameter(str2, javaTypeQualifiers5);
                function2.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                function2.returns(str2, javaTypeQualifiers5);
                return Unit.f186387a;
            case 9:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function3 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function3, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.f187033b;
                function3.parameter(str2, javaTypeQualifiers7);
                JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.f187034c;
                JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.f187032a;
                function3.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                function3.returns(str2, javaTypeQualifiers9);
                return Unit.f186387a;
            case 10:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function4 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function4, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.f187033b;
                function4.parameter(str2, javaTypeQualifiers11);
                JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.f187034c;
                function4.parameter(str2, javaTypeQualifiers12);
                JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.f187032a;
                function4.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                function4.returns(str2, javaTypeQualifiers13);
                return Unit.f186387a;
            case 11:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function5 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function5, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.f187034c;
                function5.parameter(str2, javaTypeQualifiers15);
                function5.returns(str, PredefinedEnhancementInfoKt.f187033b, javaTypeQualifiers15);
                return Unit.f186387a;
            default:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function6 = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj2;
                JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.f187032a;
                Intrinsics.checkNotNullParameter(function6, "$this$function");
                function6.parameter(str2, PredefinedEnhancementInfoKt.f187032a);
                function6.returns(str, PredefinedEnhancementInfoKt.f187033b, PredefinedEnhancementInfoKt.f187034c);
                return Unit.f186387a;
        }
    }
}
