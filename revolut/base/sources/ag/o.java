package ag;

import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final Pattern e;
    public static final Pattern f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f4713a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4715c;
    public final e d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public o(Executor executor, e eVar, e eVar2) {
        this.f4714b = executor;
        this.f4715c = eVar;
        this.d = eVar2;
    }

    public static HashSet b(e eVar) {
        HashSet hashSet = new HashSet();
        g gVarC = eVar.c();
        if (gVarC != null) {
            Iterator<String> itKeys = gVarC.f4690b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public static String c(e eVar, String str) {
        g gVarC = eVar.c();
        if (gVarC == null) {
            return null;
        }
        try {
            return gVarC.f4690b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(String str, String str2) {
        j6.a.s("No value of type '", str2, "' exists for parameter key '", str, "'.");
    }

    public final void a(String str, g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f4713a) {
            try {
                Iterator it8 = this.f4713a.iterator();
                while (it8.hasNext()) {
                    this.f4714b.execute(new n((BiConsumer) it8.next(), 0, str, gVar));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
