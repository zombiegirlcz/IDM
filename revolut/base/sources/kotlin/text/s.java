package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class s {
    public static void a(Appendable appendable, Object obj2, Function1 function1) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj2));
            return;
        }
        if (obj2 == null ? true : obj2 instanceof CharSequence) {
            appendable.append((CharSequence) obj2);
        } else if (obj2 instanceof Character) {
            appendable.append(((Character) obj2).charValue());
        } else {
            appendable.append(obj2.toString());
        }
    }
}
