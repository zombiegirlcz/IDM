package nzc;

import com.revolut.feature.selfserve.sow.impl.services.SowService;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import java.util.List;
import jzc.o;
import jzc.s;
import jzc.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kwg.e;
import nd.k;
import ne0.j;
import nyb.h0;
import nyb.m;
import te0.w;
import w4l.f;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SowService f221017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f221018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lzc.a f221019c;
    public final k d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f221020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f221021h;

    public d(SowService sowService, j memoryCache, lzc.a sowDomainMapper, k documentUploader) {
        Intrinsics.checkNotNullParameter(sowService, "sowService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(sowDomainMapper, "sowDomainMapper");
        Intrinsics.checkNotNullParameter(documentUploader, "documentUploader");
        this.f221017a = sowService;
        this.f221018b = memoryCache;
        this.f221019c = sowDomainMapper;
        this.d = documentUploader;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        };
        final int i2 = 2;
        this.e = new f(function2, new b(this, i2), new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        };
        b bVar = new b(this, i3);
        final int i5 = 4;
        this.f = new f(function22, bVar, new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 5;
        final int i21 = 6;
        this.f221020g = new f(new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        }, new b(this, 4), new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 7;
        Function2 function23 = new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        };
        final int i32 = 1;
        this.f221021h = new f(function23, new b(this, i32), new Function2(this) { // from class: nzc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221016b;

            {
                this.f221016b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f221016b.f221017a.getSubmissionsConfig();
                    case 1:
                        o submission = (o) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(submission, "submission");
                        this.f221016b.f221018b.f("MEMORY_CACHE_LATEST_SUBMISSION_KEY", submission);
                        return Unit.f186387a;
                    case 2:
                        t config = (t) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY", config);
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f221016b.f221017a.getFlowState();
                    case 4:
                        s sowState = (s) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sowState, "sowState");
                        this.f221016b.f221018b.f("MEMORY_CACHE_SOW_STATE_KEY", sowState);
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f221016b.f221017a.getEvidenceTypes();
                    case 6:
                        List evidenceTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
                        this.f221016b.f221018b.f("MEMORY_CACHE_EVIDENCE_TYPES_KEY", evidenceTypes);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate4 = (f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return this.f221016b.f221017a.getLatestSubmission();
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final r a() {
        return nim.a.w(this.f221020g.f(Unit.f186387a, false), new m(this, 22));
    }

    public final pfm.a b() {
        SowService sowService = this.f221017a;
        pfm.a aVar = new pfm.a(w.H0(sowService.getSubmissionsConfig(), sowService.getLatestSubmission()), new h0(14, new b(this, 5)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final r c(String evidenceId, String documentType, String actionToDoId, String userDefinedType, List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(evidenceId, "evidenceId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
        Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
        return this.d.n(documents, new e((Object) this, evidenceId, (Object) documentType, (Object) actionToDoId, userDefinedType, 13));
    }
}
