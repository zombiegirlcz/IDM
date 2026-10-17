package hl7;

import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153240c;

    public /* synthetic */ o1(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(m1.f153209a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153238a = str;
        this.f153239b = str2;
        this.f153240c = list;
    }
}
