package androidx.glance.session;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"GlanceSessionManager", "Landroidx/glance/session/SessionManager;", "getGlanceSessionManager", "()Landroidx/glance/session/SessionManager;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SessionManagerKt {

    @NotNull
    private static final SessionManager GlanceSessionManager = new SessionManagerImpl(SessionWorker.class);

    @NotNull
    public static final SessionManager getGlanceSessionManager() {
        return GlanceSessionManager;
    }
}
