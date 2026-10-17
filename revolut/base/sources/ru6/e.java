package ru6;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Custom f257450a;

    public e(iu6.j clauseFactory) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
        this.f257450a = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
    }
}
