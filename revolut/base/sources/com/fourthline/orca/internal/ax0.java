package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.rw0;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ax0 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f26932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p20 f26933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26934c;
    private final Lazy d;
    private final rw0 e;

    public ax0(v10 imageServiceLocator, String partialPhoneNumber, List signDocumentNames, p20 analytics, int i) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(partialPhoneNumber, "partialPhoneNumber");
        Intrinsics.checkNotNullParameter(signDocumentNames, "signDocumentNames");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f26932a = imageServiceLocator;
        this.f26933b = analytics;
        this.f26934c = i;
        this.d = yhm.j.b(new gj1(this, 6));
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.shared_button_sign, 0, 2, null);
        Iterator it8 = signDocumentNames.iterator();
        if (!it8.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = ((String) next) + ", " + ((String) it8.next());
        }
        c81.c cVar = new c81.c(R.string.step_qes_sign_message, zhm.u.c(next));
        c81.a aVar = c81.f27404a;
        c81.d dVarA2 = c81.a.a(aVar, R.string.shared_button_sign, 0, 2, null);
        c81.d dVarA3 = c81.a.a(aVar, R.string.shared_button_exit, 0, 2, null);
        c81.d dVarA4 = c81.a.a(aVar, R.string.step_qes_sign_label_code, 0, 2, null);
        c81.b bVar = c81.b.f27406b;
        StringBuilder sb6 = new StringBuilder();
        int i2 = this.f26934c;
        for (int i3 = 0; i3 < i2; i3++) {
            sb6.append('X');
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        s20 s20Var = new s20(null, "qes_otp_code", false, l20.f30507a, "", dVarA4, new c81.e(string), bVar, null, null, 0, 1797, null);
        this.f26933b.a(s20Var);
        c81.c cVar2 = new c81.c(R.string.step_qes_sign_hint_sms_sent_to, zhm.u.c(partialPhoneNumber));
        c81.a aVar2 = c81.f27404a;
        this.e = new rw0(dVarA, cVar, s20Var, cVar2, new rw0.a(true, c81.a.a(aVar2, R.string.step_qes_sign_alternative_sms_not_received, 0, 2, null), c81.a.a(aVar2, R.string.shared_button_send_again, 0, 2, null), null, 8, null), dVarA2, false, false, dVarA3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 a(ax0 ax0Var) {
        return ax0Var.f26932a.a(r10.E0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rw0 b(rw0 rw0Var) {
        Intrinsics.checkNotNullParameter(rw0Var, "<this>");
        return rw0.a(rw0Var, null, null, s20.a(rw0Var.n(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, false, false, null, false, 1019, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rw0 c(rw0 rw0Var) {
        Intrinsics.checkNotNullParameter(rw0Var, "<this>");
        return rw0.a(rw0Var, null, null, s20.a(rw0Var.n(), null, null, false, l20.d, null, null, null, null, null, null, 0, 2039, null), null, rw0.a.a(rw0Var.p(), false, null, null, null, 14, null), c81.a.a(c81.f27404a, R.string.shared_button_signing, 0, 2, null), true, false, null, false, 267, null);
    }

    private final z10 v() {
        return (z10) this.d.getValue();
    }

    public final Function1 d(int i) {
        return new ij1(i, 0);
    }

    public final Function1 s() {
        return new bi1(14);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public rw0 getInitialState() {
        return this.e;
    }

    public final Function1 x() {
        return new hj1(this, 0);
    }

    public final Function1 y() {
        return new bi1(13);
    }

    public final Function1 z() {
        return new hj1(this, 1);
    }

    public final Function1 a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new jn1(code, this, 5);
    }

    public final Function1 k() {
        return new bi1(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rw0 a(String str, ax0 ax0Var, rw0 rw0Var) {
        Intrinsics.checkNotNullParameter(rw0Var, "<this>");
        return rw0.a(rw0Var, null, null, s20.a(rw0Var.n(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, false, ax0Var.a(rw0Var.n(), str), null, false, 891, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rw0 a(ax0 ax0Var, rw0 rw0Var) {
        Intrinsics.checkNotNullParameter(rw0Var, "<this>");
        s20 s20VarN = rw0Var.n();
        c81.a aVar = c81.f27404a;
        return rw0.a(rw0Var, null, null, s20.a(s20VarN, null, null, false, l20.f30509c, "", null, null, c81.a.a(aVar, R.string.step_qes_sign_validation_invalid_code, 0, 2, null), ax0Var.v(), null, 0, 1639, null), null, rw0.a.a(rw0Var.p(), rw0Var.p().b() == null, null, null, null, 14, null), c81.a.a(aVar, R.string.shared_button_sign, 0, 2, null), false, false, null, true, 267, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fourthline.orca.internal.rw0 b(com.fourthline.orca.internal.ax0 r19, com.fourthline.orca.internal.rw0 r20) {
        /*
            r0 = r19
            java.lang.String r1 = "<this>"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.fourthline.orca.internal.s20 r1 = r2.n()
            com.fourthline.orca.internal.l20 r1 = r1.getState()
            com.fourthline.orca.internal.l20 r3 = com.fourthline.orca.internal.l20.f30508b
            if (r1 != r3) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r3 = 0
            if (r1 == 0) goto L45
            com.fourthline.orca.internal.s20 r1 = r2.n()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            if (r1 != 0) goto L2f
            com.fourthline.orca.internal.y20$c r1 = new com.fourthline.orca.internal.y20$c
            r1.<init>()
            goto L46
        L2f:
            com.fourthline.orca.internal.s20 r1 = r2.n()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            int r4 = r0.f26934c
            if (r1 >= r4) goto L45
            com.fourthline.orca.internal.y20$d r1 = new com.fourthline.orca.internal.y20$d
            r1.<init>()
            goto L46
        L45:
            r1 = r3
        L46:
            if (r1 != 0) goto L4c
            com.fourthline.orca.internal.l20 r4 = com.fourthline.orca.internal.l20.f30507a
        L4a:
            r9 = r4
            goto L4f
        L4c:
            com.fourthline.orca.internal.l20 r4 = com.fourthline.orca.internal.l20.f30509c
            goto L4a
        L4f:
            boolean r4 = r1 instanceof com.fourthline.orca.internal.y20.c
            if (r4 == 0) goto L5e
            com.fourthline.orca.internal.c81$a r4 = com.fourthline.orca.internal.c81.f27404a
            r5 = -2113338625(0xffffffff820902ff, float:-1.006603E-37)
            com.fourthline.orca.internal.c81$d r4 = r4.b(r5)
        L5c:
            r13 = r4
            goto L6f
        L5e:
            boolean r4 = r1 instanceof com.fourthline.orca.internal.y20.d
            if (r4 == 0) goto L6c
            com.fourthline.orca.internal.c81$a r4 = com.fourthline.orca.internal.c81.f27404a
            r5 = -2113338648(0xffffffff820902e8, float:-1.0066004E-37)
            com.fourthline.orca.internal.c81$d r4 = r4.a(r5)
            goto L5c
        L6c:
            com.fourthline.orca.internal.c81$b r4 = com.fourthline.orca.internal.c81.b.f27406b
            goto L5c
        L6f:
            com.fourthline.orca.internal.s20 r5 = r2.n()
            com.fourthline.orca.internal.c81$b r4 = com.fourthline.orca.internal.c81.b.f27406b
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r13, r4)
            if (r4 == 0) goto L7d
        L7b:
            r14 = r3
            goto L82
        L7d:
            com.fourthline.orca.internal.z10 r3 = r0.v()
            goto L7b
        L82:
            r17 = 1655(0x677, float:2.319E-42)
            r18 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            com.fourthline.orca.internal.s20 r5 = com.fourthline.orca.internal.s20.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.fourthline.orca.internal.p20 r3 = r0.f26933b
            r3.b(r5)
            if (r1 == 0) goto L9f
            com.fourthline.orca.internal.p20 r0 = r0.f26933b
            r0.a(r5, r1)
        L9f:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r13 = 1019(0x3fb, float:1.428E-42)
            r14 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.fourthline.orca.internal.rw0 r0 = com.fourthline.orca.internal.rw0.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ax0.b(com.fourthline.orca.internal.ax0, com.fourthline.orca.internal.rw0):com.fourthline.orca.internal.rw0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rw0 a(int i, rw0 rw0Var) {
        Intrinsics.checkNotNullParameter(rw0Var, "<this>");
        return rw0.a(rw0Var, null, null, null, null, rw0.a.a(rw0Var.p(), false, null, null, Integer.valueOf(i), 6, null), null, false, false, null, false, 1007, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rw0 a(rw0 rw0Var) {
        Intrinsics.checkNotNullParameter(rw0Var, "<this>");
        return rw0.a(rw0Var, null, null, null, null, rw0.a.a(rw0Var.p(), true, null, null, null, 6, null), null, false, false, null, false, 1007, null);
    }

    private final boolean a(s20 s20Var, String str) {
        return str.length() == this.f26934c;
    }
}
