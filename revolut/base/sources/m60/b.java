package m60;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import yji.p;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends p {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj0.a f202965c;
    public final e d;
    public final String e;
    public boolean f;

    public b(wj0.a idempotencyKeyHolder, e dateProvider, String tag2) {
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f202965c = idempotencyKeyHolder;
        this.d = dateProvider;
        this.e = tag2;
    }

    @Override // yji.p
    public final String Q() {
        return j6.a.q("IDEMPOTENCY_KEY_EXTENSION_", this.e);
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String idempotencyTag = this.e;
        String idempotencyKey = state.getString(idempotencyTag);
        long j2 = state.getLong("IDEMPOTENCY_STATE_STORAGE_TIMESTAMP_SEC");
        if (idempotencyKey == null || ((f) this.d).b().getEpochSecond() - j2 >= 1800) {
            this.f = false;
            return;
        }
        this.f = true;
        wj0.a aVar = this.f202965c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(idempotencyTag, "idempotencyTag");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        aVar.f297952b.f(idempotencyTag, idempotencyKey);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        wj0.a aVar = this.f202965c;
        String str = this.e;
        String strB = aVar.b(str);
        if (strB != null) {
            outState.putString(str, strB);
            outState.putLong("IDEMPOTENCY_STATE_STORAGE_TIMESTAMP_SEC", ((f) this.d).b().getEpochSecond());
        }
    }

    @Override // yji.d
    public final void onCreate() {
        if (this.f) {
            return;
        }
        this.f202965c.a(this.e);
    }
}
