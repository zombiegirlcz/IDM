package nr0;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SpannableStringBuilder f218503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f218504b;

    public b(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f218504b = new ArrayList();
    }

    public final d a(TextPaint paint) {
        Object next;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Iterator it8 = this.f218504b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((d) next).f218508a, paint)) {
                break;
            }
        }
        return (d) next;
    }
}
