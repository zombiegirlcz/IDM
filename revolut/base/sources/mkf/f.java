package mkf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f206240b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f206241a;

    static {
        String[] elements = {"COLOMBIA_ACH_ACCOUNT_TYPE", "COLOMBIA_BANK_CODE", "COLOMBIA_DOCUMENT_TYPE", "COLOMBIA_DOCUMENT_NUMBER"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f206240b = kotlin.collections.d.y0(elements);
    }

    public f(d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f206241a = beneficiaryInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(tof.a3 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mkf.e
            if (r0 == 0) goto L13
            r0 = r6
            mkf.e r0 = (mkf.e) r0
            int r1 = r0.f206238w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206238w = r1
            goto L18
        L13:
            mkf.e r0 = new mkf.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206238w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r6 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            tof.x6 r5 = r5.I
            tof.e3 r6 = r5.d
            r2 = 0
            if (r6 == 0) goto L42
            java.lang.String r6 = r6.f272726a
            if (r6 != 0) goto L4a
        L42:
            tof.c3 r5 = r5.e
            if (r5 == 0) goto L49
            java.lang.String r6 = r5.f272662a
            goto L4a
        L49:
            r6 = r2
        L4a:
            if (r6 == 0) goto L73
            d3j.b r5 = r4.f206241a
            w4l.h r2 = w4l.h.f294642c
            efm.r r5 = r5.j(r6, r2)
            efm.r r5 = zi0.c.J(r5)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.f206238w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r5 = r6.getContent()
            f5j.a r5 = (f5j.a) r5
            return r5
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mkf.f.a(tof.a3, gim.c):java.io.Serializable");
    }
}
