package tg9;

import g12.l;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements l {
    @Override // g12.l
    public final Object c(xq2.a aVar, Continuation continuation) {
        String str;
        if (aVar == null || (str = aVar.f308049a) == null) {
            throw new IllegalStateException("Null Barcode");
        }
        return new b(str);
    }
}
