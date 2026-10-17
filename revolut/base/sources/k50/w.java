package k50;

import android.text.Editable;
import android.text.Html;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements Html.TagHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f181266a = new w();

    private w() {
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String tag2, Editable output, XMLReader xmlReader) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(xmlReader, "xmlReader");
        if (!Intrinsics.f(tag2, "md_li") || z) {
            return;
        }
        output.append("\n");
    }
}
