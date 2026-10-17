package hl7;

import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u7 {

    @NotNull
    public static final t7 Companion = new t7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153331b = {yhm.j.c(yhm.k.PUBLICATION, new q0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153332a;

    public /* synthetic */ u7(int i, List list) {
        if (1 == (i & 1)) {
            this.f153332a = list;
        } else {
            qlm.j1.f(s7.f153303a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
