package rpe;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f256379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f256381c;

    public e(TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarDescription, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        this.f256379a = items;
        this.f256380b = toolbarTitle;
        this.f256381c = toolbarDescription;
    }

    @Override // cli.p
    public final List c() {
        return this.f256379a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f256379a.equals(eVar.f256379a) && this.f256380b.equals(eVar.f256380b) && this.f256381c.equals(eVar.f256381c);
    }

    public final int hashCode() {
        return this.f256381c.hashCode() + t61.a.a(this.f256379a.hashCode() * 31, 31, this.f256380b);
    }
}
