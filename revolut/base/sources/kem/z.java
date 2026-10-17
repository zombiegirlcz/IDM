package kem;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f183244a;

    static {
        x xVar = y.Companion;
        xVar.getClass();
        y yVar = y.f183240b;
        xVar.getClass();
        y yVar2 = y.e;
        xVar.getClass();
        y[] elements = {yVar, yVar2, y.f, new y("TRACE")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f183244a = kotlin.collections.d.y0(elements);
    }
}
