package kem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class k0 {

    @NotNull
    public static final j0 Companion;
    public static final q0 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f183205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f183206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183207c;
    public n0 d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f183208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f183209h;
    public g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r0 f183210j;

    static {
        j0 j0Var = new j0();
        Companion = j0Var;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        k = a1m.e.b("http://localhost");
    }

    public k0() throws Throwable {
        Throwable th10;
        zhm.f0<String> pathSegments = zhm.f0.f322471a;
        f0.Companion.getClass();
        k parameters = e0.f183199b;
        Intrinsics.checkNotNullParameter("", "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter("", "fragment");
        this.f183205a = "";
        final int i = 0;
        this.f183206b = false;
        this.f183207c = 0;
        Throwable th11 = null;
        this.d = null;
        this.e = null;
        this.f = null;
        Set set = b.f183183a;
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter("", "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final StringBuilder sb6 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
        int length = "".length();
        Intrinsics.checkNotNullParameter(charsetEncoderNewEncoder, "<this>");
        Intrinsics.checkNotNullParameter("", "input");
        jlm.a aVar = new jlm.a();
        a1m.e.r(charsetEncoderNewEncoder, aVar, "", 0, length);
        b.f(aVar, new Function1() { // from class: kem.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Byte b4 = (Byte) obj2;
                switch (i) {
                    case 0:
                        byte bByteValue = b4.byteValue();
                        StringBuilder sb9 = sb6;
                        if (bByteValue == 32) {
                            sb9.append("%20");
                        } else if (b.f183183a.contains(b4) || b.f183185c.contains(b4)) {
                            sb9.append((char) bByteValue);
                        } else {
                            sb9.append(b.g(bByteValue));
                        }
                        break;
                    default:
                        sb6.append(b.g(b4.byteValue()));
                        break;
                }
                return Unit.f186387a;
            }
        });
        this.f183208g = sb6.toString();
        ArrayList arrayList = new ArrayList(zhm.w.t(pathSegments, 10));
        for (String input : pathSegments) {
            Intrinsics.checkNotNullParameter(input, "<this>");
            Intrinsics.checkNotNullParameter(input, "<this>");
            final StringBuilder sb9 = new StringBuilder();
            Charset charset2 = Charsets.UTF_8;
            int i2 = i;
            while (i2 < input.length()) {
                char cCharAt = input.charAt(i2);
                if (b.f183184b.contains(Character.valueOf(cCharAt)) || b.d.contains(Character.valueOf(cCharAt))) {
                    th10 = th11;
                    sb9.append(cCharAt);
                    i2++;
                } else {
                    final int i3 = 1;
                    int i5 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                    CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                    Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder2, "newEncoder(...)");
                    int i6 = i5 + i2;
                    Intrinsics.checkNotNullParameter(charsetEncoderNewEncoder2, "<this>");
                    Intrinsics.checkNotNullParameter(input, "input");
                    th10 = th11;
                    jlm.a aVar2 = new jlm.a();
                    a1m.e.r(charsetEncoderNewEncoder2, aVar2, input, i2, i6);
                    b.f(aVar2, new Function1() { // from class: kem.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Byte b4 = (Byte) obj2;
                            switch (i3) {
                                case 0:
                                    byte bByteValue = b4.byteValue();
                                    StringBuilder sb92 = sb9;
                                    if (bByteValue == 32) {
                                        sb92.append("%20");
                                    } else if (b.f183183a.contains(b4) || b.f183185c.contains(b4)) {
                                        sb92.append((char) bByteValue);
                                    } else {
                                        sb92.append(b.g(bByteValue));
                                    }
                                    break;
                                default:
                                    sb9.append(b.g(b4.byteValue()));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    i2 = i6;
                }
                th11 = th10;
            }
            arrayList.add(sb9.toString());
            i = 0;
        }
        Throwable th12 = th11;
        this.f183209h = arrayList;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        h0 h0Var = new h0();
        parameters.getClass();
        zhm.e0 e0Var = (zhm.e0) zhm.h0.f322473a.iterator();
        if (e0Var.hasNext()) {
            e0Var.next();
            throw th12;
        }
        this.i = h0Var;
        this.f183210j = new r0(h0Var);
    }

    public final void a() {
        if (this.f183205a.length() <= 0 && !Intrinsics.f(d().f183217a, "file")) {
            q0 q0Var = k;
            this.f183205a = q0Var.f183226a;
            if (this.d == null) {
                this.d = q0Var.f183230h;
            }
            if (this.f183207c == 0) {
                g(q0Var.f183227b);
            }
        }
    }

    public final q0 b() {
        a();
        n0 n0Var = this.d;
        String str = this.f183205a;
        int i = this.f183207c;
        List list = this.f183209h;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(b.c((String) it8.next()));
        }
        f0 f0VarP = a1m.e.p(this.f183210j.f183235a);
        String strD = b.d(0, 0, 15, this.f183208g);
        String str2 = this.e;
        String strC = str2 != null ? b.c(str2) : null;
        String str3 = this.f;
        return new q0(n0Var, str, i, arrayList, f0VarP, strD, strC, str3 != null ? b.c(str3) : null, this.f183206b, c());
    }

    public final String c() throws IOException {
        a();
        StringBuilder sb6 = new StringBuilder(256);
        a1m.e.c(this, sb6);
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final n0 d() {
        n0 n0Var = this.d;
        if (n0Var != null) {
            return n0Var;
        }
        n0.Companion.getClass();
        return n0.f183216c;
    }

    public final void e(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f183209h = list;
    }

    public final void f(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f183205a = str;
    }

    public final void g(int i) {
        if (i >= 0 && i < 65536) {
            this.f183207c = i;
        } else {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i).toString());
        }
    }

    public final String toString() throws IOException {
        StringBuilder sb6 = new StringBuilder(256);
        a1m.e.c(this, sb6);
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
