package hxi;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f156607b = new i();

    private i() {
        super(new TimeClause.Format.Pretty(q0.ONLY_TIME));
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof i);
    }

    public final int hashCode() {
        return 1995453719;
    }
}
