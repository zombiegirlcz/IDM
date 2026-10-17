package com.revolut.feature.travel.experiences.impl.ui.screen.cancellation;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function1 {
    public iyf.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f93034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesCancellationScreenContract$Mode.BookingCancellation f93035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Data f93036y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, TravelExperiencesCancellationScreenContract$Mode.BookingCancellation bookingCancellation, Data data, Continuation continuation) {
        super(1, continuation);
        this.f93034w = eVar;
        this.f93035x = bookingCancellation;
        this.f93036y = data;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f93034w, this.f93035x, this.f93036y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02e4  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
