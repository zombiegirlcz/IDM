package r7a;

import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((PermissionsControllerContract$Permission) obj2).f80330b instanceof PermissionsControllerContract$Explanation.None), Boolean.valueOf(((PermissionsControllerContract$Permission) obj3).f80330b instanceof PermissionsControllerContract$Explanation.None));
    }
}
