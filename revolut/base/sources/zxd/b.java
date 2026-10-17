package zxd;

import com.samskivert.mustache.Mustache;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface b {
    static String a(b bVar, String template, LinkedHashMap model) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(model, "model");
        String strExecute = Mustache.compiler().escapeHTML(true).compile(template).execute(model);
        Intrinsics.checkNotNullExpressionValue(strExecute, "execute(...)");
        return strExecute;
    }
}
