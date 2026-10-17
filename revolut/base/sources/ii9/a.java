package ii9;

import cj9.f;
import dj0.d;
import hi9.c;
import hi9.j;
import hi9.k;
import i26.l;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import xi0.b;
import zh9.k0;
import zh9.l0;
import zh9.m0;
import zh9.n0;
import zh9.o;
import zh9.o0;
import zh9.p;
import zh9.p0;
import zh9.p1;
import zh9.q0;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f161592a = r0.k(new Pair("ACTIVE", q0.ACTIVE), new Pair("CANCELLED", q0.CANCELLED), new Pair("OVERDUE", q0.OVERDUE), new Pair("OUTSTANDING", q0.OUTSTANDING), new Pair("REPAID", q0.REPAID));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f161593b = r0.k(new Pair("SCHEDULED", o.SCHEDULED), new Pair("OUTSTANDING", o.OUTSTANDING), new Pair("OVERDUE", o.OVERDUE), new Pair("CANCELLED", o.CANCELLED), new Pair("REPAID", o.REPAID));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f161594c = r0.k(new Pair("TRANSACTION", k0.TRANSACTION), new Pair("USER", k0.USER));
    public static final Object d = r0.k(new Pair("DEFAULT", o0.Default), new Pair("REDUCED", o0.Reduced), new Pair("ZERO", o0.Zero));
    public static final Object e = r0.k(new Pair("PAY_IN_30_DAYS", p0.PAY_IN_30_DAYS), new Pair("PAY_IN_3", p0.PAY_IN_3), new Pair("PAY_IN_6", p0.PAY_IN_6), new Pair("PAY_IN_9", p0.PAY_IN_9), new Pair("PAY_IN_12", p0.PAY_IN_12));

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    public static final zh9.r0 a(ki9.a aVar) {
        String str;
        Integer num;
        String str2;
        n0 l0Var;
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        xi0.a aVar2 = b.Companion;
        String str4 = aVar.f184187a.o;
        aVar2.getClass();
        b currency = xi0.a.a(str4);
        k kVar = aVar.f184187a;
        String str5 = kVar.f152550a;
        String str6 = kVar.f152551b;
        String str7 = kVar.f152552c;
        String str8 = kVar.d;
        String str9 = kVar.e;
        String str10 = kVar.f;
        String str11 = kVar.f152553g;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(kVar.f152554h);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(kVar.i);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        d dVar = new d(kVar.f152555j, currency);
        d dVar2 = new d(kVar.k, currency);
        d dVar3 = new d(kVar.f152556l, currency);
        Long l2 = kVar.f152557m;
        d dVar4 = new d(kVar.f152558n, currency);
        q0 q0Var = (q0) l.B(kVar.f152559p, f161592a, q0.ACTIVE);
        boolean z = kVar.f152560q;
        String str12 = kVar.f152561r;
        Intrinsics.checkNotNullParameter(str12, "<this>");
        o0 o0Var = (o0) u1.t(str12, o0.Default, d);
        p1 p1Var = (p1) l.B(kVar.f152562s, f.f24629a, p1.Cards);
        wi0.a aVar3 = wi0.b.Companion;
        String str13 = kVar.f152563t;
        aVar3.getClass();
        wi0.b bVarA = wi0.a.a(str13);
        String str14 = kVar.u;
        Intrinsics.checkNotNullParameter(str14, "<this>");
        p0 p0Var = (p0) u1.u(str14, e);
        BigDecimal bigDecimal = new BigDecimal(kVar.v);
        d dVar5 = new d(kVar.f152564w, currency);
        String str15 = kVar.f152565x;
        k0 k0Var = str15 != null ? (k0) l.B(str15, f161594c, null) : null;
        Integer num2 = kVar.f152566y;
        String str16 = kVar.z;
        c cVar = kVar.A;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        k0 k0Var2 = k0Var;
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (cVar instanceof j) {
            str = str16;
            j jVar = (j) cVar;
            num = num2;
            str2 = str7;
            l0Var = new m0(new d(jVar.f152548b, currency), jVar.f152549c);
        } else {
            str = str16;
            num = num2;
            str2 = str7;
            if (!(cVar instanceof hi9.f)) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = new l0(new d(((hi9.f) cVar).f152545b, currency));
        }
        List list = aVar.f184188b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            hi9.a aVar4 = (hi9.a) it8.next();
            Intrinsics.checkNotNullParameter(aVar4, str3);
            xi0.a aVar5 = b.Companion;
            String str17 = aVar4.e;
            aVar5.getClass();
            b bVarA2 = xi0.a.a(str17);
            int i = aVar4.f152533b;
            Iterator it9 = it8;
            String str18 = str3;
            b bVar = currency;
            long j2 = aVar4.f152534c;
            n0 n0Var = l0Var;
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            DateTime dateTime = new DateTime(j2, dateTimeZone);
            String str19 = str8;
            d dVar6 = new d(aVar4.f152536h, bVarA2);
            d dVar7 = new d(aVar4.f152537j, bVarA2);
            o oVar = (o) u1.u(aVar4.d, f161593b);
            Long l3 = aVar4.f;
            arrayList.add(new p(i, dateTime, dVar6, dVar7, oVar, l3 != null ? new DateTime(l3.longValue(), dateTimeZone) : null, d0.i1(aVar4.f152535g), new d(aVar4.k, bVarA2), new d(aVar4.i, bVarA2), new d(aVar4.f152538l, bVarA2), new d(aVar4.f152539m, bVarA2), aVar4.f152540n));
            it8 = it9;
            str8 = str19;
            str3 = str18;
            currency = bVar;
            l0Var = n0Var;
        }
        return new zh9.r0(str5, str6, str2, str8, str9, str10, str11, instantOfEpochMilli, instantOfEpochMilli2, dVar, dVar2, dVar3, l2, dVar4, currency, q0Var, z, o0Var, p1Var, bVarA, p0Var, bigDecimal, dVar5, k0Var2, num, str, l0Var, arrayList);
    }
}
