package sf0;

import com.revolut.core.error.data.model.RevolutOutOfMemoryError;
import com.revolut.core.error.data.model.ServerErrorException;
import java.lang.reflect.Field;
import java.util.concurrent.CancellationException;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RevolutOutOfMemoryError f262252b = new RevolutOutOfMemoryError();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f262253a;

    public e(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f262253a = gson;
    }

    public final Throwable a(Throwable throwable) {
        Field declaredField;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof OutOfMemoryError) {
            OutOfMemoryError outOfMemoryError = (OutOfMemoryError) throwable;
            if (outOfMemoryError.getCause() == null) {
                outOfMemoryError.initCause(f262252b);
            }
            return outOfMemoryError;
        }
        if (throwable instanceof HttpException) {
            ServerErrorException.INSTANCE.getClass();
            return ServerErrorException.Companion.c((HttpException) throwable, this.f262253a);
        }
        if (!(throwable instanceof CancellationException)) {
            return throwable;
        }
        CancellationException cancellationException = (CancellationException) throwable;
        try {
            StackTraceElement[] stackTrace = cancellationException.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            if (stackTrace.length != 0 || !cancellationException.getClass().getSimpleName().equals("JobCancellationException")) {
                return cancellationException;
            }
            String message = cancellationException.getMessage();
            if (message == null) {
                message = "";
            }
            if (!a0.y(message, " was cancelled", false)) {
                return cancellationException;
            }
            try {
                declaredField = cancellationException.getClass().getDeclaredField("job");
            } catch (NoSuchFieldException unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj2 = declaredField != null ? declaredField.get(cancellationException) : null;
            if (obj2 == null) {
                return cancellationException;
            }
            return new RuntimeException(cancellationException.getMessage() + " " + obj2, cancellationException);
        } catch (Throwable unused2) {
            return cancellationException;
        }
    }
}
