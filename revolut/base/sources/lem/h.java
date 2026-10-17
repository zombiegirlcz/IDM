package lem;

import com.fourthline.vision.internal.qh;
import io.ktor.http.cio.ParserException;
import io.ktor.utils.io.r0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.d0;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f194607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f194608b;

    static {
        Character[] elements = {'/', '?', '#', '@'};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f194607a = kotlin.collections.d.y0(elements);
        r0.Companion.getClass();
        f194608b = 6;
        mem.a aVar = mem.c.Companion;
        List from = v.k("HTTP/1.0", "HTTP/1.1");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        mem.a.a(from, new qh(26), new f3.a(1));
    }

    public static final void a(CharSequence charSequence, char c2) {
        throw new ParserException("Character with code " + (c2 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    public static final int b(mem.e text, mem.i range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int i = range.f204800b;
        for (int i2 = range.f204799a; i2 < i; i2++) {
            char cCharAt = text.charAt(i2);
            if (cCharAt == ':' && i2 != range.f204799a) {
                range.f204799a = i2 + 1;
                return i2;
            }
            if (Intrinsics.k(cCharAt, 32) <= 0 || d0.K("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i3 = range.f204799a;
                if (cCharAt == ':') {
                    Intrinsics.checkNotNullParameter("Empty header names are not allowed as per RFC7230.", "message");
                    throw new ParserException("Empty header names are not allowed as per RFC7230.");
                }
                if (i2 == i3) {
                    Intrinsics.checkNotNullParameter("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", "message");
                    throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                }
                a(text, cCharAt);
                throw null;
            }
        }
        throw new ParserException("No colon in HTTP header in " + text.subSequence(range.f204799a, range.f204800b).toString() + " in builder: \n" + ((Object) text));
    }

    public static final void c(mem.e text, mem.i range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int i = range.f204799a;
        int i2 = range.f204800b;
        Intrinsics.checkNotNullParameter(text, "text");
        while (i < i2) {
            char cCharAt = text.charAt(i);
            if (!CharsKt.e(cCharAt) && cCharAt != '\t') {
                break;
            } else {
                i++;
            }
        }
        if (i >= i2) {
            range.f204799a = i2;
            return;
        }
        int i3 = i;
        int i5 = i3;
        while (i3 < i2) {
            char cCharAt2 = text.charAt(i3);
            if (cCharAt2 != '\t') {
                if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                    a(text, cCharAt2);
                    throw null;
                }
                if (cCharAt2 != ' ') {
                    i5 = i3;
                }
            }
            i3++;
        }
        range.f204799a = i;
        range.f204800b = i5 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:23:0x006a, B:25:0x0072, B:29:0x007a, B:32:0x0085, B:33:0x009a, B:34:0x00a1, B:35:0x00a2, B:37:0x00ac), top: B:47:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:23:0x006a, B:25:0x0072, B:29:0x007a, B:32:0x0085, B:33:0x009a, B:34:0x00a1, B:35:0x00a2, B:37:0x00ac), top: B:47:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:47:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.t r10, mem.e r11, mem.i r12, gim.c r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof lem.g
            if (r0 == 0) goto L13
            r0 = r13
            lem.g r0 = (lem.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            lem.g r0 = new lem.g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f194606y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 8192(0x2000, float:1.148E-41)
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 != r4) goto L43
            java.lang.Object r10 = r0.f194605x
            lem.d r10 = (lem.d) r10
            java.lang.Object r11 = r0.f194604w
            mem.i r11 = (mem.i) r11
            java.lang.Object r12 = r0.v
            mem.e r12 = (mem.e) r12
            java.lang.Object r2 = r0.u
            io.ktor.utils.io.t r2 = (io.ktor.utils.io.t) r2
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L40
            r9 = r0
            r0 = r10
            r10 = r2
            r2 = r9
            r9 = r12
            r12 = r11
            r11 = r9
            goto L6a
        L40:
            r11 = move-exception
            goto Lb2
        L43:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4b:
            yhm.o.b(r13)
            lem.d r13 = new lem.d
            r13.<init>(r11)
        L53:
            int r2 = lem.h.f194608b     // Catch: java.lang.Throwable -> Lb0
            r0.u = r10     // Catch: java.lang.Throwable -> Lb0
            r0.v = r11     // Catch: java.lang.Throwable -> Lb0
            r0.f194604w = r12     // Catch: java.lang.Throwable -> Lb0
            r0.f194605x = r13     // Catch: java.lang.Throwable -> Lb0
            r0.z = r4     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r2 = io.ktor.utils.io.n0.j(r10, r11, r3, r2, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r2 != r1) goto L66
            return r1
        L66:
            r9 = r0
            r0 = r13
            r13 = r2
            r2 = r9
        L6a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L77
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r13 != 0) goto L7a
            r0.d()     // Catch: java.lang.Throwable -> L77
            r10 = 0
            return r10
        L77:
            r11 = move-exception
            r10 = r0
            goto Lb2
        L7a:
            int r13 = r11.f204796g     // Catch: java.lang.Throwable -> L77
            r12.f204800b = r13     // Catch: java.lang.Throwable -> L77
            int r5 = r12.f204799a     // Catch: java.lang.Throwable -> L77
            int r13 = r13 - r5
            if (r13 == 0) goto La2
            if (r13 >= r3) goto L9a
            int r13 = b(r11, r12)     // Catch: java.lang.Throwable -> L77
            int r6 = r12.f204800b     // Catch: java.lang.Throwable -> L77
            c(r11, r12)     // Catch: java.lang.Throwable -> L77
            int r7 = r12.f204799a     // Catch: java.lang.Throwable -> L77
            int r8 = r12.f204800b     // Catch: java.lang.Throwable -> L77
            r12.f204799a = r6     // Catch: java.lang.Throwable -> L77
            r0.c(r5, r13, r7, r8)     // Catch: java.lang.Throwable -> L77
            r13 = r0
            r0 = r2
            goto L53
        L9a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L77
            java.lang.String r11 = "Header line length limit exceeded"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Throwable -> L77
        La2:
            java.util.List r10 = kem.u.f183239a     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "Host"
            java.lang.CharSequence r10 = r0.a(r10)     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto Laf
            e(r10)     // Catch: java.lang.Throwable -> L77
        Laf:
            return r0
        Lb0:
            r11 = move-exception
            r10 = r13
        Lb2:
            r10.d()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lem.h.d(io.ktor.utils.io.t, mem.e, mem.i, gim.c):java.lang.Object");
    }

    public static final void e(CharSequence charSequence) {
        if (d0.M(charSequence, ":")) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        int i = 0;
        while (true) {
            mem.d dVar = (mem.d) charSequence;
            if (i >= dVar.length()) {
                return;
            }
            Character chValueOf = Character.valueOf(dVar.charAt(i));
            Set set = f194607a;
            if (set.contains(chValueOf)) {
                throw new ParserException("Host cannot contain any of the following symbols: " + set);
            }
            i++;
        }
    }
}
