package hx7;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f156394a = r0.k(new Pair("PEDIGREE", zw7.h.PEDIGREE), new Pair("CROSS", zw7.h.CROSS), new Pair("MIXED", zw7.h.MIXED));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final zw7.e a(gx7.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new zw7.e(eVar.getCode(), eVar.getName(), (zw7.h) u1.t(eVar.getBreedType(), zw7.h.UNKNOWN, f156394a), eVar.getPopular());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final zw7.e b(ix7.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new zw7.e(eVar.getCode(), eVar.getName(), (zw7.h) u1.t(eVar.getBreedType(), zw7.h.UNKNOWN, f156394a), eVar.getPopular());
    }
}
