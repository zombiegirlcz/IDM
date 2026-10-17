package com.revolut.feature.onboarding.impl.user_migration;

import ad9.h;
import com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = new h(eVar, continuation, 2);
            this.u = 1;
            obj2 = eVar.p2(this, hVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        PlannedUserMigrationResult plannedUserMigrationResult = (PlannedUserMigrationResult) obj2;
        if (plannedUserMigrationResult instanceof PlannedUserMigrationResult.Error) {
            Throwable th10 = ((PlannedUserMigrationResult.Error) plannedUserMigrationResult).f78215a;
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            oki.h.D2(eVar.u);
            return Unit.f186387a;
        }
        if (plannedUserMigrationResult instanceof PlannedUserMigrationResult.MigrationNotSupported) {
            eVar.K2((PlannedUserMigrationResult.MigrationNotSupported) plannedUserMigrationResult);
            return Unit.f186387a;
        }
        if (plannedUserMigrationResult instanceof PlannedUserMigrationResult.NoPlannedMigrations) {
            return eVar.M2();
        }
        if (plannedUserMigrationResult instanceof PlannedUserMigrationResult.UnsatisfiableMigration) {
            return eVar.L2();
        }
        if (!(plannedUserMigrationResult instanceof PlannedUserMigrationResult.AllRequirementsSatisfied) && !(plannedUserMigrationResult instanceof PlannedUserMigrationResult.OccupationRequired) && !(plannedUserMigrationResult instanceof PlannedUserMigrationResult.PlaceOfBirthRequired) && !(plannedUserMigrationResult instanceof PlannedUserMigrationResult.QesRequired) && !(plannedUserMigrationResult instanceof PlannedUserMigrationResult.TermsRequired)) {
            throw new NoWhenBranchMatchedException();
        }
        oki.h.t2(eVar, eVar.u, new UserMigrationFlowContract$Step.Intro(plannedUserMigrationResult), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
