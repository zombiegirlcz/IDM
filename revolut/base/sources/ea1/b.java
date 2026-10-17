package ea1;

import a09.a0;
import e2j.i;
import e8h.c;
import efm.d0;
import fa1.k;
import fa1.v;
import ihm.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pfm.t;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f124050a = v0.a.d("create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f124051b;

    static {
        Intrinsics.checkNotNullExpressionValue(new f(), "create(...)");
        f124051b = LoggerFactory.getLogger("RevolutReader");
    }

    public static final void a(String message, k level) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        DateTime dateTimeNow = DateTime.now(DateTimeZone.UTC);
        Intrinsics.h(dateTimeNow);
        f124050a.onNext(new v(dateTimeNow, message, level));
    }

    public static final t c(efm.b bVar, String description, k level) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(level, "level");
        n0 n0Var = new n0();
        c cVar = new c(17, new a(n0Var, description, level, 2));
        dfm.c cVar2 = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        bVar.getClass();
        t tVarM = new t(bVar, cVar, cVar2, aVar, aVar, aVar, aVar).l(new a0(description, 8, n0Var, level)).m(new c(13, new i(description, 3)));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        return tVarM;
    }

    public static ufm.f d(d0 d0Var, String description) {
        k level = k.INFO;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(level, "level");
        n0 n0Var = new n0();
        ufm.f fVar = new ufm.f(new ufm.f(new ufm.f(d0Var, new c(14, new a(n0Var, description, level, 0)), 2), new c(15, new a(description, n0Var, level)), 3), new c(16, new i(description, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        return fVar;
    }
}
