package irc;

import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import ni0.e;
import ni0.f;
import rd0.c;
import vkm.q;
import vkm.z1;
import yji.d;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f168038c;

    public a(f paymentCardRecognitionResultExtractor) {
        Intrinsics.checkNotNullParameter(paymentCardRecognitionResultExtractor, "paymentCardRecognitionResultExtractor");
        this.f168038c = q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    @Override // yji.d
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected null data value");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
            return;
        }
        if (i != 11) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(a0.d.n("Unknown request code: ", i));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalArgumentException2, h0Var2);
            return;
        }
        e eVarA = f.a(intent);
        if (eVarA != null) {
            String pan = eVarA.f215614a.getPan();
            Intrinsics.checkNotNullExpressionValue(pan, "getPan(...)");
            this.f168038c.k(pan);
        } else {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Unexpected null intent value");
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalArgumentException3, h0Var3);
        }
    }
}
