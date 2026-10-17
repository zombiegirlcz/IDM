package com.fourthline.orca.workflow;

import android.content.Context;
import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.internal.eg1;
import com.fourthline.orca.internal.g00;
import com.fourthline.orca.internal.h00;
import com.fourthline.orca.internal.k8;
import com.fourthline.orca.internal.p31;
import com.fourthline.orca.internal.wc;
import com.fourthline.orca.internal.wd;
import com.fourthline.orca.internal.z31;
import com.fourthline.orca.workflow.WorkflowError;
import elm.f;
import gim.i;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.h1;
import skm.p0;
import yhm.m;
import yhm.o;
import zkm.d;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/fourthline/orca/workflow/SessionBuilder;", "Lcom/fourthline/orca/workflow/WorkflowSessionConfiguration;", "Landroid/content/Context;", "context", "", "validationCode", "Lcom/fourthline/orca/internal/k8;", "analytics", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/fourthline/orca/internal/k8;)V", "Lcom/fourthline/orca/workflow/WorkflowConfig;", "config", "Lcom/fourthline/orca/workflow/WorkflowSessionStart;", "configure", "(Lcom/fourthline/orca/workflow/WorkflowConfig;)Lcom/fourthline/orca/workflow/WorkflowSessionStart;", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lcom/fourthline/orca/internal/k8;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class SessionBuilder implements WorkflowSessionConfiguration {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String validationCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k8 analytics;

    public static final class a extends i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35775c;
        int d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f35776g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h00 f35777h;
        final /* synthetic */ SessionBuilder i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Locale f35778j;
        final /* synthetic */ z31 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f35779l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f35780m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ WorkflowConfig f35781n;

        /* JADX INFO: renamed from: com.fourthline.orca.workflow.SessionBuilder$a$a, reason: collision with other inner class name */
        public static final class C0324a extends i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h00.b f35784c;
            final /* synthetic */ z31 d;
            final /* synthetic */ CoroutineScope e;
            final /* synthetic */ SessionBuilder f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f35785g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ WorkflowConfig f35786h;

            /* JADX INFO: renamed from: com.fourthline.orca.workflow.SessionBuilder$a$a$a, reason: collision with other inner class name */
            public static final class C0325a extends i implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f35787a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ z31 f35788b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ h00.b f35789c;
                final /* synthetic */ SessionBuilder d;
                final /* synthetic */ CoroutineScope e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0325a(z31 z31Var, h00.b bVar, SessionBuilder sessionBuilder, CoroutineScope coroutineScope, Continuation continuation) {
                    super(2, continuation);
                    this.f35788b = z31Var;
                    this.f35789c = bVar;
                    this.d = sessionBuilder;
                    this.e = coroutineScope;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0325a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    return new C0325a(this.f35788b, this.f35789c, this.d, this.e, continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    int i = this.f35787a;
                    if (i == 0) {
                        o.b(obj2);
                        z31 z31Var = this.f35788b;
                        eg1 eg1VarA = this.f35789c.a().a();
                        Context context = this.d.context;
                        CoroutineScope coroutineScope = this.e;
                        this.f35787a = 1;
                        if (SessionBuilderKt.tryCollectDeviceData(z31Var, eg1VarA, context, coroutineScope, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f186387a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0324a(h00.b bVar, z31 z31Var, CoroutineScope coroutineScope, SessionBuilder sessionBuilder, Function1 function1, WorkflowConfig workflowConfig, Continuation continuation) {
                super(2, continuation);
                this.f35784c = bVar;
                this.d = z31Var;
                this.e = coroutineScope;
                this.f = sessionBuilder;
                this.f35785g = function1;
                this.f35786h = workflowConfig;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0324a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0324a c0324a = new C0324a(this.f35784c, this.d, this.e, this.f, this.f35785g, this.f35786h, continuation);
                c0324a.f35783b = obj2;
                return c0324a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f35783b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f35782a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                g00 g00VarA = this.f35784c.a();
                WorkflowConfig workflowConfig = this.f35786h;
                SessionBuilder sessionBuilder = this.f;
                sessionBuilder.analytics.track((k8.a) new k8.a.d(g00VarA, workflowConfig, g00VarA.a().b()));
                e0.C(coroutineScope, null, null, new C0325a(this.d, this.f35784c, this.f, this.e, null), 3);
                this.f35784c.a().a(SessionBuilderKt.tryCreateMotionDataUploader(this.d, this.f35784c.a().a()));
                this.f35784c.a().a(this.e);
                if (DeviceMetadataKt.isDeviceRooted()) {
                    this.f.analytics.track((k8.a) k8.a.C0234a.f30177b);
                    WorkflowError.Unexpected unexpected = new WorkflowError.Unexpected("notSupportedOnCompromisedDevice");
                    Function1 function1 = this.f35785g;
                    m.Companion companion = m.INSTANCE;
                    function1.invoke(new m(o.a(unexpected)));
                } else {
                    Function1 function12 = this.f35785g;
                    m.Companion companion2 = m.INSTANCE;
                    function12.invoke(new m(this.f35784c.a()));
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00 h00Var, SessionBuilder sessionBuilder, Locale locale, z31 z31Var, CoroutineScope coroutineScope, Function1 function1, WorkflowConfig workflowConfig, Continuation continuation) {
            super(2, continuation);
            this.f35777h = h00Var;
            this.i = sessionBuilder;
            this.f35778j = locale;
            this.k = z31Var;
            this.f35779l = coroutineScope;
            this.f35780m = function1;
            this.f35781n = workflowConfig;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f35777h, this.i, this.f35778j, this.k, this.f35779l, this.f35780m, this.f35781n, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
        
            if (skm.e0.J(r12, r3, r11) == r0) goto L17;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r11.f35776g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r11.f35775c
                com.fourthline.orca.internal.h00$b r0 = (com.fourthline.orca.internal.h00.b) r0
                yhm.o.b(r12)
                goto L9c
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                yhm.o.b(r12)
                yhm.m r12 = (yhm.m) r12
                java.lang.Object r12 = r12.f314193a
                goto L49
            L25:
                yhm.o.b(r12)
                com.fourthline.orca.internal.h00 r12 = r11.f35777h
                com.fourthline.orca.internal.h00$a r1 = new com.fourthline.orca.internal.h00$a
                com.fourthline.orca.workflow.SessionBuilder r4 = r11.i
                java.lang.String r4 = com.fourthline.orca.workflow.SessionBuilder.access$getValidationCode$p(r4)
                java.util.Locale r5 = r11.f35778j
                java.lang.String r5 = r5.getLanguage()
                java.lang.String r6 = "getLanguage(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                r1.<init>(r4, r5)
                r11.f35776g = r3
                java.lang.Object r12 = r12.a(r1, r11)
                if (r12 != r0) goto L49
                goto L7c
            L49:
                com.fourthline.orca.internal.z31 r5 = r11.k
                kotlinx.coroutines.CoroutineScope r6 = r11.f35779l
                com.fourthline.orca.workflow.SessionBuilder r7 = r11.i
                kotlin.jvm.functions.Function1 r8 = r11.f35780m
                com.fourthline.orca.workflow.WorkflowConfig r9 = r11.f35781n
                java.lang.Throwable r1 = yhm.m.a(r12)
                if (r1 != 0) goto L7d
                r4 = r12
                com.fourthline.orca.internal.h00$b r4 = (com.fourthline.orca.internal.h00.b) r4
                skm.p0 r12 = skm.p0.f264001a
                tkm.e r12 = zkm.o.f323119a
                com.fourthline.orca.workflow.SessionBuilder$a$a r3 = new com.fourthline.orca.workflow.SessionBuilder$a$a
                r10 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r1 = 0
                r11.f35773a = r1
                r11.f35774b = r1
                r11.f35775c = r1
                r1 = 0
                r11.d = r1
                r11.e = r1
                r11.f = r1
                r11.f35776g = r2
                java.lang.Object r12 = skm.e0.J(r12, r3, r11)
                if (r12 != r0) goto L9c
            L7c:
                return r0
            L7d:
                com.fourthline.orca.internal.re1 r12 = com.fourthline.orca.internal.se1.a(r1)
                com.fourthline.orca.workflow.WorkflowError$Unexpected r0 = new com.fourthline.orca.workflow.WorkflowError$Unexpected
                java.lang.String r1 = r12.getMessage()
                if (r1 != 0) goto L8d
                java.lang.String r1 = r12.toString()
            L8d:
                r0.<init>(r1)
                yhm.n r12 = yhm.o.a(r0)
                yhm.m r0 = new yhm.m
                r0.<init>(r12)
                r8.invoke(r0)
            L9c:
                kotlin.Unit r12 = kotlin.Unit.f186387a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.workflow.SessionBuilder.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SessionBuilder(@NotNull Context context, @NotNull String validationCode, @NotNull k8 analytics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.context = context;
        this.validationCode = validationCode;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SessionBuilder sessionBuilder, WorkflowConfig workflowConfig, Function1 onSessionStartResult) {
        Intrinsics.checkNotNullParameter(onSessionStartResult, "onSessionStartResult");
        z31 z31VarBuild = wd.a().a(new p31(sessionBuilder.validationCode, workflowConfig)).a().b().a(new wc(sessionBuilder.context)).build();
        h00 h00VarC = z31VarBuild.c();
        Locale locale = sessionBuilder.context.getResources().getConfiguration().getLocales().get(0);
        h1 h1VarD = e0.d();
        p0 p0Var = p0.f264001a;
        d dVarC = e0.c(e.d(h1VarD, f.f127540b));
        e0.C(dVarC, null, null, new a(h00VarC, sessionBuilder, locale, z31VarBuild, dVarC, onSessionStartResult, workflowConfig, null), 3);
    }

    @Override // com.fourthline.orca.workflow.WorkflowSessionConfiguration
    @NotNull
    public WorkflowSessionStart configure(@NotNull WorkflowConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new com.fourthline.core.location.internal.a(this, config);
    }

    public /* synthetic */ SessionBuilder(Context context, String str, k8 k8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new k8() { // from class: com.fourthline.orca.workflow.SessionBuilder.1
            @Override // com.fourthline.orca.internal.k8
            public /* bridge */ void onProductFailed(Throwable th10) {
                super.onProductFailed(th10);
            }

            @Override // com.fourthline.orca.internal.k8
            public /* bridge */ void onProductStart(ProductConfig productConfig, ProductCustomization productCustomization) {
                super.onProductStart(productConfig, productCustomization);
            }

            @Override // com.fourthline.orca.internal.k8
            public /* bridge */ void onProductSuccess(Object obj2) {
                super.onProductSuccess(obj2);
            }

            @Override // com.fourthline.orca.internal.qg0
            public /* bridge */ void track(k8.a aVar) {
                super.track(aVar);
            }
        } : k8Var);
    }
}
