package vsj;

import androidx.room.util.DBUtil;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.retail.feature.impl.custom_assets.network.CustomAssetsApiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import pqg.v;
import uyd.e0;
import wim.z;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f291836h;
    public static final Set i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psj.a f291837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final psj.b f291838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomAssetsApiService f291839c;
    public final ne0.d d;
    public final ue0.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f291840g;

    static {
        String[] elements = {"US", "GB", "MM", "LR"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f291836h = kotlin.collections.d.y0(elements);
        String[] elements2 = {"US", "GB", "CA", "IN", "SG", "HK", "MY", "PK", "MM", "LR"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        i = kotlin.collections.d.y0(elements2);
    }

    public q(psj.a customAssetsDao, psj.b fieldDefinitionsDao, CustomAssetsApiService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(customAssetsDao, "customAssetsDao");
        Intrinsics.checkNotNullParameter(fieldDefinitionsDao, "fieldDefinitionsDao");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f291837a = customAssetsDao;
        this.f291838b = fieldDefinitionsDao;
        this.f291839c = service;
        this.d = memoryCache;
        this.e = storage;
        final int i2 = 0;
        Continuation continuation = null;
        int i3 = 3;
        this.f = new x4l.c(new g(this, continuation, i2), new Function1(this) { // from class: vsj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f291818b;

            {
                this.f291818b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f291818b.d.get("custom_assets_cache");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (CustomAssetFieldDefinitions) this.f291818b.d.get("custom_assets_field_definitions");
                }
            }
        }, new Function2(this) { // from class: vsj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f291820b;

            {
                this.f291820b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        List assets = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(assets, "assets");
                        this.f291820b.d.f("custom_assets_cache", assets);
                        break;
                    default:
                        CustomAssetFieldDefinitions definitions = (CustomAssetFieldDefinitions) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(definitions, "definitions");
                        this.f291820b.d.f("custom_assets_field_definitions", definitions);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, continuation, i2), new e0(i3, 3, continuation));
        final int i5 = 1;
        this.f291840g = new x4l.c(new g(this, continuation, i5), new Function1(this) { // from class: vsj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f291818b;

            {
                this.f291818b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f291818b.d.get("custom_assets_cache");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (CustomAssetFieldDefinitions) this.f291818b.d.get("custom_assets_field_definitions");
                }
            }
        }, new Function2(this) { // from class: vsj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f291820b;

            {
                this.f291820b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i5) {
                    case 0:
                        List assets = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(assets, "assets");
                        this.f291820b.d.f("custom_assets_cache", assets);
                        break;
                    default:
                        CustomAssetFieldDefinitions definitions = (CustomAssetFieldDefinitions) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(definitions, "definitions");
                        this.f291820b.d.f("custom_assets_field_definitions", definitions);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, continuation, i5), new e0(i3, 4, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(vsj.q r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.a(vsj.q, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(vsj.q r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.b(vsj.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r6.f.d(r12, false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dj0.d r12, gim.c r13, java.lang.String r14) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof vsj.e
            if (r0 == 0) goto L13
            r0 = r13
            vsj.e r0 = (vsj.e) r0
            int r1 = r0.f291821w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291821w = r1
            goto L18
        L13:
            vsj.e r0 = new vsj.e
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291821w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            r6 = r11
            goto L74
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r13)
            r6 = r11
            goto L66
        L38:
            yhm.o.b(r13)
            usj.c r8 = new usj.c
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            usj.x r13 = new usj.x
            long r5 = r12.f115082a
            xi0.b r12 = r12.f115083b
            java.lang.String r12 = r12.f306286a
            r13.<init>(r5, r12)
            r8.<init>(r13)
            vq5.w r5 = new vq5.w
            r10 = 4
            r9 = 0
            r6 = r11
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            r0.f291821w = r4
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L66
            goto L73
        L66:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            r0.f291821w = r3
            r13 = 0
            x4l.c r14 = r6.f
            java.lang.Object r12 = r14.d(r12, r13, r0)
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.c(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        this.d.clear();
        DBUtil.performBlocking(this.f291837a.f239489a, false, true, new v(26));
        DBUtil.performBlocking(this.f291838b.f239492a, false, true, new v(27));
        this.e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(vzi.a r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof vsj.f
            if (r0 == 0) goto L13
            r0 = r14
            vsj.f r0 = (vsj.f) r0
            int r1 = r0.f291822w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291822w = r1
            goto L18
        L13:
            vsj.f r0 = new vsj.f
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291822w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r14)
            r6 = r11
            goto L51
        L37:
            yhm.o.b(r14)
            vq5.w r5 = new vq5.w
            r10 = 5
            r9 = 0
            r6 = r11
            r8 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            r0.f291822w = r4
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)
            if (r14 != r1) goto L51
            goto L5d
        L51:
            usj.i r14 = (usj.i) r14
            java.lang.String r12 = r14.f282951a
            r0.f291822w = r3
            java.lang.Object r12 = r11.h(r12, r0)
            if (r12 != r1) goto L5e
        L5d:
            return r1
        L5e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.d(vzi.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6.f.d(r7, false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vsj.i
            if (r0 == 0) goto L13
            r0 = r8
            vsj.i r0 = (vsj.i) r0
            int r1 = r0.f291824w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291824w = r1
            goto L18
        L13:
            vsj.i r0 = new vsj.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291824w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L5a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L4d
        L37:
            yhm.o.b(r8)
            vsj.j r8 = new vsj.j
            r2 = 0
            r8.<init>(r6, r7, r2, r3)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            r0.f291824w = r5
            java.lang.Object r7 = skm.e0.J(r7, r8, r0)
            if (r7 != r1) goto L4d
            goto L59
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            r0.f291824w = r4
            x4l.c r8 = r6.f
            java.lang.Object r7 = r8.d(r7, r3, r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.e(java.lang.String, gim.c):java.lang.Object");
    }

    public final CustomAssetFieldDefinitions g() {
        Set setI1;
        Set setI12;
        vzi.b bVar;
        Iterator it8;
        vzi.f fVar;
        vzi.e eVar;
        vzi.i iVar;
        psj.b bVar2 = this.f291838b;
        int i2 = 0;
        List list = (List) DBUtil.performBlocking(bVar2.f239492a, true, false, new pp5.d(bVar2, 24));
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((rsj.b) obj2).f257092a;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj2);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it9 = linkedHashMap.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry = (Map.Entry) it9.next();
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            vzi.b[] bVarArrValues = vzi.b.values();
            int length = bVarArrValues.length;
            int i3 = i2;
            while (true) {
                if (i3 >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i3];
                if (a0.z(bVar.name(), str2, true)) {
                    break;
                }
                i3++;
            }
            if (bVar == null) {
                bVar = vzi.b.UNKNOWN;
            }
            List<rsj.b> list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (rsj.b bVar3 : list3) {
                List<String> list4 = bVar3.f257096h;
                ArrayList arrayList3 = new ArrayList();
                for (String str3 : list4) {
                    vzi.i[] iVarArrValues = vzi.i.values();
                    int length2 = iVarArrValues.length;
                    while (true) {
                        if (i2 >= length2) {
                            iVar = null;
                            break;
                        }
                        vzi.i iVar2 = iVarArrValues[i2];
                        if (a0.z(iVar2.name(), str3, true)) {
                            iVar = iVar2;
                            break;
                        }
                        i2++;
                    }
                    if (iVar != null) {
                        arrayList3.add(iVar);
                    }
                    i2 = 0;
                }
                String str4 = bVar3.f257093b;
                String str5 = bVar3.f257094c;
                vzi.f[] fVarArrValues = vzi.f.values();
                int length3 = fVarArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        it8 = it9;
                        fVar = null;
                        break;
                    }
                    fVar = fVarArrValues[i5];
                    it8 = it9;
                    if (a0.z(fVar.name(), str5, true)) {
                        break;
                    }
                    i5++;
                    it9 = it8;
                }
                if (fVar == null) {
                    fVar = vzi.f.UNKNOWN;
                }
                vzi.f fVar2 = fVar;
                String str6 = bVar3.d;
                vzi.e[] eVarArrValues = vzi.e.values();
                int length4 = eVarArrValues.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length4) {
                        eVar = null;
                        break;
                    }
                    eVar = eVarArrValues[i6];
                    if (a0.z(eVar.name(), str6, true)) {
                        break;
                    }
                    i6++;
                }
                if (eVar == null) {
                    eVar = vzi.e.UNKNOWN;
                }
                vzi.e eVar2 = eVar;
                boolean zIsEmpty = arrayList3.isEmpty();
                List listK = arrayList3;
                if (zIsEmpty) {
                    listK = (bVar3.f257096h.isEmpty() && bVar3.e) ? zhm.v.k(vzi.i.USER, vzi.i.SMART_ESTIMATION) : f0.f322471a;
                }
                arrayList2.add(new CustomAssetFieldDefinition(str4, fVar2, eVar2, listK, bVar3.f, bVar3.f257095g));
                it9 = it8;
                i2 = 0;
            }
            Iterator it10 = it9;
            rsj.b bVar4 = (rsj.b) d0.d0(list2);
            arrayList.add(new CustomAssetCategoryDefinition(bVar, arrayList2, bVar4 != null ? bVar4.i : false));
            it9 = it10;
            i2 = 0;
        }
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        ue0.c cVar = this.e;
        List list5 = (List) p.a.j(String.class, companion, List.class, cVar, "custom_assets_field_definitions_mile_countries");
        List list6 = (List) cVar.T2("custom_assets_field_definitions_square_foot_countries", z.d(o0.c(List.class, KTypeProjection.Companion.a(o0.b(String.class)))));
        if (list5 == null || (setI1 = d0.i1(list5)) == null) {
            setI1 = f291836h;
        }
        if (list6 == null || (setI12 = d0.i1(list6)) == null) {
            setI12 = i;
        }
        return new CustomAssetFieldDefinitions(arrayList, setI1, setI12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vsj.m
            if (r0 == 0) goto L13
            r0 = r8
            vsj.m r0 = (vsj.m) r0
            int r1 = r0.f291830x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291830x = r1
            goto L18
        L13:
            vsj.m r0 = new vsj.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291830x
            x4l.c r3 = r6.f
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L4c
        L3c:
            yhm.o.b(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r0.u = r7
            r0.f291830x = r5
            java.lang.Object r8 = r3.d(r8, r5, r0)
            if (r8 != r1) goto L4c
            goto L70
        L4c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            w4l.h r2 = w4l.h.f294642c
            vkm.d r8 = r3.b(r8, r2)
            vo8.t r2 = new vo8.t
            r3 = 21
            r2.<init>(r3)
            r3 = 0
            jhi.b r8 = mo3.a.g(r8, r3, r2, r5)
            kk8.n r2 = new kk8.n
            r5 = 2
            r2.<init>(r5, r7, r3)
            r0.u = r7
            r0.f291830x = r4
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r1 = (com.revolut.retail.feature.api.custom_assets.models.CustomAsset) r1
            java.lang.String r1 = r1.f99216a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L77
            return r0
        L8d:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r8 = "Collection contains no element matching the predicate."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.h(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5.f.d(r6, false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vsj.n
            if (r0 == 0) goto L13
            r0 = r7
            vsj.n r0 = (vsj.n) r0
            int r1 = r0.f291831w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291831w = r1
            goto L18
        L13:
            vsj.n r0 = new vsj.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291831w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L4c
        L36:
            yhm.o.b(r7)
            vsj.j r7 = new vsj.j
            r2 = 0
            r7.<init>(r5, r6, r2, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.f291831w = r4
            java.lang.Object r6 = skm.e0.J(r6, r7, r0)
            if (r6 != r1) goto L4c
            goto L59
        L4c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            r0.f291831w = r3
            r7 = 0
            x4l.c r2 = r5.f
            java.lang.Object r6 = r2.d(r6, r7, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.i(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r12, vzi.g r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof vsj.o
            if (r0 == 0) goto L13
            r0 = r14
            vsj.o r0 = (vsj.o) r0
            int r1 = r0.f291834y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291834y = r1
            goto L18
        L13:
            vsj.o r0 = new vsj.o
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f291832w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291834y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            usj.b0 r12 = r0.v
            yhm.o.b(r14)
            r6 = r11
            goto L74
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            usj.b0 r12 = r0.v
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            java.lang.String r12 = r0.u
            yhm.o.b(r14)     // Catch: retrofit2.HttpException -> L41
            r6 = r11
            goto L63
        L41:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L8c
        L45:
            yhm.o.b(r14)
            vq5.w r5 = new vq5.w     // Catch: retrofit2.HttpException -> L89
            r10 = 6
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: retrofit2.HttpException -> L86
            skm.p0 r12 = skm.p0.f264001a     // Catch: retrofit2.HttpException -> L86
            elm.f r12 = elm.f.f127540b     // Catch: retrofit2.HttpException -> L86
            r0.u = r7     // Catch: retrofit2.HttpException -> L86
            r0.v = r9     // Catch: retrofit2.HttpException -> L86
            r0.f291834y = r4     // Catch: retrofit2.HttpException -> L86
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)     // Catch: retrofit2.HttpException -> L86
            if (r14 != r1) goto L62
            goto L72
        L62:
            r12 = r7
        L63:
            r13 = r14
            usj.b0 r13 = (usj.b0) r13     // Catch: retrofit2.HttpException -> L86
            r0.u = r9
            r0.v = r13
            r0.f291834y = r3
            java.lang.Object r14 = r11.h(r12, r0)
            if (r14 != r1) goto L73
        L72:
            return r1
        L73:
            r12 = r13
        L74:
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r14 = (com.revolut.retail.feature.api.custom_assets.models.CustomAsset) r14
            java.lang.Boolean r12 = r12.f282936a
            if (r12 == 0) goto L7f
            boolean r12 = r12.booleanValue()
            goto L80
        L7f:
            r12 = 0
        L80:
            vzi.h r13 = new vzi.h
            r13.<init>(r14, r12)
            return r13
        L86:
            r0 = move-exception
        L87:
            r12 = r0
            goto L8c
        L89:
            r0 = move-exception
            r6 = r11
            goto L87
        L8c:
            com.revolut.core.error.data.model.ServerErrorException r12 = com.revolut.core.error.data.model.a.a(r12)
            com.revolut.core.error.data.model.ServerError r13 = r12.f
            int r13 = r13.f51362a
            r14 = 91002(0x1637a, float:1.27521E-40)
            if (r13 == r14) goto L9e
            r14 = 91003(0x1637b, float:1.27522E-40)
            if (r13 != r14) goto La4
        L9e:
            com.revolut.retail.feature.api.custom_assets.models.InvalidCustomAssetAttributesException r13 = new com.revolut.retail.feature.api.custom_assets.models.InvalidCustomAssetAttributesException
            r13.<init>(r12)
            r12 = r13
        La4:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.j(java.lang.String, vzi.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r6.f.d(r12, false, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r12, java.time.LocalDate r13, dj0.d r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof vsj.p
            if (r0 == 0) goto L13
            r0 = r15
            vsj.p r0 = (vsj.p) r0
            int r1 = r0.f291835w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291835w = r1
            goto L18
        L13:
            vsj.p r0 = new vsj.p
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291835w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r15)
            r6 = r11
            goto L78
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r15)
            r6 = r11
            goto L6a
        L38:
            yhm.o.b(r15)
            usj.e0 r8 = new usj.e0
            r9 = 0
            if (r14 == 0) goto L51
            java.lang.String r15 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            usj.x r15 = new usj.x
            long r5 = r14.f115082a
            xi0.b r14 = r14.f115083b
            java.lang.String r14 = r14.f306286a
            r15.<init>(r5, r14)
            goto L52
        L51:
            r15 = r9
        L52:
            r8.<init>(r13, r15)
            vq5.w r5 = new vq5.w
            r10 = 7
            r6 = r11
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            r0.f291835w = r4
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L6a
            goto L77
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            r0.f291835w = r3
            r13 = 0
            x4l.c r14 = r6.f
            java.lang.Object r12 = r14.d(r12, r13, r0)
            if (r12 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vsj.q.k(java.lang.String, java.time.LocalDate, dj0.d, gim.c):java.lang.Object");
    }
}
