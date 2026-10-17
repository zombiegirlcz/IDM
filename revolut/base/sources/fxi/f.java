package fxi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd7.d f138827a;

    public f(nd7.d termsClauseMapper, i dynamicTermsAssetTypeExtractor) {
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        Intrinsics.checkNotNullParameter(dynamicTermsAssetTypeExtractor, "dynamicTermsAssetTypeExtractor");
        this.f138827a = termsClauseMapper;
    }
}
