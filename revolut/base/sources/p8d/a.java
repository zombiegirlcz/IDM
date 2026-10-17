package p8d;

import com.revolut.core.ui_kit.models.HtmlClause;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import nl0.f;
import nl0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f234145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f234146b;

    public a(f markDown) {
        Intrinsics.checkNotNullParameter(markDown, "markDown");
        this.f234145a = markDown;
        h[] elements = {h.LINK, h.HTTP_HTTPS_LINK, h.NEW_LINE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f234146b = d.y0(elements);
    }

    public final HtmlClause a(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new HtmlClause(0, 30, (Integer) null, (Object) null, f.c(this.f234145a, content, this.f234146b));
    }
}
