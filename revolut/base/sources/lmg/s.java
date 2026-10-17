package lmg;

import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f197071a = new LinkedHashSet();

    public final void a(UserChecklistContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f197071a.remove(type);
    }

    public final void b(UserChecklistContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f197071a.add(type);
    }
}
