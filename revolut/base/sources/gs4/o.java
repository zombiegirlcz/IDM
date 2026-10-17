package gs4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f146325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f146326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f146327c;
    public final ArrayList d;

    public o(TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause buttonTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146325a = title;
        this.f146326b = subtitle;
        this.f146327c = buttonTitle;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f146325a.equals(oVar.f146325a) && this.f146326b.equals(oVar.f146326b) && this.f146327c.equals(oVar.f146327c) && this.d.equals(oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f146325a.hashCode() * 31, 31, this.f146326b), 31, this.f146327c);
    }
}
