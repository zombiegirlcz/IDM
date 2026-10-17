package gah;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.data.model.Data;
import d1h.h;
import gaf.l;
import ip0.ak0;
import ip0.yj0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {

        /* JADX INFO: renamed from: gah.g$a$a, reason: collision with other inner class name */
        public static final class C0824a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0824a f142184a = new C0824a();

            private C0824a() {
            }
        }

        private a() {
        }
    }

    public final List c(d1h.g gVar, d7 textStyle) {
        Data data;
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        List list = (gVar == null || (data = gVar.f110649a) == null) ? null : (List) iii.c.f(data, new l(2), new g5k.f(20), new fyg.b(this, textStyle, 11));
        return list == null ? f0.f322471a : list;
    }

    public final HtmlClause d(Integer num, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new HtmlClause(1, 8, num, a.C0824a.f142184a, text);
    }

    public final TextDelegate.Model e(rdh.a disclaimer, String listId, yj0 gravity, Integer num) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        return new TextDelegate.Model(listId, d(num, disclaimer.f253458b), false, new ak0(gravity, null, 2), null, null, 0, 0, 0, 0, 2036);
    }
}
