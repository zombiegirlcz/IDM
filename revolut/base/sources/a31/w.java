package a31;

import ahe.w0;
import android.content.Context;
import c2d.z;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderPreconditions;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Claim;
import dej.b1;
import dfj.i1;
import dfj.w1;
import dp4.c0;
import eq5.g0;
import eq5.x0;
import ft3.h1;
import ix0.d0;
import java.io.File;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nfj.k0;
import nfj.u0;
import okhttp3.MultipartBody$Part;
import skm.e0;
import skm.h0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function2 {
    public Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f998y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f997x = obj2;
        this.f998y = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    private final Object b(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        k0 k0Var = ((i1) this.f996w).f113996a;
        String str = (String) this.z;
        String str2 = (String) this.A;
        Long l2 = (Long) this.f997x;
        String str3 = (String) this.f998y;
        this.v = 1;
        u0 u0Var = (u0) k0Var;
        u0Var.getClass();
        mp6.j jVar = new mp6.j(5, u0Var, l2, str3, str, str2, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, jVar, this);
        return objJ == aVar ? aVar : objJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007a -> B:31:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008a -> B:39:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.z
            dej.b1 r0 = (dej.b1) r0
            java.lang.Object r1 = r10.f998y
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r2 = r10.f997x
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r10.v
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L2f
            if (r4 == r6) goto L2b
            if (r4 != r5) goto L23
            java.lang.Object r4 = r10.f996w
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            yhm.o.b(r11)     // Catch: retrofit2.HttpException -> L21
            goto L7b
        L21:
            r11 = move-exception
            goto L82
        L23:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2b:
            yhm.o.b(r11)
            goto L55
        L2f:
            yhm.o.b(r11)
        L32:
            boolean r11 = skm.e0.y(r2)
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r1.f186409a
            com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r11 = (com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber) r11
            if (r11 == 0) goto L41
            dej.z2 r11 = r11.f100471b
            goto L42
        L41:
            r11 = r7
        L42:
            dej.z2 r4 = dej.z2.ACTIVE
            if (r11 == r4) goto L8f
            long r8 = r0.f113497c
            r10.f997x = r2
            r10.f996w = r7
            r10.v = r6
            java.lang.Object r11 = skm.k0.c(r8, r10)
            if (r11 != r3) goto L55
            goto L79
        L55:
            java.lang.Object r11 = r10.A
            dfj.w1 r11 = (dfj.w1) r11
            nfj.k0 r11 = r11.f114141a     // Catch: retrofit2.HttpException -> L80
            java.lang.String r4 = r0.f113495a     // Catch: retrofit2.HttpException -> L80
            r10.f997x = r2     // Catch: retrofit2.HttpException -> L80
            r10.f996w = r1     // Catch: retrofit2.HttpException -> L80
            r10.v = r5     // Catch: retrofit2.HttpException -> L80
            nfj.u0 r11 = (nfj.u0) r11     // Catch: retrofit2.HttpException -> L80
            r11.getClass()     // Catch: retrofit2.HttpException -> L80
            n8a.r r8 = new n8a.r     // Catch: retrofit2.HttpException -> L80
            r9 = 8
            r8.<init>(r9, r11, r4, r7)     // Catch: retrofit2.HttpException -> L80
            skm.p0 r11 = skm.p0.f264001a     // Catch: retrofit2.HttpException -> L80
            elm.f r11 = elm.f.f127540b     // Catch: retrofit2.HttpException -> L80
            java.lang.Object r11 = skm.e0.J(r11, r8, r10)     // Catch: retrofit2.HttpException -> L80
            if (r11 != r3) goto L7a
        L79:
            return r3
        L7a:
            r4 = r1
        L7b:
            com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r11 = (com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber) r11     // Catch: retrofit2.HttpException -> L21
            goto L8b
        L7e:
            r4 = r1
            goto L82
        L80:
            r11 = move-exception
            goto L7e
        L82:
            int r8 = r11.code()
            r9 = 404(0x194, float:5.66E-43)
            if (r8 != r9) goto L8e
            r11 = r7
        L8b:
            r4.f186409a = r11
            goto L32
        L8e:
            throw r11
        L8f:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.w.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            CreditCardService creditCardService = ((c0) this.f996w).f116604a;
            String str = (String) this.z;
            String str2 = (String) this.A;
            yn4.c0 c0Var = new yn4.c0(mo3.a.p((dj0.d) this.f997x), mo3.a.p((dj0.d) this.f998y));
            this.v = 1;
            if (creditCardService.repayCustomAmount(str, str2, c0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        e44.b bVar;
        h1 h1Var = (h1) this.f998y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            y14.d dVar = new y14.d((String) this.z, (String) this.A);
            e44.b bVar2 = (e44.b) this.f997x;
            CreditPluginsService creditPluginsService = bVar2.f122383b;
            String str = h1Var.f137835a;
            this.f996w = bVar2;
            this.v = 1;
            obj2 = creditPluginsService.editRefinancingBankProvider(str, dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (e44.b) this.f996w;
            yhm.o.b(obj2);
        }
        lv3.a aVarA = n14.i.a((y14.a) obj2);
        e44.b.a(bVar, aVarA, h1Var);
        return aVarA;
    }

    private final Object p(Object obj2) {
        File file = (File) this.f998y;
        e44.b bVar = (e44.b) this.f997x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            MultipartBody$Part multipartBody$PartB = bVar.d.b(file, String.valueOf(file.getName()));
            CreditPluginsService creditPluginsService = bVar.f122383b;
            String str = (String) this.z;
            this.f996w = bVar;
            this.v = 1;
            obj2 = creditPluginsService.uploadRefinancingDoc(str, multipartBody$PartB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (e44.b) this.f996w;
            yhm.o.b(obj2);
        }
        lv3.a aVarA = n14.i.a((y14.a) obj2);
        e44.b.a(bVar, aVarA, (h1) this.A);
        return aVarA;
    }

    private final Object s(Object obj2) {
        LoanDetails loanDetails;
        LoanBackupCard loanBackupCard;
        q35.r rVar;
        yhm.r rVar2 = (yhm.r) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            loanDetails = (LoanDetails) rVar2.f314201a;
            q35.r rVar3 = (q35.r) rVar2.f314202b;
            loanBackupCard = (LoanBackupCard) rVar2.f314203c;
            m35.c cVar = ((e75.o) this.A).f123079r;
            this.z = null;
            this.f996w = loanDetails;
            this.f997x = rVar3;
            this.f998y = loanBackupCard;
            this.v = 1;
            Object objB = ((c55.g) cVar).b(loanDetails, this);
            if (objB == aVar) {
                return aVar;
            }
            rVar = rVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loanBackupCard = (LoanBackupCard) this.f998y;
            rVar = (q35.r) this.f997x;
            loanDetails = (LoanDetails) this.f996w;
            yhm.o.b(obj2);
        }
        return new e75.e(loanDetails, rVar, loanBackupCard, (x35.e) obj2);
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            hi3.a aVar2 = ((ei3.m) this.f996w).f126385a;
            List listC = zhm.u.c(new pi3.l((String) this.z, pi3.s.PLAN, null, (pi3.p) this.f997x, (Instant) this.f998y, (PreorderPreconditions) this.A));
            this.v = 1;
            if (((hi3.i) aVar2).a(this, null, listC) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        h0 h0VarG;
        Object obj3;
        ei3.m mVar = (ei3.m) this.z;
        CoroutineScope coroutineScope = (CoroutineScope) this.f998y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            h0 h0VarG2 = e0.g(coroutineScope, null, null, new e8e.w(mVar, (CheckoutParams) this.A, continuation, 24), 3);
            h0VarG = e0.g(coroutineScope, null, null, new ei3.g(mVar, continuation, 1), 3);
            this.f998y = null;
            this.f996w = h0VarG;
            this.v = 1;
            obj2 = h0VarG2.y(this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj3 = this.f997x;
            yhm.o.b(obj2);
            return new Pair(obj3, obj2);
        }
        h0VarG = (h0) this.f996w;
        yhm.o.b(obj2);
        this.f998y = null;
        this.f996w = null;
        this.f997x = obj2;
        this.v = 2;
        Object objI = h0VarG.i(this);
        if (objI != aVar) {
            obj3 = obj2;
            obj2 = objI;
            return new Pair(obj3, obj2);
        }
        return aVar;
    }

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar = (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) this.f996w;
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.b bVar = new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.b(eVar, (String) this.z, (String) this.A, (String) this.f997x, (String) this.f998y, null);
            this.v = 1;
            if (eVar.p2(this, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (zh9.u0.b0(r2.X(), "CryptoSendAmountInputScreen_NextButton_LoadingTag", r1, r8) == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f996w
            r2 = r0
            com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j r2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) r2
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r7 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r7) goto L15
            yhm.o.b(r9)
            goto L5e
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L31
        L21:
            yhm.o.b(r9)
            ae5.a r9 = r2.f71284y
            ae5.c r1 = ae5.c.CTA_CLICKED
            r8.v = r3
            java.lang.Object r9 = r9.Z2()
            if (r9 != r0) goto L31
            goto L5d
        L31:
            ae5.b r9 = (ae5.b) r9
            ae5.b r1 = ae5.b.CONTINUE_FLOW
            if (r9 == r1) goto L3a
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L3a:
            com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.a r1 = new com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.a
            java.lang.Object r9 = r8.f998y
            r3 = r9
            com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r3 = (com.revolut.feature.crypto.withdraw.api.models.CryptoAddress) r3
            java.lang.Object r9 = r8.z
            r4 = r9
            dj0.d r4 = (dj0.d) r4
            java.lang.Object r9 = r8.A
            r5 = r9
            wk5.a r5 = (wk5.a) r5
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.v = r7
            tji.f r9 = r2.X()
            java.lang.String r2 = "CryptoSendAmountInputScreen_NextButton_LoadingTag"
            java.lang.Object r9 = zh9.u0.b0(r9, r2, r1, r8)
            if (r9 != r0) goto L5e
        L5d:
            return r0
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.w.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj2) {
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f996w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            x0 x0Var = jVar.f71278q;
            xi0.b bVar = (xi0.b) this.f997x;
            xi0.b bVar2 = ((FundingSource) this.f998y).f92241b;
            nqi.c cVar = (nqi.c) this.z;
            FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) this.A;
            this.v = 1;
            obj2 = x0Var.s(bVar, bVar2, cVar, fiatCryptoMoney, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nqi.c cVar2 = (nqi.c) obj2;
        jVar.H2(jVar.F, new eq4.g(cVar2, 2));
        g0 g0Var = jVar.f71280s;
        xi0.b currency = cVar2.f218471a.f115083b;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(currency, "newCurrency");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return jVar.X1(new mii.k("CryptoSendAmountInputScreen_CurrencySwitched_Shot", new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_withdrawal_switcher_toast, zhm.u.c(d0.a(currency, null)), null, 12), null, null, null, 28));
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w((x) this.f996w, (qua.p) this.f997x, (TransferReasonsValues) this.f998y, (String) this.z, (String) this.A, continuation, 0);
            case 1:
                w wVar = new w(1, (a41.x) this.f997x, (e41.c) this.f998y, (e41.d) this.z, (LinkedHashMap) this.A, continuation);
                wVar.f996w = obj2;
                return wVar;
            case 2:
                w wVar2 = new w(2, (a41.x) this.f997x, (e41.c) this.f998y, (e41.a) this.z, (LinkedHashMap) this.A, continuation);
                wVar2.f996w = obj2;
                return wVar2;
            case 3:
                w wVar3 = new w((w0) this.f998y, (List) this.z, (xi0.b) this.A, continuation, 3);
                wVar3.f997x = obj2;
                return wVar3;
            case 4:
                return new w(4, (akl.h) this.f997x, (AuthAction) this.f998y, (jkl.i) this.z, (cjl.g) this.A, continuation);
            case 5:
                return new w(5, (Claim) this.f996w, (akl.r) this.f997x, (Evidence) this.f998y, (String) this.z, (String) this.A, continuation);
            case 6:
                return new w((az0.u) this.f996w, (Context) this.f997x, (Image) this.f998y, (Function1) this.z, (Function0) this.A, continuation, 6);
            case 7:
                return new w(this.f996w, (String) this.z, (String) this.A, this.f997x, (Serializable) this.f998y, continuation, 7);
            case 8:
                return new w((r10.w) this.f996w, (String) this.z, (dj0.d) this.f997x, (String) this.A, (String) this.f998y, continuation);
            case 9:
                return new w((r10.w) this.f996w, (TopupMethodType) this.f997x, (dj0.d) this.f998y, (String) this.z, (String) this.A, continuation, 9);
            case 10:
                w wVar4 = new w((bwb.p) this.z, (bwb.a) this.A, continuation, 10);
                wVar4.f998y = obj2;
                return wVar4;
            case 11:
                w wVar5 = new w((z) this.A, continuation, 11);
                wVar5.z = obj2;
                return wVar5;
            case 12:
                w wVar6 = new w(12, (c48.g) this.f997x, (z38.n) this.f998y, (List) this.z, (j38.a) this.A, continuation);
                wVar6.f996w = obj2;
                return wVar6;
            case 13:
                return new w((cni.f) this.f996w, (cni.q) this.f997x, (ArrayList) this.f998y, continuation);
            case 14:
                w wVar7 = new w((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f998y, (bfl.g) this.z, (nel.z) this.A, continuation, 14);
                wVar7.f997x = obj2;
                return wVar7;
            case 15:
                return new w((d34.e) this.f998y, (String) this.z, (qu3.a) this.A, continuation, 15);
            case 16:
                return new w((d34.e) this.f998y, (String) this.z, (qu3.n) this.A, continuation, 16);
            case 17:
                return new w(this.f996w, (String) this.z, (String) this.A, this.f997x, (Serializable) this.f998y, continuation, 17);
            case 18:
                w wVar8 = new w((Ref$ObjectRef) this.f998y, (b1) this.z, (w1) this.A, continuation, 18);
                wVar8.f997x = obj2;
                return wVar8;
            case 19:
                return new w(this.f996w, (String) this.z, (String) this.A, this.f997x, (Serializable) this.f998y, continuation, 19);
            case 20:
                return new w((String) this.z, (String) this.A, (e44.b) this.f997x, (h1) this.f998y, continuation);
            case 21:
                return new w(21, (e44.b) this.f997x, (File) this.f998y, (String) this.z, (h1) this.A, continuation);
            case 22:
                return new w(22, (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f996w, (AccountId) this.f997x, (k1j.a) this.f998y, (String) this.z, (String) this.A, continuation);
            case 23:
                w wVar9 = new w((e75.o) this.A, continuation, 23);
                wVar9.z = obj2;
                return wVar9;
            case 24:
                return new w((ei3.m) this.f996w, (String) this.z, (pi3.p) this.f997x, (Instant) this.f998y, (PreorderPreconditions) this.A, continuation);
            case 25:
                w wVar10 = new w((ei3.m) this.z, (CheckoutParams) this.A, continuation, 25);
                wVar10.f998y = obj2;
                return wVar10;
            case 26:
                return new w(this.f996w, (String) this.z, (String) this.A, this.f997x, (Serializable) this.f998y, continuation, 26);
            case 27:
                return new w((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f996w, (xi0.b) this.f997x, (CryptoAddress) this.f998y, (dj0.d) this.z, (wk5.a) this.A, continuation, 27);
            case 28:
                return new w((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f996w, (xi0.b) this.f997x, (FundingSource) this.f998y, (nqi.c) this.z, (FiatCryptoMoney) this.A, continuation, 28);
            default:
                w wVar11 = new w((b9k.f) this.z, (nr6.b) this.A, continuation, 29);
                wVar11.f998y = obj2;
                return wVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((e41.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w) create((e41.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((w) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((w) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((w) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((w) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:565|(1:(1:(2:168|(15:170|568|171|172|237|241|244|(1:246)|247|(1:249)(1:250)|251|(1:253)(1:254)|(1:256)(1:257)|258|259)(2:177|178))(15:179|569|180|181|211|215|218|(1:220)|221|(1:223)|224|(1:226)(1:227)|(1:229)(1:231)|230|(3:570|233|(1:597)(12:236|237|241|244|(0)|247|(0)(0)|251|(0)(0)|(0)(0)|258|259))(11:240|241|244|(0)|247|(0)(0)|251|(0)(0)|(0)(0)|258|259)))(1:186))(2:187|(1:595))|190|(2:191|(2:193|(1:575)(1:576))(2:574|196))|197|(2:198|(2:200|(1:578)(1:579))(2:577|203))|204|563|205|(2:207|(1:596)(3:210|211|215))(2:214|215)|218|(0)|221|(0)|224|(0)(0)|(0)(0)|230|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04b1, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x04fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Object obj2, Object obj3, Object obj4, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f996w = obj2;
        this.f997x = obj3;
        this.z = str;
        this.A = str2;
        this.f998y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cni.f fVar, cni.q qVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.f996w = fVar;
        this.f997x = qVar;
        this.f998y = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ei3.m mVar, String str, pi3.p pVar, Instant instant, PreorderPreconditions preorderPreconditions, Continuation continuation) {
        super(2, continuation);
        this.u = 24;
        this.f996w = mVar;
        this.z = str;
        this.f997x = pVar;
        this.f998y = instant;
        this.A = preorderPreconditions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f996w = obj2;
        this.f997x = obj3;
        this.f998y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f998y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, String str, String str2, Object obj3, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f996w = obj2;
        this.z = str;
        this.A = str2;
        this.f997x = obj3;
        this.f998y = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, e44.b bVar, h1 h1Var, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.z = str;
        this.A = str2;
        this.f997x = bVar;
        this.f998y = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r10.w wVar, String str, dj0.d dVar, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.f996w = wVar;
        this.z = str;
        this.f997x = dVar;
        this.A = str2;
        this.f998y = str3;
    }
}
