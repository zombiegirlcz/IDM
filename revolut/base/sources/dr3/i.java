package dr3;

import ht3.u;
import ht3.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {
    public static v a(st3.j dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        String value = dto.getValue();
        st3.i image = dto.getImage();
        if (!(image instanceof st3.h)) {
            throw new NoWhenBranchMatchedException();
        }
        st3.h hVar = (st3.h) image;
        return new v(title, value, new u(hVar.getUserId(), hVar.getFullName()));
    }
}
