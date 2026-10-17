package os9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.r;
import os9.a;
import rfm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mq9.f f229262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mr9.d f229263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl3.a f229264c;
    public final ang.f d;

    public c(mq9.f groupsInteractor, mr9.d groupsRemindersInteractor, jt0.b groupsDebtsInteractor, cl3.a contactsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(groupsRemindersInteractor, "groupsRemindersInteractor");
        Intrinsics.checkNotNullParameter(groupsDebtsInteractor, "groupsDebtsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f229262a = groupsInteractor;
        this.f229263b = groupsRemindersInteractor;
        this.f229264c = contactsInteractor;
        this.d = userInteractor;
    }

    public final f0 a(PaymentGroup group) {
        oq9.r rVar;
        efm.k kVarC;
        Intrinsics.checkNotNullParameter(group, "group");
        ArrayList<oq9.o> arrayListJ = oc.c.j(group);
        ArrayList arrayList = new ArrayList();
        for (oq9.o oVar : arrayListJ) {
            rfm.f fVarG = null;
            if (oVar instanceof oq9.l) {
                rVar = ((oq9.l) oVar).d;
            } else if (oVar instanceof oq9.m) {
                rVar = ((oq9.m) oVar).d;
            } else {
                if (!(oVar instanceof oq9.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVar = null;
            }
            boolean z = rVar instanceof oq9.p;
            cl3.a aVar = this.f229264c;
            if (z) {
                kVarC = ((wl3.h) aVar).b(((oq9.p) rVar).f227848a);
            } else if (rVar instanceof oq9.q) {
                kVarC = ((wl3.h) aVar).c(((oq9.q) rVar).f227850a);
            } else if (rVar instanceof oq9.s) {
                kVarC = ((wl3.h) aVar).c(((oq9.s) rVar).f227852a);
            } else {
                if (!(rVar instanceof r.a) && rVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                kVarC = null;
            }
            if (kVarC != null) {
                rfm.m mVar = new rfm.m(kVarC, new or2.e(new or4.h(25), 15), 1);
                a.C1263a c1263a = a.C1263a.f229260a;
                fVarG = ue0.e.G(mVar.e(c1263a), c1263a);
            }
            if (fVarG != null) {
                arrayList.add(fVarG);
            }
        }
        f0 f0VarO = new rfm.e(arrayList, new or2.e(new or4.h(26), 16), 1).o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        return f0VarO;
    }
}
