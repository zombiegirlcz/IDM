package j54;

import com.revolut.retail.core.navigation.FeatureCommand;
import j54.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public interface v {
    static Unit r(v vVar, String str, FeatureCommand featureCommand, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            featureCommand = null;
        }
        y yVar = (y) vVar;
        mri.w wVar = yVar.f171584l;
        if (str != null) {
            mri.w.r0(wVar, str);
        }
        pw5.a.x(wVar);
        yVar.r2().M0(new t.b(featureCommand, str));
        return Unit.f186387a;
    }
}
