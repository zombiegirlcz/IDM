package nmm;

import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f217428a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? d0.J(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
