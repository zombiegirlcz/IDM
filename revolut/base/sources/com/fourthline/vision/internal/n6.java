package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n6 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private na f36595a;

    public n6(@NotNull na dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f36595a = dataSource;
    }

    @NotNull
    public final na getDataSource() {
        return this.f36595a;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((List<? extends h6>) obj2, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    public final void setDataSource(@NotNull na naVar) {
        Intrinsics.checkNotNullParameter(naVar, "<set-?>");
        this.f36595a = naVar;
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
        fa faVarContentDetectionArea = this.f36595a.contentDetectionArea();
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((h6) it8.next()).getFaceBox());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (z) {
                arrayList2.add(obj2);
            } else if (!faVarContentDetectionArea.contains((fa) obj2)) {
                arrayList2.add(obj2);
                z = true;
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            arrayList3.add(SelfieScannerWarning.FACE_NOT_IN_FRAME);
        }
        return arrayList3;
    }
}
