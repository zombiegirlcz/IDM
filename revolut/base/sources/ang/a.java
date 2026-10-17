package ang;

import do3.n;
import hng.q;
import java.util.concurrent.CopyOnWriteArrayList;
import jng.l;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ylg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f7764a;

    public a(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f7764a = storage;
    }

    public final n a() {
        try {
            ue0.c cVar = this.f7764a;
            q.Companion.getClass();
            l lVar = (l) cVar.T2("STORAGE_KEY_USER", q.k);
            if (lVar != null) {
                return com.bumptech.glide.c.B(lVar);
            }
            return null;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "LegacyUserProviderImpl", "Can't get access to user in storage", e, h0Var);
            return null;
        }
    }
}
