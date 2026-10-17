package tch;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f269818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f269819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PairedImage f269820c;
    public final List d;

    public d0(MoneyClause title, CompositeClause description, PairedImage icon, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f269818a = title;
        this.f269819b = description;
        this.f269820c = icon;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f269818a.equals(d0Var.f269818a) && this.f269819b.equals(d0Var.f269819b) && this.f269820c.equals(d0Var.f269820c) && this.d.equals(d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f269820c.hashCode() + h30.l.c(this.f269819b, this.f269818a.hashCode() * 31, 31)) * 31);
    }
}
