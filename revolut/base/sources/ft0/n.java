package ft0;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$Toggle;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ic;
import ip0.jc;
import ip0.mc;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f137766a = new Regex("<([^>]+)>");

    private n() {
    }

    public static ArrayList a(mc row, Context context) {
        koi.j lVar;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = ty0.c.a(jh.d.f(context).b0(), row.f165355a, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        ArrayList arrayList = new ArrayList();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        nkm.k kVar = new nkm.k(Regex.c(f137766a, string));
        int i = 0;
        while (kVar.hasNext()) {
            MatchResult matchResult = (MatchResult) kVar.next();
            String strSubstring = string.substring(i, matchResult.getRange().f186448a);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            c(arrayList, ref$IntRef2, ref$IntRef, strSubstring);
            String str = (String) matchResult.c().get(1);
            jc jcVar = (jc) row.f165356b.get(str);
            if (jcVar == null) {
                throw new IllegalStateException(a10.b.s("Unknown tag: <", str, ">"));
            }
            if (jcVar instanceof ConditionalAmountDelegate$ConditionalAmountItem$ActionChip) {
                lVar = new e((ConditionalAmountDelegate$ConditionalAmountItem$ActionChip) jcVar);
            } else if (jcVar instanceof ic) {
                lVar = new g((ic) jcVar);
            } else {
                if (!(jcVar instanceof ConditionalAmountDelegate$ConditionalAmountItem$Toggle)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar = new l((ConditionalAmountDelegate$ConditionalAmountItem$Toggle) jcVar);
            }
            arrayList.add(lVar);
            i = matchResult.getRange().f186449b + 1;
        }
        String strSubstring2 = string.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        c(arrayList, ref$IntRef2, ref$IntRef, strSubstring2);
        return arrayList;
    }

    public static final void b(ArrayList arrayList, Ref$IntRef ref$IntRef, String str) {
        String string = d0.F0(str).toString();
        if (string.length() > 0) {
            int i = ref$IntRef.f186408a;
            ref$IntRef.f186408a = i + 1;
            arrayList.add(new j(new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), a0.d.n("text_", i)));
        }
    }

    public static final void c(ArrayList arrayList, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, String str) {
        int i = 0;
        int iS = d0.S(str, '\n', 0, 6);
        while (iS >= 0) {
            String strSubstring = str.substring(i, iS);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            b(arrayList, ref$IntRef2, strSubstring);
            int i2 = ref$IntRef.f186408a;
            ref$IntRef.f186408a = i2 + 1;
            arrayList.add(new h(a0.d.n("line_break_", i2)));
            i = iS + 1;
            iS = d0.S(str, '\n', i, 4);
        }
        String strSubstring2 = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        b(arrayList, ref$IntRef2, strSubstring2);
    }
}
