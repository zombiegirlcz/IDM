package ao0;

import anf.p;
import com.revolut.core.error.data.model.UnknownApiError;
import f01.c;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ofm.q;
import v60.b;
import v60.d;
import v60.e;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7852a;

    public a(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f7852a = uiKitResources;
    }

    public final d a(int i, v60.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return i <= 1 ? new b() : new v60.c(p.a.o(type.a(), i), i);
    }

    public final v60.c b(Integer num) {
        if (num == null) {
            return null;
        }
        d dVarA = a(num.intValue(), v60.a.SERVER);
        if (dVarA instanceof v60.c) {
            try {
                m.Companion companion = m.INSTANCE;
                if (!d0.W(this.f7852a.b(q.O(dVarA)))) {
                    return (v60.c) dVarA;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                o.a(th10);
            }
        }
        String strValueOf = String.valueOf(num.intValue());
        UnknownApiError unknownApiError = new UnknownApiError(strValueOf);
        Set setW = m72.b.w("server_error_code", strValueOf);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, unknownApiError, setW);
        return null;
    }

    public final b c() {
        return new b();
    }

    public final CharSequence d(d dVar, String str) throws Throwable {
        Object objA;
        agh.b bVar = new agh.b(dVar, new p(this, 11), 17);
        try {
            m.Companion companion = m.INSTANCE;
            objA = this.f7852a.b(q.O(dVar));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            bVar.invoke();
            if (str == null) {
                throw thA;
            }
        }
        if (!(objA instanceof n) && d0.W((CharSequence) objA)) {
            bVar.invoke();
            return str != null ? str : d(c(), null);
        }
        Object objD = str;
        if (m.a(objA) == null) {
            objD = objA;
        } else if (str == null) {
            objD = d(c(), null);
        }
        return (CharSequence) objD;
    }
}
