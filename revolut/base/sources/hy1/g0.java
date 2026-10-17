package hy1;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class g0 implements ky1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by1.a f156647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.h f156648b;

    public g0(by1.a contactDao, lx1.h apmRecipientFilterInteractor) {
        Intrinsics.checkNotNullParameter(contactDao, "contactDao");
        Intrinsics.checkNotNullParameter(apmRecipientFilterInteractor, "apmRecipientFilterInteractor");
        this.f156647a = contactDao;
        this.f156648b = apmRecipientFilterInteractor;
    }

    @Override // ky1.a
    public final Flow a(String str) {
        return new b0(e(), this, str, 1);
    }

    @Override // ky1.a
    public final Object b(List list, Continuation continuation) throws Throwable {
        hul.f0 f0Var = new hul.f0(this, list, null, 17);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, f0Var, continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // ky1.a
    public final Object c(String str, gim.c cVar) {
        d0 d0Var = new d0(this, str, null, 0);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, d0Var, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ky1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof hy1.f0
            if (r0 == 0) goto L13
            r0 = r13
            hy1.f0 r0 = (hy1.f0) r0
            int r1 = r0.f156646y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156646y = r1
            goto L1a
        L13:
            hy1.f0 r0 = new hy1.f0
            gim.c r13 = (gim.c) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.f156644w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156646y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.revolut.feature.apm.core.models.recipients.QvikContact r11 = r0.v
            yhm.o.b(r13)
            return r11
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings r12 = r0.u
            yhm.o.b(r13)
        L3b:
            r7 = r12
            goto L4b
        L3d:
            yhm.o.b(r13)
            r0.u = r12
            r0.f156646y = r4
            java.lang.Object r13 = r10.c(r11, r0)
            if (r13 != r1) goto L3b
            goto L6a
        L4b:
            r4 = r13
            com.revolut.feature.apm.core.models.recipients.QvikContact r4 = (com.revolut.feature.apm.core.models.recipients.QvikContact) r4
            r11 = 0
            if (r4 == 0) goto L6c
            r8 = 0
            r9 = 895(0x37f, float:1.254E-42)
            r5 = 0
            r6 = 0
            com.revolut.feature.apm.core.models.recipients.QvikContact r12 = com.revolut.feature.apm.core.models.recipients.QvikContact.a(r4, r5, r6, r7, r8, r9)
            java.util.List r13 = zhm.u.c(r12)
            r0.u = r11
            r0.v = r12
            r0.f156646y = r3
            java.lang.Object r11 = r10.b(r13, r0)
            if (r11 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r12
        L6c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hy1.g0.d(java.lang.String, com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ky1.a
    public final vkm.d e() {
        efm.r map = this.f156647a.g().map(new m(9, new i(11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final vkm.d f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = this.f156647a.f(id10).map(new m(10, new i(12)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final Object g(String str, fy1.c cVar) {
        d0 d0Var = new d0(this, str, null, 1);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, d0Var, cVar);
    }
}
