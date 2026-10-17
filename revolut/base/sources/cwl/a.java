package cwl;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f109850b;

    public /* synthetic */ a(g gVar, int i) {
        this.f109849a = i;
        this.f109850b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand naviCommand = (NaviCommand) obj2;
        switch (this.f109849a) {
            case 0:
                m mVarA = this.f109850b.a();
                if (mVarA != null) {
                    Intrinsics.h(naviCommand);
                    mVarA.c(naviCommand);
                }
                break;
            default:
                m mVarA2 = this.f109850b.a();
                if (mVarA2 != null) {
                    Intrinsics.h(naviCommand);
                    mVarA2.c(naviCommand);
                }
                break;
        }
        return Unit.f186387a;
    }
}
