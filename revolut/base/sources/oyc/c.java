package oyc;

import com.revolut.feature.selfserve.sot.impl.services.SotService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kyc.q;
import kyc.r;
import kyc.t;
import nd.k;
import ne0.j;
import w4l.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SotService f230938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f230939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final myc.a f230940c;
    public final k d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f230941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f230942h;

    public c(SotService sotService, j memoryCache, myc.a sotMapper, k documentUploader) {
        Intrinsics.checkNotNullParameter(sotService, "sotService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(sotMapper, "sotMapper");
        Intrinsics.checkNotNullParameter(documentUploader, "documentUploader");
        this.f230938a = sotService;
        this.f230939b = memoryCache;
        this.f230940c = sotMapper;
        this.d = documentUploader;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        };
        final int i2 = 2;
        this.e = new f(function2, new a(this, i2), new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        };
        a aVar = new a(this, i3);
        final int i5 = 4;
        this.f = new f(function22, aVar, new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 5;
        final int i21 = 6;
        this.f230941g = new f(new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        }, new a(this, 4), new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 7;
        Function2 function23 = new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        };
        final int i32 = 1;
        this.f230942h = new f(function23, new a(this, i32), new Function2(this) { // from class: oyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f230937b;

            {
                this.f230937b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f230937b.f230938a.getSubmissionsConfig();
                    case 1:
                        q config = (q) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_FLOW_STATES_KEY", config);
                        return Unit.f186387a;
                    case 2:
                        t config2 = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config2);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f230937b.f230938a.getSubmissionState();
                    case 4:
                        r config3 = (r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_SUBMISSIONS_STATE_KEY", config3);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f230937b.f230938a.getIncomeSources();
                    case 6:
                        List config4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        this.f230937b.f230939b.f("MEMORY_CACHE_INCOME_SOURCES_KEY", config4);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f230937b.f230938a.getSubmissionFlowsStates();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
