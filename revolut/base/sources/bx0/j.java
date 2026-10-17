package bx0;

import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f19421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f19422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19423c;

    public j() {
        LargeActionButton.ButtonStyle.DefaultFilledButton secondaryButtonStyle = LargeActionButton.ButtonStyle.f58725a;
        e buttonsOrientation = e.VERTICAL;
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        this.f19421a = secondaryButtonStyle;
        this.f19422b = secondaryButtonStyle;
        this.f19423c = buttonsOrientation;
    }

    public final e a() {
        return this.f19423c;
    }

    public final LargeActionButton.ButtonStyle b() {
        return this.f19421a;
    }

    public final LargeActionButton.ButtonStyle c() {
        return this.f19422b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f19421a, jVar.f19421a) && Intrinsics.f(this.f19422b, jVar.f19422b) && this.f19423c == jVar.f19423c;
    }

    public final int hashCode() {
        return this.f19423c.hashCode() + r6.b.d(this.f19422b, this.f19421a.hashCode() * 923521, 961);
    }
}
