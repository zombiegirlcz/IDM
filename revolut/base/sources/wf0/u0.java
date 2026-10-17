package wf0;

import com.revolut.core.faq.data.network.HelpCenterService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 {

    @NotNull
    private static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HelpCenterService f296927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f296928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.c f296929c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f296930g;

    public u0(HelpCenterService helpCenterService, ne0.d memoryCache, ve0.c storage) {
        Intrinsics.checkNotNullParameter(helpCenterService, "helpCenterService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f296927a = helpCenterService;
        this.f296928b = memoryCache;
        this.f296929c = storage;
        Continuation continuation = null;
        q0 q0Var = new q0(this, continuation, 1);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: wf0.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296914b;

            {
                this.f296914b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296914b.f296928b.get("QUICK_ACTIONS_KEY");
                    case 1:
                        cg0.r params = (cg0.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v1.c.s("QUICK_ACTION_TROUBLESHOOTER_KEY", jb3.l.b(params), this.f296914b.f296928b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f296914b.f296928b.get("SUGGESTED_ARTICLES_KEY");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f296914b.f296928b.get("TROUBLESHOOTING_SUGGESTIONS_KEY");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (String) this.f296914b.f296928b.get("DEEPLINK_FOR_CHAT_KEY");
                }
            }
        };
        final int i2 = 1;
        Function2 function2 = new Function2(this) { // from class: wf0.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296909b;

            {
                this.f296909b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String deeplink = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        this.f296909b.f296928b.f("DEEPLINK_FOR_CHAT_KEY", deeplink);
                        break;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f296909b.f296928b.f("QUICK_ACTIONS_KEY", response);
                        break;
                    case 2:
                        cg0.r params = (cg0.r) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f296909b.f296928b.f("QUICK_ACTION_TROUBLESHOOTER_KEY" + jb3.l.b(params), statements);
                        break;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f296909b.f296928b.f("SUGGESTED_ARTICLES_KEY", response2);
                        break;
                    default:
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f296909b.f296928b.f("TROUBLESHOOTING_SUGGESTIONS_KEY", response3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i3 = 0;
        this.d = new x4l.c(q0Var, function1, function2, new s0(this, continuation, i3), new t0(this, continuation, i3));
        th6.p pVar = new th6.p(this, continuation, 27);
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: wf0.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296914b;

            {
                this.f296914b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296914b.f296928b.get("QUICK_ACTIONS_KEY");
                    case 1:
                        cg0.r params = (cg0.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v1.c.s("QUICK_ACTION_TROUBLESHOOTER_KEY", jb3.l.b(params), this.f296914b.f296928b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f296914b.f296928b.get("SUGGESTED_ARTICLES_KEY");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f296914b.f296928b.get("TROUBLESHOOTING_SUGGESTIONS_KEY");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (String) this.f296914b.f296928b.get("DEEPLINK_FOR_CHAT_KEY");
                }
            }
        };
        final int i6 = 2;
        int i21 = 3;
        this.e = new x4l.c(pVar, function12, new Function2(this) { // from class: wf0.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296909b;

            {
                this.f296909b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String deeplink = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        this.f296909b.f296928b.f("DEEPLINK_FOR_CHAT_KEY", deeplink);
                        break;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f296909b.f296928b.f("QUICK_ACTIONS_KEY", response);
                        break;
                    case 2:
                        cg0.r params = (cg0.r) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f296909b.f296928b.f("QUICK_ACTION_TROUBLESHOOTER_KEY" + jb3.l.b(params), statements);
                        break;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f296909b.f296928b.f("SUGGESTED_ARTICLES_KEY", response2);
                        break;
                    default:
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f296909b.f296928b.f("TROUBLESHOOTING_SUGGESTIONS_KEY", response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new r0(2, 0, null), new uyd.e0(i21, 17, continuation));
        final int i22 = 2;
        q0 q0Var2 = new q0(this, continuation, i22);
        Function1 function13 = new Function1(this) { // from class: wf0.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296914b;

            {
                this.f296914b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296914b.f296928b.get("QUICK_ACTIONS_KEY");
                    case 1:
                        cg0.r params = (cg0.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v1.c.s("QUICK_ACTION_TROUBLESHOOTER_KEY", jb3.l.b(params), this.f296914b.f296928b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f296914b.f296928b.get("SUGGESTED_ARTICLES_KEY");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f296914b.f296928b.get("TROUBLESHOOTING_SUGGESTIONS_KEY");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (String) this.f296914b.f296928b.get("DEEPLINK_FOR_CHAT_KEY");
                }
            }
        };
        final int i32 = 3;
        Function2 function22 = new Function2(this) { // from class: wf0.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296909b;

            {
                this.f296909b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        String deeplink = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        this.f296909b.f296928b.f("DEEPLINK_FOR_CHAT_KEY", deeplink);
                        break;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f296909b.f296928b.f("QUICK_ACTIONS_KEY", response);
                        break;
                    case 2:
                        cg0.r params = (cg0.r) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f296909b.f296928b.f("QUICK_ACTION_TROUBLESHOOTER_KEY" + jb3.l.b(params), statements);
                        break;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f296909b.f296928b.f("SUGGESTED_ARTICLES_KEY", response2);
                        break;
                    default:
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f296909b.f296928b.f("TROUBLESHOOTING_SUGGESTIONS_KEY", response3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i33 = 1;
        this.f = new x4l.c(q0Var2, function13, function22, new s0(this, continuation, i33), new t0(this, continuation, i33));
        final int i43 = 3;
        q0 q0Var3 = new q0(this, continuation, i43);
        Function1 function14 = new Function1(this) { // from class: wf0.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296914b;

            {
                this.f296914b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296914b.f296928b.get("QUICK_ACTIONS_KEY");
                    case 1:
                        cg0.r params = (cg0.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v1.c.s("QUICK_ACTION_TROUBLESHOOTER_KEY", jb3.l.b(params), this.f296914b.f296928b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f296914b.f296928b.get("SUGGESTED_ARTICLES_KEY");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f296914b.f296928b.get("TROUBLESHOOTING_SUGGESTIONS_KEY");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (String) this.f296914b.f296928b.get("DEEPLINK_FOR_CHAT_KEY");
                }
            }
        };
        final int i59 = 4;
        Function2 function23 = new Function2(this) { // from class: wf0.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296909b;

            {
                this.f296909b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        String deeplink = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        this.f296909b.f296928b.f("DEEPLINK_FOR_CHAT_KEY", deeplink);
                        break;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f296909b.f296928b.f("QUICK_ACTIONS_KEY", response);
                        break;
                    case 2:
                        cg0.r params = (cg0.r) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f296909b.f296928b.f("QUICK_ACTION_TROUBLESHOOTER_KEY" + jb3.l.b(params), statements);
                        break;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f296909b.f296928b.f("SUGGESTED_ARTICLES_KEY", response2);
                        break;
                    default:
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f296909b.f296928b.f("TROUBLESHOOTING_SUGGESTIONS_KEY", response3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i66 = 2;
        this.f296930g = new x4l.c(q0Var3, function14, function23, new s0(this, continuation, i66), new t0(this, continuation, i66));
        q0 q0Var4 = new q0(this, continuation, 0);
        final int i74 = 4;
        Function1 function15 = new Function1(this) { // from class: wf0.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296914b;

            {
                this.f296914b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i74) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296914b.f296928b.get("QUICK_ACTIONS_KEY");
                    case 1:
                        cg0.r params = (cg0.r) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v1.c.s("QUICK_ACTION_TROUBLESHOOTER_KEY", jb3.l.b(params), this.f296914b.f296928b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f296914b.f296928b.get("SUGGESTED_ARTICLES_KEY");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f296914b.f296928b.get("TROUBLESHOOTING_SUGGESTIONS_KEY");
                    default:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (String) this.f296914b.f296928b.get("DEEPLINK_FOR_CHAT_KEY");
                }
            }
        };
        final int i92 = 0;
        new x4l.c(q0Var4, function15, new Function2(this) { // from class: wf0.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f296909b;

            {
                this.f296909b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        String deeplink = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        this.f296909b.f296928b.f("DEEPLINK_FOR_CHAT_KEY", deeplink);
                        break;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f296909b.f296928b.f("QUICK_ACTIONS_KEY", response);
                        break;
                    case 2:
                        cg0.r params = (cg0.r) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f296909b.f296928b.f("QUICK_ACTION_TROUBLESHOOTER_KEY" + jb3.l.b(params), statements);
                        break;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f296909b.f296928b.f("SUGGESTED_ARTICLES_KEY", response2);
                        break;
                    default:
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f296909b.f296928b.f("TROUBLESHOOTING_SUGGESTIONS_KEY", response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rp1.c(2, 29, null), new uyd.e0(i21, 16, continuation));
    }
}
