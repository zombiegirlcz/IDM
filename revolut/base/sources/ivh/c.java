package ivh;

import a27.d;
import cul.j2;
import ikf.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kvh.h;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f168865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yp.b f168866m;

    public c(h serverErrorHelper, yp.b appStoreNavigationFactory) {
        Intrinsics.checkNotNullParameter(serverErrorHelper, "serverErrorHelper");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        this.f168865l = serverErrorHelper;
        this.f168866m = appStoreNavigationFactory;
    }

    public static void Z2(c cVar, String tag2, String loadingButtonTag, Function1 action, Function1 function1, Function1 function12, int i) {
        Function1 onErrorDialogDismiss = (i & 8) != 0 ? new d(1, 6, null) : function1;
        Function1 errorCodeIntercept = (i & 16) != 0 ? new wsg.a(29) : function12;
        j2 onRetryAction = new j2(cVar, tag2, loadingButtonTag, action, onErrorDialogDismiss, errorCodeIntercept, (Continuation) null);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(loadingButtonTag, "loadingButtonTag");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onErrorDialogDismiss, "onErrorDialogDismiss");
        Intrinsics.checkNotNullParameter(errorCodeIntercept, "errorCodeIntercept");
        Intrinsics.checkNotNullParameter(onRetryAction, "onRetryAction");
        cVar.d3(tag2, onErrorDialogDismiss, onRetryAction, errorCodeIntercept, new hsd.c(cVar, loadingButtonTag, action, (Continuation) null));
    }

    public static void c3(c cVar, String str, Function1 function1, Function1 function12, Function1 function13, int i) {
        if ((i & 4) != 0) {
            function12 = new d(1, 7, null);
        }
        Function1 function14 = function12;
        Function1 aVar = (i & 8) != 0 ? new wsg.a(29) : function13;
        cVar.b3(str, function1, function14, aVar, new a9h.c(cVar, str, function1, function14, aVar, (Continuation) null));
    }

    public final void b3(String tag2, Function1 action, Function1 onErrorDialogDismiss, Function1 errorCodeIntercept, Function2 onRetryAction) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onErrorDialogDismiss, "onErrorDialogDismiss");
        Intrinsics.checkNotNullParameter(errorCodeIntercept, "errorCodeIntercept");
        Intrinsics.checkNotNullParameter(onRetryAction, "onRetryAction");
        d3(tag2, onErrorDialogDismiss, onRetryAction, errorCodeIntercept, new g(this, action, (Continuation) null));
    }

    public final void d3(String tag2, Function1 onErrorDialogDismiss, Function2 onRetryAction, Function1 errorCodeIntercept, Function2 block) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(onErrorDialogDismiss, "onErrorDialogDismiss");
        Intrinsics.checkNotNullParameter(onRetryAction, "onRetryAction");
        Intrinsics.checkNotNullParameter(errorCodeIntercept, "errorCodeIntercept");
        Intrinsics.checkNotNullParameter(block, "block");
        T2(block, new a5b.a(this, tag2, errorCodeIntercept, onErrorDialogDismiss, onRetryAction, 25));
    }
}
