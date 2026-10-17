package io.ktor.utils.io;

import aem.b1;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class h0 extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                return ((m) ((e0) this.receiver)).i((Continuation) obj2);
            case 1:
                return Float.valueOf(((ScrollScope) this.receiver).scrollBy(((Number) obj2).floatValue()));
            case 2:
                return Float.valueOf(((ScrollScope) this.receiver).scrollBy(((Number) obj2).floatValue()));
            default:
                return io.ktor.client.engine.okhttp.a.d((io.ktor.client.engine.okhttp.a) this.receiver, (b1) obj2);
        }
    }
}
