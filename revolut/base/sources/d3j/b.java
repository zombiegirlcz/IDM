package d3j;

import com.revolut.data.network.models.beneficiary.BankBeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryValidationResultDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.domain.models.beneficiary.BeneficiaryMatchScope;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import efm.d0;
import efm.r;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.n;
import w4l.k;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements w2j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o71.a f111211a;

    public b(o71.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f111211a = repository;
    }

    public final n e(n61.b request, BeneficiaryMatchScope matchScope) {
        Intrinsics.checkNotNullParameter(request, "beneficiaryParams");
        Intrinsics.checkNotNullParameter(matchScope, "matchScope");
        r21.h hVar = (r21.h) this.f111211a;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(matchScope, "matchScope");
        d0<BankBeneficiaryDto> d0VarCheckBeneficiary = hVar.f251037a.checkBeneficiary(BeneficiaryResponseMapperKt.toNetworkModel(request), matchScope);
        qza.a aVar = new qza.a(17, new r0e.i(18));
        d0VarCheckBeneficiary.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarCheckBeneficiary, aVar, 1), new qza.a(18, new r0e.i(19)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return w.i0(iVar);
    }

    public final r f(n61.b request, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        r21.h hVar = (r21.h) this.f111211a;
        Intrinsics.checkNotNullParameter(request, "request");
        d0<BeneficiaryDto> d0VarCreateAccount = hVar.f251037a.createAccount(BeneficiaryResponseMapperKt.toNetworkModel(request), z ? "BENEFICIARY_CREATION_DYNAMIC_NAME_AND_EMAIL" : null);
        qza.a aVar = new qza.a(19, new r0e.i(20));
        d0VarCreateAccount.getClass();
        r rVarX = new ufm.i(new ufm.i(d0VarCreateAccount, aVar, 1), new qza.a(21, new r21.b(hVar, 1)), 0).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return w.f0(rVarX);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d3j.a
            if (r0 == 0) goto L13
            r0 = r7
            d3j.a r0 = (d3j.a) r0
            int r1 = r0.f111210w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111210w = r1
            goto L18
        L13:
            d3j.a r0 = new d3j.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111210w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L4f
        L28:
            r6 = move-exception
            goto L54
        L2a:
            r6 = move-exception
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            o71.a r7 = r5.f111211a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f111210w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r21.h r7 = (r21.h) r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r21.f r2 = new r21.f     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r2.<init>(r7, r6, r4, r3)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r7 = skm.e0.J(r6, r2, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r7 != r1) goto L4f
            return r1
        L4f:
            n61.q r7 = (n61.q) r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L5a
        L54:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L5a:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 == 0) goto L69
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r6, r0)
        L69:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 != 0) goto L70
            goto L72
        L70:
            n61.q$a r7 = n61.q.a.f212701a
        L72:
            return r7
        L73:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d3j.b.g(java.lang.String, gim.c):java.lang.Object");
    }

    public final d0 h(String id10, tof.i type) {
        r rVarJ;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        r21.h hVar = (r21.h) this.f111211a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = r21.e.f251034b[type.ordinal()];
        if (i == 1) {
            rVarJ = hVar.j(id10, BeneficiarySpecialPurpose.PAYID_ALIAS, loadingStrategy);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            rVarJ = z9h.n.f(null, null, false, 6, null);
            Intrinsics.checkNotNullExpressionValue(rVarJ, "just(...)");
        }
        d0 d0VarFirstOrError = rVarJ.firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final r i(BankInformationCopFlow bankInformationCopFlow, String bankCountry, String str, Map fields) {
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(bankInformationCopFlow, "bankInformationCopFlow");
        return ue0.e.H(((r21.h) this.f111211a).g(bankInformationCopFlow, bankCountry, str, fields), h0.f322473a, new d27.d0(17));
    }

    public final r j(String id10, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((r21.h) this.f111211a).h(id10, loadingStrategy.equals(w4l.i.f294643c));
    }

    public final n k(n61.b request, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        r21.h hVar = (r21.h) this.f111211a;
        Intrinsics.checkNotNullParameter(request, "request");
        d0<BeneficiaryValidationResultDto> d0VarValidateAccount = hVar.f251037a.validateAccount(BeneficiaryResponseMapperKt.toNetworkModel(request), z ? "BENEFICIARY_CREATION_DYNAMIC_NAME_AND_EMAIL" : null);
        qza.a aVar = new qza.a(23, new r0e.i(21));
        d0VarValidateAccount.getClass();
        ufm.i iVar = new ufm.i(d0VarValidateAccount, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}
