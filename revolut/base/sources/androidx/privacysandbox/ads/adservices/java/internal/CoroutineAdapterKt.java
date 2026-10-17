package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.b;
import org.jetbrains.annotations.NotNull;
import skm.g0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lskm/g0;", "", "tag", "Lcom/google/common/util/concurrent/ListenableFuture;", "asListenableFuture", "(Lskm/g0;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineAdapterKt {
    @NotNull
    public static final <T> ListenableFuture<T> asListenableFuture(@NotNull g0 g0Var, Object obj2) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new b(g0Var, obj2, 1));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ ListenableFuture asListenableFuture$default(g0 g0Var, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj2 = "Deferred.asListenableFuture";
        }
        return asListenableFuture(g0Var, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(g0 this_asListenableFuture, Object obj2, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.k(new CoroutineAdapterKt$asListenableFuture$1$1(completer, this_asListenableFuture));
        return obj2;
    }
}
