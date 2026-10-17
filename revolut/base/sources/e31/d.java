package e31;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.network.models.topup.AutoTopUpDto;
import com.revolut.data.network.models.topup.AutoTopUpPerPocketDto;
import com.revolut.data.network.models.topup.mapper.AutoTopUpDtoMapperKt;
import com.revolut.data.network.services.AutoTopUpService;
import com.revolut.domain.models.topup.AutoTopUpState;
import efm.d0;
import io3.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements w71.a {

    @NotNull
    public static final c Companion = new c();
    public static final Type f = new TypeToken<List<? extends AutoTopUpDto>>() { // from class: com.revolut.data.repositories.topup.AutoTopUpRepositoryImpl$Companion$AUTO_TOP_UPS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoTopUpService f122172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f122173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f122174c;
    public final go3.b d;
    public final w4l.f e;

    public d(AutoTopUpService service, ne0.d memoryCache, ue0.c storage, go3.b walletMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        this.f122172a = service;
        this.f122173b = memoryCache;
        this.f122174c = storage;
        this.d = walletMapper;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: e31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f122169b;

            {
                this.f122169b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object objC;
                Object objC2;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l pocketType = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        d dVar = this.f122169b;
                        d0<AutoTopUpPerPocketDto> autoTopUp = dVar.f122172a.getAutoTopUp();
                        e0f.k kVar = new e0f.k(new e1.b(dVar, pocketType, 11), 29);
                        autoTopUp.getClass();
                        ufm.i iVar = new ufm.i(autoTopUp, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        l pocketType2 = (l) obj2;
                        AutoTopUpState value = (AutoTopUpState) obj3;
                        Intrinsics.checkNotNullParameter(pocketType2, "pocketType");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.d dVar2 = this.f122169b.f122173b;
                        List list = (List) dVar2.get("auto_top_up");
                        if (list != null) {
                            List list2 = list;
                            objC = new ArrayList(w.t(list2, 10));
                            for (Object obj4 : list2) {
                                if (((AutoTopUpState) obj4).f60424g == pocketType2) {
                                    obj4 = value;
                                }
                                objC.add(obj4);
                            }
                        } else {
                            objC = u.c(value);
                        }
                        dVar2.f("auto_top_up", objC);
                        break;
                    default:
                        l pocketType3 = (l) obj2;
                        AutoTopUpState autoTopUp2 = (AutoTopUpState) obj3;
                        Intrinsics.checkNotNullParameter(pocketType3, "pocketType");
                        Intrinsics.checkNotNullParameter(autoTopUp2, "autoTopUp");
                        ue0.c cVar = this.f122169b.f122174c;
                        Type AUTO_TOP_UPS_TYPE = d.f;
                        Intrinsics.checkNotNullExpressionValue(AUTO_TOP_UPS_TYPE, "AUTO_TOP_UPS_TYPE");
                        List list3 = (List) cVar.T2("auto_top_up", AUTO_TOP_UPS_TYPE);
                        if (list3 != null) {
                            AutoTopUpDto dto = AutoTopUpDtoMapperKt.toDto(autoTopUp2);
                            List list4 = list3;
                            objC2 = new ArrayList(w.t(list4, 10));
                            for (Object obj5 : list4) {
                                if (autoTopUp2.f60424g == pocketType3) {
                                    obj5 = dto;
                                }
                                objC2.add(obj5);
                            }
                        } else {
                            objC2 = u.c(AutoTopUpDtoMapperKt.toDto(autoTopUp2));
                        }
                        cVar.G(objC2, "auto_top_up", kii.e.o(AutoTopUpDto.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: e31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f122171b;

            {
                this.f122171b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l pocketType = (l) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        List list = (List) this.f122171b.f122173b.get("auto_top_up");
                        Object obj3 = null;
                        if (list == null) {
                            return null;
                        }
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (((AutoTopUpState) next).f60424g == pocketType) {
                                    obj3 = next;
                                }
                            }
                        }
                        return (AutoTopUpState) obj3;
                    default:
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        d dVar = this.f122171b;
                        ue0.c cVar = dVar.f122174c;
                        Type AUTO_TOP_UPS_TYPE = d.f;
                        Intrinsics.checkNotNullExpressionValue(AUTO_TOP_UPS_TYPE, "AUTO_TOP_UPS_TYPE");
                        List list2 = (List) cVar.T2("auto_top_up", AUTO_TOP_UPS_TYPE);
                        Object obj4 = null;
                        if (list2 == null) {
                            return null;
                        }
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(AutoTopUpDtoMapperKt.toDomain((AutoTopUpDto) it9.next(), dVar.d, pocketType.name()));
                        }
                        Iterator it10 = arrayList.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                Object next2 = it10.next();
                                if (((AutoTopUpState) next2).f60424g == pocketType) {
                                    obj4 = next2;
                                }
                            }
                        }
                        return (AutoTopUpState) obj4;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: e31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f122169b;

            {
                this.f122169b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object objC;
                Object objC2;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l pocketType = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        d dVar = this.f122169b;
                        d0<AutoTopUpPerPocketDto> autoTopUp = dVar.f122172a.getAutoTopUp();
                        e0f.k kVar = new e0f.k(new e1.b(dVar, pocketType, 11), 29);
                        autoTopUp.getClass();
                        ufm.i iVar = new ufm.i(autoTopUp, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        l pocketType2 = (l) obj2;
                        AutoTopUpState value = (AutoTopUpState) obj3;
                        Intrinsics.checkNotNullParameter(pocketType2, "pocketType");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.d dVar2 = this.f122169b.f122173b;
                        List list = (List) dVar2.get("auto_top_up");
                        if (list != null) {
                            List list2 = list;
                            objC = new ArrayList(w.t(list2, 10));
                            for (Object obj4 : list2) {
                                if (((AutoTopUpState) obj4).f60424g == pocketType2) {
                                    obj4 = value;
                                }
                                objC.add(obj4);
                            }
                        } else {
                            objC = u.c(value);
                        }
                        dVar2.f("auto_top_up", objC);
                        break;
                    default:
                        l pocketType3 = (l) obj2;
                        AutoTopUpState autoTopUp2 = (AutoTopUpState) obj3;
                        Intrinsics.checkNotNullParameter(pocketType3, "pocketType");
                        Intrinsics.checkNotNullParameter(autoTopUp2, "autoTopUp");
                        ue0.c cVar = this.f122169b.f122174c;
                        Type AUTO_TOP_UPS_TYPE = d.f;
                        Intrinsics.checkNotNullExpressionValue(AUTO_TOP_UPS_TYPE, "AUTO_TOP_UPS_TYPE");
                        List list3 = (List) cVar.T2("auto_top_up", AUTO_TOP_UPS_TYPE);
                        if (list3 != null) {
                            AutoTopUpDto dto = AutoTopUpDtoMapperKt.toDto(autoTopUp2);
                            List list4 = list3;
                            objC2 = new ArrayList(w.t(list4, 10));
                            for (Object obj5 : list4) {
                                if (autoTopUp2.f60424g == pocketType3) {
                                    obj5 = dto;
                                }
                                objC2.add(obj5);
                            }
                        } else {
                            objC2 = u.c(AutoTopUpDtoMapperKt.toDto(autoTopUp2));
                        }
                        cVar.G(objC2, "auto_top_up", kii.e.o(AutoTopUpDto.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: e31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f122171b;

            {
                this.f122171b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l pocketType = (l) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        List list = (List) this.f122171b.f122173b.get("auto_top_up");
                        Object obj3 = null;
                        if (list == null) {
                            return null;
                        }
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (((AutoTopUpState) next).f60424g == pocketType) {
                                    obj3 = next;
                                }
                            }
                        }
                        return (AutoTopUpState) obj3;
                    default:
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        d dVar = this.f122171b;
                        ue0.c cVar = dVar.f122174c;
                        Type AUTO_TOP_UPS_TYPE = d.f;
                        Intrinsics.checkNotNullExpressionValue(AUTO_TOP_UPS_TYPE, "AUTO_TOP_UPS_TYPE");
                        List list2 = (List) cVar.T2("auto_top_up", AUTO_TOP_UPS_TYPE);
                        Object obj4 = null;
                        if (list2 == null) {
                            return null;
                        }
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(AutoTopUpDtoMapperKt.toDomain((AutoTopUpDto) it9.next(), dVar.d, pocketType.name()));
                        }
                        Iterator it10 = arrayList.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                Object next2 = it10.next();
                                if (((AutoTopUpState) next2).f60424g == pocketType) {
                                    obj4 = next2;
                                }
                            }
                        }
                        return (AutoTopUpState) obj4;
                }
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: e31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f122169b;

            {
                this.f122169b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object objC;
                Object objC2;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l pocketType = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                        d dVar = this.f122169b;
                        d0<AutoTopUpPerPocketDto> autoTopUp = dVar.f122172a.getAutoTopUp();
                        e0f.k kVar = new e0f.k(new e1.b(dVar, pocketType, 11), 29);
                        autoTopUp.getClass();
                        ufm.i iVar = new ufm.i(autoTopUp, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        l pocketType2 = (l) obj2;
                        AutoTopUpState value = (AutoTopUpState) obj3;
                        Intrinsics.checkNotNullParameter(pocketType2, "pocketType");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.d dVar2 = this.f122169b.f122173b;
                        List list = (List) dVar2.get("auto_top_up");
                        if (list != null) {
                            List list2 = list;
                            objC = new ArrayList(w.t(list2, 10));
                            for (Object obj4 : list2) {
                                if (((AutoTopUpState) obj4).f60424g == pocketType2) {
                                    obj4 = value;
                                }
                                objC.add(obj4);
                            }
                        } else {
                            objC = u.c(value);
                        }
                        dVar2.f("auto_top_up", objC);
                        break;
                    default:
                        l pocketType3 = (l) obj2;
                        AutoTopUpState autoTopUp2 = (AutoTopUpState) obj3;
                        Intrinsics.checkNotNullParameter(pocketType3, "pocketType");
                        Intrinsics.checkNotNullParameter(autoTopUp2, "autoTopUp");
                        ue0.c cVar = this.f122169b.f122174c;
                        Type AUTO_TOP_UPS_TYPE = d.f;
                        Intrinsics.checkNotNullExpressionValue(AUTO_TOP_UPS_TYPE, "AUTO_TOP_UPS_TYPE");
                        List list3 = (List) cVar.T2("auto_top_up", AUTO_TOP_UPS_TYPE);
                        if (list3 != null) {
                            AutoTopUpDto dto = AutoTopUpDtoMapperKt.toDto(autoTopUp2);
                            List list4 = list3;
                            objC2 = new ArrayList(w.t(list4, 10));
                            for (Object obj5 : list4) {
                                if (autoTopUp2.f60424g == pocketType3) {
                                    obj5 = dto;
                                }
                                objC2.add(obj5);
                            }
                        } else {
                            objC2 = u.c(AutoTopUpDtoMapperKt.toDto(autoTopUp2));
                        }
                        cVar.G(objC2, "auto_top_up", kii.e.o(AutoTopUpDto.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
