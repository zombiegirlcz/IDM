package s0l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import s0l.g;
import skm.e0;
import skm.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f258991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = sVar;
        this.f258991w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f258991w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX1;
        Function1 function1;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        final int i2 = 0;
        Continuation continuation = null;
        final int i3 = 1;
        final s sVar = this.v;
        try {
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    sVar.x2(new Function1() { // from class: s0l.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i2) {
                                case 0:
                                    return e.a((e) sVar.t2(), null, true, 3);
                                default:
                                    return e.a((e) sVar.t2(), null, false, 3);
                            }
                        }
                    });
                    lyk.a aVar = sVar.f258995s;
                    String phone = this.f258991w;
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    this.u = 1;
                    hyk.h hVar = aVar.f200849a;
                    hVar.getClass();
                    hsd.c cVar = new hsd.c(hVar, phone, continuation, 6);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, cVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                sVar.v2(g.b.f258983a);
                objX1 = Unit.f186387a;
                function1 = new Function1() { // from class: s0l.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i3) {
                            case 0:
                                return e.a((e) sVar.t2(), null, true, 3);
                            default:
                                return e.a((e) sVar.t2(), null, false, 3);
                        }
                    }
                };
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                ((r0l.b) sVar.f258992p).getClass();
                objX1 = sVar.X1(new y0("APPLICATION_FAILURE_STATUS_ID", new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4));
                function1 = new Function1() { // from class: s0l.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i3) {
                            case 0:
                                return e.a((e) sVar.t2(), null, true, 3);
                            default:
                                return e.a((e) sVar.t2(), null, false, 3);
                        }
                    }
                };
            }
            sVar.x2(function1);
            return objX1;
        } catch (Throwable th10) {
            sVar.x2(new Function1() { // from class: s0l.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            return e.a((e) sVar.t2(), null, true, 3);
                        default:
                            return e.a((e) sVar.t2(), null, false, 3);
                    }
                }
            });
            throw th10;
        }
    }
}
