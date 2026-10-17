package lmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmd.j f196949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f196950b;

    public a(qmd.j repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f196949a = repository;
        ihm.b bVarE = ihm.b.e(amd.i.CATEGORIES);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f196950b = bVarE;
    }
}
