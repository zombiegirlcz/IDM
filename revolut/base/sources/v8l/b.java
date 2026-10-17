package v8l;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f286902c = new b(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f286903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f286904b;

    public b(TextClause title, TextClause toolbarSubtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        this.f286903a = title;
        this.f286904b = toolbarSubtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f286903a.equals(bVar.f286903a) && this.f286904b.equals(bVar.f286904b);
    }

    public final int hashCode() {
        return this.f286904b.hashCode() + (this.f286903a.hashCode() * 31);
    }
}
