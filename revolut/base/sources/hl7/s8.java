package hl7;

import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s8 {

    @NotNull
    public static final r8 Companion = new r8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153304b = {yhm.j.c(yhm.k.PUBLICATION, new q0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153305a;

    public /* synthetic */ s8(int i, List list) {
        if (1 == (i & 1)) {
            this.f153305a = list;
        } else {
            qlm.j1.f(q8.f153271a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
