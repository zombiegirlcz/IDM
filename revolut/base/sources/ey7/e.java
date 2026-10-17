package ey7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f130585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f130586b;

    public e(TextLocalisedClause label, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f130585a = label;
        this.f130586b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f130585a, eVar.f130585a) && Intrinsics.f(this.f130586b, eVar.f130586b);
    }

    public final int hashCode() {
        return this.f130586b.hashCode() + (this.f130585a.hashCode() * 31);
    }
}
