package com.fourthline.orca.internal;

import com.fourthline.orca.internal.yp0;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class mw implements kw, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yw f31278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fq0 f31279c;
    private final ww d;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31282c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31283g;
        final /* synthetic */ Throwable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f31285j;
        final /* synthetic */ Function0 k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th10, String str, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.i = th10;
            this.f31285j = str;
            this.k = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return mw.this.new a(this.i, this.f31285j, this.k, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Throwable th10;
            ww wwVar;
            String str;
            Function0 function0;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f31283g;
            if (i == 0) {
                yhm.o.b(obj2);
                ww wwVar2 = mw.this.d;
                mw mwVar = mw.this;
                th10 = this.i;
                String str2 = this.f31285j;
                Function0 function02 = this.k;
                zp0 zp0VarBuildStateFor = mwVar.f31278b.buildStateFor(th10);
                fq0 fq0Var = mwVar.f31279c;
                this.f31280a = th10;
                this.f31281b = str2;
                this.f31282c = function02;
                this.d = wwVar2;
                this.e = null;
                this.f = 0;
                this.f31283g = 1;
                Object objA = fq0Var.a(zp0VarBuildStateFor, this);
                if (objA == aVar) {
                    return aVar;
                }
                wwVar = wwVar2;
                obj2 = objA;
                str = str2;
                function0 = function02;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wwVar = (ww) this.d;
                function0 = (Function0) this.f31282c;
                str = (String) this.f31281b;
                th10 = (Throwable) this.f31280a;
                yhm.o.b(obj2);
            }
            yp0 yp0Var = (yp0) obj2;
            if (yp0Var instanceof yp0.c) {
                wwVar.onPrimaryClicked(((yp0.c) yp0Var).a(), th10, str, function0);
            } else if (yp0Var instanceof yp0.d) {
                wwVar.onSecondaryClicked(((yp0.d) yp0Var).a(), th10, str, function0);
            } else if (!(yp0Var instanceof yp0.b) && !(yp0Var instanceof yp0.e) && !(yp0Var instanceof yp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f186387a;
        }
    }

    public mw(yw errorPopupStateBuilder, fq0 popupPresenter, ww clicksHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(popupPresenter, "popupPresenter");
        Intrinsics.checkNotNullParameter(clicksHandler, "clicksHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f31277a = coroutineScope;
        this.f31278b = errorPopupStateBuilder;
        this.f31279c = popupPresenter;
        this.d = clicksHandler;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31277a.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.kw
    public void handleError(Throwable error, String source) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        handleRecoverableError(error, source, new ko1(error, 17));
    }

    @Override // com.fourthline.orca.internal.kw
    public void handleRecoverableError(Throwable error, String source, Function0 onRetry) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        Objects.toString(error);
        skm.e0.C(this, null, null, new a(error, source, onRetry, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Throwable th10) {
        throw new IllegalStateException(("Developer error. `onRetry` block was called for non-recoverable error: " + th10).toString());
    }
}
