package ydm;

import java.util.List;
import java.util.Set;
import kem.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f312726a;

    static {
        List list = u.f183239a;
        String[] elements = {"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f312726a = kotlin.collections.d.y0(elements);
    }
}
