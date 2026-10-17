package zy9;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f326396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c70.a f326397b;

    public h(ImmutableSet providers, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f326396a = providers;
        this.f326397b = clipboard;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:21:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof zy9.f
            if (r0 == 0) goto L13
            r0 = r12
            zy9.f r0 = (zy9.f) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            zy9.f r0 = new zy9.f
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r11 = r0.z
            int r2 = r0.f326394y
            int r4 = r0.f326393x
            java.util.Iterator r5 = r0.f326392w
            java.util.Collection r6 = r0.v
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = r0.u
            yhm.o.b(r12)
            r9 = r5
            r5 = r11
            r11 = r7
            r7 = r6
            r6 = r9
            goto L81
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            yhm.o.b(r12)
            java.util.Set r12 = r10.f326396a
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
            r4 = 0
            r5 = r12
            r6 = r2
            r12 = r4
            r2 = r12
        L57:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r5.next()
            ry9.c r7 = (ry9.c) r7
            r0.u = r11
            r8 = r6
            java.util.Collection r8 = (java.util.Collection) r8
            r0.v = r8
            r0.f326392w = r5
            r0.f326393x = r12
            r0.f326394y = r2
            r0.z = r4
            r0.C = r3
            java.lang.Object r7 = r7.a(r11, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            r9 = r4
            r4 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r9
        L81:
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r12 = (com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption) r12
            if (r12 == 0) goto L88
            r7.add(r12)
        L88:
            r12 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L57
        L8d:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            zy9.e r11 = new zy9.e
            r11.<init>()
            java.util.List r11 = zhm.d0.P0(r6, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zy9.h.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zy9.g
            if (r0 == 0) goto L13
            r0 = r6
            zy9.g r0 = (zy9.g) r0
            int r1 = r0.f326395w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326395w = r1
            goto L18
        L13:
            zy9.g r0 = new zy9.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f326395w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f326395w = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L46
            zy9.b$a r5 = zy9.b.a.f326390a
            return r5
        L46:
            int r5 = r6.size()
            if (r5 != r3) goto L6e
            java.lang.Object r5 = zhm.d0.b0(r6)
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r5 = (com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption) r5
            java.util.List r5 = r5.f79688a
            int r5 = r5.size()
            if (r5 != r3) goto L6e
            java.lang.Object r5 = zhm.d0.b0(r6)
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r5 = (com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption) r5
            java.util.List r5 = r5.f79688a
            java.lang.Object r5 = zhm.d0.b0(r5)
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType r5 = (com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType) r5
            zy9.c r6 = new zy9.c
            r6.<init>(r5)
            return r6
        L6e:
            zy9.a r5 = new zy9.a
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult r0 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zy9.h.b(java.lang.String, gim.c):java.lang.Object");
    }
}
