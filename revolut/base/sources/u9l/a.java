package u9l;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import thf.d;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f278506a;

    public a(d iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f278506a = iconMapper;
    }

    public final Image a(v9l.a transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction == null) {
            try {
                throw new IllegalArgumentException(("Unsupported SharedTransaction " + transaction).toString());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                transaction = null;
            }
        }
        if (transaction == null) {
            return null;
        }
        return this.f278506a.b(transaction.f287078a, transaction.f287079b);
    }
}
