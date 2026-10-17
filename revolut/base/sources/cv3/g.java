package cv3;

import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public interface g extends Serializable {
    default h l5() {
        if (this instanceof d) {
            return ((d) this).f109248b;
        }
        if (this instanceof b) {
            return ((b) this).f109236a;
        }
        if (this instanceof c) {
            return ((c) this).e;
        }
        if (this instanceof f) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
