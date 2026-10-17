package t61;

import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.firebase.perf.util.Timer;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.api.models.StatementUrlState;
import ip0.nb0;
import ip0.pb0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.Instant;
import r7d.w;
import tfm.a4;
import tfm.e4;
import u7i.o;
import ufg.k0;
import us6.q;
import uyd.h0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {
    public static void A(xi0.a aVar, String str, ArrayList arrayList) {
        aVar.getClass();
        arrayList.add(xi0.a.a(str));
    }

    public static /* synthetic */ boolean B(AtomicReference atomicReference, Object obj2, Object obj3) {
        while (!atomicReference.compareAndSet(obj2, obj3)) {
            if (atomicReference.get() != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean C(AtomicReference atomicReference, a4 a4Var, a4 a4Var2) {
        while (!atomicReference.compareAndSet(a4Var, a4Var2)) {
            if (atomicReference.get() != a4Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean D(AtomicReference atomicReference, vfm.c cVar) {
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static int a(int i, int i2, TextLocalisedClause textLocalisedClause) {
        return (textLocalisedClause.hashCode() + i) * i2;
    }

    public static int b(BaseTextPreparedSelection baseTextPreparedSelection) {
        baseTextPreparedSelection.getState().resetCachedX();
        return baseTextPreparedSelection.getText$foundation().length();
    }

    public static int c(io3.l lVar, int i, int i2) {
        return (lVar.hashCode() + i) * i2;
    }

    public static int d(BigDecimal bigDecimal, int i, int i2) {
        return (bigDecimal.hashCode() + i) * i2;
    }

    public static int e(Date date, int i, int i2) {
        return (date.hashCode() + i) * i2;
    }

    public static int f(UUID uuid, int i, int i2) {
        return (uuid.hashCode() + i) * i2;
    }

    public static int g(Instant instant, int i, int i2) {
        return (instant.hashCode() + i) * i2;
    }

    public static e4m.e h(t64.c cVar, int i) {
        return e4m.b.b(new sac.a(cVar, i, 19));
    }

    public static e4m.e i(t64.c cVar, t64.b bVar, int i) {
        return e4m.b.b(new t0b.l(cVar, bVar, i, 9));
    }

    public static e4m.e j(u41.b bVar, u41.a aVar, int i) {
        return e4m.b.b(new tg5.h(bVar, aVar, i, 26));
    }

    public static e4m.e k(u7i.l lVar, u7i.m mVar, u7i.f fVar, int i) {
        return e4m.b.b(new w(lVar, mVar, fVar, i, 11));
    }

    public static e4m.e l(u7i.l lVar, u7i.m mVar, o oVar, int i) {
        return e4m.b.b(new w(lVar, mVar, oVar, i, 13));
    }

    public static e4m.e m(ufh.i iVar, ufh.a aVar, int i) {
        return e4m.b.b(new k0(iVar, aVar, i, 2));
    }

    public static e4m.e n(q qVar, int i) {
        return e4m.b.b(new uhc.a(qVar, i, 5));
    }

    public static pb0 o(String str, int i, nb0 nb0Var, boolean z, int i2) {
        return nb0.a(nb0Var, str + i, z, i2);
    }

    public static String p(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return str3 + str4;
    }

    public static String q(String str, List list, StringBuilder sb6) {
        sb6.append(list);
        sb6.append(str);
        return sb6.toString();
    }

    public static /* synthetic */ BigDecimal r(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }

    public static ArrayList s(String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, str);
        return new ArrayList();
    }

    public static Function2 t(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m1665setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1665setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static IntRange u(Function0 function0, String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(function0, str);
        return new IntRange(i, i2, i3);
    }

    public static void v(Timer timer, rf.d dVar, rf.d dVar2) {
        dVar.T(timer.a());
        tf.g.c(dVar2);
    }

    public static void w(String str, String str2, ne0.j jVar, StatementUrlState statementUrlState) {
        h0.s(jVar, str + str2, statementUrlState);
    }

    public static void x(StringBuilder sb6, int i, String str, int i2, String str2) {
        sb6.append(i);
        sb6.append(str);
        sb6.append(i2);
        sb6.append(str2);
    }

    public static void y(StringBuilder sb6, boolean z, String str, boolean z3, String str2) {
        sb6.append(z);
        sb6.append(str);
        sb6.append(z3);
        sb6.append(str2);
    }

    public static /* synthetic */ void z(AtomicReference atomicReference, e4 e4Var) {
        while (!atomicReference.compareAndSet(e4Var, null) && atomicReference.get() == e4Var) {
        }
    }
}
