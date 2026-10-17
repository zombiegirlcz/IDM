package com.fourthline.orca.internal;

import android.text.TextUtils;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.vc0;
import com.fourthline.orca.internal.y20;
import com.fourthline.orca.internal.z20;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes23.dex */
public final class xc0 implements v20, j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l9 f34947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p20 f34949c;
    private final vc0 d;

    public xc0(l9 repository, v10 imageServiceLocator, p20 analytics, z10 canHintImageSource) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(canHintImageSource, "canHintImageSource");
        this.f34947a = repository;
        this.f34948b = imageServiceLocator;
        this.f34949c = analytics;
        c81.a aVar = c81.f27404a;
        this.d = new vc0(c81.a.a(aVar, R.string.step_document_can_header, 0, 2, null), a(tc0.f33272a), c81.a.a(aVar, R.string.step_document_can_hint_can, 0, 2, null), canHintImageSource, new vc0.a(c81.a.a(aVar, R.string.step_document_can_footer_can_not_found, 0, 2, null), c81.a.a(aVar, R.string.shared_button_take_photos, 0, 2, null)), new vc0.b(c81.a.a(aVar, R.string.shared_button_continue, 0, 2, null), false), new c81.d(R.string.shared_button_back, R.string.shared_button_back_accessibility));
    }

    @Override // com.fourthline.orca.internal.v20
    public /* bridge */ s20 a(vc0 vc0Var, tc0 tc0Var, boolean z) {
        return super.a((ie1) vc0Var, (x20) tc0Var, z);
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public z20 a(tc0 type) {
        String strA;
        Intrinsics.checkNotNullParameter(type, "type");
        String strA2 = this.f34947a.a();
        return (strA2 == null || strA2.length() != 6 || (strA = this.f34947a.a()) == null || !TextUtils.isDigitsOnly(strA)) ? new z20.a(new y20.d()) : z20.b.f35505a;
    }

    @Override // com.fourthline.orca.internal.v20
    public p20 k() {
        return this.f34949c;
    }

    @Override // com.fourthline.orca.internal.v20
    public v10 s() {
        return this.f34948b;
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public vc0 getInitialState() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s20 a(vc0 vc0Var, tc0 type) {
        Intrinsics.checkNotNullParameter(vc0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return vc0Var.p();
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* bridge */ s20 b(vc0 vc0Var, tc0 tc0Var) {
        return super.b((ie1) vc0Var, (x20) tc0Var);
    }

    public String b(tc0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f34947a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.s20 a(com.fourthline.orca.internal.tc0 r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r19.b(r20)
            r2 = 0
            if (r1 == 0) goto L14
            int r3 = r1.length()
            if (r3 != 0) goto L17
        L14:
            r4 = r19
            goto L2c
        L17:
            com.fourthline.orca.internal.z20 r3 = r19.a(r20)
            boolean r4 = r3 instanceof com.fourthline.orca.internal.z20.a
            if (r4 == 0) goto L14
            com.fourthline.orca.internal.z20$a r3 = (com.fourthline.orca.internal.z20.a) r3
            com.fourthline.orca.internal.y20 r3 = r3.a()
            r4 = r19
            com.fourthline.orca.internal.c81 r0 = r4.a(r0, r3)
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 != 0) goto L33
            com.fourthline.orca.internal.l20 r3 = com.fourthline.orca.internal.l20.f30507a
        L31:
            r9 = r3
            goto L36
        L33:
            com.fourthline.orca.internal.l20 r3 = com.fourthline.orca.internal.l20.f30509c
            goto L31
        L36:
            com.fourthline.orca.internal.r20 r6 = com.fourthline.orca.internal.r20.f32617b
            if (r1 != 0) goto L3c
            java.lang.String r1 = ""
        L3c:
            r10 = r1
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            r3 = -2113338577(0xffffffff8209032f, float:-1.0066084E-37)
            r5 = 0
            r7 = 2
            com.fourthline.orca.internal.c81$d r11 = com.fourthline.orca.internal.c81.a.a(r1, r3, r5, r7, r2)
            r3 = -2113338699(0xffffffff820902b5, float:-1.0065947E-37)
            com.fourthline.orca.internal.c81$d r12 = com.fourthline.orca.internal.c81.a.a(r1, r3, r5, r7, r2)
            if (r0 != 0) goto L55
            com.fourthline.orca.internal.c81$b r1 = com.fourthline.orca.internal.c81.b.f27406b
            r13 = r1
            goto L56
        L55:
            r13 = r0
        L56:
            if (r0 == 0) goto L62
            com.fourthline.orca.internal.v10 r0 = r4.s()
            com.fourthline.orca.internal.r10 r1 = com.fourthline.orca.internal.r10.E0
            com.fourthline.orca.internal.z10 r2 = r0.a(r1)
        L62:
            r14 = r2
            com.fourthline.orca.internal.s20 r5 = new com.fourthline.orca.internal.s20
            r17 = 1540(0x604, float:2.158E-42)
            r18 = 0
            java.lang.String r7 = "document_can_number"
            r8 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = r5.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L83
            com.fourthline.orca.internal.p20 r0 = r4.k()
            r0.a(r5)
        L83:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xc0.a(com.fourthline.orca.internal.tc0):com.fourthline.orca.internal.s20");
    }

    @Override // com.fourthline.orca.internal.v20
    public c81 a(tc0 type, y20 value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return c81.f27404a.a(R.string.step_document_can_validation_invalid_can, value instanceof y20.c ? R.string.shared_validation_required_can_number_accessibility : R.string.shared_validation_invalid_can_number_accessibility);
    }

    public final Function1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new jn1(input, this, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc0 a(String str, xc0 xc0Var, vc0 vc0Var) {
        Intrinsics.checkNotNullParameter(vc0Var, "<this>");
        return vc0.a(vc0Var, null, s20.a(vc0Var.p(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, vc0.b.a(vc0Var.r(), null, xc0Var.a(tc0.f33272a) instanceof z20.b, 1, null), null, 93, null);
    }

    public final Function1 a(tc0 fieldType, boolean z) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        return new em1(z, this, fieldType, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc0 a(boolean z, xc0 xc0Var, tc0 tc0Var, vc0 vc0Var) {
        s20 s20VarA;
        Intrinsics.checkNotNullParameter(vc0Var, "<this>");
        if (z) {
            s20VarA = xc0Var.b((ie1) vc0Var, (x20) tc0Var);
        } else {
            s20VarA = xc0Var.a((ie1) vc0Var, (x20) tc0Var, vc0Var.p().getState() != l20.f30507a);
        }
        return vc0.a(vc0Var, null, s20VarA, null, null, null, null, null, ISO781611.SMT_TAG, null);
    }
}
