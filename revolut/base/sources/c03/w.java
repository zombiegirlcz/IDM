package c03;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f20148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20149c;
    public final tm.g d;
    public final tm.g e;
    public final tm.g f;

    public w(l93.f revolutCardsInteractor, b state, com.google.firebase.messaging.t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f20148b = revolutCardsInteractor;
        this.f20149c = state;
        final int i = 0;
        this.d = actionDelegateFactory.e(new Function0(this) { // from class: c03.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f20147b;

            {
                this.f20147b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        w wVar = this.f20147b;
                        int i2 = 0;
                        pfm.h hVar = new pfm.h(new ufm.i(te0.w.N(((n) wVar.f20149c).w0()), new u(i2, new t(wVar, i2)), 0), 4);
                        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                        return hVar;
                    case 1:
                        w wVar2 = this.f20147b;
                        int i3 = 2;
                        pfm.a aVar = new pfm.a(te0.w.N(((n) wVar2.f20149c).w0()), new u(i3, new t(wVar2, i3)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        return aVar;
                    default:
                        w wVar3 = this.f20147b;
                        int i5 = 1;
                        pfm.a aVar2 = new pfm.a(te0.w.N(((n) wVar3.f20149c).w0()), new u(i5, new t(wVar3, i5)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                        return aVar2;
                }
            }
        });
        final int i2 = 1;
        this.e = actionDelegateFactory.e(new Function0(this) { // from class: c03.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f20147b;

            {
                this.f20147b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        w wVar = this.f20147b;
                        int i22 = 0;
                        pfm.h hVar = new pfm.h(new ufm.i(te0.w.N(((n) wVar.f20149c).w0()), new u(i22, new t(wVar, i22)), 0), 4);
                        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                        return hVar;
                    case 1:
                        w wVar2 = this.f20147b;
                        int i3 = 2;
                        pfm.a aVar = new pfm.a(te0.w.N(((n) wVar2.f20149c).w0()), new u(i3, new t(wVar2, i3)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        return aVar;
                    default:
                        w wVar3 = this.f20147b;
                        int i5 = 1;
                        pfm.a aVar2 = new pfm.a(te0.w.N(((n) wVar3.f20149c).w0()), new u(i5, new t(wVar3, i5)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                        return aVar2;
                }
            }
        });
        final int i3 = 2;
        this.f = actionDelegateFactory.e(new Function0(this) { // from class: c03.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f20147b;

            {
                this.f20147b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        w wVar = this.f20147b;
                        int i22 = 0;
                        pfm.h hVar = new pfm.h(new ufm.i(te0.w.N(((n) wVar.f20149c).w0()), new u(i22, new t(wVar, i22)), 0), 4);
                        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                        return hVar;
                    case 1:
                        w wVar2 = this.f20147b;
                        int i32 = 2;
                        pfm.a aVar = new pfm.a(te0.w.N(((n) wVar2.f20149c).w0()), new u(i32, new t(wVar2, i32)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        return aVar;
                    default:
                        w wVar3 = this.f20147b;
                        int i5 = 1;
                        pfm.a aVar2 = new pfm.a(te0.w.N(((n) wVar3.f20149c).w0()), new u(i5, new t(wVar3, i5)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                        return aVar2;
                }
            }
        });
    }
}
