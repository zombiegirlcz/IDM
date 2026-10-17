package vpg;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import sri.m;
import ufm.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f291203b;

    public /* synthetic */ a(e eVar, int i) {
        this.f291202a = i;
        this.f291203b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291202a) {
            case 0:
                NaviCommand naviCommand = (NaviCommand) obj2;
                m mVar = this.f291203b.f291207a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
            case 1:
                NaviCommand naviCommand2 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand2, "naviCommand");
                e eVar = this.f291203b;
                return new i(((cpj.b) eVar.f291209c).e(yoj.c.VAULTS, yoj.d.DISABLED), new b(1, new ec9.a(naviCommand2, eVar, 7)), 1).w();
            default:
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return ((aqg.b) this.f291203b.d).a(vault);
        }
    }
}
