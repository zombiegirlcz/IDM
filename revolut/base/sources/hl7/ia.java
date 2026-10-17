package hl7;

import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class ia {

    @NotNull
    public static final ha Companion = new ha();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153152b = {yhm.j.c(yhm.k.PUBLICATION, new q0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153153a;

    public /* synthetic */ ia(int i, List list) {
        if (1 == (i & 1)) {
            this.f153153a = list;
        } else {
            qlm.j1.f(ga.f153122a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
