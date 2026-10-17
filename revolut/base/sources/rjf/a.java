package rjf;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import sri.m;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f254666b;

    public /* synthetic */ a(d dVar, int i) {
        this.f254665a = i;
        this.f254666b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f254665a) {
            case 0:
                p payment = (p) obj2;
                Intrinsics.checkNotNullParameter(payment, "payment");
                return this.f254666b.f254670b.a(payment);
            default:
                NaviCommand naviCommand = (NaviCommand) obj2;
                m mVar = this.f254666b.f254669a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
        }
    }
}
