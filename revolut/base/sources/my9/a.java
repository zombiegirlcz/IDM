package my9;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static e60.a a(Set controllerExtensions) {
        Object next;
        Intrinsics.checkNotNullParameter(controllerExtensions, "controllerExtensions");
        Iterator it8 = controllerExtensions.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof e60.a) {
                break;
            }
        }
        e60.a aVar = (e60.a) next;
        if (aVar != null) {
            return aVar;
        }
        r6.b.r("Global search doesn't provide MediaPickerControllerExtension");
        return null;
    }
}
