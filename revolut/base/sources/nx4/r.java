package nx4;

import kotlin.jvm.internal.Intrinsics;
import nx4.q;

/* JADX INFO: loaded from: classes22.dex */
public final class r {
    public static fx4.c a(q dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        q.b disclaimer = dto.getDisclaimer();
        return new fx4.c(disclaimer != null ? new fx4.b(disclaimer.getText()) : null, new fx4.a(dto.getPrimaryButton().getText()));
    }
}
