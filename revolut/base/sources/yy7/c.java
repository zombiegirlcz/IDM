package yy7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yx7.h;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f317860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f317861b;

    public c(h imageBuilder, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(imageBuilder, "imageBuilder");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f317860a = imageBuilder;
        this.f317861b = languageProvider;
    }
}
