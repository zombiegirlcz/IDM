package com.revolut.feature.onboarding.impl.onboarding;

import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import g37.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DateOfBirthControllerDescriptor$OutputData f78435w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, DateOfBirthControllerDescriptor$OutputData dateOfBirthControllerDescriptor$OutputData, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f78435w = dateOfBirthControllerDescriptor$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f78435w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            DateOfBirthControllerDescriptor$OutputData dateOfBirthControllerDescriptor$OutputData = this.f78435w;
            v vVar = this.v;
            z zVar = new z(dateOfBirthControllerDescriptor$OutputData, vVar, null, 17);
            this.u = 1;
            if (vVar.p2(this, zVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
