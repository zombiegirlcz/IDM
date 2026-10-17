package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.internal.e3;
import com.fourthline.vision.internal.ra;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class p9 implements x1 {
    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Pair<? extends Image, ? extends List<? extends e3>>) obj2, (Continuation<? super Unit>) continuation);
    }

    public Object consume(@NotNull Pair<? extends Image, ? extends List<? extends e3>> pair, @NotNull Continuation<? super Unit> continuation) throws ra.f.a {
        List list = (List) pair.f186386b;
        if (list.isEmpty() || !(zhm.d0.d0(list) instanceof e3.b)) {
            throw ra.f.a.f36780a;
        }
        return Unit.f186387a;
    }
}
