package ii0;

import ag.e;
import ag.g;
import ag.o;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import org.json.JSONException;
import rd0.c;
import rd0.d;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ih0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af0.a f161502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f161503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f161504c;

    public b() {
        af0.a configProvider = new af0.a(17);
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f161502a = configProvider;
        this.f161503b = j.b(new af0.a(18));
        this.f161504c = j.b(new androidx.lifecycle.b(this, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ii0.a
            if (r0 == 0) goto L13
            r0 = r10
            ii0.a r0 = (ii0.a) r0
            int r1 = r0.f161501w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161501w = r1
            goto L1a
        L13:
            ii0.a r0 = new ii0.a
            gim.c r10 = (gim.c) r10
            r0.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161501w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r10)
            goto L66
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            yhm.o.b(r10)
            zf.a r10 = r9.c()
            ag.e r2 = r10.f321808c
            com.google.android.gms.tasks.Task r2 = r2.b()
            ag.e r4 = r10.d
            com.google.android.gms.tasks.Task r4 = r4.b()
            com.google.android.gms.tasks.Task[] r5 = new com.google.android.gms.tasks.Task[]{r2, r4}
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.whenAllComplete(r5)
            java.util.concurrent.Executor r6 = r10.f321807b
            bg.a r7 = new bg.a
            r8 = 5
            r7.<init>(r10, r8, r2, r4)
            com.google.android.gms.tasks.Task r10 = r5.continueWithTask(r6, r7)
            java.lang.String r2 = "activate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            r0.f161501w = r3
            java.lang.Object r10 = jh.d.b(r10, r0)
            if (r10 != r1) goto L66
            return r1
        L66:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ii0.b.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        o oVar = c().f;
        Pattern pattern = o.f;
        Pattern pattern2 = o.e;
        e eVar = oVar.f4715c;
        String strC = o.c(eVar, key);
        if (strC != null) {
            if (pattern2.matcher(strC).matches()) {
                oVar.a(key, eVar.c());
                return true;
            }
            if (pattern.matcher(strC).matches()) {
                oVar.a(key, eVar.c());
                return false;
            }
        }
        String strC2 = o.c(oVar.d, key);
        if (strC2 != null) {
            if (pattern2.matcher(strC2).matches()) {
                return true;
            }
            if (pattern.matcher(strC2).matches()) {
                return false;
            }
        }
        o.d(key, "Boolean");
        return false;
    }

    public final zf.a c() {
        return (zf.a) this.f161504c.getValue();
    }

    public final long d(String key) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(key, "key");
        o oVar = c().f;
        e eVar = oVar.f4715c;
        g gVarC = eVar.c();
        Long lValueOf2 = null;
        if (gVarC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(gVarC.f4690b.getLong(key));
            } catch (JSONException unused) {
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            oVar.a(key, eVar.c());
            return lValueOf.longValue();
        }
        g gVarC2 = oVar.d.c();
        if (gVarC2 != null) {
            try {
                lValueOf2 = Long.valueOf(gVarC2.f4690b.getLong(key));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        o.d(key, "Long");
        return 0L;
    }

    public final String e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strB = c().b(key);
        Intrinsics.checkNotNullExpressionValue(strB, "getString(...)");
        return strB;
    }

    public final Object f(String key, Object obj2, mlm.b strategy) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        String strB = c().b(key);
        Intrinsics.checkNotNullExpressionValue(strB, "getString(...)");
        if (strB.length() == 0) {
            return obj2;
        }
        try {
            return ((Json) this.f161503b.getValue()).b(strategy, strB);
        } catch (SerializationException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, a0.d.s("decodeFromString failed for key: ", key, "\nRaw Json: ", strB), e, h0Var);
            return obj2;
        }
    }
}
