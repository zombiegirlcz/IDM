package xkl;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wl0.m;
import wl0.n;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements wl0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skm.l f306868a;

    public c(skm.l lVar) {
        this.f306868a = lVar;
    }

    @Override // wl0.a
    public final void a(n result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zEquals = result.equals(wl0.j.f298355a);
        skm.l lVar = this.f306868a;
        if (zEquals) {
            t1.H(lVar, null);
            return;
        }
        if (result instanceof wl0.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "authenticateAndSign: failed biometric attempt, type=" + ((wl0.k) result).f298356a, null, null, 16);
            return;
        }
        if (result.equals(wl0.l.f298357a)) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "Authentication attempts of bio signature has been exhausted", null, null, 16);
            t1.H(lVar, null);
        } else {
            if (!(result instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            t1.H(lVar, ((m) result).f298358a);
        }
    }
}
