package hfj;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((UserDevice) ((Map.Entry) obj2).getKey()) == null), Boolean.valueOf(((UserDevice) ((Map.Entry) obj3).getKey()) == null));
    }
}
