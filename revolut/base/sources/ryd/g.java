package ryd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uyd.h0;
import uyd.k0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f258339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f258340c;

    public /* synthetic */ g(w wVar, String str, int i) {
        this.f258338a = i;
        this.f258339b = wVar;
        this.f258340c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean bool = (Boolean) obj2;
        switch (this.f258338a) {
            case 0:
                bool.getClass();
                h0 h0Var = (h0) this.f258339b.f258357a;
                h0Var.getClass();
                String groupId = this.f258340c;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                return h0Var.f284202w.e(new k0(groupId), w4l.h.f294642c);
            default:
                boolean zBooleanValue = bool.booleanValue();
                w4l.f fVar = ((h0) this.f258339b.f258357a).i;
                String str = this.f258340c;
                if (str == null) {
                    str = null;
                }
                return fVar.f(new uyd.q(str, zBooleanValue), true);
        }
    }
}
