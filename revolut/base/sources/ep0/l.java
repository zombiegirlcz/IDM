package ep0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Html.TagHandler {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f128036j = R$drawable.uikit_icn_24_arrow_hook_right;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp0.s f128038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128039c;
    public final int d;
    public final int e;
    public final ArrayDeque f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f128040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f128041h;
    public boolean i;

    public l(Context context, bp0.s onLinkClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        this.f128037a = context;
        this.f128038b = onLinkClick;
        this.f128039c = kli.a.k(context, 28.0f);
        this.d = kli.a.k(context, 8.0f);
        this.e = d.a(context);
        this.f = new ArrayDeque();
        this.f128040g = new ArrayDeque();
    }

    public static void a(Editable editable, boolean z) {
        if (editable.length() == 0 || d0.M(editable, "\n\n")) {
            return;
        }
        if (!z || d0.L(editable, '\n')) {
            editable.append('\n');
        } else {
            editable.append("\n\n");
        }
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String tag2, Editable output, XMLReader xmlReader) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(xmlReader, "xmlReader");
        if (!this.i) {
            xmlReader.setContentHandler(new k(xmlReader.getContentHandler(), this));
            this.i = true;
        }
        if (Intrinsics.f(tag2, "md_follow_up")) {
            ArrayDeque arrayDeque = this.f128040g;
            ArrayDeque arrayDeque2 = this.f;
            if (z) {
                a(output, z);
                arrayDeque2.addLast(Integer.valueOf(output.length()));
                arrayDeque.addLast(this.f128041h);
                this.f128041h = null;
                return;
            }
            Integer num = (Integer) (arrayDeque2.isEmpty() ? null : arrayDeque2.removeLast());
            if (num != null) {
                int iIntValue = num.intValue();
                String str = (String) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
                if (iIntValue >= output.length()) {
                    return;
                }
                a(output, z);
                int length = output.length();
                Drawable drawable = this.f128037a.getDrawable(f128036j);
                if (drawable == null) {
                    drawable = new ColorDrawable(0);
                }
                Drawable drawableMutate = drawable.mutate();
                Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
                output.setSpan(new i(drawableMutate, this.f128039c, this.d, this.e), iIntValue, length, 33);
                output.setSpan(new f(), iIntValue, length, 33);
                if (str == null || length <= iIntValue + 1) {
                    return;
                }
                int i = length - 1;
                output.setSpan(new ix0.b0(this.f128037a, Integer.valueOf(R$attr.uikit_colorTransparent), false, false, null, ty0.b.DEFAULT, new a2.a(this, 8, str, output.subSequence(iIntValue, i).toString())), iIntValue, i, 33);
            }
        }
    }
}
