package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaLocalization;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dx0 implements cx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kt0 f27944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaLocalization f27945b;

    public dx0(kt0 bundle, OrcaLocalization localization) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f27944a = bundle;
        this.f27945b = localization;
    }

    @Override // com.fourthline.orca.internal.cx0
    public String a() {
        return this.f27944a.e();
    }

    @Override // com.fourthline.orca.internal.cx0
    public OrcaLocalization.LanguageType b() {
        OrcaLocalization.LanguageType fixedLanguage = this.f27945b.getFixedLanguage();
        return fixedLanguage == null ? this.f27945b.getBaseLanguage() : fixedLanguage;
    }
}
