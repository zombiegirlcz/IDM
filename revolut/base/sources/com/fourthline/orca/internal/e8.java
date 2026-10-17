package com.fourthline.orca.internal;

import com.fourthline.orca.internal.y20;
import com.fourthline.orca.internal.z20;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e8 implements v20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8 f28015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p20 f28017c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dm.values().length];
            try {
                iArr[dm.f27818a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e8(f8 repository, v10 imageServiceLocator, p20 analytics) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f28015a = repository;
        this.f28016b = imageServiceLocator;
        this.f28017c = analytics;
    }

    @Override // com.fourthline.orca.internal.v20
    public /* bridge */ s20 a(fm fmVar, dm dmVar, boolean z) {
        return super.a((ie1) fmVar, (x20) dmVar, z);
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public z20 a(dm type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (a.$EnumSwitchMapping$0[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String strA = this.f28015a.a();
        return (strA == null || kotlin.text.d0.W(strA)) ? new z20.a(new y20.c()) : z20.b.f35505a;
    }

    @Override // com.fourthline.orca.internal.v20
    public p20 k() {
        return this.f28017c;
    }

    @Override // com.fourthline.orca.internal.v20
    public v10 s() {
        return this.f28016b;
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s20 a(fm fmVar, dm type) {
        Intrinsics.checkNotNullParameter(fmVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return fmVar.n();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.v20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* bridge */ s20 b(fm fmVar, dm dmVar) {
        return super.b((ie1) fmVar, (x20) dmVar);
    }

    public String b(dm type) {
        Intrinsics.checkNotNullParameter(type, "type");
        f8 f8Var = this.f28015a;
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return f8Var.a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.s20 a(com.fourthline.orca.internal.dm r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r25.b(r26)
            r2 = 0
            if (r1 == 0) goto L14
            int r3 = r1.length()
            if (r3 != 0) goto L17
        L14:
            r4 = r25
            goto L2c
        L17:
            com.fourthline.orca.internal.z20 r3 = r25.a(r26)
            boolean r4 = r3 instanceof com.fourthline.orca.internal.z20.a
            if (r4 == 0) goto L14
            com.fourthline.orca.internal.z20$a r3 = (com.fourthline.orca.internal.z20.a) r3
            com.fourthline.orca.internal.y20 r3 = r3.a()
            r4 = r25
            com.fourthline.orca.internal.c81 r3 = r4.a(r0, r3)
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 != 0) goto L33
            com.fourthline.orca.internal.l20 r5 = com.fourthline.orca.internal.l20.f30507a
        L31:
            r10 = r5
            goto L36
        L33:
            com.fourthline.orca.internal.l20 r5 = com.fourthline.orca.internal.l20.f30509c
            goto L31
        L36:
            com.fourthline.orca.internal.s20 r6 = new com.fourthline.orca.internal.s20
            if (r1 != 0) goto L3c
            java.lang.String r1 = ""
        L3c:
            r11 = r1
            com.fourthline.orca.internal.c81$b r12 = com.fourthline.orca.internal.c81.b.f27406b
            if (r3 != 0) goto L43
            r14 = r12
            goto L44
        L43:
            r14 = r3
        L44:
            r18 = 1799(0x707, float:2.521E-42)
            r19 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int[] r1 = com.fourthline.orca.internal.e8.a.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 != r1) goto L9b
            com.fourthline.orca.internal.c81$a r0 = com.fourthline.orca.internal.c81.f27404a
            r1 = -2113338429(0xffffffff820903c3, float:-1.006625E-37)
            r3 = 0
            r5 = 2
            com.fourthline.orca.internal.c81$d r17 = com.fourthline.orca.internal.c81.a.a(r0, r1, r3, r5, r2)
            r1 = -2113338699(0xffffffff820902b5, float:-1.0065947E-37)
            com.fourthline.orca.internal.c81$d r18 = com.fourthline.orca.internal.c81.a.a(r0, r1, r3, r5, r2)
            r23 = 1949(0x79d, float:2.731E-42)
            r24 = 0
            r12 = 0
            java.lang.String r13 = "person_birth_place"
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r11 = r6
            com.fourthline.orca.internal.s20 r0 = com.fourthline.orca.internal.s20.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r1 = r0.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L9a
            com.fourthline.orca.internal.p20 r1 = r4.k()
            r1.a(r0)
        L9a:
            return r0
        L9b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.e8.a(com.fourthline.orca.internal.dm):com.fourthline.orca.internal.s20");
    }

    @Override // com.fourthline.orca.internal.v20
    public c81 a(dm type, y20 error) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof y20.c) {
            return c81.f27404a.b(R.string.shared_validation_required_place_of_birth_accessibility);
        }
        return c81.f27404a.a(R.string.shared_validation_invalid_place_of_birth_accessibility);
    }
}
