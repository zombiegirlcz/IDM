package xag;

import efm.r;
import i6j.p;
import i9g.b0;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a f303882b;

    public /* synthetic */ f(com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a aVar, int i) {
        this.f303881a = i;
        this.f303882b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303881a) {
            case 0:
                afi.a draft = (afi.a) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a aVar = this.f303882b;
                b0 b0Var = aVar.f93757q;
                String str = draft.f4101b.f97981a;
                LocalDate localDate = draft.f4102c;
                LocalDate localDate2 = draft.d;
                List list = draft.e;
                r rVarG = m70.a.g(b0Var.d(new cgi.c(str, localDate, localDate2, hx7.a.F(list))), null, null, 3);
                cgi.c propertyRoomDetailsParams = new cgi.c(draft.f4101b.f97981a, localDate, localDate2, hx7.a.F(list));
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(propertyRoomDetailsParams, "propertyRoomDetailsParams");
                return w.m(rVarG, m70.a.g(nim.a.w(b0Var.d(propertyRoomDetailsParams), new p(27)), null, null, 3), aVar.f93759s.a());
            default:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                this.f303882b.C2(output);
                return Unit.f186387a;
        }
    }
}
