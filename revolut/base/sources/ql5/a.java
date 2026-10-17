package ql5;

import il5.e;
import kotlin.jvm.internal.Intrinsics;
import ll5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(b dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        e target = new e(dto.getTarget().getPocketId(), dto.getTarget().getType());
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(target, "target");
    }
}
