package yw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f317297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f317298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f317299c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public s(ArrayList pages, h foregroundTintStyle, TextLocalisedClause skipText, boolean z, boolean z3) {
        int i = R$drawable.uikit_icn_24_cross;
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(foregroundTintStyle, "foregroundTintStyle");
        Intrinsics.checkNotNullParameter(skipText, "skipText");
        this.f317297a = pages;
        this.f317298b = foregroundTintStyle;
        this.f317299c = skipText;
        this.d = z;
        this.e = i;
        this.f = z3;
    }

    @Override // yw0.k
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f317297a.equals(sVar.f317297a) && this.f317298b == sVar.f317298b && this.f317299c.equals(sVar.f317299c) && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.b(this.e, j6.a.c(t61.a.a((this.f317298b.hashCode() + (this.f317297a.hashCode() * 31)) * 31, 31, this.f317299c), 31, this.d), 31);
    }
}
