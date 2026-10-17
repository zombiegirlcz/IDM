package km2;

import com.revolut.feature.backgroundpicker.impl.network.BackgroundPickerService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundPickerService f185693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.a f185694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f185695c;
    public final ne0.j d;
    public final ue0.c e;
    public final kg.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f185696g;

    public i(BackgroundPickerService backgroundPickerService, ij0.a networkConfiguration, u defaultBackgroundCatalogue, ne0.j memoryCache, ue0.c storage, kg.o gson) {
        Intrinsics.checkNotNullParameter(backgroundPickerService, "backgroundPickerService");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(defaultBackgroundCatalogue, "defaultBackgroundCatalogue");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(gson, "gson");
        fn2.a backgroundIdHelper = fn2.a.f136512a;
        Intrinsics.checkNotNullParameter(backgroundIdHelper, "backgroundIdHelper");
        this.f185693a = backgroundPickerService;
        this.f185694b = networkConfiguration;
        this.f185695c = defaultBackgroundCatalogue;
        this.d = memoryCache;
        this.e = storage;
        this.f = gson;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: km2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f185685b;

            {
                this.f185685b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    case 1:
                        List map = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(map, "map");
                        this.f185685b.d.f("UPLOADED_BACKGROUNDS_MEMORY_KEY", map);
                        break;
                    default:
                        List map2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(map2, "map");
                        this.f185685b.e.G(map2, "UPLOADED_BACKGROUNDS_STORAGE_KEY", kii.e.o(dn2.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        a aVar = new a(this, i2);
        Function2 function22 = new Function2(this) { // from class: km2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f185685b;

            {
                this.f185685b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    case 1:
                        List map = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(map, "map");
                        this.f185685b.d.f("UPLOADED_BACKGROUNDS_MEMORY_KEY", map);
                        break;
                    default:
                        List map2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(map2, "map");
                        this.f185685b.e.G(map2, "UPLOADED_BACKGROUNDS_STORAGE_KEY", kii.e.o(dn2.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.f185696g = new w4l.f(function2, aVar, function22, new a(this, i3), new Function2(this) { // from class: km2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f185685b;

            {
                this.f185685b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    case 1:
                        List map = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(map, "map");
                        this.f185685b.d.f("UPLOADED_BACKGROUNDS_MEMORY_KEY", map);
                        break;
                    default:
                        List map2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(map2, "map");
                        this.f185685b.e.G(map2, "UPLOADED_BACKGROUNDS_STORAGE_KEY", kii.e.o(dn2.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof km2.f
            if (r0 == 0) goto L13
            r0 = r7
            km2.f r0 = (km2.f) r0
            int r1 = r0.f185688x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f185688x = r1
            goto L18
        L13:
            km2.f r0 = new km2.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f185688x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            boolean r7 = fn2.a.e(r6)
            if (r7 == 0) goto L93
            java.lang.String r6 = fn2.a.c(r6)
            kb7.c r7 = new kb7.c
            r2 = 21
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r6
            r0.f185688x = r3
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            ne0.j r0 = r5.d
            java.lang.String r1 = "UPLOADED_BACKGROUNDS_MEMORY_KEY"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L89
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r0.next()
            r3 = r2
            dn2.a r3 = (dn2.a) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 != 0) goto L6e
            r1.add(r2)
            goto L6e
        L89:
            zhm.f0 r1 = zhm.f0.f322471a
        L8b:
            w4l.f r6 = r5.f185696g
            r6.j(r7, r1)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L93:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Only deletion of uploaded backgrounds is supported"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: km2.i.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final em2.e b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return fn2.a.d(id10, this.f185694b.getBaseUrl(), this.f185695c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof km2.g
            if (r0 == 0) goto L13
            r0 = r7
            km2.g r0 = (km2.g) r0
            int r1 = r0.f185690x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f185690x = r1
            goto L18
        L13:
            km2.g r0 = new km2.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f185690x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            km2.h r7 = new km2.h
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.u = r5
            r0.f185690x = r3
            java.lang.Object r6 = skm.e0.J(r6, r7, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = fn2.a.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: km2.i.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
