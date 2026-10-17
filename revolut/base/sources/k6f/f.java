package k6f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.h f181705a;

    public f(l6f.a allocationItemMapper, d1h.h remoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(allocationItemMapper, "allocationItemMapper");
        Intrinsics.checkNotNullParameter(remoteDisclaimersMapper, "remoteDisclaimersMapper");
        this.f181705a = remoteDisclaimersMapper;
    }
}
