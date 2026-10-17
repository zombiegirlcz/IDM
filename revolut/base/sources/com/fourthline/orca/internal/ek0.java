package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bm;
import com.fourthline.orca.internal.ck0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.pl0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ek0 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f28166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc1 f28167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc1 f28168c;
    private final aq0 d;
    private final c80 e;

    public ek0(o80 navigationChannel, vc1 skipNationalityUseCase, vc1 skipPersonDetailsUseCase, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(skipNationalityUseCase, "skipNationalityUseCase");
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f28166a = navigationChannel;
        this.f28167b = skipNationalityUseCase;
        this.f28168c = skipPersonDetailsUseCase;
        this.d = popupHandler;
        this.e = new c80("person");
    }

    private final q80 c() {
        aq0.a(this.d, hq0.b.f29374a, new gj1(this, 22), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof bm.c) {
            return a((bm.c) navigationEffect);
        }
        if (navigationEffect instanceof pl0.a) {
            return a((pl0.a) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.f28167b.a(true) ? q80.s.b.f32306b : this.f28168c.a(true) ? new q80.s.a(null, 1, null) : new q80.s.a(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(al0 navigationEffect) {
        q80 q80VarA;
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof bm.c) {
            q80VarA = a((bm.c) navigationEffect);
        } else {
            if (!(navigationEffect instanceof pl0.a)) {
                throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
            }
            q80VarA = a((pl0.a) navigationEffect);
        }
        this.f28166a.mo3647trySendJP2dKIU(q80VarA);
    }

    private final q80 a(bm.c cVar) {
        if (cVar instanceof bm.c.a) {
            return c();
        }
        if (cVar instanceof bm.c.C0171c) {
            bm.c.C0171c c0171c = (bm.c.C0171c) cVar;
            return c0171c.c() instanceof ck0.b ? q80.s.b.f32306b : new q80.k(null, ly.a(c0171c.c()), 1, null);
        }
        if (cVar instanceof bm.c.b) {
            return new q80.l(((bm.c.b) cVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(pl0.a aVar) {
        if (Intrinsics.f(aVar, pl0.a.C0264a.f31992a)) {
            if (this.f28167b.a(false)) {
                return c();
            }
            return new q80.b(null, 1, null);
        }
        if (aVar instanceof pl0.a.b) {
            pl0.a.b bVar = (pl0.a.b) aVar;
            bVar.c();
            return new q80.k(null, ly.a(bVar.c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ek0 ek0Var) {
        ek0Var.f28166a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
