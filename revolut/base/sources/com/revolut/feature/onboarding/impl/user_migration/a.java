package com.revolut.feature.onboarding.impl.user_migration;

import com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UserMigrationFlowContract$Step.Intro f78586w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, UserMigrationFlowContract$Step.Intro intro, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f78586w = intro;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f78586w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PlannedUserMigrationResult plannedUserMigrationResult = this.f78586w.f78581a;
            this.u = 1;
            if (this.v.I2(plannedUserMigrationResult, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
