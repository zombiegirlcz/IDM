package ox6;

import akl.s1;
import android.net.Uri;
import au0.j0;
import au6.k1;
import au6.w0;
import au6.z0;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.feature.html_viewer.api.declaration.HtmlViewerDestination;
import efm.d0;
import et6.p1;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import skm.p0;
import te0.w;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a f230638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f230639x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(FreelancerInvoice freelancerInvoice, com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = 14;
        this.f230639x = freelancerInvoice;
        this.f230638w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f230638w, this.f230639x, continuation, 0);
            case 1:
                return new r(this.f230638w, this.f230639x, continuation, 1);
            case 2:
                return new r(this.f230638w, this.f230639x, continuation, 2);
            case 3:
                return new r(this.f230638w, this.f230639x, continuation, 3);
            case 4:
                return new r(this.f230638w, this.f230639x, continuation, 4);
            case 5:
                return new r(this.f230638w, this.f230639x, continuation, 5);
            case 6:
                return new r(this.f230638w, this.f230639x, continuation, 6);
            case 7:
                return new r(this.f230638w, this.f230639x, continuation, 7);
            case 8:
                return new r(this.f230638w, this.f230639x, continuation, 8);
            case 9:
                return new r(this.f230638w, this.f230639x, continuation, 9);
            case 10:
                return new r(this.f230638w, this.f230639x, continuation, 10);
            case 11:
                return new r(this.f230638w, this.f230639x, continuation, 11);
            case 12:
                return new r(this.f230638w, this.f230639x, continuation, 12);
            case 13:
                return new r(this.f230638w, this.f230639x, continuation, 13);
            case 14:
                return new r(this.f230639x, this.f230638w, continuation);
            default:
                return new r(this.f230638w, this.f230639x, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        DateTime dateTimeM;
        FreelancerInvoiceSettings freelancerInvoiceSettings;
        sr6.b bVar;
        DateTime dateTimePlusDays;
        FreelancerInvoiceSettings freelancerInvoiceSettings2;
        sr6.a aVar;
        FreelancerInvoiceSettings freelancerInvoiceSettings3;
        sr6.a aVar2;
        DateTime dateTimeM2;
        Object objP2;
        Object objP22;
        Object objB2;
        Object objJ;
        int i = this.u;
        int i2 = 4;
        int i3 = 27;
        int i5 = 29;
        int i6 = 2;
        int i21 = 0;
        Continuation continuation = null;
        FreelancerInvoice freelancerInvoice = this.f230639x;
        com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar3 = this.f230638w;
        switch (i) {
            case 0:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p1 p1Var = aVar3.f73869s;
                String invoiceId = freelancerInvoice.f73374a;
                p1Var.getClass();
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                k1 k1Var = (k1) p1Var.f129298b;
                k1Var.getClass();
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                d0<qt6.b> d0VarCancelInvoice = k1Var.f9546a.cancelInvoice(invoiceId);
                atg.n nVar = new atg.n(i5, new j0(17));
                d0VarCancelInvoice.getClass();
                ufm.i iVar = new ufm.i(d0VarCancelInvoice, nVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.n nVarI0 = w.i0(k1Var.d(iVar));
                this.v = 1;
                Object objB3 = nim.a.b(nVarI0, this);
                return objB3 == aVar4 ? aVar4 : objB3;
            case 1:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar = new r(aVar3, freelancerInvoice, continuation, i21);
                this.v = 1;
                Object objP23 = aVar3.p2(this, rVar);
                return objP23 == aVar5 ? aVar5 : objP23;
            case 2:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarA = aVar3.f73869s.a(freelancerInvoice.f73374a);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    r rVar2 = new r(aVar3, freelancerInvoice, continuation, i6);
                    this.v = 1;
                    if (aVar3.p2(this, rVar2) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar3.B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    p1 p1Var2 = aVar3.f73869s;
                    String invoiceId2 = freelancerInvoice.f73374a;
                    p1Var2.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
                    ufm.n nVarB = ((k1) p1Var2.f129298b).b(invoiceId2);
                    this.v = 1;
                    objB = nim.a.b(nVarB, this);
                    if (objB == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                File file = (File) objB;
                Intrinsics.h(file);
                f9i.c cVar = new f9i.c(new f9i.d(file));
                this.v = 2;
                if (aVar3.G1(cVar, this) == aVar8) {
                    return aVar8;
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    r rVar3 = new r(aVar3, freelancerInvoice, continuation, i2);
                    this.v = 1;
                    if (aVar3.p2(this, rVar3) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                y yVar = aVar3.f73872x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                DateTime dateTimeG = ((l80.f) aVar3.f73867q).g();
                j jVar = (j) ((i) ((j2) yVar.f22677a).getValue()).f230624a.getContent();
                DateTime dateTime = (jVar == null || (freelancerInvoiceSettings3 = jVar.f230626b) == null || (aVar2 = freelancerInvoiceSettings3.f73405c) == null || (dateTimeM2 = e0.m(aVar2, dateTimeG)) == null) ? dateTimeG : dateTimeM2;
                j jVar2 = (j) ((i) ((j2) yVar.f22677a).getValue()).f230624a.getContent();
                if (jVar2 == null || (freelancerInvoiceSettings2 = jVar2.f230626b) == null || (aVar = freelancerInvoiceSettings2.f73404b) == null || (dateTimeM = e0.m(aVar, dateTimeG)) == null) {
                    dateTimeM = dateTimeG;
                }
                j jVar3 = (j) ((i) ((j2) yVar.f22677a).getValue()).f230624a.getContent();
                FreelancerInvoiceUpdate payload = FreelancerInvoiceUpdate.a(e0.L(freelancerInvoice), dateTime, dateTimeM, (jVar3 == null || (freelancerInvoiceSettings = jVar3.f230626b) == null || (bVar = freelancerInvoiceSettings.d) == null || (dateTimePlusDays = dateTimeM.plusDays(bVar.b())) == null) ? dateTimeG : dateTimePlusDays, null, null, null, 31736);
                p1 p1Var3 = aVar3.f73869s;
                p1Var3.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                k1 k1Var2 = (k1) p1Var3.f129298b;
                k1Var2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                d0<qt6.b> d0VarCreateInvoice = k1Var2.f9546a.createInvoice(ft6.h.j(payload));
                atg.n nVar2 = new atg.n(i3, new j0(15));
                d0VarCreateInvoice.getClass();
                ufm.i iVar2 = new ufm.i(d0VarCreateInvoice, nVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                ufm.n nVarI02 = w.i0(k1Var2.d(iVar2));
                this.v = 1;
                Object objB4 = nim.a.b(nVarI02, this);
                return objB4 == aVar10 ? aVar10 : objB4;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    r rVar4 = new r(aVar3, freelancerInvoice, continuation, 6);
                    this.v = 1;
                    objP2 = aVar3.p2(this, rVar4);
                    if (objP2 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) objP2;
                Intrinsics.h(freelancerInvoice2);
                aVar3.C2(new k(freelancerInvoice2.f73374a, freelancerInvoice2.i));
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p1 p1Var4 = aVar3.f73869s;
                String invoiceId3 = freelancerInvoice.f73374a;
                p1Var4.getClass();
                Intrinsics.checkNotNullParameter(invoiceId3, "invoiceId");
                k1 k1Var3 = (k1) p1Var4.f129298b;
                k1Var3.getClass();
                Intrinsics.checkNotNullParameter(invoiceId3, "invoiceId");
                d0<qt6.b> d0VarMarkInvoiceAsPaid = k1Var3.f9546a.markInvoiceAsPaid(invoiceId3);
                atg.n nVar3 = new atg.n(24, new j0(13));
                d0VarMarkInvoiceAsPaid.getClass();
                ufm.i iVar3 = new ufm.i(d0VarMarkInvoiceAsPaid, nVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                ufm.n nVarI03 = w.i0(k1Var3.d(iVar3));
                this.v = 1;
                Object objB5 = nim.a.b(nVarI03, this);
                return objB5 == aVar12 ? aVar12 : objB5;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar5 = new r(aVar3, freelancerInvoice, continuation, 8);
                this.v = 1;
                Object objP24 = aVar3.p2(this, rVar5);
                return objP24 == aVar13 ? aVar13 : objP24;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p1 p1Var5 = aVar3.f73869s;
                String invoiceId4 = freelancerInvoice.f73374a;
                p1Var5.getClass();
                Intrinsics.checkNotNullParameter(invoiceId4, "invoiceId");
                k1 k1Var4 = (k1) p1Var5.f129298b;
                k1Var4.getClass();
                Intrinsics.checkNotNullParameter(invoiceId4, "invoiceId");
                d0<ResponseBody> invoiceEmailHtml = k1Var4.f9546a.getInvoiceEmailHtml(invoiceId4);
                z0 z0Var = new z0(new w0(k1Var4, invoiceId4, 1), 0);
                invoiceEmailHtml.getClass();
                ufm.i iVar4 = new ufm.i(invoiceEmailHtml, z0Var, 0);
                Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                ufm.n nVarI04 = w.i0(iVar4);
                this.v = 1;
                Object objB6 = nim.a.b(nVarI04, this);
                return objB6 == aVar14 ? aVar14 : objB6;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    r rVar6 = new r(aVar3, freelancerInvoice, continuation, 10);
                    this.v = 1;
                    objP22 = aVar3.p2(this, rVar6);
                    if (objP22 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP22 = obj2;
                }
                Uri uri2 = (Uri) objP22;
                Intrinsics.h(uri2);
                aVar3.C1(new HtmlViewerDestination(new HtmlViewerDestination.InputData(new HtmlDocumentDescriptor.HtmlLocalFileDescriptor(uri2), new TextLocalisedClause(R$string.freelancer_invoice_preview_title, null, null, 14))));
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ufm.n nVarF = aVar3.f73869s.f(freelancerInvoice.f73374a);
                this.v = 1;
                Object objB7 = nim.a.b(nVarF, this);
                return objB7 == aVar16 ? aVar16 : objB7;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar7 = new r(aVar3, freelancerInvoice, continuation, 12);
                this.v = 1;
                Object objP25 = aVar3.p2(this, rVar7);
                return objP25 == aVar17 ? aVar17 : objP25;
            case 14:
                p1 p1Var6 = aVar3.f73869s;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 == 1) {
                        yhm.o.b(obj2);
                        objJ = obj2;
                        return (FreelancerInvoice) objJ;
                    }
                    if (i104 == 2) {
                        yhm.o.b(obj2);
                        objB2 = obj2;
                        return (FreelancerInvoice) objB2;
                    }
                    if (i104 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return Unit.f186387a;
                }
                yhm.o.b(obj2);
                boolean zB = freelancerInvoice.b();
                String str = freelancerInvoice.f73374a;
                if (!zB) {
                    String str2 = freelancerInvoice.f73381m;
                    if (str2 == null) {
                        throw new IllegalStateException("Customer id must not be null");
                    }
                    d0 d0VarFirstOrError = m70.a.g(aVar3.f73868r.b(str2, false), null, null, 3).firstOrError();
                    or2.e eVar = new or2.e(new oqk.c(aVar3, 29), i3);
                    d0VarFirstOrError.getClass();
                    pfm.a aVar19 = new pfm.a(d0VarFirstOrError, eVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar19, "flatMapCompletable(...)");
                    this.v = 3;
                    if (nim.a.a(aVar19, this) == aVar18) {
                        return aVar18;
                    }
                    return Unit.f186387a;
                }
                if (!freelancerInvoice.d()) {
                    ufm.n nVarG = p1Var6.g(str);
                    this.v = 2;
                    objB2 = nim.a.b(nVarG, this);
                    if (objB2 == aVar18) {
                        return aVar18;
                    }
                    return (FreelancerInvoice) objB2;
                }
                this.v = 1;
                k1 k1Var5 = (k1) p1Var6.f129298b;
                k1Var5.getClass();
                s1 s1Var = new s1(k1Var5, str, (Continuation) null, 11);
                p0 p0Var = p0.f264001a;
                objJ = skm.e0.J(elm.f.f127540b, s1Var, this);
                if (objJ == aVar18) {
                    return aVar18;
                }
                return (FreelancerInvoice) objJ;
            default:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar8 = new r(freelancerInvoice, aVar3, null);
                this.v = 1;
                Object objP26 = aVar3.p2(this, rVar8);
                return objP26 == aVar20 ? aVar20 : objP26;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar, FreelancerInvoice freelancerInvoice, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f230638w = aVar;
        this.f230639x = freelancerInvoice;
    }
}
