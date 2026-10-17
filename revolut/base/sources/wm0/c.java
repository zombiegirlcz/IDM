package wm0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf5.a f298585a;

    public static final class a {
        private a() {
        }
    }

    public c() {
        wf5.a keyStoreFactory = new wf5.a(17);
        Intrinsics.checkNotNullParameter(keyStoreFactory, "keyStoreFactory");
        this.f298585a = keyStoreFactory;
    }

    public final f a() {
        Integer numValueOf;
        int iIntValue;
        f fVar = (f) this.f298585a.invoke();
        if (wm0.a.f298584a.compareAndSet(false, true)) {
            try {
                numValueOf = Integer.valueOf(((g) fVar).f298587a.size());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                numValueOf = null;
            }
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) >= 40000) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AndroidKeyStoreProvider", j6.a.l(iIntValue, "Android Keystore aliases count is approaching the per-app key limit: ", "/50000"), null, h0Var2);
            }
        }
        return fVar;
    }
}
