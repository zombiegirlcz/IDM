package kotlin.jvm.internal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.R$id;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressSuggestion;
import com.revolut.feature.address.models.AddressVerificationFailureReason;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.tax_residency.api.exemption.model.PartnerInformation;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterDestinationTransaction;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination;
import ix0.s1;
import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import zhm.z0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class s implements vh.d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public static final PigeonNode A(cg0.f0 f0Var, String str) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        gj0.a aVar = gj0.c.Companion;
        String strG = f0Var.getType();
        aVar.getClass();
        gj0.c cVarA = gj0.a.a(strG);
        String strE = f0Var.getKey();
        String strF = f0Var.getTitle();
        boolean zC = f0Var.getHidden();
        String strD = f0Var.getIcon();
        String strB = f0Var.getDeeplink();
        List listA = f0Var.getChildren();
        if (listA != null) {
            List list = listA;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(A((cg0.f0) it8.next(), f0Var.getKey()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = zhm.f0.f322471a;
        }
        return new PigeonNode(strE, strF, cVarA, zC, strD, strB, str, arrayList);
    }

    public static final PigeonNode B(zf0.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        gj0.a aVar = gj0.c.Companion;
        String str = hVar.f321848a;
        aVar.getClass();
        gj0.c cVarA = gj0.a.a(str);
        String str2 = hVar.f321849b;
        String str3 = hVar.d;
        boolean z = hVar.e;
        String str4 = hVar.f321852h;
        String str5 = hVar.f;
        String str6 = hVar.f321850c;
        if (str6.length() <= 0) {
            str6 = null;
        }
        return new PigeonNode(str2, str3, cVarA, z, str4, str5, str6, zhm.f0.f322471a);
    }

    public static final AddressSuggestion C(bj1.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        boolean zC = bVar.getVerified();
        no3.b bVarB = bVar.getSuggestedAddress();
        AddressVerificationFailureReason addressVerificationFailureReason = null;
        Address addressA = bVarB != null ? oo3.a.a(bVarB) : null;
        String strA = bVar.getFailureReason();
        if (strA != null) {
            AddressVerificationFailureReason[] addressVerificationFailureReasonArrValues = AddressVerificationFailureReason.values();
            int length = addressVerificationFailureReasonArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AddressVerificationFailureReason addressVerificationFailureReason2 = addressVerificationFailureReasonArrValues[i];
                if (kotlin.text.a0.z(addressVerificationFailureReason2.name(), strA, true)) {
                    addressVerificationFailureReason = addressVerificationFailureReason2;
                    break;
                }
                i++;
            }
        }
        return new AddressSuggestion(zC, addressA, addressVerificationFailureReason);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution D(ysj.k r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r2 = r10.f316487a
            java.lang.String r3 = r10.f316488b
            java.lang.String r5 = r10.d
            java.lang.String r0 = r10.f316489c
            int r1 = r0.hashCode()
            switch(r1) {
                case -1429540080: goto L5e;
                case 527514546: goto L52;
                case 1383663147: goto L46;
                case 1430517727: goto L3a;
                case 1746537160: goto L2e;
                case 1967871671: goto L22;
                case 2066319421: goto L15;
                default: goto L14;
            }
        L14:
            goto L66
        L15:
            java.lang.String r1 = "FAILED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L66
        L1e:
            yzi.b r0 = yzi.b.FAILED
        L20:
            r4 = r0
            goto L6c
        L22:
            java.lang.String r1 = "APPROVED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L66
        L2b:
            yzi.b r0 = yzi.b.APPROVED
            goto L20
        L2e:
            java.lang.String r1 = "CREATED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L66
        L37:
            yzi.b r0 = yzi.b.CREATED
            goto L20
        L3a:
            java.lang.String r1 = "DEFERRED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L66
        L43:
            yzi.b r0 = yzi.b.DEFERRED
            goto L20
        L46:
            java.lang.String r1 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L66
        L4f:
            yzi.b r0 = yzi.b.COMPLETED
            goto L20
        L52:
            java.lang.String r1 = "IN_REVIEW"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L66
        L5b:
            yzi.b r0 = yzi.b.IN_REVIEW
            goto L20
        L5e:
            java.lang.String r1 = "SKIPPED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
        L66:
            yzi.b r0 = yzi.b.UNKNOWN
            goto L20
        L69:
            yzi.b r0 = yzi.b.SKIPPED
            goto L20
        L6c:
            long r6 = r10.e
            java.util.List r0 = r10.f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            ysj.j r1 = (ysj.j) r1
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination r1 = E(r1)
            r8.add(r1)
            goto L81
        L95:
            ysj.j r10 = r10.f316490g
            if (r10 == 0) goto L9f
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination r10 = E(r10)
        L9d:
            r9 = r10
            goto La1
        L9f:
            r10 = 0
            goto L9d
        La1:
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution r1 = new com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution
            r1.<init>(r2, r3, r4, r5, r6, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.s.D(ysj.k):com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination E(ysj.j r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.s.E(ysj.j):com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination");
    }

    public static final hha.l F(gfk.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        List listA = uVar.getActivePlanCampaigns();
        ArrayList arrayList = null;
        if (listA != null) {
            List<gfk.t> list = listA;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            for (gfk.t tVar : list) {
                Intrinsics.checkNotNullParameter(tVar, "<this>");
                hha.k kVarValueOf = hha.k.valueOf(tVar.getType());
                String strC = tVar.getPricingPlanId();
                String strA = tVar.getEndDate();
                LocalDate localDateFrom = strA != null ? LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse(strA)) : null;
                Period period = Period.parse(tVar.getTotalPeriod());
                Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
                String strB = tVar.getLeftPeriod();
                arrayList2.add(new hha.j(kVarValueOf, strC, localDateFrom, period, strB != null ? Period.parse(strB) : null));
            }
            arrayList = arrayList2;
        }
        return new hha.l(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList G(java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.s.G(java.util.List):java.util.ArrayList");
    }

    public static final ry3.a H(i24.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ry3.a(new File(aVar.getFilePath()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final svi.i0 I(gwi.i2 r19) {
        /*
            r0 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            svi.i0 r2 = new svi.i0
            int r3 = r0.f147423a
            gwi.c2 r0 = r0.f147424b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            svi.g0 r4 = new svi.g0
            jo3.a r5 = r0.f147362a
            r6 = 0
            if (r5 == 0) goto L1c
            dj0.d r5 = mo3.a.o(r5)
            goto L1d
        L1c:
            r5 = r6
        L1d:
            jo3.a r7 = r0.f147363b
            dj0.d r7 = mo3.a.o(r7)
            r8 = r6
            r6 = r7
            java.lang.String r7 = r0.f147364c
            jo3.a r9 = r0.d
            if (r9 == 0) goto L30
            dj0.d r9 = mo3.a.o(r9)
            goto L31
        L30:
            r9 = r8
        L31:
            jo3.a r10 = r0.e
            dj0.d r10 = mo3.a.o(r10)
            jo3.a r11 = r0.f
            if (r11 == 0) goto L40
            dj0.d r11 = mo3.a.o(r11)
            goto L41
        L40:
            r11 = r8
        L41:
            gwi.w1 r0 = r0.f147365g
            if (r0 == 0) goto La3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r8 = r0.f147550a
            jo3.a r12 = r0.f147551b
            dj0.d r12 = mo3.a.o(r12)
            java.util.List r0 = r0.f147552c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = zhm.w.t(r0, r14)
            r13.<init>(r14)
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L97
            java.lang.Object r14 = r0.next()
            gwi.t1 r14 = (gwi.t1) r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            svi.d0 r15 = new svi.d0
            r19 = r0
            java.lang.String r0 = r14.f147520a
            r16 = r1
            jo3.a r1 = r14.f147521b
            dj0.d r1 = mo3.a.o(r1)
            r17 = r4
            jo3.a r4 = r14.f147522c
            dj0.d r4 = mo3.a.o(r4)
            boolean r14 = r14.d
            r15.<init>(r1, r4, r0, r14)
            r13.add(r15)
            r0 = r19
            r1 = r16
            r4 = r17
            goto L63
        L97:
            r17 = r4
            svi.e0 r0 = new svi.e0
            r0.<init>(r12, r8, r13)
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r0
            goto Laa
        La3:
            r18 = r11
            r11 = r8
            r8 = r9
            r9 = r10
            r10 = r18
        Laa:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.<init>(r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.s.I(gwi.i2):svi.i0");
    }

    public static final xme.f J(pne.e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String str = e0Var.f237712a;
        pne.f fVar = e0Var.f237713b;
        List<pne.r> list = fVar.f237716a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (pne.r rVar : list) {
            String str2 = rVar.f237735g;
            String str3 = rVar.f237732a;
            String str4 = rVar.f237733b;
            ValidityPeriod validityPeriodD = knm.b.D(rVar.f237734c);
            dj0.d dVar = rVar.f;
            dj0.d dVar2 = rVar.e;
            pne.x xVar = rVar.d;
            arrayList.add(new xme.c(str3, str4, validityPeriodD, xVar != null ? new PartnerInformation(xVar.f237741a, xVar.f237742b) : null, dVar, dVar2, str2));
        }
        List<pne.l> list2 = fVar.f237717b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (pne.l lVar : list2) {
            arrayList2.add(new xme.b(lVar.f237725a, knm.b.D(lVar.f237726b)));
        }
        xme.a aVar = new xme.a(arrayList, arrayList2);
        List<pne.d0> list3 = e0Var.f237714c;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
        for (pne.d0 d0Var : list3) {
            arrayList3.add(new xme.g(d0Var.f237709a, d0Var.f237710b, d0Var.f237711c));
        }
        return new xme.f(str, aVar, arrayList3);
    }

    public static final lfj.d K(dej.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof dej.x) {
            dej.x xVar = (dej.x) yVar;
            return new lfj.d(xVar.f113688c.name(), xVar.f113686a, xVar.f113687b);
        }
        if (!(yVar instanceof dej.w)) {
            throw new NoWhenBranchMatchedException();
        }
        dej.w wVar = (dej.w) yVar;
        return new lfj.d(wVar.f113676c.name(), wVar.f113674a, wVar.f113675b);
    }

    public static final i24.a L(ry3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String path = aVar.f258207a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return new i24.a(path);
    }

    public static final ysj.j M(IncomeSorterExecutionDestination incomeSorterExecutionDestination) {
        Intrinsics.checkNotNullParameter(incomeSorterExecutionDestination, "<this>");
        ysj.c cVarC = zsj.b.c(incomeSorterExecutionDestination.f99242a);
        ArrayList<IncomeSorterDestinationTransaction> arrayList = incomeSorterExecutionDestination.f99243b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (IncomeSorterDestinationTransaction incomeSorterDestinationTransaction : arrayList) {
            Intrinsics.checkNotNullParameter(incomeSorterDestinationTransaction, "<this>");
            arrayList2.add(new ysj.f(incomeSorterDestinationTransaction.f99236a, incomeSorterDestinationTransaction.f99237b.toString()));
        }
        return new ysj.j(cVarC, arrayList2, incomeSorterExecutionDestination.f99244c.toString());
    }

    public static final ysj.k N(IncomeSorterExecution incomeSorterExecution) {
        String str;
        Intrinsics.checkNotNullParameter(incomeSorterExecution, "<this>");
        String str2 = incomeSorterExecution.f99238a;
        String str3 = incomeSorterExecution.f99239b;
        String str4 = incomeSorterExecution.d;
        switch (zsj.c.f324941a[incomeSorterExecution.f99240c.ordinal()]) {
            case 1:
                str = "COMPLETED";
                break;
            case 2:
                str = "FAILED";
                break;
            case 3:
                str = "CREATED";
                break;
            case 4:
                str = "IN_REVIEW";
                break;
            case 5:
                str = "APPROVED";
                break;
            case 6:
                str = "DEFERRED";
                break;
            case 7:
                str = "SKIPPED";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str5 = str;
        long j2 = incomeSorterExecution.e;
        ArrayList arrayList = incomeSorterExecution.f;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(M((IncomeSorterExecutionDestination) it8.next()));
        }
        IncomeSorterExecutionDestination incomeSorterExecutionDestination = incomeSorterExecution.f99241g;
        return new ysj.k(str2, str3, str5, str4, j2, arrayList2, incomeSorterExecutionDestination != null ? M(incomeSorterExecutionDestination) : null);
    }

    public static final ir6.f O(cs6.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = fr6.a.f137395a[cVar.ordinal()];
        if (i == 1) {
            return ir6.f.PAYMENT_LINK;
        }
        if (i == 2) {
            return ir6.f.INVOICE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("No product article for card reader sale.");
    }

    public static final int P(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return (int) (dVar.f115082a / cp5.d.k(dVar.f115083b));
    }

    public static final String Q(iwg.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (svg.a.f265863a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "TAX_ADVANTAGED";
            case 4:
                return "SECURITY";
            case 5:
                return "CRYPTO";
            case 6:
                return "COMMODITY";
            case 7:
                return "ROBO";
            case 8:
                return "CFD";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String R(iwg.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = svg.a.f265864b[cVar.ordinal()];
        if (i == 1) {
            return "TIME_WEIGHTED";
        }
        if (i == 2) {
            return "MODIFIED_DIETZ";
        }
        if (i == 3) {
            return "SIMPLE";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void S(ViewController viewController, Function2 tillHide, Function0 onDismiss, Function1 onResult) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(tillHide, "tillHide");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        viewController.l2(new bib.b(tillHide, ref$ObjectRef, onResult, onDismiss));
        b79.i block = new b79.i(ref$ObjectRef, 3);
        Intrinsics.checkNotNullParameter(block, "block");
        viewController.H = block;
    }

    public static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i5 = 0;
            while (i5 < i3) {
                zArr[i] = z;
                i5++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static final void c(ViewGroup viewGroup, Function1 action) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.h(childAt);
            action.invoke(childAt);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt;
            if (viewGroup2 != null) {
                c(viewGroup2, action);
            }
        }
    }

    public static final Set e(zfi.a aVar, zfi.b filter) {
        zfi.n nVar;
        Set set;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter instanceof zfi.j) {
            zfi.l lVar = (zfi.l) aVar.f321952b.get(((zfi.j) filter).f321975a);
            if (lVar == null || (set = lVar.f321981b) == null) {
                return zhm.h0.f322473a;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                linkedHashSet.add(((zfi.n) it8.next()).f321982a);
            }
            return linkedHashSet;
        }
        if (filter instanceof zfi.r) {
            zfi.t tVar = (zfi.t) aVar.f321953c.get(((zfi.r) filter).f321994a);
            return z0.h((tVar == null || (nVar = tVar.f322001b) == null) ? null : nVar.f321982a);
        }
        if (!(filter instanceof zfi.o) && !(filter instanceof zfi.g)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("This filter doesn't have options: " + filter);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View f(androidx.recyclerview.widget.RecyclerView r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.getWidth()
            int r0 = r0 / 2
            int r1 = r8.getChildCount()
            r2 = 0
            r3 = 0
        L11:
            if (r3 >= r1) goto L53
            android.view.View r4 = r8.getChildAt(r3)
            if (r2 != 0) goto L1b
        L19:
            r2 = r4
            goto L50
        L1b:
            int r5 = r4.getLeft()
            float r5 = (float) r5
            float r6 = r4.getTranslationX()
            float r6 = r6 + r5
            int r5 = r4.getWidth()
            int r5 = r5 / 2
            float r5 = (float) r5
            float r6 = r6 + r5
            int r5 = r2.getLeft()
            float r5 = (float) r5
            float r7 = r2.getTranslationX()
            float r7 = r7 + r5
            int r5 = r2.getWidth()
            int r5 = r5 / 2
            float r5 = (float) r5
            float r7 = r7 + r5
            float r5 = (float) r0
            float r6 = r5 - r6
            float r6 = java.lang.Math.abs(r6)
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L50
            goto L19
        L50:
            int r3 = r3 + 1
            goto L11
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.s.f(androidx.recyclerview.widget.RecyclerView):android.view.View");
    }

    public static final View g(ViewGroup viewGroup, String mainElementId) {
        koi.b bVarF;
        View view;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(mainElementId, "mainElementId");
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null && (bVarF = yp0.y.f(recyclerView, mainElementId)) != null && (view = bVarF.itemView) != null) {
                return view;
            }
            i++;
        }
    }

    public static final ArrayList h(CashbackBySources cashbackBySources, ed3.c upgradeToEarnMetalState, ed3.c upgradeToEarnUltraState) {
        uc3.d dVar;
        ed3.c cVar;
        Intrinsics.checkNotNullParameter(cashbackBySources, "<this>");
        Intrinsics.checkNotNullParameter(upgradeToEarnMetalState, "upgradeToEarnMetalState");
        Intrinsics.checkNotNullParameter(upgradeToEarnUltraState, "upgradeToEarnUltraState");
        ArrayList arrayList = cashbackBySources.f65686b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            CashbackSource cashbackSource = (CashbackSource) obj2;
            if (!cashbackSource.f65688a.k() || (((dVar = cashbackSource.f65689b) == uc3.d.METAL && upgradeToEarnMetalState == ed3.c.ALREADY_UPGRADED) || (dVar == uc3.d.PLAN && (upgradeToEarnMetalState == (cVar = ed3.c.ALREADY_UPGRADED) || upgradeToEarnUltraState == cVar)))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final View i(ViewGroup viewGroup, Class[] clazz, String str) {
        View viewI;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int length = clazz.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (clazz[i2].isAssignableFrom(childAt.getClass())) {
                        viewI = childAt;
                        break;
                    }
                    i2++;
                } else if (childAt instanceof ViewGroup) {
                    viewI = i((ViewGroup) childAt, (Class[]) Arrays.copyOf(clazz, clazz.length), null);
                } else {
                    continue;
                }
            }
            if (viewI != null && (str == null || Intrinsics.f(childAt.getTag(R$id.uikit_main_scrollable_view), str))) {
                return viewI;
            }
        }
        return null;
    }

    public static final ArrayList j(ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData, my8.o kycDocs) {
        Intrinsics.checkNotNullParameter(chooseDocumentScreenContract$InputData, "<this>");
        Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
        int i = ku8.i.f189739a[chooseDocumentScreenContract$InputData.f77591a.ordinal()];
        if (i == 1) {
            List list = kycDocs.f210393b.f210404a;
            if (list.isEmpty() || (list.size() <= 1 && chooseDocumentScreenContract$InputData.f77592b != my8.r.ADDRESS)) {
                list = null;
            }
            if (list != null) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((my8.y) it8.next()).f210402a);
                }
                return arrayList;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayListK = ce9.m.k(kycDocs.f210393b.f210404a, chooseDocumentScreenContract$InputData.f77594g.f77598a);
            if (arrayListK != null && !arrayListK.isEmpty()) {
                return arrayListK;
            }
        }
        return null;
    }

    public static final String k(TaxExemptionAggregate taxExemptionAggregate) {
        Intrinsics.checkNotNullParameter(taxExemptionAggregate, "<this>");
        return a0.d.r(taxExemptionAggregate.i, taxExemptionAggregate.f89971b);
    }

    public static final Pair l(xzg.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new Pair(pVar.getFrom(), pVar.getTo());
    }

    public static final oi9.f n(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        phm.a aVar = (phm.a) ue0.e.j(activity).a().get(oi9.f.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (oi9.f) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", oi9.f.class, " is not found"));
    }

    public static final wjf.a o(CategoryColor categoryColor) {
        Intrinsics.checkNotNullParameter(categoryColor, "<this>");
        switch (wjf.c.f298083a[categoryColor.ordinal()]) {
            case 1:
                return wjf.a.RED;
            case 2:
                return wjf.a.PINK;
            case 3:
                return wjf.a.PURPLE;
            case 4:
                return wjf.a.DEEP_PURPLE;
            case 5:
                return wjf.a.INDIGO;
            case 6:
                return wjf.a.LIGHT_BLUE;
            case 7:
                return wjf.a.CYAN;
            case 8:
                return wjf.a.TEAL;
            case 9:
                return wjf.a.GREEN;
            case 10:
                return wjf.a.LIGHT_GREEN;
            case 11:
                return wjf.a.YELLOW;
            case 12:
                return wjf.a.BLUE;
            case 13:
                return wjf.a.ORANGE;
            case 14:
                return wjf.a.DEEP_PINK;
            case 15:
                return wjf.a.DEEP_GREY;
            case 16:
                return wjf.a.BROWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final wjf.b p(CategoryImage categoryImage) {
        Intrinsics.checkNotNullParameter(categoryImage, "<this>");
        switch (wjf.c.f298084b[categoryImage.ordinal()]) {
            case 1:
                return wjf.b.SCREEN;
            case 2:
                return wjf.b.FOOTBALL;
            case 3:
                return wjf.b.CYCLE;
            case 4:
                return wjf.b.SMILE;
            case 5:
                return wjf.b.SCISSORS;
            case 6:
                return wjf.b.ROCKET;
            case 7:
                return wjf.b.PHONE;
            case 8:
                return wjf.b.MAN;
            case 9:
                return wjf.b.INFINITY;
            case 10:
                return wjf.b.HEALTH;
            case 11:
                return wjf.b.HAT;
            case 12:
                return wjf.b.HAMBURGER;
            case 13:
                return wjf.b.FLAG;
            case 14:
                return wjf.b.DRINK;
            case 15:
                return wjf.b.DOG;
            case 16:
                return wjf.b.COFFEE;
            case 17:
                return wjf.b.CHART;
            case 18:
                return wjf.b.CAR;
            case 19:
                return wjf.b.CAKE;
            case 20:
                return wjf.b.BASKETBALL;
            case 21:
                return wjf.b.BULB;
            case 22:
                return wjf.b.COINS;
            case 23:
                return wjf.b.GROCERIES;
            case 24:
                return wjf.b.CART;
            case 25:
                return wjf.b.RESTAURANT;
            case 26:
                return wjf.b.TRANSPORT;
            case 27:
                return wjf.b.TRAVEL;
            case 28:
                return wjf.b.ENTERTAINMENT;
            case 29:
                return wjf.b.UTILITIES;
            case 30:
                return wjf.b.HEART;
            case 31:
                return wjf.b.SERVICES;
            case 32:
                return wjf.b.TRANSFERS;
            case 33:
                return wjf.b.CASH;
            case 34:
                return wjf.b.INSURANCE;
            case 35:
                return wjf.b.ENVELOPE;
            case 36:
                return wjf.b.VAULT;
            case 37:
                return wjf.b.INVEST;
            case 38:
                return wjf.b.GIFT;
            case 39:
                return wjf.b.FORM;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int q(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        int childCount = viewGroup.getChildCount();
        int iMax = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            iMax = Math.max((childAt.getVisibility() != 0 || childAt.getAlpha() == BitmapDescriptorFactory.HUE_RED) ? 0 : childAt.getBottom(), iMax);
        }
        return viewGroup.getTop() + iMax;
    }

    public static final View r(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public static final boolean s(cam.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof gw0.i) {
            return true;
        }
        return (fVar instanceof gw0.k) && ((gw0.k) fVar).f147242c;
    }

    public static final boolean t(zfi.a aVar, zfi.g booleanFilter) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(booleanFilter, "booleanFilter");
        zfi.i iVar = (zfi.i) aVar.f321951a.get(booleanFilter.f321967a);
        if (iVar != null) {
            return iVar.f321974c;
        }
        return false;
    }

    public static final boolean u(zfi.a aVar, zfi.j checkboxFilter, zfi.n checkBoxOption) {
        Set set;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(checkboxFilter, "checkboxFilter");
        Intrinsics.checkNotNullParameter(checkBoxOption, "checkBoxOption");
        zfi.l lVar = (zfi.l) aVar.f321952b.get(checkboxFilter.f321975a);
        if (lVar == null || (set = lVar.f321981b) == null) {
            return false;
        }
        return set.contains(checkBoxOption);
    }

    public static final boolean v(zfi.a aVar, zfi.n radioOption, zfi.r radioFilter) {
        zfi.n nVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(radioFilter, "radioFilter");
        Intrinsics.checkNotNullParameter(radioOption, "radioOption");
        zfi.t tVar = (zfi.t) aVar.f321953c.get(radioFilter.f321994a);
        return (tVar == null || (nVar = tVar.f322001b) == null) ? Intrinsics.f(radioFilter.f321996c.f321999c, radioOption.f321982a) : nVar.equals(radioOption);
    }

    public static final boolean w(zfi.a aVar, zfi.o priceRangeFilter, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "priceRangeFilter");
        zfi.q qVar = (zfi.q) aVar.d.get(priceRangeFilter.f321985a);
        if (qVar == null) {
            return false;
        }
        dj0.d dVar3 = qVar.f321993c;
        dj0.d dVar4 = qVar.f321992b;
        zfi.p pVar = qVar.f321991a;
        if ((dVar4 != null ? zh9.u0.t(dVar4, pVar.f321990c) : null) == null) {
            if ((dVar3 != null ? zh9.u0.t(dVar3, pVar.d) : null) == null) {
                return false;
            }
        }
        if (Intrinsics.f(dVar4 != null ? zh9.u0.t(dVar4, pVar.f321990c) : null, dVar != null ? zh9.u0.t(dVar, pVar.f321990c) : null)) {
            return Intrinsics.f(dVar3 != null ? zh9.u0.t(dVar3, pVar.d) : null, dVar2 != null ? zh9.u0.t(dVar2, pVar.d) : null);
        }
        return false;
    }

    public static final void x(s1 s1Var, Object token, boolean z) {
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        if (z) {
            s1Var.d(token);
        } else {
            s1Var.e(token);
        }
    }

    public static final ku8.w y(ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData, my8.o kycDocs) {
        Intrinsics.checkNotNullParameter(chooseDocumentScreenContract$InputData, "<this>");
        Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
        int i = ku8.i.f189739a[chooseDocumentScreenContract$InputData.f77591a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayListJ = j(chooseDocumentScreenContract$InputData, kycDocs);
            if (arrayListJ == null) {
                return ku8.u.f189754a;
            }
            ArrayList arrayList = new ArrayList(zhm.w.t(arrayListJ, 10));
            Iterator it8 = arrayListJ.iterator();
            while (it8.hasNext()) {
                arrayList.add(zhm.d0.F0((my8.l) it8.next(), chooseDocumentScreenContract$InputData.f77594g.f77598a));
            }
            return new ku8.s(arrayList);
        }
        List list = kycDocs.f210393b.f210404a;
        if (list.isEmpty()) {
            return ku8.t.f189753a;
        }
        if (list.size() == 1 && chooseDocumentScreenContract$InputData.f77592b != my8.r.ADDRESS) {
            return new ku8.v(((my8.y) zhm.d0.K0(list)).f210402a);
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((my8.y) obj2).f210403b.isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(zhm.u.c(((my8.y) it9.next()).f210402a));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (!((my8.y) obj3).f210403b.isEmpty()) {
                arrayList4.add(obj3);
            }
        }
        return new ku8.s(zhm.d0.E0(ce9.m.G(arrayList4), arrayList3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final iwg.a z(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case 66625:
                if (str.equals("CFD")) {
                    return iwg.a.CFD;
                }
                break;
            case 2520906:
                if (str.equals("ROBO")) {
                    return iwg.a.ROBO;
                }
                break;
            case 1300506381:
                if (str.equals("COMMODITY")) {
                    return iwg.a.COMMODITY;
                }
                break;
            case 1731749696:
                if (str.equals("SECURITY")) {
                    return iwg.a.SECURITY;
                }
                break;
            case 1996612801:
                if (str.equals("CRYPTO")) {
                    return iwg.a.CRYPTO;
                }
                break;
        }
        throw new IllegalStateException(p.a.p("Can't convert ", str, " to enum"));
    }

    @Override // vh.d
    public yh.b b(String str, vh.a aVar, int i, int i2, aim.f fVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int iM = m();
        vh.b bVar = vh.b.MARGIN;
        if (fVar.containsKey(bVar)) {
            iM = Integer.parseInt(fVar.get(bVar).toString());
        }
        boolean[] zArrD = d(str);
        int length = zArrD.length;
        int i3 = iM + length;
        int iMax = Math.max(i, i3);
        int iMax2 = Math.max(1, i2);
        int i5 = iMax / i3;
        int i6 = (iMax - (length * i5)) / 2;
        yh.b bVar2 = new yh.b(iMax, iMax2);
        int i21 = 0;
        while (i21 < length) {
            if (zArrD[i21]) {
                bVar2.c(i6, 0, i5, iMax2);
            }
            i21++;
            i6 += i5;
        }
        return bVar2;
    }

    public abstract boolean[] d(String str);

    public int m() {
        return 10;
    }
}
