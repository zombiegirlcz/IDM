package l91;

import com.revolut.feature.account_switching.impl.data.network.AccountSwitchingService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m91.i;
import m91.k;
import m91.m;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import u91.h;
import u91.u;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountSwitchingService f193020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f193021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m91.f f193022c;
    public final j d;
    public final ue0.c e;

    public g(AccountSwitchingService service, m sourceBankDetailsDao, m91.f accountSwitchingPaymentsDao, m91.a accountSwitchingAddressesDao, m91.d accountSwitchingOverriddenNamesDao, i accountSwitchingRequiredAttributeValuesDao, k accountSwitchingScheduledPaymentOverriddenDataDao, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(sourceBankDetailsDao, "sourceBankDetailsDao");
        Intrinsics.checkNotNullParameter(accountSwitchingPaymentsDao, "accountSwitchingPaymentsDao");
        Intrinsics.checkNotNullParameter(accountSwitchingAddressesDao, "accountSwitchingAddressesDao");
        Intrinsics.checkNotNullParameter(accountSwitchingOverriddenNamesDao, "accountSwitchingOverriddenNamesDao");
        Intrinsics.checkNotNullParameter(accountSwitchingRequiredAttributeValuesDao, "accountSwitchingRequiredAttributeValuesDao");
        Intrinsics.checkNotNullParameter(accountSwitchingScheduledPaymentOverriddenDataDao, "accountSwitchingScheduledPaymentOverriddenDataDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f193020a = service;
        this.f193021b = sourceBankDetailsDao;
        this.f193022c = accountSwitchingPaymentsDao;
        this.d = memoryCache;
        this.e = storage;
        final int i = 0;
        Continuation continuation = null;
        new x4l.c(new d(this, continuation, i), new Function1(this) { // from class: l91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193013b;

            {
                this.f193013b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.d) this.f193013b.d.get("ACCOUNT_SWITCHING_INTRO_DATA_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f193013b.d.get("SOURCE_BANKS_DETAILS_DATA_KEY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.e) this.f193013b.d.get("ACCOUNT_SWITCHING_PAYMENTS_KEY");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f193013b.d.get("SWITCHING_STATUS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u) this.f193013b.d.get("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY");
                }
            }
        }, new Function2(this) { // from class: l91.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193015b;

            {
                this.f193015b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        u91.d domain = (u91.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_INTRO_DATA_KEY", domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f193015b.d.f("SOURCE_BANKS_DETAILS_DATA_KEY", domain2);
                        break;
                    case 2:
                        u91.e domain3 = (u91.e) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_PAYMENTS_KEY", domain3);
                        break;
                    case 3:
                        h status = (h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f193015b.d.f("SWITCHING_STATUS_KEY", status);
                        break;
                    default:
                        u domain4 = (u) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY", domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, i), new l05.b(this, continuation, 5));
        final int i2 = 1;
        new x4l.c(new d(this, continuation, 3), new Function1(this) { // from class: l91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193013b;

            {
                this.f193013b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.d) this.f193013b.d.get("ACCOUNT_SWITCHING_INTRO_DATA_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f193013b.d.get("SOURCE_BANKS_DETAILS_DATA_KEY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.e) this.f193013b.d.get("ACCOUNT_SWITCHING_PAYMENTS_KEY");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f193013b.d.get("SWITCHING_STATUS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u) this.f193013b.d.get("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY");
                }
            }
        }, new Function2(this) { // from class: l91.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193015b;

            {
                this.f193015b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        u91.d domain = (u91.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_INTRO_DATA_KEY", domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f193015b.d.f("SOURCE_BANKS_DETAILS_DATA_KEY", domain2);
                        break;
                    case 2:
                        u91.e domain3 = (u91.e) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_PAYMENTS_KEY", domain3);
                        break;
                    case 3:
                        h status = (h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f193015b.d.f("SWITCHING_STATUS_KEY", status);
                        break;
                    default:
                        u domain4 = (u) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY", domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 3), new l05.b(this, continuation, 8));
        final int i3 = 2;
        new x4l.c(new d(this, continuation, 1), new Function1(this) { // from class: l91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193013b;

            {
                this.f193013b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.d) this.f193013b.d.get("ACCOUNT_SWITCHING_INTRO_DATA_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f193013b.d.get("SOURCE_BANKS_DETAILS_DATA_KEY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.e) this.f193013b.d.get("ACCOUNT_SWITCHING_PAYMENTS_KEY");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f193013b.d.get("SWITCHING_STATUS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u) this.f193013b.d.get("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY");
                }
            }
        }, new Function2(this) { // from class: l91.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193015b;

            {
                this.f193015b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i3) {
                    case 0:
                        u91.d domain = (u91.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_INTRO_DATA_KEY", domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f193015b.d.f("SOURCE_BANKS_DETAILS_DATA_KEY", domain2);
                        break;
                    case 2:
                        u91.e domain3 = (u91.e) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_PAYMENTS_KEY", domain3);
                        break;
                    case 3:
                        h status = (h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f193015b.d.f("SWITCHING_STATUS_KEY", status);
                        break;
                    default:
                        u domain4 = (u) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY", domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 1), new l05.b(this, continuation, 6));
        final int i5 = 3;
        new x4l.c(new d(this, continuation, 2), new Function1(this) { // from class: l91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193013b;

            {
                this.f193013b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.d) this.f193013b.d.get("ACCOUNT_SWITCHING_INTRO_DATA_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f193013b.d.get("SOURCE_BANKS_DETAILS_DATA_KEY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.e) this.f193013b.d.get("ACCOUNT_SWITCHING_PAYMENTS_KEY");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f193013b.d.get("SWITCHING_STATUS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u) this.f193013b.d.get("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY");
                }
            }
        }, new Function2(this) { // from class: l91.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193015b;

            {
                this.f193015b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i5) {
                    case 0:
                        u91.d domain = (u91.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_INTRO_DATA_KEY", domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f193015b.d.f("SOURCE_BANKS_DETAILS_DATA_KEY", domain2);
                        break;
                    case 2:
                        u91.e domain3 = (u91.e) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_PAYMENTS_KEY", domain3);
                        break;
                    case 3:
                        h status = (h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f193015b.d.f("SWITCHING_STATUS_KEY", status);
                        break;
                    default:
                        u domain4 = (u) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY", domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 2), new l05.b(this, continuation, 7));
        final int i6 = 4;
        new x4l.c(new d(this, continuation, i6), new Function1(this) { // from class: l91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193013b;

            {
                this.f193013b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.d) this.f193013b.d.get("ACCOUNT_SWITCHING_INTRO_DATA_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f193013b.d.get("SOURCE_BANKS_DETAILS_DATA_KEY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u91.e) this.f193013b.d.get("ACCOUNT_SWITCHING_PAYMENTS_KEY");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f193013b.d.get("SWITCHING_STATUS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (u) this.f193013b.d.get("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY");
                }
            }
        }, new Function2(this) { // from class: l91.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f193015b;

            {
                this.f193015b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i6) {
                    case 0:
                        u91.d domain = (u91.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_INTRO_DATA_KEY", domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f193015b.d.f("SOURCE_BANKS_DETAILS_DATA_KEY", domain2);
                        break;
                    case 2:
                        u91.e domain3 = (u91.e) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_PAYMENTS_KEY", domain3);
                        break;
                    case 3:
                        h status = (h) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f193015b.d.f("SWITCHING_STATUS_KEY", status);
                        break;
                    default:
                        u domain4 = (u) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f193015b.d.f("ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY", domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, i6), new l05.b(this, continuation, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a0 -> B:39:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(l91.g r13, gim.c r14) {
        /*
            com.revolut.feature.account_switching.impl.data.network.AccountSwitchingService r0 = r13.f193020a
            boolean r1 = r14 instanceof l91.f
            if (r1 == 0) goto L15
            r1 = r14
            l91.f r1 = (l91.f) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            l91.f r1 = new l91.f
            r1.<init>(r13, r14)
        L1a:
            java.lang.Object r13 = r1.f193019y
            fim.a r14 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.A
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L55
            if (r2 == r6) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            yhm.o.b(r13)
            goto Lb0
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            int r2 = r1.v
            int r7 = r1.u
            yhm.o.b(r13)
            r9 = r7
            goto La3
        L43:
            int r2 = r1.f193018x
            int r7 = r1.f193017w
            int r8 = r1.v
            int r9 = r1.u
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L4f
            goto L71
        L4f:
            r13 = move-exception
            r12 = r7
            r7 = r2
            r2 = r8
            r8 = r12
            goto L7c
        L55:
            yhm.o.b(r13)
            r13 = 20
            r9 = r13
            r7 = r3
        L5c:
            if (r7 >= r9) goto La7
            r1.u = r9     // Catch: java.lang.Exception -> L78
            r1.v = r7     // Catch: java.lang.Exception -> L78
            r1.f193017w = r7     // Catch: java.lang.Exception -> L78
            r1.f193018x = r3     // Catch: java.lang.Exception -> L78
            r1.A = r6     // Catch: java.lang.Exception -> L78
            java.lang.Object r13 = r0.getPayments(r1)     // Catch: java.lang.Exception -> L78
            if (r13 != r14) goto L6f
            goto Lb6
        L6f:
            r2 = r3
            r8 = r7
        L71:
            k91.c r13 = (k91.c) r13     // Catch: java.lang.Exception -> L4f
            u91.e r14 = pyd.c.c0(r13)     // Catch: java.lang.Exception -> L4f
            goto Lb6
        L78:
            r13 = move-exception
            r2 = r7
            r8 = r2
            r7 = r3
        L7c:
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r10)
            boolean r10 = r13 instanceof retrofit2.HttpException
            if (r10 == 0) goto La6
            r10 = r13
            retrofit2.HttpException r10 = (retrofit2.HttpException) r10
            int r10 = r10.code()
            r11 = 409(0x199, float:5.73E-43)
            if (r10 != r11) goto La6
            r1.u = r9
            r1.v = r2
            r1.f193017w = r8
            r1.f193018x = r7
            r1.A = r5
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r13 = skm.k0.b(r7, r1)
            if (r13 != r14) goto La3
            goto Lb6
        La3:
            int r7 = r2 + 1
            goto L5c
        La6:
            throw r13
        La7:
            r1.A = r4
            java.lang.Object r13 = r0.getPayments(r1)
            if (r13 != r14) goto Lb0
            goto Lb6
        Lb0:
            k91.c r13 = (k91.c) r13
            u91.e r14 = pyd.c.c0(r13)
        Lb6:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l91.g.a(l91.g, gim.c):java.lang.Object");
    }
}
