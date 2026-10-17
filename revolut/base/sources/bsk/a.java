package bsk;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18211b;

    public /* synthetic */ a(c cVar, int i) {
        this.f18210a = i;
        this.f18211b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18210a) {
            case 0:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                this.f18211b.f18215a.c(command);
                break;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                c cVar = this.f18211b;
                cVar.f18215a.c((NaviCommand) cVar.d.getValue());
                break;
        }
        return Boolean.TRUE;
    }
}
