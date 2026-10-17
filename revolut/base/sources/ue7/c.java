package ue7;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward;
import cxe.u;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import re7.j;
import vkm.y;
import w4l.i;
import xd2.n;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements qe7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg3.a f279309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f279310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe7.d f279311c;

    public c(lg3.a checklistChallengesInteractor, l80.e dateProvider, xe7.d repository) {
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279309a = checklistChallengesInteractor;
        this.f279310b = dateProvider;
        this.f279311c = repository;
    }

    public static Pair c(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ChecklistChallenge) next).f65775a, str)) {
                break;
            }
        }
        ChecklistChallenge checklistChallenge = (ChecklistChallenge) next;
        if (checklistChallenge != null) {
            ChecklistChallengeReward checklistChallengeReward = checklistChallenge.f65776b;
            ChecklistChallengeReward.PhysicalCard physicalCard = checklistChallengeReward instanceof ChecklistChallengeReward.PhysicalCard ? (ChecklistChallengeReward.PhysicalCard) checklistChallengeReward : null;
            if (physicalCard != null) {
                return new Pair(checklistChallenge, physicalCard);
            }
        }
        return null;
    }

    public static j f(ChecklistChallengeReward.PhysicalCard physicalCard) {
        String str = physicalCard.f65787a;
        Locale locale = Locale.ROOT;
        return new j(v0.a.j(locale, "ROOT", str, locale, "toUpperCase(...)"), physicalCard.f65788b, physicalCard.f65789c, physicalCard.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ue7.a
            if (r0 == 0) goto L13
            r0 = r7
            ue7.a r0 = (ue7.a) r0
            int r1 = r0.f279306w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279306w = r1
            goto L18
        L13:
            ue7.a r0 = new ue7.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279306w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L69
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            xe7.d r7 = r6.f279311c
            r7.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            x4l.c r2 = r7.e
            kotlin.Unit r5 = kotlin.Unit.f186387a
            qe0.s r7 = r7.d
            w4l.k r7 = r7.c(r5, r4)
            vkm.d r7 = r2.b(r5, r7)
            xd2.n r2 = new xd2.n
            r4 = 4
            r2.<init>(r4)
            akg.n r7 = nim.a.v(r7, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r7 = rd0.e.n(r7, r2)
            zfd.e r7 = zi0.c.w(r7)
            r0.f279306w = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            r0 = 0
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r7.getContent()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L9b
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L86
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L86
            goto L9b
        L86:
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r7.next()
            ve7.k r1 = (ve7.k) r1
            boolean r1 = r1 instanceof ve7.h
            if (r1 == 0) goto L8a
            goto L9c
        L9b:
            r3 = r0
        L9c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ue7.c.d(gim.c):java.lang.Object");
    }

    public final u e(Object obj2, Function1 function1, Function3 function3) {
        xe7.d dVar = this.f279311c;
        dVar.getClass();
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = dVar.e;
        Unit unit = Unit.f186387a;
        return nim.a.y(rd0.e.n(new y(xam.a.h(new a9h.c(function1, obj2, this, function3, (Continuation) null), nim.a.v(cVar.b(unit, dVar.d.c(unit, loadingStrategy)), new n(4))), new pc2.d(3, 23, null)), h0.f322473a), new sx4.b(obj2, 3));
    }
}
