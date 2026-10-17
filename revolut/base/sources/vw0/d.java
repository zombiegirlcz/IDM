package vw0;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends ContextThemeWrapper {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f292610a;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        b bVar = this.f292610a;
        if (bVar != null) {
            return bVar;
        }
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        b bVar2 = new b(resources);
        this.f292610a = bVar2;
        return bVar2;
    }
}
