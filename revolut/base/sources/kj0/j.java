package kj0;

import java.util.function.Predicate;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj2) {
        String message = ((Throwable) obj2).getMessage();
        return message != null && d0.J(message, "Response error: HTTP ", false);
    }
}
