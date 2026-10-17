package au6;

import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.impl.network.services.AcquiringPaymentsService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements x {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcquiringPaymentsService f9509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is6.c f9511c;
    public final ue0.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f9512g;

    public d0(AcquiringPaymentsService api2, ne0.j memoryCache, is6.c paymentsDao, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(paymentsDao, "paymentsDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9509a = api2;
        this.f9510b = memoryCache;
        this.f9511c = paymentsDao;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new a72.k(this, continuation, 6), new ar1.c(this, 19), new anc.b(this, 18), new ap7.k(this, continuation, 13), new a09.p(this, continuation, 12));
        this.f = new x4l.c(new a0e.m(this, continuation, 29), new a0(this, 0), new b0(this, 0), new c0(this, continuation, 0), new a09.p(this, continuation, 11), new c0(this, continuation, 1));
        this.f9512g = new x4l.c(new a72.k(this, continuation, 7), new a0(this, 1), new b0(this, 1), new c0(this, continuation, 2), new a0e.o(this, continuation, 8));
    }

    public static final pr6.q a(d0 d0Var, AcquiringPaymentsQuery acquiringPaymentsQuery) {
        final String str;
        d0Var.getClass();
        boolean z = acquiringPaymentsQuery.f73373g == null;
        Set set = acquiringPaymentsQuery.e;
        Set set2 = acquiringPaymentsQuery.f;
        Set set3 = acquiringPaymentsQuery.d;
        if (!z) {
            return null;
        }
        final is6.c cVar = d0Var.f9511c;
        String str2 = acquiringPaymentsQuery.f73370a;
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str = lowerCase;
        } else {
            str = null;
        }
        final LocalDateTime localDateTime = acquiringPaymentsQuery.f73371b;
        final LocalDateTime localDateTime2 = acquiringPaymentsQuery.f73372c;
        final int i = !set3.isEmpty() ? 1 : 0;
        Set set4 = set3;
        ArrayList arrayList = new ArrayList(zhm.w.t(set4, 10));
        Iterator it8 = set4.iterator();
        while (it8.hasNext()) {
            arrayList.add(((lr6.a) it8.next()).name());
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = zhm.u.c("");
        }
        final List list = listC;
        final int i2 = !set2.isEmpty() ? 1 : 0;
        Set set5 = set2;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(set5, 10));
        Iterator it9 = set5.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((pr6.j) it9.next()).name());
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        List listC2 = arrayList2;
        if (zIsEmpty2) {
            listC2 = zhm.u.c("");
        }
        final List list2 = listC2;
        final int i3 = !set.isEmpty() ? 1 : 0;
        Set set6 = set;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(set6, 10));
        Iterator it10 = set6.iterator();
        while (it10.hasNext()) {
            arrayList3.add(((xi0.b) it10.next()).f306286a);
        }
        boolean zIsEmpty3 = arrayList3.isEmpty();
        List listC3 = arrayList3;
        if (zIsEmpty3) {
            listC3 = zhm.u.c("");
        }
        final List list3 = listC3;
        cVar.getClass();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("\n        SELECT * FROM acquiring_payments\n        WHERE\n            -- Search Query Filter\n            (? IS NULL OR\n                LOWER(id) LIKE '%' || LOWER(?) || '%' OR\n                LOWER(order_id) LIKE '%' || LOWER(?) || '%' OR\n                LOWER(acquiring_reference_number) LIKE '%' || LOWER(?) || '%' OR\n                sepa_last_four LIKE '%' || LOWER(?) || '%')\n            -- Date Filters\n            AND (? IS NULL OR created_at >= ?)\n            AND (? IS NULL OR created_at <= ?)\n            -- List Filters\n            AND (? = 0 OR state IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb6, size);
        sb6.append("))");
        sb6.append("\n");
        sb6.append("            AND (");
        sb6.append("?");
        sb6.append(" = 0 OR payment_method IN (");
        final int size2 = list2.size();
        StringUtil.appendPlaceholders(sb6, size2);
        j6.a.D(sb6, "))", "\n", "            AND (", "?");
        sb6.append(" = 0 OR amount_currency IN (");
        final int size3 = list3.size();
        StringUtil.appendPlaceholders(sb6, size3);
        sb6.append("))");
        j6.a.D(sb6, "\n", "        ORDER BY created_at DESC", "\n", "        LIMIT ");
        final String strU = a0.d.u(sb6, "?", "\n", "    ");
        List list4 = (List) DBUtil.performBlocking(cVar.f168123a, true, false, new Function1() { // from class: is6.b
            /* JADX WARN: Removed duplicated region for block: B:156:0x037d A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:4:0x002b, B:10:0x0038, B:14:0x0042, B:18:0x004c, B:22:0x0056, B:24:0x005d, B:26:0x0064, B:28:0x006b, B:30:0x0072, B:32:0x0079, B:34:0x0081, B:36:0x0088, B:38:0x0090, B:40:0x0097, B:41:0x00a3, B:43:0x00a9, B:45:0x00b1, B:47:0x00b8, B:46:0x00b5, B:48:0x00bb, B:49:0x00c8, B:51:0x00ce, B:53:0x00d6, B:55:0x00dd, B:54:0x00da, B:56:0x00e0, B:57:0x00ed, B:59:0x00f3, B:61:0x00fb, B:63:0x0102, B:62:0x00ff, B:64:0x0105, B:65:0x01b1, B:67:0x01b7, B:71:0x01c8, B:75:0x01d7, B:79:0x01ea, B:83:0x01fb, B:87:0x020c, B:91:0x021f, B:95:0x022e, B:99:0x023d, B:103:0x0255, B:107:0x0264, B:111:0x027c, B:115:0x0294, B:120:0x02b3, B:125:0x02c3, B:130:0x02ec, B:135:0x030a, B:140:0x032f, B:142:0x033c, B:148:0x0355, B:153:0x036f, B:154:0x0377, B:156:0x037d, B:161:0x038f, B:165:0x03a5, B:166:0x03ac, B:164:0x03a0, B:152:0x0366, B:139:0x0326, B:134:0x0301, B:129:0x02df, B:124:0x02be, B:119:0x02ac, B:114:0x028e, B:110:0x0276, B:106:0x025e, B:102:0x024f, B:98:0x0237, B:94:0x0228, B:90:0x0219, B:86:0x0208, B:82:0x01f7, B:78:0x01e2, B:74:0x01d1, B:70:0x01c2, B:39:0x0094, B:35:0x0085, B:31:0x0076, B:27:0x0068, B:23:0x005a, B:19:0x0050, B:15:0x0046, B:11:0x003c, B:7:0x0032), top: B:172:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:160:0x038d  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x03a0 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:4:0x002b, B:10:0x0038, B:14:0x0042, B:18:0x004c, B:22:0x0056, B:24:0x005d, B:26:0x0064, B:28:0x006b, B:30:0x0072, B:32:0x0079, B:34:0x0081, B:36:0x0088, B:38:0x0090, B:40:0x0097, B:41:0x00a3, B:43:0x00a9, B:45:0x00b1, B:47:0x00b8, B:46:0x00b5, B:48:0x00bb, B:49:0x00c8, B:51:0x00ce, B:53:0x00d6, B:55:0x00dd, B:54:0x00da, B:56:0x00e0, B:57:0x00ed, B:59:0x00f3, B:61:0x00fb, B:63:0x0102, B:62:0x00ff, B:64:0x0105, B:65:0x01b1, B:67:0x01b7, B:71:0x01c8, B:75:0x01d7, B:79:0x01ea, B:83:0x01fb, B:87:0x020c, B:91:0x021f, B:95:0x022e, B:99:0x023d, B:103:0x0255, B:107:0x0264, B:111:0x027c, B:115:0x0294, B:120:0x02b3, B:125:0x02c3, B:130:0x02ec, B:135:0x030a, B:140:0x032f, B:142:0x033c, B:148:0x0355, B:153:0x036f, B:154:0x0377, B:156:0x037d, B:161:0x038f, B:165:0x03a5, B:166:0x03ac, B:164:0x03a0, B:152:0x0366, B:139:0x0326, B:134:0x0301, B:129:0x02df, B:124:0x02be, B:119:0x02ac, B:114:0x028e, B:110:0x0276, B:106:0x025e, B:102:0x024f, B:98:0x0237, B:94:0x0228, B:90:0x0219, B:86:0x0208, B:82:0x01f7, B:78:0x01e2, B:74:0x01d1, B:70:0x01c2, B:39:0x0094, B:35:0x0085, B:31:0x0076, B:27:0x0068, B:23:0x005a, B:19:0x0050, B:15:0x0046, B:11:0x003c, B:7:0x0032), top: B:172:0x0029 }] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 976
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: is6.b.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
        Iterator it11 = list4.iterator();
        while (it11.hasNext()) {
            arrayList4.add(bu6.b.a((ks6.q) it11.next()));
        }
        return new pr6.q(arrayList4, null);
    }

    public static final String b(d0 d0Var, String str) {
        return j6.a.q("FreelancerAcquiringPaymentRepositoryImpl:Timeline:Memory", str);
    }

    public static final String c(d0 d0Var, String str) {
        return j6.a.q("FreelancerAcquiringPaymentRepositoryImpl:Timeline:Storage", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pr6.q d(com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au6.d0.d(com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery):pr6.q");
    }

    public final void e(pr6.q qVar) {
        ne0.j jVar = this.f9510b;
        pr6.q qVar2 = (pr6.q) jVar.get("FreelancerAcquiringPaymentRepositoryImpl:Payment:Memory");
        List list = qVar2 != null ? qVar2.f238959a : null;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        List list2 = qVar.f238959a;
        ArrayList payments = zhm.d0.f1(list);
        for (Object obj2 : list2) {
            Iterator it8 = payments.iterator();
            int i = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.f(((pr6.e) it8.next()).f238938a, ((pr6.e) obj2).f238938a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                payments.set(i, obj2);
            } else {
                payments.add(obj2);
            }
        }
        Intrinsics.checkNotNullParameter(payments, "payments");
        jVar.f("FreelancerAcquiringPaymentRepositoryImpl:Payment:Memory", new pr6.q(payments, null));
    }
}
