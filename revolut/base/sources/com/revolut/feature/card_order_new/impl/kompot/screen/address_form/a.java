package com.revolut.feature.card_order_new.impl.kompot.screen.address_form;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import do3.n;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o23.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ List A;
    public final /* synthetic */ n B;
    public AddressFormat u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f65128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Address f65129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f65130y;
    public final /* synthetic */ wi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Address address, v vVar, wi0.b bVar2, List list, n nVar, Continuation continuation) {
        super(1, continuation);
        this.f65128w = bVar;
        this.f65129x = address;
        this.f65130y = vVar;
        this.z = bVar2;
        this.A = list;
        this.B = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f65128w, this.f65129x, this.f65130y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        if (r0 == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.address_form.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
