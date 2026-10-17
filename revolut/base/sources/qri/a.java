package qri;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f248732b;

    public /* synthetic */ a(b bVar, int i) {
        this.f248731a = i;
        this.f248732b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object step) {
        switch (this.f248731a) {
            case 0:
                Intrinsics.checkNotNullParameter(step, "step");
                b bVar = this.f248732b;
                bVar.f248733b.c1(step);
                return bVar.i(step, Boolean.TRUE).w();
            case 1:
                NaviCommand naviCommand = (NaviCommand) step;
                Intrinsics.h(naviCommand);
                this.f248732b.d(naviCommand);
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter(step, "step");
                b bVar2 = this.f248732b;
                bVar2.f248733b.c1(step);
                return bVar2.i(step, Boolean.FALSE).w();
            case 3:
                NaviCommand naviCommand2 = (NaviCommand) step;
                Intrinsics.h(naviCommand2);
                this.f248732b.d(naviCommand2);
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(step, "it");
                b bVar3 = this.f248732b;
                bVar3.f248733b.c1(step);
                return bVar3.i(step, null);
        }
    }
}
