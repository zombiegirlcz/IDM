package zuh;

import ald.p;
import ald.q;
import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y5b.b0;
import ya6.y;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f325480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f325481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkflowService f325482c;
    public final avh.e d;
    public final cvh.b e;
    public final zjh.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f325483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f325484h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f325485j;

    public o(ue0.c storage, ne0.j memoryCache, WorkflowService workflowService, avh.e workflowMapper, cvh.b eligibilityMapper, zjh.c productClosureMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(workflowService, "workflowService");
        Intrinsics.checkNotNullParameter(workflowMapper, "workflowMapper");
        Intrinsics.checkNotNullParameter(eligibilityMapper, "eligibilityMapper");
        Intrinsics.checkNotNullParameter(productClosureMapper, "productClosureMapper");
        this.f325480a = storage;
        this.f325481b = memoryCache;
        this.f325482c = workflowService;
        this.d = workflowMapper;
        this.e = eligibilityMapper;
        this.f = productClosureMapper;
        Continuation continuation = null;
        final int i = 0;
        final int i2 = 0;
        this.f325483g = new x4l.c(new ald.n(this, continuation, 8), new Function1(this) { // from class: zuh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f325466b;

            {
                this.f325466b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f325466b.f325481b.get(o.c(params));
                    case 1:
                        pil.d params2 = (pil.d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f325466b.f325481b.get(o.b(params2));
                    default:
                        pil.a params3 = (pil.a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (ApplicableDocuments) this.f325466b.f325481b.get(o.a(params3));
                }
            }
        }, new Function2(this) { // from class: zuh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f325468b;

            {
                this.f325468b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        g params = (g) obj2;
                        List workflowInfos = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(workflowInfos, "workflowInfos");
                        this.f325468b.f325481b.f(o.c(params), workflowInfos);
                        break;
                    case 1:
                        pil.d params2 = (pil.d) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f325468b.f325481b.f(o.b(params2), suggestions);
                        break;
                    default:
                        pil.a params3 = (pil.a) obj2;
                        ApplicableDocuments documentGroups = (ApplicableDocuments) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
                        this.f325468b.f325481b.f(o.a(params3), documentGroups);
                        break;
                }
                return Unit.f186387a;
            }
        }, new zga.l(2), new y(8));
        int i3 = 22;
        this.f325484h = new x4l.c(new z6e.g(this, continuation, i3), new zr2.o(i3), new zs4.d(4), new zga.l(1), new y(7));
        final int i5 = 1;
        final int i6 = 1;
        this.i = new x4l.c(new ald.n(this, continuation, 9), new Function1(this) { // from class: zuh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f325466b;

            {
                this.f325466b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f325466b.f325481b.get(o.c(params));
                    case 1:
                        pil.d params2 = (pil.d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f325466b.f325481b.get(o.b(params2));
                    default:
                        pil.a params3 = (pil.a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (ApplicableDocuments) this.f325466b.f325481b.get(o.a(params3));
                }
            }
        }, new Function2(this) { // from class: zuh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f325468b;

            {
                this.f325468b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        g params = (g) obj2;
                        List workflowInfos = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(workflowInfos, "workflowInfos");
                        this.f325468b.f325481b.f(o.c(params), workflowInfos);
                        break;
                    case 1:
                        pil.d params2 = (pil.d) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f325468b.f325481b.f(o.b(params2), suggestions);
                        break;
                    default:
                        pil.a params3 = (pil.a) obj2;
                        ApplicableDocuments documentGroups = (ApplicableDocuments) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
                        this.f325468b.f325481b.f(o.a(params3), documentGroups);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(this, continuation, 16), new q(this, continuation, 7));
        final int i21 = 2;
        this.f325485j = new x4l.c(new b0(this, continuation, 15), new Function1(this) { // from class: zuh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f325466b;

            {
                this.f325466b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f325466b.f325481b.get(o.c(params));
                    case 1:
                        pil.d params2 = (pil.d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f325466b.f325481b.get(o.b(params2));
                    default:
                        pil.a params3 = (pil.a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (ApplicableDocuments) this.f325466b.f325481b.get(o.a(params3));
                }
            }
        }, new Function2(this) { // from class: zuh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f325468b;

            {
                this.f325468b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        g params = (g) obj2;
                        List workflowInfos = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(workflowInfos, "workflowInfos");
                        this.f325468b.f325481b.f(o.c(params), workflowInfos);
                        break;
                    case 1:
                        pil.d params2 = (pil.d) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f325468b.f325481b.f(o.b(params2), suggestions);
                        break;
                    default:
                        pil.a params3 = (pil.a) obj2;
                        ApplicableDocuments documentGroups = (ApplicableDocuments) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
                        this.f325468b.f325481b.f(o.a(params3), documentGroups);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, continuation, 0), new y69.e(this, continuation, 10), new h(this, continuation, 1));
    }

    public static String a(pil.a aVar) {
        String[] elements = {"APPLICABLE_DOCUMENTS_MEMORY_CACHE_KEY_V2", aVar.a().f297794a, aVar.b()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }

    public static String b(pil.d dVar) {
        Object[] elements = {"SUGGESTIONS_KEY", dVar.a(), "EMPLOYER", dVar.b(), null, null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }

    public static String c(g gVar) {
        if (gVar instanceof e) {
            return ((e) gVar).a().getF105667a();
        }
        if (gVar instanceof f) {
            return d0.k0(d0.P0(((f) gVar).a().entrySet(), new l()), "&", null, null, 0, new zr2.o(21), 30);
        }
        throw new NoWhenBranchMatchedException();
    }
}
