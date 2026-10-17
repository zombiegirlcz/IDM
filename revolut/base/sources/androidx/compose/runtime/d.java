package androidx.compose.runtime;

import androidx.compose.runtime.NextFrameEndCallbackQueue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return NextFrameEndCallbackQueue.markFrameComplete$lambda$0((NextFrameEndCallbackQueue.NextFrameEndAwaiter) obj2);
    }
}
