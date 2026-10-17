package yp9;

import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import do3.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wp9.b0;
import wp9.t;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f315800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f315801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f315802c;
    public final Object d;

    public e(SplitBillInputData inputData, hp9.c distributionStrategiesFactory, qd0.b languageProvider, h participantPayAmountCalculator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(distributionStrategiesFactory, "distributionStrategiesFactory");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(participantPayAmountCalculator, "participantPayAmountCalculator");
        this.f315800a = languageProvider;
        List list = inputData.f79198b;
        this.f315801b = list;
        dj0.d.Companion.getClass();
        dj0.d dVarA = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarA = i == 0 ? com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a() : pyd.c.O(dVarA, com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a());
            i = i2;
        }
        this.f315802c = dVarA;
        cp9.a aVar = cp9.a.PERCENT;
        long j2 = dVarA.f115082a;
        long j3 = dVarA.f115082a;
        distributionStrategiesFactory.getClass();
        Pair pair = new Pair(aVar, hp9.c.a(aVar, j2));
        cp9.a aVar2 = cp9.a.AMOUNT;
        Pair pair2 = new Pair(aVar2, hp9.c.a(aVar2, j3));
        cp9.a aVar3 = cp9.a.SHARE;
        this.d = r0.k(pair, pair2, new Pair(aVar3, hp9.c.a(aVar3, j3)));
    }

    public static ap9.f c(b0 b0Var) {
        ap9.b bVar = b0Var.f299172b;
        ArrayList<t> arrayList = b0Var.f299171a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (t tVar : arrayList) {
            arrayList2.add(new ap9.g(tVar.f299200b, tVar.f299199a, tVar.d, tVar.e));
        }
        return new ap9.f(bVar, arrayList2);
    }

    public final b0 a(SplitMembersType splitMembers, cp9.a splitType, n nVar) {
        Intrinsics.checkNotNullParameter(splitMembers, "splitMembers");
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        if (nVar != null) {
            if (splitMembers instanceof SplitMembersType.Group) {
                SplitMembersType.Group group = (SplitMembersType.Group) splitMembers;
                splitMembers = SplitMembersType.Group.a(group, null, d0.P0(group.f79222b, new mqk.g(nVar, 3, false)), 1);
            } else {
                if (!(splitMembers instanceof SplitMembersType.Split)) {
                    throw new NoWhenBranchMatchedException();
                }
                SplitMembersType.Split split = (SplitMembersType.Split) splitMembers;
                splitMembers = SplitMembersType.Split.a(split, null, d0.P0(split.f79224b, new d()), 1);
            }
        }
        List<SplitMemberType> f79224b = splitMembers.getF79224b();
        ArrayList arrayList = new ArrayList(w.t(f79224b, 10));
        for (SplitMemberType splitMemberType : f79224b) {
            SplitMemberType.SplitMember splitMember = splitMemberType instanceof SplitMemberType.SplitMember ? (SplitMemberType.SplitMember) splitMemberType : null;
            Integer f79220b = splitMember != null ? splitMember.getF79220b() : null;
            arrayList.add(new ap9.g(f79220b != null ? f79220b.intValue() : 0L, splitMemberType.O7(), f79220b != null, true));
        }
        return b(arrayList, splitType);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final b0 b(ArrayList arrayList, cp9.a splitType) {
        ap9.e eVar = (ap9.e) this.d.get(splitType);
        if (eVar == null) {
            throw new IllegalStateException("No strategy found for " + splitType);
        }
        ap9.f splitDistribution = eVar.a(new ap9.a(arrayList));
        Intrinsics.checkNotNullParameter(splitDistribution, "splitDistribution");
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        dj0.d totalSum = this.f315802c;
        Intrinsics.checkNotNullParameter(totalSum, "totalSum");
        ArrayList arrayListB = h.b(splitDistribution, splitType, totalSum.f115082a);
        ArrayList arrayList2 = splitDistribution.f8125a;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        int i = 0;
        for (Object obj2 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ap9.g gVar = (ap9.g) obj2;
            arrayList3.add(new t(gVar.f8127a, gVar.f8128b, new dj0.d(((Number) arrayListB.get(i)).longValue(), totalSum.f115083b), gVar.f8129c, gVar.d));
            i = i2;
        }
        return new b0(splitDistribution.f8126b, arrayList3);
    }
}
