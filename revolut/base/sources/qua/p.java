package qua;

import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements ibd.i, Serializable {
    public final ibd.a A;
    public final tua.c B;
    public final h C;
    public final rua.d D;
    public final fva.h E;
    public final ibd.a F;
    public final Set G;
    public final int H;
    public final String I;
    public final sua.b J;
    public final fva.e K;
    public final String L;
    public final o M;
    public final kq2.c N;
    public final fva.j O;
    public final Map P;
    public final i Q;
    public final List R;
    public final UltimateDebtor S;
    public final kq2.g T;
    public final fva.g U;
    public final fva.l V;
    public final String W;
    public final j X;
    public final n Y;
    public final List Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ibd.e f249314a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final s f249315a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.f f249316b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final WalletAutomation f249317b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249318c;
    public final Boolean c0;
    public final kq2.m d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LocalDate f249319d0;
    public final LocalDate e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LocalDate f249320e0;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f249321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f249322h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f249323j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f249324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f249325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final prf.f f249326n;
    public final krf.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f249327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wua.a f249328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f5j.a f249329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vua.a f249330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uua.a f249331t;
    public final fva.m u;
    public final sua.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f249332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tua.b f249333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tua.d f249334y;
    public final String z;

    public p(ibd.e recurringPaymentShort, ibd.f state, String str, kq2.m mVar, LocalDate localDate, Boolean bool, dj0.d dVar, String str2, String currency, Long l2, String str3, String str4, String str5, prf.f fVar, krf.c cVar, String str6, wua.a aVar, f5j.a aVar2, vua.a aVar3, uua.a aVar4, fva.m mVar2, sua.a aVar5, g gVar, tua.b bVar, tua.d dVar2, String str7, ibd.a aVar6, tua.c cVar2, h hVar, rua.d dVar3, fva.h hVar2, ibd.a aVar7, Set set, int i, String str8, sua.b bVar2, fva.e eVar, String str9, o oVar, kq2.c cVar3, fva.j jVar, Map map, i iVar, List referenceFields, UltimateDebtor ultimateDebtor, kq2.g gVar2, fva.g gVar3, fva.l lVar, String str10, j jVar2, n nVar, List list, s sVar, WalletAutomation walletAutomation, Boolean bool2, LocalDate localDate2, LocalDate localDate3) {
        Intrinsics.checkNotNullParameter(recurringPaymentShort, "recurringPaymentShort");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referenceFields, "referenceFields");
        this.f249314a = recurringPaymentShort;
        this.f249316b = state;
        this.f249318c = str;
        this.d = mVar;
        this.e = localDate;
        this.f = bool;
        this.f249321g = dVar;
        this.f249322h = str2;
        this.i = currency;
        this.f249323j = l2;
        this.k = str3;
        this.f249324l = str4;
        this.f249325m = str5;
        this.f249326n = fVar;
        this.o = cVar;
        this.f249327p = str6;
        this.f249328q = aVar;
        this.f249329r = aVar2;
        this.f249330s = aVar3;
        this.f249331t = aVar4;
        this.u = mVar2;
        this.v = aVar5;
        this.f249332w = gVar;
        this.f249333x = bVar;
        this.f249334y = dVar2;
        this.z = str7;
        this.A = aVar6;
        this.B = cVar2;
        this.C = hVar;
        this.D = dVar3;
        this.E = hVar2;
        this.F = aVar7;
        this.G = set;
        this.H = i;
        this.I = str8;
        this.J = bVar2;
        this.K = eVar;
        this.L = str9;
        this.M = oVar;
        this.N = cVar3;
        this.O = jVar;
        this.P = map;
        this.Q = iVar;
        this.R = referenceFields;
        this.S = ultimateDebtor;
        this.T = gVar2;
        this.U = gVar3;
        this.V = lVar;
        this.W = str10;
        this.X = jVar2;
        this.Y = nVar;
        this.Z = list;
        this.f249315a0 = sVar;
        this.f249317b0 = walletAutomation;
        this.c0 = bool2;
        this.f249319d0 = localDate2;
        this.f249320e0 = localDate3;
    }

    public static p a(p pVar, ibd.e eVar, ibd.f fVar, String str, String str2, Long l2, String str3, String str4, vua.a aVar, g gVar, int i, String str5, int i2, int i3) {
        ibd.e recurringPaymentShort = (i2 & 1) != 0 ? pVar.f249314a : eVar;
        ibd.f state = (i2 & 2) != 0 ? pVar.f249316b : fVar;
        String str6 = pVar.f249318c;
        kq2.m mVar = pVar.d;
        LocalDate localDate = pVar.e;
        Boolean bool = pVar.f;
        dj0.d dVar = pVar.f249321g;
        String str7 = (i2 & 128) != 0 ? pVar.f249322h : str;
        String currency = (i2 & 256) != 0 ? pVar.i : str2;
        Long l3 = (i2 & 512) != 0 ? pVar.f249323j : l2;
        String str8 = (i2 & 1024) != 0 ? pVar.k : str3;
        String str9 = pVar.f249324l;
        String str10 = (i2 & 4096) != 0 ? pVar.f249325m : str4;
        prf.f fVar2 = pVar.f249326n;
        krf.c cVar = pVar.o;
        String str11 = pVar.f249327p;
        wua.a aVar2 = pVar.f249328q;
        f5j.a aVar3 = pVar.f249329r;
        vua.a aVar4 = (i2 & 262144) != 0 ? pVar.f249330s : aVar;
        uua.a aVar5 = pVar.f249331t;
        fva.m mVar2 = pVar.u;
        sua.a aVar6 = pVar.v;
        g gVar2 = (i2 & 4194304) != 0 ? pVar.f249332w : gVar;
        tua.b bVar = pVar.f249333x;
        tua.d dVar2 = pVar.f249334y;
        String str12 = pVar.z;
        ibd.a aVar7 = pVar.A;
        tua.c cVar2 = pVar.B;
        h hVar = pVar.C;
        rua.d dVar3 = pVar.D;
        fva.h hVar2 = pVar.E;
        ibd.a aVar8 = pVar.F;
        Set set = pVar.G;
        int i5 = (i3 & 2) != 0 ? pVar.H : i;
        String str13 = pVar.I;
        sua.b bVar2 = pVar.J;
        fva.e eVar2 = pVar.K;
        String str14 = pVar.L;
        o oVar = pVar.M;
        kq2.c cVar3 = pVar.N;
        fva.j jVar = pVar.O;
        Map map = pVar.P;
        i iVar = pVar.Q;
        List referenceFields = pVar.R;
        UltimateDebtor ultimateDebtor = pVar.S;
        kq2.g gVar3 = pVar.T;
        fva.g gVar4 = pVar.U;
        fva.l lVar = pVar.V;
        String str15 = (i3 & 65536) != 0 ? pVar.W : str5;
        j jVar2 = pVar.X;
        n nVar = pVar.Y;
        List list = pVar.Z;
        s sVar = pVar.f249315a0;
        WalletAutomation walletAutomation = pVar.f249317b0;
        Boolean bool2 = pVar.c0;
        LocalDate localDate2 = pVar.f249319d0;
        LocalDate localDate3 = pVar.f249320e0;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPaymentShort, "recurringPaymentShort");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referenceFields, "referenceFields");
        return new p(recurringPaymentShort, state, str6, mVar, localDate, bool, dVar, str7, currency, l3, str8, str9, str10, fVar2, cVar, str11, aVar2, aVar3, aVar4, aVar5, mVar2, aVar6, gVar2, bVar, dVar2, str12, aVar7, cVar2, hVar, dVar3, hVar2, aVar8, set, i5, str13, bVar2, eVar2, str14, oVar, cVar3, jVar, map, iVar, referenceFields, ultimateDebtor, gVar3, gVar4, lVar, str15, jVar2, nVar, list, sVar, walletAutomation, bool2, localDate2, localDate3);
    }

    @Override // ibd.i
    public final Period L() {
        return this.f249314a.f160151b;
    }

    @Override // ibd.i
    public final LocalDate Q() {
        return this.f249314a.e;
    }

    public final String b() {
        return this.f249318c;
    }

    public final vua.a c() {
        return this.f249330s;
    }

    public final n d() {
        return this.Y;
    }

    public final String e() {
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qua.p.equals(java.lang.Object):boolean");
    }

    @Override // ibd.i
    public final String getId() {
        return this.f249314a.f160150a;
    }

    @Override // ibd.i
    public final Boolean getRecurring() {
        return this.f249314a.f160153g;
    }

    @Override // ibd.i
    public final ibd.h getType() {
        return this.f249314a.f160152c;
    }

    public final int hashCode() {
        int iHashCode = (this.f249316b.hashCode() + (this.f249314a.hashCode() * 31)) * 31;
        String str = this.f249318c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kq2.m mVar = this.d;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        dj0.d dVar = this.f249321g;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f249322h;
        int iC = p.a.c((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        Long l2 = this.f249323j;
        int iHashCode7 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f249324l;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f249325m;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        prf.f fVar = this.f249326n;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        krf.c cVar = this.o;
        int iHashCode12 = (iHashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str6 = this.f249327p;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        wua.a aVar = this.f249328q;
        int iHashCode14 = (iHashCode13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f5j.a aVar2 = this.f249329r;
        int iHashCode15 = (iHashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        vua.a aVar3 = this.f249330s;
        int iHashCode16 = (iHashCode15 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        uua.a aVar4 = this.f249331t;
        int iHashCode17 = (iHashCode16 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        fva.m mVar2 = this.u;
        int iHashCode18 = (iHashCode17 + (mVar2 == null ? 0 : mVar2.f138404a.hashCode())) * 31;
        sua.a aVar5 = this.v;
        int iHashCode19 = (iHashCode18 + (aVar5 == null ? 0 : aVar5.f265695a.hashCode())) * 31;
        g gVar = this.f249332w;
        int iHashCode20 = (iHashCode19 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        tua.b bVar = this.f249333x;
        int iHashCode21 = (iHashCode20 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        tua.d dVar2 = this.f249334y;
        int iHashCode22 = (iHashCode21 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str7 = this.z;
        int iHashCode23 = (iHashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ibd.a aVar6 = this.A;
        int iHashCode24 = (iHashCode23 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        tua.c cVar2 = this.B;
        int iHashCode25 = (iHashCode24 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        h hVar = this.C;
        int iHashCode26 = (iHashCode25 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        rua.d dVar3 = this.D;
        int iHashCode27 = (iHashCode26 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        fva.h hVar2 = this.E;
        int iHashCode28 = (iHashCode27 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        ibd.a aVar7 = this.F;
        int iHashCode29 = (iHashCode28 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        Set set = this.G;
        int iB = j6.a.b(this.H, (iHashCode29 + (set == null ? 0 : set.hashCode())) * 31, 31);
        String str8 = this.I;
        int iHashCode30 = (iB + (str8 == null ? 0 : str8.hashCode())) * 31;
        sua.b bVar2 = this.J;
        int iHashCode31 = (iHashCode30 + (bVar2 == null ? 0 : bVar2.f265696a.hashCode())) * 31;
        fva.e eVar = this.K;
        int iHashCode32 = (iHashCode31 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str9 = this.L;
        int iHashCode33 = (iHashCode32 + (str9 == null ? 0 : str9.hashCode())) * 31;
        o oVar = this.M;
        int iHashCode34 = (iHashCode33 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        kq2.c cVar3 = this.N;
        int iHashCode35 = (iHashCode34 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        fva.j jVar = this.O;
        int iHashCode36 = (iHashCode35 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Map map = this.P;
        int iHashCode37 = (iHashCode36 + (map == null ? 0 : map.hashCode())) * 31;
        i iVar = this.Q;
        int iD = p.a.d((iHashCode37 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.R);
        UltimateDebtor ultimateDebtor = this.S;
        int iHashCode38 = (iD + (ultimateDebtor == null ? 0 : ultimateDebtor.hashCode())) * 31;
        kq2.g gVar2 = this.T;
        int iHashCode39 = (iHashCode38 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        fva.g gVar3 = this.U;
        int iHashCode40 = (iHashCode39 + (gVar3 == null ? 0 : gVar3.hashCode())) * 31;
        fva.l lVar = this.V;
        int iHashCode41 = (iHashCode40 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str10 = this.W;
        int iHashCode42 = (iHashCode41 + (str10 == null ? 0 : str10.hashCode())) * 31;
        j jVar2 = this.X;
        int iHashCode43 = (iHashCode42 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        n nVar = this.Y;
        int iHashCode44 = (iHashCode43 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List list = this.Z;
        int iHashCode45 = (iHashCode44 + (list == null ? 0 : list.hashCode())) * 31;
        s sVar = this.f249315a0;
        int iHashCode46 = (iHashCode45 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        WalletAutomation walletAutomation = this.f249317b0;
        int iHashCode47 = (iHashCode46 + (walletAutomation == null ? 0 : walletAutomation.hashCode())) * 31;
        Boolean bool2 = this.c0;
        int iHashCode48 = (iHashCode47 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        LocalDate localDate2 = this.f249319d0;
        int iHashCode49 = (iHashCode48 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f249320e0;
        return iHashCode49 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    @Override // ibd.i
    public final LocalDate n2() {
        return this.f249314a.f;
    }

    public p(ibd.e eVar, ibd.f fVar, String str, kq2.m mVar, LocalDate localDate, Boolean bool, dj0.d dVar, String str2, String str3, Long l2, String str4, String str5, String str6, prf.f fVar2, krf.c cVar, String str7, wua.a aVar, f5j.a aVar2, vua.a aVar3, uua.a aVar4, fva.m mVar2, sua.a aVar5, g gVar, tua.b bVar, tua.d dVar2, String str8, ibd.a aVar6, tua.c cVar2, h hVar, rua.d dVar3, fva.h hVar2, ibd.a aVar7, Set set, int i, String str9, sua.b bVar2, fva.e eVar2, String str10, o oVar, kq2.c cVar3, fva.j jVar, Map map, i iVar, List list, UltimateDebtor ultimateDebtor, kq2.g gVar2, fva.g gVar3, fva.l lVar, String str11, j jVar2, n nVar, ArrayList arrayList, s sVar, WalletAutomation walletAutomation, Boolean bool2, LocalDate localDate2, LocalDate localDate3, int i2, int i3) {
        this(eVar, fVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : mVar, (i2 & 16) != 0 ? null : localDate, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : dVar, (i2 & 128) != 0 ? null : str2, str3, l2, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : fVar2, (i2 & 16384) != 0 ? null : cVar, (i2 & 32768) != 0 ? null : str7, (i2 & 65536) != 0 ? null : aVar, (i2 & 131072) != 0 ? null : aVar2, (i2 & 262144) != 0 ? null : aVar3, (i2 & 524288) != 0 ? null : aVar4, (i2 & PKIFailureInfo.badCertTemplate) != 0 ? null : mVar2, (i2 & PKIFailureInfo.badSenderNonce) != 0 ? null : aVar5, (i2 & 4194304) != 0 ? null : gVar, (i2 & 8388608) != 0 ? null : bVar, (i2 & 16777216) != 0 ? null : dVar2, (i2 & 33554432) != 0 ? null : str8, (i2 & 67108864) != 0 ? null : aVar6, (i2 & 134217728) != 0 ? null : cVar2, (i2 & 268435456) != 0 ? null : hVar, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? null : dVar3, (i2 & 1073741824) != 0 ? null : hVar2, (i2 & Integer.MIN_VALUE) != 0 ? null : aVar7, (i3 & 1) != 0 ? null : set, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? null : str9, (i3 & 8) != 0 ? null : bVar2, (i3 & 16) != 0 ? null : eVar2, (i3 & 32) != 0 ? null : str10, (i3 & 64) != 0 ? null : oVar, (i3 & 128) != 0 ? null : cVar3, (i3 & 256) != 0 ? null : jVar, (i3 & 512) != 0 ? null : map, (i3 & 1024) != 0 ? null : iVar, (i3 & 2048) != 0 ? f0.f322471a : list, (i3 & 4096) != 0 ? null : ultimateDebtor, (i3 & 8192) != 0 ? null : gVar2, (i3 & 16384) != 0 ? null : gVar3, (i3 & 32768) != 0 ? null : lVar, (i3 & 65536) != 0 ? null : str11, (i3 & 131072) != 0 ? null : jVar2, (i3 & 262144) != 0 ? null : nVar, (i3 & 524288) != 0 ? null : arrayList, (i3 & PKIFailureInfo.badCertTemplate) != 0 ? null : sVar, (i3 & PKIFailureInfo.badSenderNonce) != 0 ? null : walletAutomation, (i3 & 4194304) != 0 ? null : bool2, (i3 & 8388608) != 0 ? null : localDate2, (i3 & 16777216) != 0 ? null : localDate3);
    }
}
