package cpa;

import a09.r;
import kotlin.jvm.internal.Intrinsics;
import o80.b;
import ufm.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107911a;

    public a(b imageUtils, int i) {
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        this.f107911a = i;
    }

    public final c a(String profileImagePath) {
        Intrinsics.checkNotNullParameter(profileImagePath, "profileImagePath");
        c cVar = new c(new r(this, profileImagePath, 17), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
