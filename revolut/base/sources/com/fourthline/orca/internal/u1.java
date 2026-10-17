package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class u1 implements ka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f33907a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33908b = "u1";

    private u1() {
    }

    @Override // com.fourthline.orca.internal.ka0
    public void a(ab0.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        b(request);
    }

    private final String c(ab0.a aVar) {
        return a(this, new String(aVar.a().b(), Charsets.UTF_8), 0, 1, null);
    }

    @Override // com.fourthline.orca.internal.ka0
    public void a(ab0.c request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        b(request);
    }

    public final String b(ab0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return kotlin.text.t.e("\nAlias: " + aVar.getAlias() + "\nUrl: " + aVar.c() + " " + aVar.e() + "\nParameters: " + aVar.d() + "\nHeaders: \n" + a(aVar.b()) + "\nRequest Body: \n" + c(aVar) + "\n    ");
    }

    private final String c(ab0.c cVar) throws IOException {
        return kotlin.text.t.e("\nMultipart Body:\n" + zhm.d0.k0(cVar.a(), "\n", null, "\n", 0, new nq1(17), 26) + "\n    ");
    }

    @Override // com.fourthline.orca.internal.ka0
    public void a(Object obj2) {
        Throwable thA = yhm.m.a(obj2);
        if (thA == null) {
            f33907a.a((eb0) obj2);
        } else {
            thA.toString();
        }
    }

    public final String a(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        return kotlin.text.t.e("\nResponse Code: " + eb0Var.d() + "\nHeaders: \n" + a(eb0Var.b()) + "\nBody: \n" + b(eb0Var) + "\n    ");
    }

    public final String b(ab0.c cVar) throws IOException {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return kotlin.text.t.e("\nAlias: " + cVar.getAlias() + "\nUrl: " + cVar.d() + "\nParameters: " + cVar.c() + "\nHeaders: \n" + a(cVar.b()) + "\nRequest Body: \n" + c(cVar) + "\n    ");
    }

    private final String a(Map map) {
        return zhm.d0.k0(zhm.t0.C(map), "\n", null, "\n", 0, new nq1(16), 26);
    }

    private final String a(ab0.c.a aVar) {
        String strA;
        if (bx.b(bx.a(aVar.a()))) {
            strA = "*** BINARY FILE ***";
        } else {
            strA = a(this, new String(aVar.c().b(), Charsets.UTF_8), 0, 1, null);
        }
        return aVar.b() + " : {\n " + strA + " \n}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(ab0.c.a bodyPart) {
        Intrinsics.checkNotNullParameter(bodyPart, "bodyPart");
        return f33907a.a(bodyPart);
    }

    public static /* synthetic */ String a(u1 u1Var, String str, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return u1Var.a(str, i);
    }

    private final String b(eb0 eb0Var) {
        String strA = bx.a(eb0Var.b());
        if (bx.b(strA)) {
            return "*** BINARY FILE ***";
        }
        String str = new String(fb0.a(eb0Var), Charsets.UTF_8);
        if (bx.c(strA)) {
            str = a(f33907a, str, 0, 1, null);
        }
        Intrinsics.h(str);
        return str;
    }

    private final String a(String str, int i) {
        try {
            if (str.length() == 0) {
                return "*** EMPTY ***";
            }
            return new JSONObject(str).toString(i);
        } catch (JSONException unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Pair header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return header.f186385a + ": " + header.f186386b;
    }
}
