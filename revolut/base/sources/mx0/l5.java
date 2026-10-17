package mx0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l5 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj2;
        Intrinsics.checkNotNullParameter(viewHolder, "p0");
        es0.c cVar = (es0.c) this.receiver;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ((ar0.h) es0.c.b(viewHolder)).F(new es0.b(cVar, 0));
        return Unit.f186387a;
    }
}
