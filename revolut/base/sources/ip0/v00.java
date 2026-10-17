package ip0;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.oa f166753b;

    public /* synthetic */ v00(com.revolut.core.ui_kit.delegates.oa oaVar, int i) {
        this.f166752a = i;
        this.f166753b = oaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f166752a) {
            case 0:
                com.revolut.core.ui_kit.delegates.oa oaVar = this.f166753b;
                zam.a frame = (zam.a) obj2;
                Intrinsics.checkNotNullParameter(frame, "frame");
                oaVar.f54542n = frame;
                oaVar.o = null;
                if (oaVar.k) {
                    oaVar.k = false;
                    oaVar.itemView.post(oaVar.f54539j);
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.oa oaVar2 = this.f166753b;
                oaVar2.f54542n = null;
                oaVar2.o = (Bitmap) obj2;
                break;
        }
        return Unit.f186387a;
    }
}
