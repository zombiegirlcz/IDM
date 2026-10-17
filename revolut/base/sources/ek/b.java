package ek;

import kotlin.jvm.internal.Intrinsics;
import mlm.j;
import ulm.b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final a a(j jVar, b1 contentType) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new a(contentType, new a31.a(jVar));
    }
}
