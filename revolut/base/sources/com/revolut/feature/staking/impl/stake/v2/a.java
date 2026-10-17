package com.revolut.feature.staking.impl.stake.v2;

import cli.y;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dj0.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oqk.h;
import qwd.k;
import qwd.m;
import vkm.j2;
import vrc.g;
import yhm.o;
import z92.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public StakingPocket f88146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public StakingProduct f88147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f88148y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        StakingProduct stakingProduct;
        d dVar2;
        String str;
        StakingPocket stakingPocket;
        b bVar = this.z;
        StakeControllerContract$InputData stakeControllerContract$InputData = bVar.o;
        y yVar = bVar.K;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f88148y;
        if (i == 0) {
            o.b(obj2);
            io3.d dVar3 = (io3.d) ((m) ((j2) yVar.f22677a).getValue()).f249866g.getContent();
            Continuation continuation = null;
            if (Intrinsics.f(dVar3 != null ? f.l(dVar3) : null, stakeControllerContract$InputData.f88138a.d)) {
                k kVar = (k) ((m) ((j2) yVar.f22677a).getValue()).d.getContent();
                dVar = kVar != null ? kVar.f249859b : null;
            } else {
                m mVar = (m) ((j2) yVar.f22677a).getValue();
                dVar = new d(mVar.f249863a, mVar.f249864b);
            }
            String str2 = dVar3 != null ? dVar3.f163145a : null;
            StakingPocket stakingPocket2 = stakeControllerContract$InputData.f88139b;
            StakingProduct stakingProduct2 = stakeControllerContract$InputData.f88138a;
            if (dVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            h hVar = new h(bVar, dVar3, stakingProduct2, continuation, 15);
            this.u = dVar;
            this.v = str2;
            this.f88146w = stakingPocket2;
            this.f88147x = stakingProduct2;
            this.f88148y = 1;
            obj2 = bVar.p2(this, hVar);
            if (obj2 == aVar) {
                return aVar;
            }
            stakingProduct = stakingProduct2;
            dVar2 = dVar;
            str = str2;
            stakingPocket = stakingPocket2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StakingProduct stakingProduct3 = this.f88147x;
            StakingPocket stakingPocket3 = this.f88146w;
            String str3 = this.v;
            dVar2 = this.u;
            o.b(obj2);
            stakingProduct = stakingProduct3;
            stakingPocket = stakingPocket3;
            str = str3;
        }
        g gVar = (g) obj2;
        if (gVar instanceof vrc.f) {
            oki.h.v2(bVar.L, new StakeControllerContract$ModalStep.CryptoScaPrompt(((vrc.f) gVar).f291575a, dVar2, str, stakingPocket, stakingProduct), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } else {
            bVar.C2(new ytd.f(dVar2, str, stakingPocket, stakingProduct));
        }
        return Unit.f186387a;
    }
}
