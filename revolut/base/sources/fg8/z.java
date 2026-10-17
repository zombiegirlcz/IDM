package fg8;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f135019b;

    public /* synthetic */ z(c0 c0Var, int i) {
        this.f135018a = i;
        this.f135019b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        final NaviCommand command = (NaviCommand) obj2;
        switch (this.f135018a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                final int i = 0;
                final c0 c0Var = this.f135019b;
                return new pfm.h(new kfm.a() { // from class: fg8.x
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                sri.m mVar = c0Var.f134911a;
                                NaviCommand naviCommand = command;
                                Intrinsics.h(naviCommand);
                                mVar.c(naviCommand);
                                break;
                            default:
                                sri.m mVar2 = c0Var.f134911a;
                                NaviCommand naviCommand2 = command;
                                Intrinsics.h(naviCommand2);
                                mVar2.c(naviCommand2);
                                break;
                        }
                    }
                }, 2);
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                final int i2 = 1;
                final c0 c0Var2 = this.f135019b;
                return new pfm.h(new kfm.a() { // from class: fg8.x
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                sri.m mVar = c0Var2.f134911a;
                                NaviCommand naviCommand = command;
                                Intrinsics.h(naviCommand);
                                mVar.c(naviCommand);
                                break;
                            default:
                                sri.m mVar2 = c0Var2.f134911a;
                                NaviCommand naviCommand2 = command;
                                Intrinsics.h(naviCommand2);
                                mVar2.c(naviCommand2);
                                break;
                        }
                    }
                }, 2);
        }
    }
}
