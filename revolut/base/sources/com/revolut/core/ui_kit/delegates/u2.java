package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u2 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54801c;
    public final ms0.h4 d;

    public u2() {
        this(null);
    }

    @Override // com.revolut.core.ui_kit.delegates.w2
    public final ms0.h4 a() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.delegates.w2
    public final int b() {
        return this.f54801c;
    }

    @Override // com.revolut.core.ui_kit.delegates.w2
    public final int c() {
        return this.f54800b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u2) && Intrinsics.f(this.f54799a, ((u2) obj2).f54799a);
    }

    public final int hashCode() {
        Clause clause = this.f54799a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }

    public u2(TextClause textClause) {
        this.f54799a = textClause;
        this.f54800b = R$attr.internal_textAppearanceHeading3;
        this.f54801c = R$attr.uikit_colorForeground;
        this.d = ms0.h4.ACCENT;
    }
}
