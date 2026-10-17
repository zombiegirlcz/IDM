package iem;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final glm.a f160830a = new glm.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final glm.a f160831b = new glm.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final glm.a f160832c = new glm.a();
    public static final glm.a d = new glm.a();
    public static final glm.a e = new glm.a();

    public static final Throwable a(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        Throwable cause = th10;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (cause.equals(cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th10;
    }
}
