package a09;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, nz8.d.class, "toDomain", "toDomain(Lcom/revolut/feature/learn/shared/impl/data/network/dto/course/CourseWithLessonsDto;)Lcom/revolut/feature/learn/shared/models/domain/LearnCourse;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        u09.o oVar;
        u09.o oVar2;
        String str;
        qz8.t p0 = (qz8.t) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String str2 = p0.d;
        String str3 = p0.o;
        LearnReward learnRewardB = nz8.j.b(p0.k);
        String str4 = p0.f250411n;
        u09.l lVarD = nz8.d.D(p0.f250409l);
        u09.k kVarC = nz8.d.C(p0.i);
        u09.v vVarW = cp5.d.W(p0.f250408j);
        String str5 = p0.f250405c;
        int i = p0.f;
        List list = p0.f250407h;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(nz8.f.b((uz8.i) it8.next()));
        }
        List<uz8.n> list2 = p0.f250406g;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (uz8.n nVar : list2) {
            Map map = nz8.f.f220998a;
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            arrayList2.add(nz8.f.c(nVar.f284642c));
        }
        boolean z = p0.e;
        List list3 = p0.f250410m;
        if (list3 == null) {
            list3 = zhm.f0.f322471a;
        }
        String str6 = p0.f250404b;
        qz8.q qVar = p0.f250412p;
        ArrayList arrayList3 = null;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            oVar = new u09.o(nz8.j.b(qVar.f250400a));
        } else {
            oVar = null;
        }
        List list4 = p0.f250403a;
        if (list4 != null) {
            List list5 = list4;
            oVar2 = oVar;
            str = str2;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
            Iterator it9 = list5.iterator();
            while (it9.hasNext()) {
                arrayList4.add(nz8.d.B((qz8.e) it9.next()));
            }
            arrayList3 = arrayList4;
        } else {
            oVar2 = oVar;
            str = str2;
        }
        return new u09.f(str, str3, learnRewardB, str4, lVarD, kVarC, vVarW, str5, i, arrayList, arrayList2, z, list3, str6, oVar2, arrayList3, pd.b.j(p0.f250413q));
    }
}
