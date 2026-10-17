package aw0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f10252b;

    public c(String actionId, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f10251a = actionId;
        this.f10252b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f10251a.equals(cVar.f10251a) && this.f10252b.equals(cVar.f10252b);
    }

    public final int hashCode() {
        return this.f10252b.hashCode() + (this.f10251a.hashCode() * 31);
    }
}
