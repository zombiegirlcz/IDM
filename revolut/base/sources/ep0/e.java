package ep0;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements Html.TagHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp0.s f128023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f128024c;
    public l d;

    public e(Context context, bp0.s onLinkClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        this.f128022a = context;
        this.f128023b = onLinkClick;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String tag2, Editable output, XMLReader xmlReader) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(xmlReader, "xmlReader");
        boolean zF = Intrinsics.f(tag2, "md_rt");
        Context context = this.f128022a;
        if (zF || Intrinsics.f(tag2, "md_follow_up")) {
            l lVar = this.d;
            if (lVar == null) {
                lVar = new l(context, this.f128023b);
            }
            this.d = lVar;
            lVar.handleTag(z, tag2, output, xmlReader);
        }
        if (Intrinsics.f(tag2, "md_rt") || Intrinsics.f(tag2, "md_ul") || Intrinsics.f(tag2, "md_ol") || Intrinsics.f(tag2, "md_li")) {
            x xVar = this.f128024c;
            if (xVar == null) {
                xVar = new x(context);
            }
            this.f128024c = xVar;
            xVar.handleTag(z, tag2, output, xmlReader);
        }
    }
}
