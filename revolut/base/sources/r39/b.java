package r39;

import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import java.util.Collections;
import java.util.Set;
import qy7.f;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateInputInputData f251225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251227c;

    public b(c cVar, DateInputInputData dateInputInputData) {
        this.f251225a = dateInputInputData;
        int i = 8;
        this.f251226b = e4m.b.b(new f(cVar, this, 1, i));
        this.f251227c = e4m.b.b(new f(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
