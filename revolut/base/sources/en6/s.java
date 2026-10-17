package en6;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xg6.x;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements oe6.k {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f127758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f127759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f127760c;
    public final fk3.a d;

    public s(gte.a featureToggleInteractor, n mandateDialogCounter, x mandateInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mandateDialogCounter, "mandateDialogCounter");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f127758a = featureToggleInteractor;
        this.f127759b = mandateDialogCounter;
        this.f127760c = mandateInteractor;
        this.d = configurationInteractor;
    }

    public final boolean a(String institutionId) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        o oVar = (o) this.f127759b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        ecm.q qVar = oVar.f127751a;
        String key = "MANDATE_DIALOG_COUNTER_" + institutionId;
        Intrinsics.checkNotNullParameter(key, "key");
        int i = ((SharedPreferences) qVar.f124861b).getInt(key, 0);
        if (i <= 15) {
            Integer[] elements = {1, 4, 8, 15};
            Intrinsics.checkNotNullParameter(elements, "elements");
            zContains = kotlin.collections.d.y0(elements).contains(Integer.valueOf(i));
        } else {
            zContains = i % 5 == 0;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        String key2 = "MANDATE_DIALOG_COUNTER_" + institutionId;
        SharedPreferences sharedPreferences = (SharedPreferences) oVar.f127751a.f124861b;
        Intrinsics.checkNotNullParameter(key2, "key");
        int i2 = sharedPreferences.getInt(key2, 0) + 1;
        int i3 = i2 >= 0 ? i2 : 0;
        Intrinsics.checkNotNullParameter(key2, "key");
        sharedPreferences.edit().putInt(key2, i3).commit();
        return zContains;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, se6.b r9, dj0.d r10, com.revolut.domain.models.topup.TopUpContext r11, gim.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof en6.r
            if (r0 == 0) goto L13
            r0 = r12
            en6.r r0 = (en6.r) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            en6.r r0 = new en6.r
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            e7l.f r8 = r0.f127757y
            com.revolut.domain.models.topup.TopUpContext r9 = r0.f127756x
            dj0.d r10 = r0.f127755w
            se6.b r11 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r12)
            goto L8c
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            com.revolut.domain.models.topup.TopUpContext r11 = r0.f127756x
            dj0.d r10 = r0.f127755w
            se6.b r9 = r0.v
            java.lang.String r8 = r0.u
            yhm.o.b(r12)
            goto L6e
        L48:
            yhm.o.b(r12)
            w4l.j r12 = w4l.j.f294644c
            fk3.a r2 = r7.d
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r5 = e7l.g.b.f123407a
            efm.r r12 = r2.l(r5, r12)
            r2 = 3
            r5 = 0
            efm.r r12 = m70.a.g(r12, r5, r5, r2)
            r0.u = r8
            r0.v = r9
            r0.f127755w = r10
            r0.f127756x = r11
            r0.B = r4
            java.lang.Object r12 = nim.a.c(r12, r0)
            if (r12 != r1) goto L6e
            goto L84
        L6e:
            e7l.f r12 = (e7l.f) r12
            r0.u = r8
            r0.v = r9
            r0.f127755w = r10
            r0.f127756x = r11
            r0.f127757y = r12
            r0.B = r3
            xg6.x r2 = r7.f127760c
            java.lang.Object r0 = r2.c(r0)
            if (r0 != r1) goto L85
        L84:
            return r1
        L85:
            r6 = r0
            r0 = r8
            r8 = r12
            r12 = r6
            r6 = r11
            r11 = r9
            r9 = r6
        L8c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc1
            boolean r12 = r11.f262122a
            if (r12 == 0) goto Lc1
            boolean r11 = r11.d
            if (r11 != 0) goto Lc1
            boolean r9 = r9 instanceof com.revolut.domain.models.topup.TopUpContext.Joint
            if (r9 == 0) goto Lac
            com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointLinkedOBTopups r9 = com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointLinkedOBTopups.f76461c
            gte.a r11 = r7.f127758a
            jte.d r11 = (jte.d) r11
            boolean r9 = r11.c(r9)
            if (r9 == 0) goto Lc1
        Lac:
            dj0.d r8 = r8.O0
            r11 = 2
            dj0.d r8 = pyd.c.k(r8, r11)
            boolean r8 = r10.i(r8)
            if (r8 == 0) goto Lc1
            boolean r8 = r7.a(r0)
            if (r8 == 0) goto Lc1
            goto Lc2
        Lc1:
            r4 = 0
        Lc2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: en6.s.b(java.lang.String, se6.b, dj0.d, com.revolut.domain.models.topup.TopUpContext, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[EDGE_INSN: B:56:0x0163->B:53:0x0163 BREAK  A[LOOP:0: B:45:0x0147->B:58:?]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r18, boolean r19, dj0.d r20, com.revolut.domain.models.topup.TopUpContext r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en6.s.c(java.lang.String, boolean, dj0.d, com.revolut.domain.models.topup.TopUpContext, gim.c):java.lang.Object");
    }
}
