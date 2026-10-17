package sg0;

import kotlin.jvm.functions.Function0;
import ui0.l;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f262575a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f262576b = new a();

    public static final class a implements c {
        @Override // sg0.c
        public final boolean c() {
            return false;
        }

        @Override // sg0.c
        public final Function0 d() {
            return sg0.a.f262574a;
        }
    }

    private b() {
    }

    public static l a(Long l2, Long l3) {
        if (l2 == null && l3 == null) {
            return null;
        }
        if (l2 == null || l3 == null) {
            throw new IllegalStateException("VERSION_CODE_V2_THRESHOLD and VERSION_CODE_V2_OFFSET must both be provided or both be null");
        }
        return new l(l2.longValue(), l3.longValue());
    }
}
