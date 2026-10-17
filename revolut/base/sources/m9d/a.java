package m9d;

import com.revolut.data.model.Data;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static Boolean a(Data data) {
        if (data.getLoading()) {
            return null;
        }
        Collection collection = (Collection) data.getContent();
        return Boolean.valueOf(!(collection == null || collection.isEmpty()));
    }
}
