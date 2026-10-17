package ll7;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import com.youTransactor.uCube.rpc.Constants;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f196630j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCarService f196631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f196632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f196633c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f196634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f196635h;
    public final x4l.c i;

    static {
        Type type = new TypeToken<List<? extends hl7.i>>() { // from class: com.revolut.feature.insurance_car.impl.data.repository.ApplicationFormRepositoryImpl$Companion$TYPE_APPLICATION_FORMS_LIST$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f196630j = type;
    }

    public h(InsuranceCarService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f196631a = service;
        this.f196632b = memoryCache;
        this.f196633c = storage;
        final int i = 7;
        Function2 function2 = new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i2) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.d = new w4l.f(function2, new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                int i3 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i22) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i22) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i5 = 3;
        this.e = new w4l.f(function22, function1, new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                int i32 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i22) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 4;
        Function2 function23 = new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                int i32 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i22) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i21 = 3;
        Function1 function12 = new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i22 = 5;
        this.f = new w4l.f(function23, function12, new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i22;
                int i32 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i32 = 6;
        Function2 function24 = new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                int i322 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 4;
        Function1 function13 = new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i43 = 8;
        this.f196634g = new w4l.f(function24, function13, new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i43;
                int i322 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i59 = 9;
        Function2 function25 = new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i59;
                int i322 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i66 = 5;
        Function1 function14 = new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i66) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i74 = 10;
        Function2 function26 = new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i74;
                int i322 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i92 = 6;
        Function1 function15 = new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i92) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i96 = 11;
        this.f196635h = new w4l.f(function25, function14, function26, function15, new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i96;
                int i322 = 0;
                Continuation continuation = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i99 = 0;
        final int i100 = 0;
        this.i = new x4l.c(new k7c.x(this, continuation, 15), new Function1(this) { // from class: ll7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196596b;

            {
                this.f196596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i99) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (ApplicationForm) v7.r("RENEWAL_APPLICATION_FORM_", applicationFormId, this.f196596b.f196632b);
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f196596b.f196632b.get("OCCUPATIONS");
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (kl7.d) this.f196596b.f196632b.get("CAR_MAKES");
                    case 3:
                        String make = (String) obj2;
                        Intrinsics.checkNotNullParameter(make, "make");
                        return (List) v7.r("CAR_MODELS_", make, this.f196596b.f196632b);
                    case 4:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        return (List) this.f196596b.f196632b.get("CAR_VARIATIONS_" + str + "_" + str2);
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f196596b.f196632b.get("APPLICATION_FORMS");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        List list = (List) this.f196596b.f196633c.T2("APPLICATION_FORMS", h.f196630j);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            arrayList.add(jl7.c.a((hl7.i) it12.next()));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: ll7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f196600b;

            {
                this.f196600b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i100;
                int i322 = 0;
                Continuation continuation2 = null;
                h hVar = this.f196600b;
                switch (i222) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        ApplicationForm applicationForm = (ApplicationForm) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
                        hVar.f196632b.f("RENEWAL_APPLICATION_FORM_" + applicationFormId, applicationForm);
                        break;
                    case 1:
                        List occupations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(occupations, "occupations");
                        hVar.f196632b.f("OCCUPATIONS", occupations);
                        break;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        p0 p0Var = p0.f264001a;
                        break;
                    case 3:
                        kl7.d makes = (kl7.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(makes, "makes");
                        hVar.f196632b.f("CAR_MAKES", makes);
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String make = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(make, "make");
                        p0 p0Var2 = p0.f264001a;
                        break;
                    case 5:
                        String make2 = (String) obj2;
                        List models = (List) obj3;
                        Intrinsics.checkNotNullParameter(make2, "make");
                        Intrinsics.checkNotNullParameter(models, "models");
                        ehe.n.z("CAR_MODELS_", make2, hVar.f196632b, models);
                        break;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        p0 p0Var3 = p0.f264001a;
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        p0 p0Var4 = p0.f264001a;
                        break;
                    case 8:
                        Pair pair2 = (Pair) obj2;
                        List variations = (List) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(variations, "variations");
                        hVar.f196632b.f(a0.d.s("CAR_VARIATIONS_", (String) pair2.f186385a, "_", (String) pair2.f186386b), variations);
                        break;
                    case 9:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        p0 p0Var5 = p0.f264001a;
                        break;
                    case 10:
                        List forms = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(forms, "forms");
                        hVar.f196632b.f("APPLICATION_FORMS", forms);
                        break;
                    default:
                        List policies = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(policies, "policies");
                        ue0.c cVar = hVar.f196633c;
                        List list = policies;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(jl7.c.d((ApplicationForm) it11.next()));
                        }
                        cVar.G(arrayList, "APPLICATION_FORMS", kii.e.o(hl7.i.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new le8.d(this, continuation, 16), new j40.d(this, continuation, 22));
    }

    public final List a() {
        List list = (List) this.f196632b.get("APPLICATION_FORMS");
        if (list != null) {
            return list;
        }
        List list2 = (List) this.f196633c.T2("APPLICATION_FORMS", f196630j);
        if (list2 == null) {
            return null;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(jl7.c.a((hl7.i) it8.next()));
        }
        return arrayList;
    }

    public final vkm.d b(String make, String model) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        return rd0.e.b(this.f196634g.f(new Pair(make, model), false));
    }
}
