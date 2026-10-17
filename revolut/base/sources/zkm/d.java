package zkm;

import ch.qos.logback.core.CoreConstants;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f323100a;

    public d(CoroutineContext coroutineContext) {
        this.f323100a = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f323100a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f323100a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
