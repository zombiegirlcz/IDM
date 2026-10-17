package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class he0 implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f29236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f29237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xj0 f29238c;
    private final l81 d;
    private final vc1 e;
    private final vc1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vc1 f29239g;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rc1.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public he0(Function0 workflowIdProvider, gj dataBundle, xj0 personBundle, l81 tinBundle, vc1 skipNationalityUseCase, vc1 skipPersonDetailsUseCase, vc1 tinBundleIsValidUseCase) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(skipNationalityUseCase, "skipNationalityUseCase");
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        Intrinsics.checkNotNullParameter(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        this.f29236a = workflowIdProvider;
        this.f29237b = dataBundle;
        this.f29238c = personBundle;
        this.d = tinBundle;
        this.e = skipNationalityUseCase;
        this.f = skipPersonDetailsUseCase;
        this.f29239g = tinBundleIsValidUseCase;
    }

    private final boolean b() {
        return this.f29237b.i() != null;
    }

    private final boolean c() {
        return this.e.a(true) && this.f.a(true);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        rc1[] elements = {rc1.f32689a, rc1.f32690b, b() ? rc1.f32691c : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = ((ArrayList) listL).iterator();
        while (it8.hasNext()) {
            i10 i10VarA = hj.a(this.f29237b, (String) this.f29236a.invoke(), (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listL, arrayList, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    @Override // com.fourthline.orca.internal.ic1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.h10 a(com.fourthline.orca.internal.ny r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.fourthline.orca.internal.dk0
            r1 = 0
            if (r0 == 0) goto Le
            boolean r10 = r9.c()
            if (r10 == 0) goto L1d
            com.fourthline.orca.internal.rc1 r10 = com.fourthline.orca.internal.rc1.d
            goto L1e
        Le:
            boolean r0 = r10 instanceof com.fourthline.orca.internal.j91
            if (r0 == 0) goto L1d
            com.fourthline.orca.internal.j91 r10 = (com.fourthline.orca.internal.j91) r10
            boolean r10 = r9.a(r10)
            if (r10 == 0) goto L1d
            com.fourthline.orca.internal.rc1 r10 = com.fourthline.orca.internal.rc1.f
            goto L1e
        L1d:
            r10 = r1
        L1e:
            java.util.List r3 = zhm.v.l(r10)
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto L7b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r3.iterator()
        L31:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r10.next()
            com.fourthline.orca.internal.rc1 r0 = (com.fourthline.orca.internal.rc1) r0
            int[] r2 = com.fourthline.orca.internal.he0.a.$EnumSwitchMapping$0
            int r5 = r0.ordinal()
            r2 = r2[r5]
            r5 = 1
            if (r2 == r5) goto L5c
            r5 = 2
            if (r2 == r5) goto L4d
            r0 = r1
            goto L6a
        L4d:
            com.fourthline.orca.internal.l81 r2 = r9.d
            kotlin.jvm.functions.Function0 r5 = r9.f29236a
            java.lang.Object r5 = r5.invoke()
            java.lang.String r5 = (java.lang.String) r5
            com.fourthline.orca.internal.i10 r0 = com.fourthline.orca.internal.l8.a(r2, r5, r0)
            goto L6a
        L5c:
            com.fourthline.orca.internal.xj0 r2 = r9.f29238c
            kotlin.jvm.functions.Function0 r5 = r9.f29236a
            java.lang.Object r5 = r5.invoke()
            java.lang.String r5 = (java.lang.String) r5
            com.fourthline.orca.internal.i10 r0 = com.fourthline.orca.internal.l8.a(r2, r5, r0)
        L6a:
            if (r0 == 0) goto L31
            r4.add(r0)
            goto L31
        L70:
            com.fourthline.orca.internal.h10 r2 = new com.fourthline.orca.internal.h10
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.he0.a(com.fourthline.orca.internal.ny):com.fourthline.orca.internal.h10");
    }

    private final boolean a(j91 j91Var) {
        return Intrinsics.f(j91Var.getIsTinCaptureRequired(), Boolean.FALSE) && this.f29239g.a(true);
    }
}
