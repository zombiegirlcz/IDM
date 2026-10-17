package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import fim.h;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import l.a;
import org.jetbrains.annotations.NotNull;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u0011H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManager;", "", "Landroid/content/Context;", "context", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroidx/credentials/GetCredentialResponse;", "getCredential", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "createCredential", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "", "getCredentialAsync", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "createCredentialAsync", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CredentialManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/credentials/CredentialManager$Companion;", "", "()V", "create", "Landroidx/credentials/CredentialManager;", "context", "Landroid/content/Context;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CredentialManager create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialManagerImpl(context);
        }
    }

    static Object createCredential$suspendImpl(CredentialManager credentialManager, Context context, CreateCredentialRequest createCredentialRequest, Continuation<? super CreateCredentialResponse> frame) {
        final l lVar = new l(1, h.b(frame));
        lVar.u();
        CancellationSignal cancellationSignal = new CancellationSignal();
        lVar.r(new CredentialManager$createCredential$2$1(cancellationSignal));
        credentialManager.createCredentialAsync(context, createCredentialRequest, cancellationSignal, new a(2), new CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>() { // from class: androidx.credentials.CredentialManager$createCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(@NotNull CreateCredentialException e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (lVar.d()) {
                    CancellableContinuation cancellableContinuation = lVar;
                    m.Companion companion = m.INSTANCE;
                    cancellableContinuation.resumeWith(o.a(e));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(@NotNull CreateCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (lVar.d()) {
                    CancellableContinuation cancellableContinuation = lVar;
                    m.Companion companion = m.INSTANCE;
                    cancellableContinuation.resumeWith(result);
                }
            }
        });
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    static Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, GetCredentialRequest getCredentialRequest, Continuation<? super GetCredentialResponse> frame) {
        final l lVar = new l(1, h.b(frame));
        lVar.u();
        CancellationSignal cancellationSignal = new CancellationSignal();
        lVar.r(new CredentialManager$getCredential$2$1(cancellationSignal));
        credentialManager.getCredentialAsync(context, getCredentialRequest, cancellationSignal, new a(2), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(@NotNull GetCredentialException e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (lVar.d()) {
                    CancellableContinuation cancellableContinuation = lVar;
                    m.Companion companion = m.INSTANCE;
                    cancellableContinuation.resumeWith(o.a(e));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(@NotNull GetCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (lVar.d()) {
                    CancellableContinuation cancellableContinuation = lVar;
                    m.Companion companion = m.INSTANCE;
                    cancellableContinuation.resumeWith(result);
                }
            }
        });
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    default Object createCredential(@NotNull Context context, @NotNull CreateCredentialRequest createCredentialRequest, @NotNull Continuation<? super CreateCredentialResponse> continuation) {
        return createCredential$suspendImpl(this, context, createCredentialRequest, continuation);
    }

    void createCredentialAsync(@NotNull Context context, @NotNull CreateCredentialRequest request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback);

    default Object getCredential(@NotNull Context context, @NotNull GetCredentialRequest getCredentialRequest, @NotNull Continuation<? super GetCredentialResponse> continuation) {
        return getCredential$suspendImpl(this, context, getCredentialRequest, continuation);
    }

    void getCredentialAsync(@NotNull Context context, @NotNull GetCredentialRequest request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback);
}
