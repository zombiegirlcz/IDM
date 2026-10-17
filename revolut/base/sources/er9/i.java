package er9;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import efm.d0;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f128572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f128573c;

    public /* synthetic */ i(x xVar, String str, int i) {
        this.f128571a = i;
        this.f128572b = xVar;
        this.f128573c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        st9.d dVar;
        switch (this.f128571a) {
            case 0:
                x xVar = this.f128572b;
                String str = this.f128573c;
                xVar.o.b("RELOAD_STRATEGY_KEY_BILLS" + str);
                return Unit.f186387a;
            case 1:
                x xVar2 = this.f128572b;
                String str2 = this.f128573c;
                xVar2.o.b("RELOAD_STRATEGY_KEY_GROUP_" + str2);
                qe0.s sVar = xVar2.f128605p;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
            case 2:
                x xVar3 = this.f128572b;
                String str3 = this.f128573c;
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                yq9.i iVar = xVar3.f;
                RoomDatabase roomDatabase = iVar.f316008a;
                yj2.b bVar = new yj2.b(iVar, str3, 20);
                int i = 1;
                List list = (List) DBUtil.performBlocking(roomDatabase, true, false, bVar);
                List list2 = groupMembers;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap members = new LinkedHashMap(iB);
                for (Object obj3 : list2) {
                    members.put(((oq9.o) obj3).b(), obj3);
                }
                Intrinsics.checkNotNullParameter(list, "<this>");
                Intrinsics.checkNotNullParameter(members, "members");
                List<ar9.o> list3 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (ar9.o oVar : list3) {
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    Intrinsics.checkNotNullParameter(members, "members");
                    String str4 = oVar.f8566a;
                    String str5 = oVar.f8567b;
                    int i2 = br9.e.f17957a[oVar.d.ordinal()];
                    if (i2 == i) {
                        dVar = st9.d.ACTIVE;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = st9.d.PENDING;
                    }
                    long j2 = oVar.e;
                    xi0.a aVar = xi0.b.Companion;
                    String str6 = oVar.f;
                    aVar.getClass();
                    arrayList.add(new st9.e(str4, str5, dVar, new dj0.d(j2, xi0.a.a(str6)), new dj0.d(oVar.f8569g, xi0.a.a(oVar.f8570h)), yh5.b.q(oVar.f8571j, str5, "payeeId", members), yh5.b.q(oVar.i, str5, "payerId", members), oVar.k));
                    i = 1;
                }
                return arrayList;
            case 3:
                x xVar4 = this.f128572b;
                String str7 = this.f128573c;
                List groupMembers2 = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers2, "groupMembers");
                yq9.c cVar = (yq9.c) xVar4.f128598c;
                List list4 = (List) DBUtil.performBlocking(cVar.f315994a, true, false, new y9d.c(18, str7, cVar));
                yq9.e eVar = xVar4.d;
                List list5 = (List) DBUtil.performBlocking(eVar.f315999a, true, false, new yq9.d(eVar, str7, 0));
                List list6 = groupMembers2;
                int iB2 = q0.b(zhm.w.t(list6, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB2);
                for (Object obj4 : list6) {
                    linkedHashMap.put(((oq9.o) obj4).b(), obj4);
                }
                return v13.d.G(linkedHashMap, list4, xam.a.r(linkedHashMap, list5));
            case 4:
                x xVar5 = this.f128572b;
                String str8 = this.f128573c;
                xVar5.o.b("RELOAD_STRATEGY_KEY_SETTLEMENTS" + str8);
                return Unit.f186387a;
            case 5:
                x xVar6 = this.f128572b;
                String str9 = this.f128573c;
                List groupMembers3 = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers3, "groupMembers");
                yq9.o oVar2 = xVar6.e;
                List list7 = (List) DBUtil.performBlocking(oVar2.f316023a, true, false, new yq9.m(oVar2, str9, 0));
                List list8 = groupMembers3;
                int iB3 = q0.b(zhm.w.t(list8, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB3);
                for (Object obj5 : list8) {
                    linkedHashMap2.put(((oq9.o) obj5).b(), obj5);
                }
                return a.a.F(linkedHashMap2, list7);
            case 6:
                x xVar7 = this.f128572b;
                String str10 = this.f128573c;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list9 = (List) pair.f186385a;
                List list10 = (List) pair.f186386b;
                xVar7.f128605p.d = true;
                List list11 = list10;
                int iB4 = q0.b(zhm.w.t(list11, 10));
                if (iB4 < 16) {
                    iB4 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB4);
                for (Object obj6 : list11) {
                    linkedHashMap3.put(((oq9.o) obj6).b(), obj6);
                }
                return br9.c.a(list9, str10, linkedHashMap3);
            case 7:
                x xVar8 = this.f128572b;
                String str11 = this.f128573c;
                List bills = (List) obj2;
                Intrinsics.checkNotNullParameter(bills, "bills");
                return xVar8.h(str11).D(bills);
            case 8:
                x xVar9 = this.f128572b;
                String str12 = this.f128573c;
                File compressedImageFile = (File) obj2;
                Intrinsics.checkNotNullParameter(compressedImageFile, "compressedImageFile");
                String strN = lim.o.n(compressedImageFile);
                if (Intrinsics.f(strN, "jpg") || Intrinsics.f(strN, "0")) {
                    strN = "jpeg";
                }
                e1 e1Var = MultipartBody$Part.Companion;
                p1 p1Var = RequestBody.Companion;
                b1.Companion.getClass();
                b1 b1VarB = a1.b("image/" + strN);
                p1Var.getClass();
                k1 k1VarA = p1.a(compressedImageFile, b1VarB);
                e1Var.getClass();
                d0<cr9.v> d0VarChangeImage = xVar9.f128599g.changeImage(true, str12, e1.c("banner", "banner", k1VarA));
                k kVar = new k(13, new b22.j(compressedImageFile, 2));
                d0VarChangeImage.getClass();
                return new ufm.f(d0VarChangeImage, kVar, 3);
            case 9:
                x xVar10 = this.f128572b;
                String str13 = this.f128573c;
                xVar10.o.b("RELOAD_STRATEGY_KEY_DEBTS" + str13);
                return Unit.f186387a;
            case 10:
                x xVar11 = this.f128572b;
                String str14 = this.f128573c;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list12 = (List) pair2.f186385a;
                List list13 = (List) pair2.f186386b;
                xVar11.f128605p.d = true;
                List list14 = list13;
                int iB5 = q0.b(zhm.w.t(list14, 10));
                if (iB5 < 16) {
                    iB5 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB5);
                for (Object obj7 : list14) {
                    linkedHashMap4.put(((oq9.o) obj7).b(), obj7);
                }
                return br9.c.a(list12, str14, linkedHashMap4);
            case 11:
                x xVar12 = this.f128572b;
                String str15 = this.f128573c;
                List bills2 = (List) obj2;
                Intrinsics.checkNotNullParameter(bills2, "bills");
                return xVar12.h(str15).D(bills2);
            default:
                x xVar13 = this.f128572b;
                String str16 = this.f128573c;
                PaymentGroup paymentGroup = (PaymentGroup) obj2;
                qe0.q qVar = xVar13.o;
                String params = "RELOAD_STRATEGY_KEY_DEBTS" + str16;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                qVar.f245042a.invoke(params, -1L);
                w4l.f fVar = xVar13.f128606q;
                Intrinsics.h(paymentGroup);
                xVar13.i(fVar, paymentGroup);
                xVar13.f128605p.d = true;
                return Unit.f186387a;
        }
    }
}
