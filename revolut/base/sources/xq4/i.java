package xq4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f308108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f308109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f308110c;

    public i(TextLocalisedClause title, TextLocalisedClause toolbarTitle, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f308108a = title;
        this.f308109b = toolbarTitle;
        this.f308110c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f308108a.equals(iVar.f308108a) && this.f308109b.equals(iVar.f308109b) && this.f308110c.equals(iVar.f308110c);
    }

    public final int hashCode() {
        return this.f308110c.hashCode() + t61.a.a(this.f308108a.hashCode() * 31, 31, this.f308109b);
    }
}
