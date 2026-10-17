package aw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f10578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f10579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f10580c;
    public final TextLocalisedClause d;
    public final boolean e;

    public v9(u9 recipientData, t9 amountData, LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle, TextLocalisedClause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(recipientData, "recipientData");
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f10578a = recipientData;
        this.f10579b = amountData;
        this.f10580c = buttonStyle;
        this.d = buttonText;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj2;
        return Intrinsics.f(this.f10578a, v9Var.f10578a) && this.f10579b.equals(v9Var.f10579b) && Intrinsics.f(this.f10580c, v9Var.f10580c) && this.d.equals(v9Var.d) && this.e == v9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(r6.b.d(this.f10580c, (this.f10579b.hashCode() + (this.f10578a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
