package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import com.revolut.feature.external_accounts.api.model.penny_verification.PennyVerificationDeeplinkResult;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public PennyVerificationDeeplinkResult u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yki.i f73036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f73037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f73038y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f73038y = dVar;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f73038y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.link.penny_topup.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
