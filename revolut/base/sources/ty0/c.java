package ty0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextSwitcher;
import android.widget.TextView;
import aw0.ha;
import bp0.r;
import bp0.y;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    static SpannableStringBuilder a(c cVar, Clause clause, Context context, Function1 function1, b bVar, g gVar, ha haVar, int i) {
        Function1 function12 = (i & 4) != 0 ? null : function1;
        b underlineMode = (i & 8) != 0 ? b.DEFAULT : bVar;
        g handleTypeface = (i & 16) != 0 ? f.f275450a : gVar;
        boolean z = (i & 32) == 0;
        ha stylingMode = (i & 128) != 0 ? ha.ALLOW : haVar;
        y yVar = (y) cVar;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(underlineMode, "underlineMode");
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        Intrinsics.checkNotNullParameter(stylingMode, "stylingMode");
        return yVar.j(clause, context, function12 != null ? new r(function12, 0) : null, handleTypeface, 0, z, null, underlineMode, stylingMode);
    }

    static /* synthetic */ void b(c cVar, Clause clause, TextView textView, Function1 function1, g gVar, int i) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            gVar = f.f275450a;
        }
        ((y) cVar).l(clause, textView, function1, gVar);
    }

    static void c(c cVar, Clause clause, TextSwitcher textSwitcher) {
        ((y) cVar).getClass();
        Intrinsics.checkNotNullParameter(textSwitcher, "textSwitcher");
        f handleTypeface = f.f275450a;
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        pyd.c.b(textSwitcher).d(clause, null, handleTypeface);
    }
}
