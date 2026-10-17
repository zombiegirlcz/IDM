package di0;

import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Text f114862a;

    public c(Text text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f114862a = text;
    }

    public final ArrayList a() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f114862a.f49674a);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "getTextBlocks(...)");
        List list = listUnmodifiableList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new b((com.google.mlkit.vision.text.a) it8.next()));
        }
        return arrayList;
    }
}
