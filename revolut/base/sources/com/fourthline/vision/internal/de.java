package com.fourthline.vision.internal;

import com.fourthline.vision.internal.h6;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class de implements q7 {
    private final boolean isInBounds(float f) {
        return f < -20.0f;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((List<? extends h6>) obj2, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    public Object process(@NotNull List<? extends h6> list, @NotNull Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof h6.b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            if (z) {
                arrayList2.add(obj3);
            } else if (!isInBounds(((h6.b) obj3).getYaw())) {
                arrayList2.add(obj3);
                z = true;
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj4 = arrayList2.get(i);
            i++;
            arrayList3.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        return arrayList3;
    }
}
