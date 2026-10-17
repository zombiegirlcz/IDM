package di0;

import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements eh0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.mlkit.vision.text.a f114861a;

    public b(com.google.mlkit.vision.text.a textBlock) {
        Intrinsics.checkNotNullParameter(textBlock, "textBlock");
        this.f114861a = textBlock;
    }

    public final ArrayList a() {
        List list;
        com.google.mlkit.vision.text.a aVar = this.f114861a;
        synchronized (aVar) {
            list = aVar.d;
        }
        Intrinsics.checkNotNullExpressionValue(list, "getLines(...)");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new a((Text.Line) it8.next()));
        }
        return arrayList;
    }
}
