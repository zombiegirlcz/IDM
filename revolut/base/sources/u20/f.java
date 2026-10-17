package u20;

import com.revolut.chat.data.network.InAppCallSupportApi;
import com.revolut.chat.data.network.TicketsInfoApi;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tyg.g;
import ufm.i;
import y10.h;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsInfoApi f276519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InAppCallSupportApi f276520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f276521c;
    public final ue0.c d;
    public final w4l.f e;

    public f(TicketsInfoApi ticketsInfoApi, InAppCallSupportApi inAppCallSupportApi, j memoryCache, ue0.c storage, h mapper) {
        Intrinsics.checkNotNullParameter(ticketsInfoApi, "ticketsInfoApi");
        Intrinsics.checkNotNullParameter(inAppCallSupportApi, "inAppCallSupportApi");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f276519a = ticketsInfoApi;
        this.f276520b = inAppCallSupportApi;
        this.f276521c = memoryCache;
        this.d = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: u20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f276513b;

            {
                this.f276513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        f fVar = this.f276513b;
                        d0<f20.d> categories = fVar.f276520b.getCategories("InAppCalls");
                        ty1.c cVar = new ty1.c(new g(fVar, 28), 29);
                        categories.getClass();
                        i iVar = new i(categories, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List categories2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories2, "categories");
                        this.f276513b.f276521c.f("key_cache_call_categories", categories2);
                        break;
                    default:
                        List categories3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories3, "categories");
                        ue0.c cVar2 = this.f276513b.d;
                        List<w30.f> list = categories3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (w30.f category : list) {
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new f20.e(category.f294081a, category.f294082b, category.f294083c));
                        }
                        cVar2.G(arrayList, "key_cache_call_categories", kii.e.o(f20.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: u20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f276515b;

            {
                this.f276515b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (List) this.f276515b.f276521c.get("key_cache_call_categories");
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        List list = (List) p.a.j(f20.e.class, KTypeProjection.INSTANCE, List.class, this.f276515b.d, "key_cache_call_categories");
                        if (list == null) {
                            return null;
                        }
                        List<f20.e> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (f20.e dto : list2) {
                            Intrinsics.checkNotNullParameter(dto, "dto");
                            arrayList.add(new w30.f(dto.getKey(), dto.getText(), dto.getIconName()));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: u20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f276513b;

            {
                this.f276513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        f fVar = this.f276513b;
                        d0<f20.d> categories = fVar.f276520b.getCategories("InAppCalls");
                        ty1.c cVar = new ty1.c(new g(fVar, 28), 29);
                        categories.getClass();
                        i iVar = new i(categories, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List categories2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories2, "categories");
                        this.f276513b.f276521c.f("key_cache_call_categories", categories2);
                        break;
                    default:
                        List categories3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories3, "categories");
                        ue0.c cVar2 = this.f276513b.d;
                        List<w30.f> list = categories3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (w30.f category : list) {
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new f20.e(category.f294081a, category.f294082b, category.f294083c));
                        }
                        cVar2.G(arrayList, "key_cache_call_categories", kii.e.o(f20.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: u20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f276515b;

            {
                this.f276515b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (List) this.f276515b.f276521c.get("key_cache_call_categories");
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        List list = (List) p.a.j(f20.e.class, KTypeProjection.INSTANCE, List.class, this.f276515b.d, "key_cache_call_categories");
                        if (list == null) {
                            return null;
                        }
                        List<f20.e> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (f20.e dto : list2) {
                            Intrinsics.checkNotNullParameter(dto, "dto");
                            arrayList.add(new w30.f(dto.getKey(), dto.getText(), dto.getIconName()));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: u20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f276513b;

            {
                this.f276513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        f fVar = this.f276513b;
                        d0<f20.d> categories = fVar.f276520b.getCategories("InAppCalls");
                        ty1.c cVar = new ty1.c(new g(fVar, 28), 29);
                        categories.getClass();
                        i iVar = new i(categories, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List categories2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories2, "categories");
                        this.f276513b.f276521c.f("key_cache_call_categories", categories2);
                        break;
                    default:
                        List categories3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(categories3, "categories");
                        ue0.c cVar2 = this.f276513b.d;
                        List<w30.f> list = categories3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (w30.f category : list) {
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new f20.e(category.f294081a, category.f294082b, category.f294083c));
                        }
                        cVar2.G(arrayList, "key_cache_call_categories", kii.e.o(f20.e.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.UUID r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u20.e
            if (r0 == 0) goto L13
            r0 = r7
            u20.e r0 = (u20.e) r0
            int r1 = r0.f276518w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276518w = r1
            goto L18
        L13:
            u20.e r0 = new u20.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276518w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L45
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            u20.d r7 = new u20.d
            r7.<init>(r5, r6, r4, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.f276518w = r3
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            f20.f r7 = (f20.f) r7
            boolean r6 = r7.getAvailable()
            if (r6 == 0) goto L4e
            goto L54
        L4e:
            f20.k r6 = r7.getUnavailabilityReason()
            if (r6 != 0) goto L57
        L54:
            w30.r$a r6 = w30.r.a.f294120a
            return r6
        L57:
            w30.s r7 = new w30.s
            boolean r0 = r6 instanceof f20.k.a
            if (r0 == 0) goto L91
            f20.k$a r6 = (f20.k.a) r6
            f20.k$a$a r6 = r6.getPresenceState()
            if (r6 == 0) goto L8b
            java.lang.String r0 = r6.getValue()
            if (r0 == 0) goto L8b
            v30.d r1 = v30.e.Companion
            r1.getClass()
            java.lang.String r1 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Map r1 = v30.e.a()
            java.lang.Object r0 = r1.get(r0)
            v30.e r0 = (v30.e) r0
            if (r0 != 0) goto L82
            goto L8b
        L82:
            com.revolut.chat.domain.model.AgentPresenceState r4 = new com.revolut.chat.domain.model.AgentPresenceState
            org.joda.time.Instant r6 = r6.getAvailableAt()
            r4.<init>(r0, r6)
        L8b:
            w30.z r6 = new w30.z
            r6.<init>(r4)
            goto La8
        L91:
            boolean r0 = r6 instanceof f20.k.c
            if (r0 == 0) goto La2
            w30.a0 r0 = new w30.a0
            f20.k$c r6 = (f20.k.c) r6
            java.lang.String r6 = r6.getMessage()
            r0.<init>(r6)
            r6 = r0
            goto La8
        La2:
            boolean r6 = r6 instanceof f20.k.d
            if (r6 == 0) goto Lac
            w30.b0$a r6 = w30.b0.a.f294079a
        La8:
            r7.<init>(r6)
            return r7
        Lac:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u20.f.a(java.util.UUID, gim.c):java.lang.Object");
    }
}
