package z9m;

import cam.t;
import dam.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f320520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f320521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f320522c;
    public String d;
    public String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f320523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f320524h;
    public final b i;

    public e(s transact, k automation, t page) {
        Intrinsics.checkNotNullParameter(transact, "transact");
        Intrinsics.checkNotNullParameter(automation, "automation");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f320520a = transact;
        this.f320521b = automation;
        this.f320522c = page;
        new JSONObject();
        this.d = "";
        this.e = "";
        this.f = "TransactAuth_" + hashCode();
        int i = 0;
        Continuation continuation = null;
        this.f320524h = new a(this, continuation, i);
        this.i = new b(this, continuation, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (r5.O(r0, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0197, code lost:
    
        if (cam.t.M(r2, r0, r3) != r4) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(org.json.JSONObject r17, boolean r18, gim.c r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z9m.e.a(org.json.JSONObject, boolean, gim.c):java.lang.Object");
    }
}
