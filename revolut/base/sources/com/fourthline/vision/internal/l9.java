package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.internal.e3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class l9 implements k3 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.fourthline.vision.internal.e3$d] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final List detect$lambda$0(e3.c root) {
        Intrinsics.checkNotNullParameter(root, "root");
        List<e3.d> texts = root.getTexts();
        ArrayList arrayList = new ArrayList(zhm.w.t(texts, 10));
        Iterator it8 = texts.iterator();
        while (it8.hasNext()) {
            ?? bVar = (e3.d) it8.next();
            MrzInfo mrzInfoCreate = MrzInfo.INSTANCE.create(bVar.getText());
            if (mrzInfoCreate != null) {
                bVar = new e3.b(mrzInfoCreate, bVar);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public static /* synthetic */ Object detect$suspendImpl(l9 l9Var, f9 f9Var, Continuation<? super List<? extends e3>> continuation) {
        return l9Var.awaitDetection(f9Var, new aem.d(18), continuation);
    }

    public abstract Object awaitDetection(@NotNull f9 f9Var, @NotNull Function1<? super e3.c, ? extends List<? extends e3>> function1, @NotNull Continuation<? super List<? extends e3>> continuation);

    public Object detect(@NotNull f9 f9Var, @NotNull Continuation<? super List<? extends e3>> continuation) {
        return detect$suspendImpl(this, f9Var, continuation);
    }

    @Override // com.fourthline.vision.internal.c9, com.fourthline.vision.internal.j2
    public /* bridge */ /* synthetic */ Object detect(u6 u6Var, Continuation continuation) {
        return detect((f9) u6Var, (Continuation<? super List<? extends e3>>) continuation);
    }
}
